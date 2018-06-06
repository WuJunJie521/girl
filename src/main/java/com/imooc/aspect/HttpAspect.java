package com.imooc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc.aspect
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 12:02
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.imooc.controller.GirlController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url地址
        LOGGER.info("url={}",request.getRequestURI());

        //method方法
        LOGGER.info("method={}",request.getMethod());

        //ip地址
        LOGGER.info("ip={}",request.getRemoteAddr());

        //类方法
        LOGGER.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        //参数
        LOGGER.info("args={}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        LOGGER.info("22222222");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        LOGGER.info("response={}",object.toString());
    }
}
