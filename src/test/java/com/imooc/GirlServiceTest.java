package com.imooc;

import com.imooc.domain.Girl;
import com.imooc.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * GirlServiceTest测试类
 *
 * @ProjectName: girl
 * @Package: com.imooc
 * @ClassName: GirlServiceTest
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 19:39
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@AutoConfigureRestDocs(outputDir = "target/snippets")
//@ AutoConfigureRestDocs注解开启了生成snippets文件，并指定了存放位置。
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest(){
        Girl girl = girlService.findById(1);
        Assert.assertArrayEquals(new Integer[]{new Integer(18)}, new Integer[]{girl.getAge()});
    }

}
