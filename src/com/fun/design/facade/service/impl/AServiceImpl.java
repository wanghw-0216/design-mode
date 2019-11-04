package com.fun.design.facade.service.impl;

import com.fun.design.facade.service.AService;

/**
 * @ClassName AServiceImpl
 * @Description TODO
 * @Author whw
 * @Date 2019/9/20 14:13
 * @Version 1.0
 */
public class AServiceImpl implements AService {
    @Override
    public void testA() {
        System.out.println("客户端调用A功能");
    }
}
