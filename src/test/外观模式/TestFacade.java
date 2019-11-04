package test.外观模式;

import com.fun.design.facade.facademodule.Facade;
import com.fun.design.facade.service.AService;
import com.fun.design.facade.service.impl.AServiceImpl;

import java.nio.channels.AsynchronousServerSocketChannel;

/**
 * @ClassName TestFacade
 * @Description TODO
 * @Author whw
 * @Date 2019/9/20 14:18
 * @Version 1.0
 */
public class TestFacade {
    public static void main(String[] args) {
        Facade f = new Facade();
        f.test();

        AService aService = new AServiceImpl();


    }



}
