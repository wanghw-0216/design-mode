package com.fun.design.proxy;

/**
 * @ClassName Proxy
 * @Description 代理对象
 * @Author whw
 * @Date 2020/5/6 17:06
 * @Version 1.0
 **/
public class Proxy implements Subject{
    // 被代理的具体对象
    private RealSubject realSubject = null;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //在调用具体对象前可以执行一些功能处理。例如，打印日志，或者权限校验等。
        before();
        realSubject.request();
        //调用之后可以做一些功能处理。
        after();
    }

    private void after() {
        System.out.println("调用完毕");
    }

    private void before() {
        System.out.println("开始调用目标对象");
    }
}
