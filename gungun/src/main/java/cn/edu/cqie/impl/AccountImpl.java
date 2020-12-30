package cn.edu.cqie.impl;

import org.springframework.stereotype.Service;

import cn.edu.cqie.bo.AccountBo;
import cn.edu.cqie.enums.GameAreaEnum;
import cn.edu.cqie.service.AccountService;

@Service
public class AccountImpl implements AccountService {

	@Override
	public AccountBo load(AccountBo bo) {

		// 1加载大区
		bo.setGameAreaLst(GameAreaEnum.getAll());
		
		// 2加载服务器，与大区联动
		

		return bo;
	}

}
