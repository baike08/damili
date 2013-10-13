package cn.damili.dal.query;

import java.io.Serializable;

/**
 * @since 2013-10-07
 */
public class NlbWebQuery implements Serializable {

    private static final long serialVersionUID = 138112297628216103L;

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
     * column nlb_web.web_status
     */
    private Byte webStatus;

    private String webSnapshot;

    public NlbWebQuery() {
        super();
    }

    public NlbWebQuery(Integer id, String webUrl, String webName, Byte webStatus, String webSnapshot) {
        this.id = id;
        this.webUrl = webUrl;
        this.webName = webName;
        this.webStatus = webStatus;
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