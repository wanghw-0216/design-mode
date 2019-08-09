package com.fun.design.strategy.usedesign.way2;

/**
 * @ClassName Strategy
 * @Description 策略类，定义算法的接口
 * @Author whw
 * @Date 2019/8/7 17:08
 * @Version 1.0
 */
public interface Strategy {

    /**
     * @Author whw
     * @Description //定义算法的方法。
     * @Date 18:00 2019/8/7
     * @Param []
     * @return double
     */
    public double getPrice(double goodsPrice);
}
