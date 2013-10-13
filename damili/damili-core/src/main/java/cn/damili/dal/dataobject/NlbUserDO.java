package cn.damili.dal.dataobject;

import java.io.Serializable;
import java.util.Date;


public class NlbUserDO implements Serializable {

    private static final long serialVersionUID = 138112300833905195L;

    private Integer userId;

    private String userNick;

    private String userPic;

    private Byte userType;

    private Integer userFlags;

    private String userEmail;

    private String userContact;

    private Byte userStatus;

    private Date createTime;

    private Date modifyTime;

    public NlbUserDO() {
        super();
    }

    public NlbUserDO(Integer userId, String userNick, String userPic, Byte userType, Integer userFlags, String userEmail, String userContact, Byte userStatus, Date createTime, Date modifyTime) {
        this.userId = userId;
        this.userNick = userNick;
        this.userPic = userPic;
        this.userType = userType;
        this.userFlags = userFlags;
        this.userEmail = userEmail;
        this.userContact = userContact;
        this.userStatus = userStatus;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    /**
     * getter for Column nlb_user.user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * setter for Column nlb_user.user_id
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * getter for Column nlb_user.user_nick
     */
    public String getUserNick() {
        return userNick;
    }

    /**
     * setter for Column nlb_user.user_nick
     * @param userNick
     */
    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    /**
     * getter for Column nlb_user.user_pic
     */
    public String getUserPic() {
        return userPic;
    }

    /**
     * setter for Column nlb_user.user_pic
     * @param userPic
     */
    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    /**
     * getter for Column nlb_user.user_type
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * setter for Column nlb_user.user_type
     * @param userType
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * getter for Column nlb_user.user_flags
     */
    public Integer getUserFlags() {
        return userFlags;
    }

    /**
     * setter for Column nlb_user.user_flags
     * @param userFlags
     */
    public void setUserFlags(Integer userFlags) {
        this.userFlags = userFlags;
    }

    /**
     * getter for Column nlb_user.user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * setter for Column nlb_user.user_email
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * getter for Column nlb_user.user_contact
     */
    public String getUserContact() {
        return userContact;
    }

    /**
     * setter for Column nlb_user.user_contact
     * @param userContact
     */
    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    /**
     * getter for Column nlb_user.user_status
     */
    public Byte getUserStatus() {
        return userStatus;
    }

    /**
     * setter for Column nlb_user.user_status
     * @param userStatus
     */
    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * getter for Column nlb_user.create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * setter for Column nlb_user.create_time
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * getter for Column nlb_user.modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * setter for Column nlb_user.modify_time
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}