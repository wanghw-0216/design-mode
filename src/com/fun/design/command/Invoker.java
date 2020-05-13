package com.fun.design.command;

/**
 * @ClassName Invoker
 * @Description 调用者
 * @Author whw
 * @Date 2020/5/8 14:29
 * @Version 1.0
 **/
public class Invoker {
    //持有命令对象
    private Command command1 = null;
    private Command command2 = null;

    public void setCommand1(Command command1) {
        this.command1 = command1;
    }

    public void setCommand2(Command command2) {
        this.command2 = command2;
    }


    //要求命令执行请求
    public void runCommand1() {
        //调用命令对象执行方法
        System.out.println("执行1号操作");
        command1.execute();
    }

    //执行二号操作
    public void runCommand2() {
        //调用命令对象执行方法
        System.out.println("执行2号操作");
        command2.execute();
    }
}
