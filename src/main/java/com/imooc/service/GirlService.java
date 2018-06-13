package com.imooc.service;

import com.imooc.domain.Girl;

import java.util.List;

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
public interface GirlService {

    /**
     * 查询所有女孩
     * @return
     */
    public List<Girl> findAll();

    /**
     * 添加女孩
     * @param girl
     */
    public Girl saveGirl(Girl girl);

    /**
     * 根据id删除女孩
     * @param id
     */
    public void delGirl(Integer id);

    /**
     * 根据对象更新
     * @param girl
     * @return
     */
    public Girl updateGirl(Girl girl);

    /**
     * 添加2个女孩
     */
    public void insertTwo();

    /**
     * 根据ID获取年龄
     * @param id
     */
    public void getAge(Integer id);

    /**
     * 根据年龄查询
     * @param age   年龄
     * @return
     */
    public List<Girl> findByAge(Integer age);

    /**
    * @Description: 通过ID查询一个女生的信息
    * @Param: [id]
    * @return: com.imooc.domain.Girl
    * @Author: 武俊杰
    * @Date: 2018/6/1 19:41
    */
    public Girl findById(Integer id);
}
