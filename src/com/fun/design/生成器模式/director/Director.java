package com.fun.design.生成器模式.director;

import com.fun.design.生成器模式.builder.Builder;

/**
 * @ClassName Director
 * @Description 指导者，指导构建过程
 * @Author whw
 * @Date 2019/11/15 14:14
 * @Version 1.0
 */
public class Director {


    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(String id ,String name){
        builder.builderPid(id);
        builder.builderPname(name);
    }

}
