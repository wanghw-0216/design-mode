package com.fun.design.strategy.normal;

/**
 * @ClassName GetPrice
 * @Description TODO
 * @Author whw
 * @Date 2019/8/7 17:01
 * @Version 1.0
 */
public class GetPrice {
    /**
     * @Author whw
     * @Description //计算新用户的方法
     * @Date 17:01 2019/8/7
     * @Param
     * @return
     */
    public double getNewUserPrice(double goodsPrice) {
        System.out.println("计算新用户的方式");
        return goodsPrice;
    }


    /**
     * @Author whw
     * @Description //计算老用户的方法
     * @Date 17:01 2019/8/7
     * @Param
     * @return
     */
    public double getOldUserPrice(double goodsPrice){
        System.out.println("计算老用户的方式");
        return goodsPrice * (1-0.05);
    }



    /**
     * @Author whw
     * @Description //计算vip的方法
     * @Date 17:01 2019/8/7
     * @Param
     * @return
     */
    public double getVipPrice(double goodsPrice){
        System.out.println("计算vip的方式");
        return goodsPrice * (1-0.1);
    }
}
