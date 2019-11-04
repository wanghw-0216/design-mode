package com.fun.design.facade.facademodule;

import com.fun.design.facade.service.AService;
import com.fun.design.facade.service.BService;
import com.fun.design.facade.service.CService;
import com.fun.design.facade.service.impl.AServiceImpl;
import com.fun.design.facade.service.impl.BServiceImpl;
import com.fun.design.facade.service.impl.CServiceImpl;

/**
 * @ClassName Facade
 * @Description TODO
 * @Author whw
 * @Date 2019/9/20 14:17
 * @Version 1.0
 */
public class Facade {

    public void test(){
        AService a = new AServiceImpl();
        a.testA();
        BService b = new BServiceImpl();
        b.testb();
        CService c = new CServiceImpl();
        c.testc();
    }
}
