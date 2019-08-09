package com.fun.design.strategy.usedesign.test;

import com.fun.design.strategy.usedesign.StrategyContext;
import com.fun.design.strategy.usedesign.impl.NewUserGetPrice;

/**
 * @ClassName DesignTest
 * @Description TODO
 * @Author whw
 * @Date 2019/8/8 10:53
 * @Version 1.0
 */
public class DesignTest {
    public static void main(String[] args) {
        //选择要使用的策略对象，赋值使用实现类，但是变量的声明使用超类，这就是针对接口编程。
        NewUserGetPrice newUserGetPrice = new NewUserGetPrice();
        //创建上下文，指定该持有那个算法。
        StrategyContext strategyContext = new StrategyContext(newUserGetPrice);
        double v = strategyContext.userGetPrice(100);
        System.out.println("向客户报价" + v);
    }
}
