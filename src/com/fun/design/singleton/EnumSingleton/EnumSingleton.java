package com.fun.design.singleton.EnumSingleton;

/**
 * @ClassName EnumSingleton
 * @Description 使用枚举来实现单例
 * 优点：1.实现更加简洁。
 *  2、无偿提供了序列化的机制。
 *  3、JVM从根本上提供保障，绝对防止多次实例化。
 *  4、更简洁、更安全、更高效的实现单例的方式。
 *
 */

public enum  EnumSingleton {
    //实例
    INSTANCE;

    //其他方法
    public void otherMethod(){
        //do something
    }
}
