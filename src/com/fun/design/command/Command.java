package com.fun.design.command;

/**
 * @InterfaceName Command
 * @Description 命令接口，声明要执行的操作。
 * @Author whw
 * @Date 2020/5/8 11:34
 * @Version 1.0
 **/
public interface Command {
    /**
     * @Description //执行命令对应的操作
     **/
     void execute();
}
