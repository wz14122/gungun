package cn.edu.cqie.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author potato Game大区
 */
public enum GameAreaEnum {

	D1(11, "000011", "电一"),

	d5(15, "000015", "电五"),

	d8(18, "000018", "电八"),

	S1(21, "000021", "双一"),

	S2(22, "000022", "双一"),

	S4(24, "000024", "双一"),

	S5(127, "000127", "体验服"),;

	private int code; // 本地数据库值
	private String distCode; // 远程
	private String message; // 内容

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
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

	private GameAreaEnum(int code, String distCode, String message) {
		this.code = code;
		this.distCode = distCode;
		this.message = message;
	}

	public static GameAreaEnum getByDistCode(String distCode) {
		for (GameAreaEnum c : GameAreaEnum.values()) {
			if (c.getDistCode().equals(distCode)) {
				return c;
			}
		}
		return null;
	}

	public static GameAreaEnum getByCode(int code) {
		for (GameAreaEnum c : GameAreaEnum.values()) {
			if (c.getCode() == code) {
				return c;
			}
		}
		return null;
	}

	public static List<Map<String, Object>> getAll() {
		List<Map<String, Object>> lst = new ArrayList<Map<String, Object>>();
		for (GameAreaEnum c : GameAreaEnum.values()) {
			Map<String, Object> item = new HashMap<String, Object>();
			item.put("gameArea", c.getDistCode());
			item.put("name", c.getMessage());

			lst.add(item);
		}
		return lst;
	}

}
