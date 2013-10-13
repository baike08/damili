package cn.damili.common.action;


import com.alibaba.citrus.service.uribroker.URIBrokerService;
import com.alibaba.citrus.service.uribroker.uri.ContentURIBroker;
import com.alibaba.citrus.service.uribroker.uri.URIBroker;
import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;

import cn.damili.common.obj.UserBO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

/**
 * 封装基本操作方法
 * 
 * @author sky
 * @date 2011.7.25
 */
public class BaseAction {
    public static String NLB_TOKEN = "_nlb_token_";

	//返回错误页面
	public static String ERROR = "error";
	//返回登录页面
	public static String LOGIN = "login";
	
	//执行成功
	public static String SUCCESS = "success";

	//用户基本信息context名
	public static String USER = "user";
	
	@Autowired
	protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;
    
    @Autowired
    protected HttpSession session;
    
    @Autowired
    protected URIBrokerService urlBrokerService;
    
    protected UserBO userBO = null;
    
    protected static Logger log = LoggerFactory.getLogger(BaseAction.class);
    
	
	public UserBO getUserBO() {
		return userBO;
	}

	public void setUserBO(UserBO userBO) {
		this.userBO = userBO;
	}


	public void setDefaultContext(Context context){
		//加载用户信息
		context.put(USER, this.getUserBO());
		
		//url后面的参数字符串(主要用于搜索)
		context.put("queryString", request.getQueryString());
		
		//当前url(主要用于登录跳转)
		context.put("redirectURL", this.getRedirectURL());
		
		//设置http响应头，清除浏览器端缓存
		response.setHeader("Cache-Control", "no-cache");
	}

	
	protected void goErrorPage(Navigator nav) {
		ContentURIBroker homeServer = (ContentURIBroker)urlBrokerService.getURIBroker("homeServer").fork();
		nav.redirectToLocation(homeServer.getURI("/home/error.php").render());
	}
	
	protected void goLoginPage(Navigator nav) {
		URIBroker loginURI = urlBrokerService.getURIBroker("commonLoginLink").fork();
		nav.redirectToLocation(loginURI.addQueryData("redirectURL", getRedirectURL()).render());
	}
	
	/**
	 * 获取当前url及参数串，没有经过了encode处理
	 */
	protected String getRedirectURL(){
		 String redirectURL = request.getRequestURL().toString();
	        
		if (request.getQueryString() != null) {
			redirectURL += "?" + request.getQueryString();
		}
		
		return redirectURL;
	}
	
	protected String getSessionId() {
		return session.getId();
	}
	
	protected HttpServletRequest getRequest(){
		return request;
	}


    protected HttpServletResponse getResponse() {
        return response;
    }

	
	protected HttpSession getSession(){
		return session; 
	}
	
	/**
	 * 获取用户IP
	 */
	protected String getIpAddress() {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/**
	 * 异步返回jsonp数据
	 * @param jsonObject
	 * @param callback
	 * @throws Exception
	 */
	protected void outputResponseJson(String jsonStr, String callback) throws Exception {
		getResponse().setContentType("text/html; charset=UTF-8");
		PrintWriter out = getResponse().getWriter();
		out.println("\n" + callback + "(" + jsonStr + ")");
	}
	
}
