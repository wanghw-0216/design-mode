package com.fun.design.singleton.静态内部类实现单例;

/**
 * @ClassName Singleton
 * @Description 静态内部类实现单例。1、JVM保证线程的安全性。2、静态内部类，只要不使用这个类级内部类，那就不会创建对象实例，从而同时实现延迟加载和线程安全。
 * @Author whw
 * @Date 2019/11/7 10:39
 * @Version 1.0
 *
 * 1、调用getInstance的时候，第一次读取SingletonHolder.instance，从而使得SingletonHolder类得到初始化。
 * 2、当SingletonHolder被加载并被初始化的时候导致它的静态域初始化，从而创建Singleton实例。
 * 3、由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机保证他的线程安全性。
 * 4、这个模式的优势--getInstance方法没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
 *
 *
 *
 */
public class Singleton {

    /**
     * @Author whw
     * @Description //类级内部类，也就是静态内部类。该类的实例与外部类的实例没有绑定关系，而且只有被调用时才会装载，从而实现了延迟加载。
     * @Date 10:41 2019/11/7
     */
    private static class SingletonHolder{

        /**
         * 静态的初始化器，由JVM来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }

    /**
     * 私有化构造方法
     */
    private Singleton(){}

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

}
