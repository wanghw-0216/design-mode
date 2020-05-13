package com.fun.design.command;

/**
 * @ClassName Receiver
 * @Description 接收者
 * @Author whw
 * @Date 2020/5/8 13:14
 * @Version 1.0
 **/
public class Receiver {
    //真正执行命令相应的操作
    public void action() {
        System.out.println("step  1");
        System.out.println("step  2");
        System.out.println("step  3");
        System.out.println("一号操作执行完毕");
    }

    public void action2() {
        System.out.println("step  a");
        System.out.println("step  b");
        System.out.println("step  c");
        System.out.println("2号操作执行完毕");
    }
}
