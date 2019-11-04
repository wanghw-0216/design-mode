package com.fun.design.facade.service.impl;

import com.fun.design.facade.service.CService;

/**
 * @ClassName CServiceImpl
 * @Description TODO
 * @Author whw
 * @Date 2019/9/20 14:14
 * @Version 1.0
 */
public class CServiceImpl implements CService {
    @Override
    public void testc() {
        System.out.println("客户端调用c功能");
    }
}
