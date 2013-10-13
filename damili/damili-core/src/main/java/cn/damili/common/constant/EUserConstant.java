package cn.damili.common.constant;

/**
 * 
 * @ClassName: EUserConstant 
 * @Description:  
 * @author laiweibin08@163.com   
 */
public enum EUserConstant {
	/**
	 * 普通用户
	 */
	COMMON_USER("普通用户", 0),
	/**
	 * 星级用户
	 */
	STAR_USER("星级用户", 1),
	/**
	 * 管理员
	 */
	ADMIN_USER("管理员", 5),
	/**
	 * 超级管理员
	 */
	ROOT_USER("超级管理员", 10);

	private String name;

	private int index;

	private EUserConstant(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public static String getName(int index) {
		for (EUserConstant c : EUserConstant.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}

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
