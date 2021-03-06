package com.imooc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc.controller
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 20:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void girlList() {
        try {
            mvc.perform(MockMvcRequestBuilders.get("/girls"))
                    .andExpect(MockMvcResultMatchers.status().isOk());
            //.andExpect(MockMvcResultMatchers.content().string("abc"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static List<Integer> list = new ArrayList<Integer>();

    public static int getNumber()
    {
        Random ran = new Random();
        int a = ran.nextInt(20);
        for(int x:list)
        {
            if(x==a)
                return getNumber();
        }
        list.add(a);
        return a;
    }
    public static void main(String[] args) {

        for(int i=0;i<10;i++)
        {
            System.out.print(getNumber()+" ");
        }

    }
}