package com.imooc.handle;

import com.imooc.domain.Result;
import com.imooc.exception.GirlException;
import com.imooc.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc.handle
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 14:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        if (e instanceof GirlException){
            GirlException girlException = (GirlException)e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            LOGGER.info("[系统异常] {}",e);
            return ResultUtil.error(-1, "未知错误");
        }
    }
}
