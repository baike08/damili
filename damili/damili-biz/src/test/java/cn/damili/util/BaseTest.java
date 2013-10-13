package cn.damili.util;

import cn.damili.dal.dao.NlbLoginDAO;

import org.junit.BeforeClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	
	protected static NlbLoginDAO nlbLoginDAO = null;
	
	
	@BeforeClass
	public static void init(){
		try{
		
			String springResourcePath = "conf/application.xml";
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
					springResourcePath);
			
			nlbLoginDAO = (NlbLoginDAO)ctx.getBean("nlbLoginDAO");
			
		}catch(Exception er){
			er.printStackTrace();
		}
	}
}
