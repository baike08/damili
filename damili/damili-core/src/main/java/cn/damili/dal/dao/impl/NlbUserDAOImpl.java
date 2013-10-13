package cn.damili.dal.dao.impl;

import java.util.Date;
import java.util.List;

import cn.damili.dal.dao.NlbUserDAO;
import cn.damili.dal.dataobject.NlbUserDO;
import cn.damili.dal.query.NlbUserQuery;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class NlbUserDAOImpl extends SqlMapClientDaoSupport implements NlbUserDAO {

    public Integer insert(NlbUserDO nlbUserDO) {
    	if(nlbUserDO == null)
    		return null;
    	nlbUserDO.setCreateTime(new Date());
    	nlbUserDO.setModifyTime(new Date());
    	try {
    		Object user_id = getSqlMapClientTemplate().insert("NlbUser.insert", nlbUserDO);
    		return (Integer) user_id;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public Integer count(NlbUserQuery nlbUserQuery) {
    	try {
    		Integer count = (Integer) getSqlMapClientTemplate().queryForObject("NlbUser.count", nlbUserQuery);
    		return count;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public Integer update(NlbUserDO nlbUserDO) {
    	if(nlbUserDO == null)
    		return null;
    	nlbUserDO.setModifyTime(new Date());
    	try {
    		int result = getSqlMapClientTemplate().update("NlbUser.update", nlbUserDO);
    		return result;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return null;
    }

    @SuppressWarnings("unchecked")
    public List<NlbUserDO> list(NlbUserQuery nlbUserQuery) {
    	try {
    		List<NlbUserDO> list = getSqlMapClientTemplate().queryForList("NlbUser.list", nlbUserQuery);
    		return list;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public NlbUserDO get(Integer userId) {
    	try {
    		NlbUserDO nlbUserDO = (NlbUserDO) getSqlMapClientTemplate().queryForObject("NlbUser.get", userId);
    		return nlbUserDO;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public Integer delete(Integer userId) {
    	try {
    		Integer rows = (Integer) getSqlMapClientTemplate().delete("NlbUser.delete", userId);
    		return rows;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

}