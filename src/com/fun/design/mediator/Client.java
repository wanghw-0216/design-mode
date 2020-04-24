package com.fun.design.mediator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author whw
 * @Date 2020/4/24 15:44
 * @Version 1.0
 **/
public class Client {


    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Colleague c1,c2;
        c1 = new Colleague1(mediator);
        c2 = new Colleague2(mediator);
        mediator.setC1(c1);
        mediator.setC2(c2);
        c1.send();
        System.out.println("------------------");
        c2.send();
    }
}
