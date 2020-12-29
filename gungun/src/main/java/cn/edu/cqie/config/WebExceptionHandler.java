package cn.edu.cqie.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.cqie.enums.RespToAppEnum;
import cn.edu.cqie.utils.BizException;

@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {

	// 打印日志

	/**
	 * 自定义异常
	 * 
	 * @param BizException e
	 * @return
	 */
	@ExceptionHandler
	public ResultBean BizExceptions(BizException e) {

		// 打印日志
		return ResultBean.error(e.getCode(), e.getMessage());
	}

	@ExceptionHandler
	public ResultBean unknownException(Exception e) {

		// 打印日志
		return ResultBean.error(RespToAppEnum.ERROR.getCode(), RespToAppEnum.ERROR.getMessage());
	}
}
