package com.fun.design.singleton.eager;

/**
 * @ClassName EagerSingleton
 * @Description 饿汉式单例模式
 * @Author whw
 * @Date 2019/11/5 14:16
 * @Version 1.0
 */
public class EagerSingleton {

    /**
     * 定义一个变量存储类实例(区别于饿汉式)
     * 之所以有这个变量是为了在第一次创建了实例以后，能够有地方将这个实例保存下来，从而可以复用这个实例。
     */
    private static EagerSingleton uniqueInstance = new EagerSingleton();


    //私有化构造方法
    private EagerSingleton() {
    }


    /**
     * @return com.fun.design.singleton.eager.EagerSingleton
     * @Author whw
     * @Description //对外提供获取实例的方法。设置成静态的，这样，客户端就可以直接调用这个方法，而不用实例化类。
     * @Date 14:18 2019/11/5
     * @Param []
     */
    public static EagerSingleton getUniqueInstance() {
        return uniqueInstance;
    }


}
