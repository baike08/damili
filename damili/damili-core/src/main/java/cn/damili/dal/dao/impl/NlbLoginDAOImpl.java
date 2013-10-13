package cn.damili.dal.dao.impl;

import java.util.Date;
import java.util.List;

import cn.damili.dal.dao.NlbLoginDAO;
import cn.damili.dal.dataobject.NlbLoginDO;
import cn.damili.dal.query.NlbLoginQuery;
import cn.damili.common.constant.ELoginStatus;
import cn.damili.common.obj.ResultDO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.mysql.jdbc.StringUtils;

public class NlbLoginDAOImpl extends SqlMapClientDaoSupport implements NlbLoginDAO {
	
	private static final Logger log = LoggerFactory.getLogger(NlbLoginDAOImpl.class);

    public Integer insert(NlbLoginDO nlbLoginDO) {
    	if(nlbLoginDO == null)
    		return null;
    	
    	if(nlbLoginDO.getLoginPwd() == null || nlbLoginDO.getLoginId() == null || nlbLoginDO.getUserId() == null) {
    		log.error("password/loginid/userid is null");
    		return null;
    	}
    	if(nlbLoginDO.getLoginType() == null) //
    		nlbLoginDO.setLoginType(0);
    	
    	if(nlbLoginDO.getLoginStatus() == null) //
    		nlbLoginDO.setLoginStatus(0);
    	try {
    		 Object id = getSqlMapClientTemplate().insert("NlbLogin.insert", nlbLoginDO);
    	     return (Integer) id;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
       
    	return null;
    }

    public Integer count(NlbLoginQuery nlbLoginQuery) {
    	try {
    		Integer count = (Integer) getSqlMapClientTemplate().queryForObject("NlbLogin.count", nlbLoginQuery);
    		return count;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return null;
    }

    public Integer update(NlbLoginDO nlbLoginDO) {
    	try {
    		int result = getSqlMapClientTemplate().update("NlbLogin.update", nlbLoginDO);
    		return result;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return null;
    }

    @SuppressWarnings("unchecked")
    public List<NlbLoginDO> list(NlbLoginQuery nlbLoginQuery) {
    	try {
    		List<NlbLoginDO> list = getSqlMapClientTemplate().queryForList("NlbLogin.list", nlbLoginQuery);
    		return list;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public NlbLoginDO get(Integer id) {
    	try {
    		NlbLoginDO nlbLoginDO = (NlbLoginDO) getSqlMapClientTemplate().queryForObject("NlbLogin.get", id);
    		return nlbLoginDO;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public Integer delete(Integer id) {
    	try {
    		Integer rows = (Integer) getSqlMapClientTemplate().delete("NlbLogin.delete", id);
    		return rows;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }
    
    /**
     * 
     */
	public ResultDO<NlbLoginDO>  login(String loginName, String pwd, int type)  {
		// type = 0 
		ResultDO<NlbLoginDO> ret = new ResultDO<NlbLoginDO>();
		if(StringUtils.isEmptyOrWhitespaceOnly(loginName)) {
			ret.setCode(ELoginStatus.LOGIN_USER_ERROR.getIndex());
			ret.setMsg(ELoginStatus.LOGIN_USER_ERROR.getName());
			return ret;
		}
		
		if(StringUtils.isEmptyOrWhitespaceOnly(pwd)) {
			ret.setCode(ELoginStatus.LOGIN_PWD_ERROR.getIndex());
			ret.setMsg(ELoginStatus.LOGIN_PWD_ERROR.getName());
			return ret;
		}
		NlbLoginQuery query = new NlbLoginQuery();
		query.setLoginId(loginName);
		query.setLoginType(type);
		query.setLoginStatus(0);
		List<NlbLoginDO> lists = this.list(query);
		
		if(lists == null || lists.isEmpty()) {
			ret.setCode(ELoginStatus.LOGIN_USER_ERROR.getIndex());
			ret.setMsg(ELoginStatus.LOGIN_USER_ERROR.getName());
			return ret;
		}
		for(NlbLoginDO l : lists) {
			if(l == null) 
				continue;
			if(pwd.equals(l.getLoginPwd())) {
				l.setLoginTime(new Date());
				this.update(l);
				ret.setSuccess(true);
				ret.setResult(l);
				return ret;
			}
		}

		ret.setCode(ELoginStatus.LOGIN_PWD_ERROR.getIndex());
		ret.setMsg(ELoginStatus.LOGIN_PWD_ERROR.getName());
		return ret;
	}

}