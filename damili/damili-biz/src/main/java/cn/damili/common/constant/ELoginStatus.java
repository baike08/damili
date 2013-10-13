package cn.damili.common.constant;

/**
 * 
 * @ClassName: EUserConstant 
 * @Description:  
 * @author laiweibin08@163.com   
 * @date 
 */
public enum ELoginStatus {
	/**
	 * 登录成功
	 */
	LOGIN_OK("登录成功", 1),
	/**
	 * 密码错误
	 */
	LOGIN_PWD_ERROR("密码错误", 2),
	/**
	 * 用户名不存在
	 */
	LOGIN_USER_ERROR("用户名不存在", 3),
	/**
	 * 登录失败
	 */
	LOGIN_FAIL("登录失败", 4),
	
	/**
	 * 验证码错误
	 */
	LOGIN_VERIF_ERROR("验证码错误", 5);

	private String name;

	private int index;

	private ELoginStatus(String name, int index) {
		this.name = name;
		this.index = index;
	}

	/**
	 * 
	 * @param index
	 * @return
	 */
	public static String getName(int index) {
		for (ELoginStatus c : ELoginStatus.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
