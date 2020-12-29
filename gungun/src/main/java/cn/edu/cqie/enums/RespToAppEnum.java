package cn.edu.cqie.enums;

public enum RespToAppEnum {

	// 基础类型返回值000-100
	SUCCESS("001", "000001", "成功"),
	
	ERROR("000", "000000", "失败")
	;

	private String code; // 本地
	private String distCode; // 远程
	private String message; // 内容

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDistCode() {
		return distCode;
	}

	public void setDistCode(String distCode) {
		this.distCode = distCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private RespToAppEnum(String code, String distCode, String message) {
		this.code = code;
		this.distCode = distCode;
		this.message = message;
	}

}
