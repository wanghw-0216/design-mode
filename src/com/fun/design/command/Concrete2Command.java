package com.fun.design.command;

/**
 * @ClassName Concrete2Command
 * @Description TODO
 * @Author whw
 * @Date 2020/5/8 15:38
 * @Version 1.0
 **/
public class Concrete2Command implements Command{
    private Receiver receiver = null;
    public Concrete2Command(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action2();
    }
}
