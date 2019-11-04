package com.fun.design.simpleFactory.impl;

import com.fun.design.simpleFactory.Api;

/**
 * @ClassName Api2Impl
 * @Description TODO
 * @Author whw
 * @Date 2019/9/17 14:03
 * @Version 1.0
 */
public class Api2Impl implements Api {
    @Override
    public void test(String s) {
        System.out.println("实现类2号打印参数:" + s);
    }
}
