package com.fun.design.strategy.normal;

/**
 * @ClassName Quote
 * @Description 普通的报价系统，需求如下：
 * 1. 对于普通用户或者新用户报全价。
 * 2. 对于老客户报统一折扣价，折扣5%。
 * 3. 对于超级vip客户报价折扣10%。
 * @Author whw
 * @Date 2019/8/7 16:46
 * @Version 1.0
 *
 *
 * 解析：
 * 1、造成以下问题的根本原因是算法和使用算法的客户是耦合的，甚至是密不可分的。通用一些就是，变化的代码和不变化的代码是耦合的。
 * 2、运用策略模式解决问题的思路为：
 *   a、把所有的计算方式独立出来，每个计算方式做成一个单独的类。即，找出应用中可能变化的部分，把它们独立出来。
 *   b、针对接口编程，而不是针对实现。具体就是单独出来的类实现一个统一的接口，客户端使用该接口类型的变量，然后变量的值通过new不同的实现类来赋予。
 *
 *
 *
 *
 *
 */
public class Quote {

    /**
     * @Author whw
     * @Description //简单的方式。但是吧报价管理类跟价格计算类放到了一起。以后扩展的时候，该类会越来越大越来越难以维护。
     * @Date 16:58 2019/8/7
     * @Param [people, goodsPrice]
     * @return double
     */
    public double quotePrice(String people , double goodsPrice){
        if("普通用户".equals(people)){
            System.out.println("普通用户没有折扣");
            return goodsPrice;
        }
        if("老客户".equals(people)){
            System.out.println("老客户统一折扣5%");
            return goodsPrice*(1-0.05);
        }
        if("超级vip".equals(people)){
            System.out.println("统一折扣10%");
            return goodsPrice*(1-0.1);
        }
        //其他的一律原价
        return goodsPrice;
    }

    /**
     * @Author whw
     * @Description //针对上述问题的修改，将计算价格的方法放到另外一个类中。
     * 存在问题：
     * 1、getPrice的类会随着计算方法的增加而越来越庞大。
     * 2、当需要动态切换用户的报价方式的时候，需要改动已有的代码。
     * @Date 17:00 2019/8/7
     * @Param [people, goodsPrice]
     * @return double
     */
    public double quotePrice2(String people , double goodsPrice){
        GetPrice getPrice = new GetPrice();
        if("普通用户".equals(people)){
            System.out.println("普通用户没有折扣");
            return getPrice.getNewUserPrice(goodsPrice);
        }
        if("老客户".equals(people)){
            System.out.println("老客户统一折扣5%");
            return getPrice.getOldUserPrice(goodsPrice);
        }
        if("超级vip".equals(people)){
            System.out.println("统一折扣10%");
            return getPrice.getVipPrice(goodsPrice);
        }
        //其他的一律原价
        return goodsPrice;
    }





}
