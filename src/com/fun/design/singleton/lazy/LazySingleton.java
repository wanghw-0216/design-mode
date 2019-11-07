package com.fun.design.singleton.lazy;

/**
 * @ClassName LazySingleton
 * @Description 懒汉式单例模式
 * @Author whw
 * @Date 2019/11/5 14:07
 * @Version 1.0
 */
public class LazySingleton {

    /**
     * 定义一个变量存储类实例(区别于饿汉式)
     * 之所以有这个变量是为了在第一次创建了实例以后，能够有地方将这个实例保存下来，从而可以复用这个实例。
     */
    private static LazySingleton uniqueInstance = null;

    //私有化构造方法
    private LazySingleton(){}

    /**
     * @Author whw
     * @Description //定义一个方法，对外提供实例。加锁，防止并发创建多个实例。
     * @Date 14:10 2019/11/5
     * @Param []
     * @return com.fun.design.singleton.lazy.LazySingleton
     */
    public static synchronized LazySingleton getUniqueInstance(){
            if(uniqueInstance == null){
                uniqueInstance = new LazySingleton();
            }
            return uniqueInstance;
    }
}
