package cn.damili.common.screen;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.citrus.service.requestcontext.parser.ParameterParser;
import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.TurbineRunData;
import com.alibaba.citrus.turbine.util.TurbineUtil;

import cn.damili.common.action.BaseAction;

public abstract class BaseScreen extends BaseAction {
	
	protected static Logger LOG = LoggerFactory.getLogger(BaseScreen.class);
	
	public void execute(Context context, Navigator nav) throws Exception{
		TurbineRunData rundata = TurbineUtil.getTurbineRunData(getRequest());
		if(rundata == null){
			goErrorPage(nav);
		}
		
		ParameterParser paramParser = rundata.getParameters();

        String result;
        try{
            result = frontExecute(paramParser, context, nav);
        }catch (Exception e){
        	LOG.error("FrontBaseScreen:frontExecute", e);
            result = ERROR;
        }
		
		if(ERROR.equals(result)){
			goErrorPage(nav);
		} else if(LOGIN.equals(result)){
			goLoginPage(nav);
		}
		
		setDefaultContext(context);
	}
	
	protected abstract String frontExecute(ParameterParser paramParser, Context context, Navigator nav)throws Exception;

	
	
	public void writeResponse(String msg) {
		try {
			response.flushBuffer();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("\n");
			response.getWriter().write(msg);
			response.getWriter().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
