package com.fun.design.facade.service.impl;

import com.fun.design.facade.service.BService;

/**
 * @ClassName BServiceImpl
 * @Description TODO
 * @Author whw
 * @Date 2019/9/20 14:13
 * @Version 1.0
 */
public class BServiceImpl implements BService {
    @Override
    public void testb() {
        System.out.println("客户端调用B功能");
    }
}
