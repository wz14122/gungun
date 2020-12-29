package cn.edu.cqie.utils;

public class BizException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1594315591333160895L;

	private String code;
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
