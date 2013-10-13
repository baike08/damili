package cn.damili.dal.dataobject;

import java.io.Serializable;
import java.util.Date;


public class NlbLoginDO implements Serializable {

    private static final long serialVersionUID = 138112293911236233L;

    /**
     * column nlb_login.id
     */
    private Integer id;

  
    /**
     * 
     */
    private Integer userId;

    /**
     * column nlb_login.login_id
     */
    private String loginId;

    /**
     * column nlb_login.login_type
     */
    private Integer loginType;

    /**
     * column nlb_login.login_status 
     */
    private Integer loginStatus;

    /**
     * column nlb_login.login_pwd 
     */
    private String loginPwd;

    /**
     * column nlb_login.login_time
     */
    private Date loginTime;

    public NlbLoginDO() {
        super();
    }

    public NlbLoginDO(Integer id, Integer userId, String loginId, Integer loginType, Integer loginStatus, String loginPwd, Date loginTime) {
        this.id = id;
        this.userId = userId;
        this.loginId = loginId;
        this.loginType = loginType;
        this.loginStatus = loginStatus;
        this.loginPwd = loginPwd;
        this.loginTime = loginTime;
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

    /**
     * getter for Column nlb_login.login_pwd
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * setter for Column nlb_login.login_pwd
     * @param loginPwd
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * getter for Column nlb_login.login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * setter for Column nlb_login.login_time
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

	@Override
	public String toString() {
		return "NlbLoginDO [id=" + id + ", userId=" + userId + ", loginId="
				+ loginId + ", loginType=" + loginType + ", loginStatus="
				+ loginStatus + ", loginPwd=" + loginPwd + ", loginTime="
				+ loginTime + "]";
	}
    
    

}