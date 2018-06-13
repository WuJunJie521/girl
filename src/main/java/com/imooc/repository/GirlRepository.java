package com.imooc.repository;

import com.imooc.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/5/31 19:31
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> ,JpaSpecificationExecutor<Girl> {

    /**
     * 根据年龄查询
     * @param age   年龄
     * @return
     */
    public List<Girl> findByAge(Integer age);
}
