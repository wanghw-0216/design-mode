package com.fun.design.command;

/**
 * @ClassName ConcreteCommand
 * @Description 具体的命令实现对象
 * @Author whw
 * @Date 2020/5/8 11:36
 * @Version 1.0
 **/
public class ConcreteCommand implements Command {
    //持有相应的接收者对象
    private Receiver receiver = null;

    //示意，命令对象可以有自己的状态
    private String state;

    //构造方法，传入相应的接收者
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        //通常会调用接收者对象的相应方法，让接收者来真正执行功能
        receiver.action();
    }
}
