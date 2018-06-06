package com.imooc.utils;

import com.imooc.domain.Result;

/**
 * java类简单作用描述
 *
 * @ProjectName: girl
 * @Package: com.imooc.utils
 * @ClassName: ${TYPE_NAME}
 * @Author: 武俊杰
 * @CreateDate: 2018/6/1 14:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2018
 */
public class ResultUtil {

    /**
    * @Description: 成功执行的返回类型
    * @Param: [object]
    * @return: com.imooc.domain.Result
    * @Author: 武俊杰
    * @Date: 2018/6/1 14:15
    */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
    * @Description:
    * @Param: []
    * @return: com.imooc.domain.Result
    * @Author: 武俊杰
    * @Date: 2018/6/1 15:18
    */
    public static Result success(){
        return success(null);
    }

    /**
    * @Description: 报错执行的返回类型
    * @Param: [code, msg]
    * @return: com.imooc.domain.Result
    * @Author: 武俊杰
    * @Date: 2018/6/1 13:18
    */
    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
