package cn.damili.dal.query;

import java.io.Serializable;

/**
 * 
 * @since 2013-10-07
 */
public class NlbLoginQuery implements Serializable {

    private static final long serialVersionUID = 138112293945569684L;

    /**
     * column nlb_login.id
     */
    private Integer id;

    private Integer userId;

    private String loginId;

    private Integer loginType;

    private Integer loginStatus;

    public NlbLoginQuery() {
        super();
    }

    public NlbLoginQuery(Integer id, Integer userId, String loginId, Integer loginType, Integer loginStatus) {
        this.id = id;
        this.userId = userId;
        this.loginId = loginId;
        this.loginType = loginType;
        this.loginStatus = loginStatus;
    }

    /**
     * getter for Column nlb_login.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * setter for Column nlb_login.id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * getter for Column nlb_login.user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * setter for Column nlb_login.user_id
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * getter for Column nlb_login.login_id
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * setter for Column nlb_login.login_id
     * @param loginId
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * getter for Column nlb_login.login_type
     */
    public Integer getLoginType() {
        return loginType;
    }

    /**
     * setter for Column nlb_login.login_type
     * @param loginType
     */
    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    /**
     * getter for Column nlb_login.login_status
     */
    public Integer getLoginStatus() {
        return loginStatus;
    }

    /**
     * setter for Column nlb_login.login_status
     * @param loginStatus
     */
    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

}