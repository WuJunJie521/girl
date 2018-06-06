package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/5/31 15:23
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "id:" + id;
        //return girlProperties.getCupSize();
    }
}
