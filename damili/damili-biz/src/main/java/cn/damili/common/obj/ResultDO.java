package cn.damili.common.obj;

import java.util.Map;

/**
 * 
 * @ClassName: ResultDO 
 * @Description:  
 * @author laiweibin08@163.com   
 * @date 
 * @param <T>
 */
public class ResultDO<T> {
	
	private boolean success = false;
	/**
	 * 
	 */
	private T result;
	
	private int code;
	
	private String msg;
	
	private Map<String, String> ext;
	
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, String> getExt() {
		return ext;
	}
	public void setExt(Map<String, String> ext) {
		this.ext = ext;
	}
	@Override
	public String toString() {
		return "ResultDO [success=" + success + ", result=" + result
				+ ", code=" + code + ", msg=" + msg + ", ext=" + ext + "]";
	}

}

