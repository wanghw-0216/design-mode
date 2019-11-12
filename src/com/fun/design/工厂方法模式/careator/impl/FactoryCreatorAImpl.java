package com.fun.design.工厂方法模式.careator.impl;

import com.fun.design.工厂方法模式.careator.FactoryCreator;
import com.fun.design.工厂方法模式.productor.ProductorApi;
import com.fun.design.工厂方法模式.productor.impl.ProductorAImpl;

/**
 * @ClassName FactoryCreatorAImpl
 * @Description 创建器实现类
 * @Author whw
 * @Date 2019/11/8 9:58
 * @Version 1.0
 */
public class FactoryCreatorAImpl extends FactoryCreator {

    @Override
    public ProductorApi factoryMethod() {
        System.out.println("创建产品A实现类");
        return new ProductorAImpl();
    }
}
