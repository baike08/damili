package cn.damili.my.screen;

import cn.damili.common.screen.BaseScreen;

import com.alibaba.citrus.service.requestcontext.parser.ParameterParser;
import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;

public class Login extends BaseScreen {

	@Override
	protected String frontExecute(ParameterParser paramParser, Context context,
			Navigator nav) throws Exception {
		// 生成验证码
		return SUCCESS;
	}

}
