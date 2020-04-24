package com.fun.design.mediator;

/**
 * @ClassName Colleague1
 * @Description TODO
 * @Author whw
 * @Date 2020/4/17 17:52
 * @Version 1.0
 **/
public class Colleague1 extends Colleague {


    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void replay() {
        System.out.println("一号接收到消息，发起回复" + this.toString());
    }

    @Override
    public void send(){
        System.out.println("一号同事类发出消息");
        mediator.replay(this);
    }
}
