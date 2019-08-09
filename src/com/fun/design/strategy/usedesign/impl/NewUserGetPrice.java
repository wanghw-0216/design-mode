package com.fun.design.strategy.usedesign.impl;

import com.fun.design.strategy.usedesign.Strategy;

/**
 * @ClassName NewUserGetPrice
 * @Description TODO
 * @Author whw
 * @Date 2019/8/7 18:09
 * @Version 1.0
 */
public class NewUserGetPrice implements Strategy {

    @Override
    public double getPrice(double goodsPrice) {
        System.out.println("新用戶，全价");
        return goodsPrice;
    }
}
