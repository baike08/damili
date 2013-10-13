package cn.damili.dal.dao;

import java.util.List;

import cn.damili.dal.dataobject.NlbLoginDO;
import cn.damili.dal.query.NlbLoginQuery;
import cn.damili.common.obj.ResultDO;

public interface NlbLoginDAO {


    public Integer insert(NlbLoginDO nlbLoginDO);

    /**
     */
    public Integer count(NlbLoginQuery nlbLoginQuery);

    /**
     */
    public Integer update(NlbLoginDO nlbLoginDO);


    /**
     */
    public List<NlbLoginDO> list(NlbLoginQuery nlbLoginQuery);

    /**
     */
    public NlbLoginDO get(Integer id);

    /**
     */
    public Integer delete(Integer id);
    
    public ResultDO<NlbLoginDO> login(String loginName, String pwd, int type);

}