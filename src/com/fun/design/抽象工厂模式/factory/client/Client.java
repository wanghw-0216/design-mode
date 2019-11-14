package com.fun.design.抽象工厂模式.factory.client;

import com.fun.design.抽象工厂模式.factory.AbstractFactory;
import com.fun.design.抽象工厂模式.factory.impl.AbstractFactoryImplA;
import com.fun.design.抽象工厂模式.factory.impl.AbstractFactoryImplB;
import com.fun.design.抽象工厂模式.product.ProductA;
import com.fun.design.抽象工厂模式.product.ProductB;

/**
 * @ClassName Client
 * @Description 客户端调用抽象工厂创建对象
 * @Author whw
 * @Date 2019/11/14 10:09
 * @Version 1.0
 */
public class Client {


    public static void main(String[] args) {
        //选择具体的工厂实现类
        AbstractFactory af = new AbstractFactoryImplA();
//    AbstractFactory af = new AbstractFactoryImplB();
        ProductA pa = af.createPA();
        ProductB pb = af.createPB();
        pa.createProductA();
        pb.createB();

    }
}
