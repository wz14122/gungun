package cn.edu.cqie.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

/**
 * @author wz
 * 
 *         基础请求类
 *
 */
public class BaseRequestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4878049820678674408L;

	@NotBlank(message = "token令牌不能为空")
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "BaseRequestDto [token=" + token + "]";
	}

}
