package com.fun.design.mediator;

/**
 * @ClassName Colleague
 * @Description 同事类的父类。用来约束同事类对象的行为，以及实现一些公用的方法。
 * @Author whw
 * @Date 2020/4/17 17:16
 * @Version 1.0
 **/
public abstract class Colleague {

    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    /**
     * @Author whw
     * @Description //发送消息
     * @Date 15:42 2020/4/24
     * @Param []
     * @return void
     **/
    public abstract void send();


    /**
     * @Author whw
     * @Description //答复消息
     * @Date 15:41 2020/4/24
     * @Param []
     * @return void
     **/
    public abstract void replay();

}
