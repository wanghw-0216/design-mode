package com.fun.design.生成器模式.builder;

/**
 * @ClassName Builder
 * @Description 生成器接口，用来创建产品的各个部件。
 * @Author whw
 * @Date 2019/11/15 14:04
 * @Version 1.0
 */
public interface Builder {

    /**
     * @Author whw
     * @Description //创建产品的第一个部分,id
     * @Date 14:07 2019/11/15
     * @Param [part1]
     * @return void
     */
     void builderPid(String id);

    /**
     * @Author whw
     * @Description //创建产品的第二个部分,pName
     * @Date 14:07 2019/11/15
     * @Param [part1]
     * @return void
     */
    void builderPname(String name);
}
