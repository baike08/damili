package cn.damili.common.obj;

import java.io.Serializable;

import cn.damili.common.constant.EUserConstant;

public class UserBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6149988992432541401L;
	/**
	 *
	 */
	private long userId;
	/**
	 * 
	 */
	private String nick;
	/**
	 * 
	 */
	private EUserConstant userConstant;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public EUserConstant getUserConstant() {
		return userConstant;
	}
	public void setUserConstant(EUserConstant userConstant) {
		this.userConstant = userConstant;
	}
	
	
}
