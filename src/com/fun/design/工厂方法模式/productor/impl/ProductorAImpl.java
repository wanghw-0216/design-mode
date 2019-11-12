package com.fun.design.工厂方法模式.productor.impl;

import com.fun.design.工厂方法模式.productor.ProductorApi;

/**
 * @ClassName ProductorAImpl
 * @Description TODO
 * @Author whw
 * @Date 2019/11/7 18:36
 * @Version 1.0
 */
public class ProductorAImpl implements ProductorApi {
    @Override
    public void doSomething() {
        System.out.println("this is A 实现");
    }
}
