package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 9:22
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transient
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(38);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(39);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if (age < 10){
            //返回"你还在上小学"    code=100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age < 16){
            //返回"你可能在上初中吧"  code=101
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
        //如果>16岁,加钱
        //....
    }

    /** 
    * @Description: 通过ID查询一个女生的信息 
    * @Param: [id] 
    * @return: com.imooc.domain.Girl 
    * @Author: 武俊杰 
    * @Date: 2018/6/1 19:41
    */
    public Girl findById(Integer id) {
        return girlRepository.findById(id).get();
    }
}
