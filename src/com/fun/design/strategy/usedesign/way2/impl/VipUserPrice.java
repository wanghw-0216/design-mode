package com.fun.design.strategy.usedesign.way2.impl;

import com.fun.design.strategy.usedesign.Strategy;

/**
 * @ClassName VipUserPrice
 * @Description TODO
 * @Author whw
 * @Date 2019/8/7 18:12
 * @Version 1.0
 */
public class VipUserPrice implements Strategy {
    @Override
    public double getPrice(double goodsPrice) {
        System.out.println("vip用户，折扣10%");
        return goodsPrice*(1-0.1);
    }
}
