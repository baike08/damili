package cn.damili.biz.test;


import org.junit.Test;

import cn.damili.dal.dataobject.NlbLoginDO;
import cn.damili.dal.query.NlbLoginQuery;
import cn.damili.util.BaseTest;

public class TestDAO extends BaseTest {

	@Test
	public void testCount() {
		System.out.println("hello world");
		
		NlbLoginQuery query = new NlbLoginQuery();
		
		Integer count = nlbLoginDAO.count(query);
		System.out.println("total count = " + count);
	}
	
	@Test
	public void testInsertLogin() {
		NlbLoginDO login = new NlbLoginDO();
		login.setLoginId("laiweibin08");
		login.setLoginPwd("abcd");
		login.setUserId(1245);
		Integer ret = nlbLoginDAO.insert(login);
		System.out.println("insert result = " + ret);
		
		System.out.println(nlbLoginDAO.login(login.getLoginId(), login.getLoginPwd()+" ", 0));
	}
}
