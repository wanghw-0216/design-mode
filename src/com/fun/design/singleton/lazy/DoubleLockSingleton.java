package com.fun.design.singleton.lazy;

/**
 * @ClassName DoubleLockSingleton
 * @Description 双重加锁实现线程安全的懒汉式单例。
 * z
 * @Author whw
 * @Date 2019/11/6 20:15
 * @Version 1.0
 */
public class DoubleLockSingleton {
    //对保存实例的变量使用volatile修饰
    private volatile static DoubleLockSingleton instance = null;

    private DoubleLockSingleton(){};

    public static DoubleLockSingleton getInstance(){
        //先检查实例是否存在
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (DoubleLockSingleton.class){
                //再次检查实例是否存在，如果不存在才真正创建实例
                if(instance == null){
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }



}
