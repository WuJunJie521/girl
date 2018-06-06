package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc.exception
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 14:52
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
