package cn.edu.cqie.bo;

import java.util.List;
import java.util.Map;

/**
 * @author potato
 *
 *         业务逻辑对象
 */
public class AccountBo {

	private List<Map<String, Object>> gameAreaLst;

	public List<Map<String, Object>> getGameAreaLst() {
		return gameAreaLst;
	}

	public void setGameAreaLst(List<Map<String, Object>> gameAreaLst) {
		this.gameAreaLst = gameAreaLst;
	}

}
