package com.fun.design.工厂方法模式.client;

import com.fun.design.工厂方法模式.careator.FactoryCreator;
import com.fun.design.工厂方法模式.careator.impl.FactoryCreatorAImpl;
import com.fun.design.工厂方法模式.productor.ProductorApi;

/**
 * @ClassName ClientCode
 * @Description 测试
 * @Author whw
 * @Date 2019/11/8 10:14
 * @Version 1.0
 */
public class ClientCode {
    public static void main(String[] args) {
        FactoryCreator fc = new FactoryCreatorAImpl();
        fc.doSomething();
    }
}
