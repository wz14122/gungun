package cn.edu.cqie.config;

import java.util.Map;

import cn.edu.cqie.enums.RespToAppEnum;

public class ResultBean {

	private String code;
	private String message;
	private Map<String, Object> data;

	private ResultBean() {

	}

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

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public static ResultBean error(String code, String message) {
		ResultBean resultBean = new ResultBean();
		resultBean.setCode(code);
		resultBean.setMessage(message);
		return resultBean;
	}

	public static ResultBean success() {
		ResultBean resultBean = new ResultBean();
		resultBean.setCode(RespToAppEnum.SUCCESS.getCode());
		resultBean.setMessage(RespToAppEnum.SUCCESS.getMessage());
		return resultBean;
	}

	public static ResultBean success(Map<String, Object> result) {
		ResultBean resultBean = new ResultBean();
		resultBean.setCode(RespToAppEnum.SUCCESS.getCode());
		resultBean.setMessage(RespToAppEnum.SUCCESS.getMessage());
		resultBean.setData(result);
		return resultBean;
	}

}
