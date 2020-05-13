package com.fun.design.command;

/**
 * @ClassName Client
 * @Description 这个不是我们通常意义上的测试客户端，
 * 主要功能是要创建命令对象并设定它的接收者，因此这里并没有调用执行的代码。
 * @Author whw
 * @Date 2020/5/8 14:31
 * @Version 1.0
 **/
public class Client {
    //负责创建命令对象，并设定他的接收者。
    public void assemble(){

    }

    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //此处的command可以是不同的类，然后会执行不同的命令
        Command command = new ConcreteCommand(receiver);
        Command command2 = new Concrete2Command(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand1(command);
        invoker.setCommand2(command2);
        invoker.runCommand1();
        invoker.runCommand2();
    }
}
