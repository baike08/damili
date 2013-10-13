package cn.damili.common.conf;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextConf implements ApplicationContextAware{
	static ApplicationContext context = null;

	public void setApplicationContext(ApplicationContext appcontext)
			throws BeansException {
		context = appcontext;
	}

	public static ApplicationContext getContext() {
		return context;
	}
	
	public static Object getBean(String beanName) {
		return getContext().getBean(beanName);
	}
}