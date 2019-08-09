package com.fun.design.strategy.usedesign.way2;

/**
 * @ClassName StrategyContext
 * @Description 上下文对象。负责持有算法，但是不负责决定具体选用哪个算法，而是交给客户选择具体的算法。客户选择好以后
 * 将该算法设置到上下文对象中，让上下文对象持有客户选择的算法。客户需要执行的时候通知上下文对象，上下文对象则转调具体的算法。
 * 这样的话，具体的算法和使用算法的客户是分离的。
 * @Author whw
 * @Date 2019/8/7 17:43
 * @Version 1.0
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    public double userGetPrice(double goodsPirce){
        double price = strategy.getPrice(goodsPirce);
        return price;
    }

}
