package com.fun.design.Prototype.client;

import com.fun.design.Prototype.concretePrototype.ConcretePrototype1;
import com.fun.design.Prototype.prototype.Prototype;

/**
 * @ClassName Client
 * @Description 客户端
 * @Author whw
 * @Date 2019/11/25 14:07
 * @Version 1.0
 */
public class Client {



    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype1();
        ((ConcretePrototype1) prototype1).setClassName("实现1");
        //第一次创建实例
        ((ConcretePrototype1) prototype1).setFlag(3);

        while (((ConcretePrototype1) prototype1).getFlag() > 1){
            Prototype clone = prototype1.clone();
            //每创建一个新的实例就将初始对象的flag +1
            clone.setFlag(1);
            //以下用打印输出代替其他业务处理。
            System.out.println("多次克隆以后的实例为===" + clone.toString());
            prototype1.setFlag(((ConcretePrototype1) prototype1).getFlag() - 1);
            System.out.println("初始对象为===" + prototype1.toString());
        }

    }
}
