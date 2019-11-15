package com.fun.design.生成器模式.client;

import com.fun.design.生成器模式.builder.impl.BuilderA;
import com.fun.design.生成器模式.director.Director;
import com.fun.design.生成器模式.product.Product;

import java.util.Locale;

/**
 * @ClassName client
 * @Description 用户
 * @Author whw
 * @Date 2019/11/15 14:27
 * @Version 1.0
 */
public class client {

    public static void main(String[] args) {
        BuilderA builderA = new BuilderA();
        Director director = new Director(builderA);
        director.construct("A111" , "Aname");
        Product result = builderA.getResult();
        System.out.println(result.getProductId() + "---" + result.getpName());
    }

}
