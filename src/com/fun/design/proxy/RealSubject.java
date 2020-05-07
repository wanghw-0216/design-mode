package com.fun.design.proxy;

/**
 * @ClassName RealSubject
 * @Description 具体目标对象
 * @Author whw
 * @Date 2020/5/6 17:05
 * @Version 1.0
 **/
public class RealSubject implements Subject{
    @Override
    public void request() {
        //执行具体的功能逻辑
        System.out.println("具体的功能逻辑");
    }
}
