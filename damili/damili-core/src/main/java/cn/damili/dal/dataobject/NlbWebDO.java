package cn.damili.dal.dataobject;

import java.io.Serializable;
import java.util.Date;


public class NlbWebDO implements Serializable {

    private static final long serialVersionUID = 138112297620345804L;

    /**
     * column nlb_web.id
     */
    private Integer id;

    /**
     * column nlb_web.web_url
     */
    private String webUrl;

    /**
     * column nlb_web.web_name
     */
    private String webName;

    /**
     * column nlb_web.web_desc
     */
    private String webDesc;

    /**
     * column nlb_web.web_status
     */
    private Byte webStatus;

    /**
     * column nlb_web.create_time 
     */
    private Date createTime;

    /**
     * column nlb_web.modify_time  
     */
    private Date modifyTime;

    /**
     * column nlb_web.web_snapshot
     */
    private String webSnapshot;

    public NlbWebDO() {
        super();
    }

    public NlbWebDO(Integer id, String webUrl, String webName, String webDesc, Byte webStatus, Date createTime, Date modifyTime, String webSnapshot) {
        this.id = id;
        this.webUrl = webUrl;
        this.webName = webName;
        this.webDesc = webDesc;
        this.webStatus = webStatus;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.webSnapshot = webSnapshot;
    }

    /**
     * getter for Column nlb_web.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * setter for Column nlb_web.id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * getter for Column nlb_web.web_url
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * setter for Column nlb_web.web_url
     * @param webUrl
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * getter for Column nlb_web.web_name
     */
    public String getWebName() {
        return webName;
    }

    /**
     * setter for Column nlb_web.web_name
     * @param webName
     */
    public void setWebName(String webName) {
        this.webName = webName;
    }

    /**
     * getter for Column nlb_web.web_desc
     */
    public String getWebDesc() {
        return webDesc;
    }

    /**
     * setter for Column nlb_web.web_desc
     * @param webDesc
     */
    public void setWebDesc(String webDesc) {
        this.webDesc = webDesc;
    }

    /**
     * getter for Column nlb_web.web_status
     */
    public Byte getWebStatus() {
        return webStatus;
    }

    /**
     * setter for Column nlb_web.web_status
     * @param webStatus
     */
    public void setWebStatus(Byte webStatus) {
        this.webStatus = webStatus;
    }

    /**
     * getter for Column nlb_web.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * setter for Column nlb_web.create_time
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * getter for Column nlb_web.modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * setter for Column nlb_web.modify_time
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * getter for Column nlb_web.web_snapshot
     */
    public String getWebSnapshot() {
        return webSnapshot;
    }

    /**
     * setter for Column nlb_web.web_snapshot
     * @param webSnapshot
     */
    public void setWebSnapshot(String webSnapshot) {
        this.webSnapshot = webSnapshot;
    }

}