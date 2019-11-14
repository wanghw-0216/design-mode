package com.fun.design.抽象工厂模式.product.impl;

import com.fun.design.抽象工厂模式.product.ProductB;

/**
 * @ClassName ProductB1
 * @Description TODO
 * @Author whw
 * @Date 2019/11/13 17:30
 * @Version 1.0
 */
public class ProductB1 implements ProductB {

    @Override
    public void createB() {
        System.out.println("我是B1，我适配A2");
    }
}
