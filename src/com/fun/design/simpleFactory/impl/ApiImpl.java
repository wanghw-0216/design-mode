package com.fun.design.simpleFactory.impl;

import com.fun.design.simpleFactory.Api;

/**
 * @ClassName ApiImpl
 * @Description TODO
 * @Author whw
 * @Date 2019/9/17 14:00
 * @Version 1.0
 */
public class ApiImpl implements Api {

    @Override
    public void test(String s) {
        System.out.println("实现类一号打印参数:" + s);
    }
}
