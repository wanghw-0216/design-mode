package com.fun.design.mediator;

/**
 * @ClassName MediatorImpl
 * @Description TODO
 * @Author whw
 * @Date 2020/4/24 15:30
 * @Version 1.0
 **/
public class Mediator {

    private Colleague c1 =  null;

    private Colleague c2 = null;

    public void setC1(Colleague c1) {
        this.c1 = c1;
    }

    public void setC2(Colleague c2) {
        this.c2 = c2;
    }

    public void replay(Colleague colleague) {
        if(colleague.equals(c1)){
            c2.replay();
        }
        if(colleague.equals(c2)){
            c1.replay();
        }
    }
}
