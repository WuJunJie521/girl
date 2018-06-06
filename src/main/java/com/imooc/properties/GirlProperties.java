package com.imooc.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/5/31 16:22
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@Component
@ConfigurationProperties(prefix="girl")
public class GirlProperties {

    private String cupSize;

    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
