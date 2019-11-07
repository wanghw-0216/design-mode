package com.fun.design.singleton.缓存;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CatchSingleton
 * @Description 利用缓存实现单例模式
 * 只是一种实现扩展。
 * 缓存实现单例比较麻烦
 * @Author whw
 * @Date 2019/11/7 13:47
 * @Version 1.0
 */
public class CatchSingleton {

    //设定一个默认的key
    private final static String DEFAULT_KEY = "key";

    //缓存实例的容器
    private static Map<String , CatchSingleton> map = new HashMap<>();

    //私有化的构造方法
    private CatchSingleton(){}

    public static CatchSingleton getInstance(){
        CatchSingleton catchSingleton = map.get(DEFAULT_KEY);
        if(catchSingleton == null){
            catchSingleton = new CatchSingleton();
            map.put(DEFAULT_KEY , catchSingleton);
        }
        return catchSingleton;
    }
}
