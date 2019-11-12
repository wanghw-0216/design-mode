package com.fun.design.工厂方法模式.careator;


import com.fun.design.工厂方法模式.productor.ProductorApi;

/**
 * @Author whw
 * @Description //创建器
 * @Date 18:38 2019/11/7
 * @Param
 * @return
 */
public abstract class FactoryCreator {

    public void doSomething(){
        System.out.println("this is creator");
        ProductorApi productorApi = factoryMethod();
        productorApi.doSomething();
    }

    /**
     * @Author whw
     * @Description //创建Product的工厂方法
     * @Date 18:39 2019/11/7
     * @Param []
     * @return com.fun.design.工厂方法模式.productor.ProductorApi
     */
    protected abstract ProductorApi factoryMethod();
}
