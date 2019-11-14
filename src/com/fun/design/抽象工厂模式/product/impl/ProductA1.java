package com.fun.design.抽象工厂模式.product.impl;

import com.fun.design.抽象工厂模式.product.ProductA;

/**
 * @ClassName ProductA1
 * @Description TODO
 * @Author whw
 * @Date 2019/11/13 17:30
 * @Version 1.0
 */
public class ProductA1 implements ProductA {

    @Override
    public void createProductA() {
        System.out.println("我是A1，我适配B2");
    }
}
