package com.fun.design.strategy.usedesign.impl;

import com.fun.design.strategy.usedesign.Strategy;

/**
 * @ClassName OldUserPrice
 * @Description TODO
 * @Author whw
 * @Date 2019/8/7 18:11
 * @Version 1.0
 */
public class OldUserPrice implements Strategy {
    @Override
    public double getPrice(double goodsPrice) {
        System.out.println("老用户，折扣5%");
        return goodsPrice * (1-0.5);
    }
}
