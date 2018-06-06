package com.imooc.enums;

/**
 * 枚举类
 * 用于管理code和message
 *
 * @ProjectName: girl
 * @Package: com.imooc.enums
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 15:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
public enum ResultEnum {
    UNkONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你还在上小学"),
    MIDDLE_SCHOOL(101,"你可能在上初中吧")
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
