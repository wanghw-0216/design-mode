package com.fun.design.simpleFactory.factory;

import com.fun.design.simpleFactory.Api;
import com.fun.design.simpleFactory.impl.Api2Impl;
import com.fun.design.simpleFactory.impl.ApiImpl;

/**
 * @ClassName simpleFactory
 * @Description 创建api实例的工厂类
 * @Author whw
 * @Date 2019/9/17 14:04
 * @Version 1.0
 */
public class SimpleFactory {
    /**
     * @Author whw
     * @Description //创建api的实例，参数为1，创建一号实例，2创建2号实例
     *              //如果只有一个实现类，则不需要判断条件，直接返回new 实现类就好
     * @Date 14:05 2019/9/17
     * @Param
     * @return
     */
    public static Api createApi(int condition){
        Api api = null;
        if(condition ==1){
            //此处来产生实例，这样不必暴露给调用方具体的实现类
            api = new ApiImpl();
        }else if(condition == 2){
            api = new Api2Impl();
        }
        return api;
    }
}
