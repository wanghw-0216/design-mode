package com.fun.design.mediator;

import com.fasterxml.jackson.core.JsonToken;

/**
 * @ClassName Colleague2
 * @Description TODO
 * @Author whw
 * @Date 2020/4/17 17:52
 * @Version 1.0
 **/
public class Colleague2 extends Colleague {

    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send() {
        System.out.println("二号发起消息" + this.toString());
        mediator.replay(this);
    }

    @Override
    public void replay() {
        System.out.println("二号接收到消息"+this.toString());
    }
}
