package com.fun.design.抽象工厂模式.factory.impl;

import com.fun.design.抽象工厂模式.factory.AbstractFactory;
import com.fun.design.抽象工厂模式.product.ProductA;
import com.fun.design.抽象工厂模式.product.ProductB;
import com.fun.design.抽象工厂模式.product.impl.ProductA1;
import com.fun.design.抽象工厂模式.product.impl.ProductA2;
import com.fun.design.抽象工厂模式.product.impl.ProductB2;

/**
 * @ClassName AbstractFactoryImplA
 * @Description TODO
 * @Author whw
 * @Date 2019/11/13 17:24
 * @Version 1.0
 */
public class AbstractFactoryImplA implements AbstractFactory {
    @Override
    public ProductA createPA() {
        return new ProductA1();
    }

    @Override
    public ProductB createPB() {
        return new ProductB2();
    }
}
