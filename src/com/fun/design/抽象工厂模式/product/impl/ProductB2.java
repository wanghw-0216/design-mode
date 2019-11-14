package com.fun.design.抽象工厂模式.product.impl;

import com.fun.design.抽象工厂模式.product.ProductB;

/**
 * @ClassName ProductB2
 * @Description TODO
 * @Author whw
 * @Date 2019/11/13 17:31
 * @Version 1.0
 */
public class ProductB2 implements ProductB {
    @Override
    public void createB() {
        System.out.println("我是B2，我配合A1");
    }
}
