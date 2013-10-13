package cn.damili.dal.query;

import java.io.Serializable;

/**
 * @since 2013-10-07
 */
public class NlbUserQuery implements Serializable {

    private static final long serialVersionUID = 138112300842438712L;

    private Integer userId;

    private String userNick;

    private Byte userType;

    private Integer userFlags;

    private String userEmail;

    private String userContact;

    private Byte userStatus;

    public NlbUserQuery() {
        super();
    }

    public NlbUserQuery(Integer userId, String userNick, Byte userType, Integer userFlags, String userEmail, String userContact, Byte userStatus) {
        this.userId = userId;
        this.userNick = userNick;
        this.userType = userType;
        this.userFlags = userFlags;
        this.userEmail = userEmail;
        this.userContact = userContact;
        this.userStatus = userStatus;
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

}