package com.imooc.controller;

import com.imooc.domain.Girl;
import com.imooc.domain.Result;
import com.imooc.service.GirlService;
import com.imooc.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/5/31 19:27
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@RestController
public class GirlController {
    private final static Logger LOGGER = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlService girlService;
    
    /** 
    * @Description: 查询所有女生列表 
    * @Param: [] 
    * @return: java.util.List<com.imooc.Girl> 
    * @Author: 武俊杰 
    * @Date: 2018/5/31 19:38
    */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        LOGGER.info("girlList");
        return girlService.findAll();
    }

    /**
    * @Description: 添加一个女生
    * @Param: [cupSize, age]
    * @return: com.imooc.Girl
  @Author: 武俊杰
    * @Date: 2018/5/31 19:44
    */
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());

        return ResultUtil.success(girlService.saveGirl(girl));
    }

    /**
    * @Description: 查询一个女生
    * @Param: [id]
    * @return: com.imooc.Girl
    * @Author: 武俊杰
    * @Date: 2018/5/31 20:16
    */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlService.findById(id);
    }

    /**
    * @Description: 更新
    * @Param: [id, cupSize, age]
    * @return: com.imooc.Girl
    * @Author: 武俊杰
    * @Date: 2018/5/31 20:17
    */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlService.updateGirl(girl);
    }

    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
//        原因：更新或删除没有加事务
//        解决办法：
//        1、在Service层加@Transactional
//        2、在Repository层加@Modifying
        girlService.delGirl(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlService.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }

    @GetMapping(value = "/girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
        girlService.getAge(id);
    }
}
