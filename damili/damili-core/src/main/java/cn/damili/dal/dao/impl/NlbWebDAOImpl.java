package cn.damili.dal.dao.impl;

import java.util.Date;
import java.util.List;

import cn.damili.dal.dao.NlbWebDAO;
import cn.damili.dal.dataobject.NlbWebDO;
import cn.damili.dal.query.NlbWebQuery;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


public class NlbWebDAOImpl extends SqlMapClientDaoSupport implements NlbWebDAO {

    public Integer insert(NlbWebDO nlbWebDO) {
    	if(nlbWebDO == null)
    		return null;
    	nlbWebDO.setCreateTime(new Date());
    	nlbWebDO.setModifyTime(new Date());
    	try {
    		Object id = getSqlMapClientTemplate().insert("NlbWeb.insert", nlbWebDO);
    		return (Integer) id;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public Integer count(NlbWebQuery nlbWebQuery) {
    	try{
    		Integer count = (Integer) getSqlMapClientTemplate().queryForObject("NlbWeb.count", nlbWebQuery);
    		return count;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public Integer update(NlbWebDO nlbWebDO) {
    	if(nlbWebDO == null)
    		return null;
    	nlbWebDO.setModifyTime(new Date());
    	try {
    		int result = getSqlMapClientTemplate().update("NlbWeb.update", nlbWebDO);
    		return result;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    @SuppressWarnings("unchecked")
    public List<NlbWebDO> list(NlbWebQuery nlbWebQuery) {
    	try {
    		List<NlbWebDO> list = getSqlMapClientTemplate().queryForList("NlbWeb.list", nlbWebQuery);
    		return list;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public NlbWebDO get(Integer id) {
    	try {
    		NlbWebDO nlbWebDO = (NlbWebDO) getSqlMapClientTemplate().queryForObject("NlbWeb.get", id);
    		return nlbWebDO;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

    public Integer delete(Integer id) {
    	try {
    		Integer rows = (Integer) getSqlMapClientTemplate().delete("NlbWeb.delete", id);
    		return rows;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	
    	return null;
    }

}