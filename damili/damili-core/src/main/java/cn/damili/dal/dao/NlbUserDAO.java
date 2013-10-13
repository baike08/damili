package cn.damili.dal.dao;

import java.util.List;

import cn.damili.dal.dataobject.NlbUserDO;
import cn.damili.dal.query.NlbUserQuery;

/**
 * ��ݷ��ʶ���ӿ�
 * @since 2013-10-07
 */
public interface NlbUserDAO {

    /**
     * �������
     * @param nlbUserDO
     * @return ������ݵ�����
     */
    public Integer insert(NlbUserDO nlbUserDO);

    /**
     * ͳ�Ƽ�¼��
     * @param nlbUserQuery
     * @return ����ļ�¼��
     */
    public Integer count(NlbUserQuery nlbUserQuery);

    /**
     * ���¼�¼
     * @param nlbUserDO
     * @return ��Ӱ�������
     */
    public Integer update(NlbUserDO nlbUserDO);

    /**
     * ��ȡ�����б�
     * @param nlbUserQuery
     * @return �����б�
     */
    public List<NlbUserDO> list(NlbUserQuery nlbUserQuery);

    /**
     * ��������ȡnlbUserDO
     * @param userId
     * @return nlbUserDO
     */
    public NlbUserDO get(Integer userId);

    /**
     * ɾ���¼
     * @param userId
     * @return ��Ӱ�������
     */
    public Integer delete(Integer userId);

}