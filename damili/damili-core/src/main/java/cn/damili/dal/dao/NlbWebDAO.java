package cn.damili.dal.dao;

import java.util.List;

import cn.damili.dal.dataobject.NlbWebDO;
import cn.damili.dal.query.NlbWebQuery;


public interface NlbWebDAO {

    public Integer insert(NlbWebDO nlbWebDO);

    public Integer count(NlbWebQuery nlbWebQuery);


    public Integer update(NlbWebDO nlbWebDO);


    public List<NlbWebDO> list(NlbWebQuery nlbWebQuery);

    public NlbWebDO get(Integer id);

    public Integer delete(Integer id);

}