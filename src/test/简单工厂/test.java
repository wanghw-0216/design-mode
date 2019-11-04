package test.简单工厂;

import com.fun.design.simpleFactory.Api;
import com.fun.design.simpleFactory.factory.ConfigurateFactory;
import com.fun.design.simpleFactory.factory.SimpleFactory;

/**
 * @ClassName test
 * @Description 此处调用方只需要知道接口和工厂类即可，不需要知道具体的实现类。能够使得提供服务方实现更好的封装，暴露更少的类。
 * @Author whw
 * @Date 2019/9/17 14:09
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Api api = SimpleFactory.createApi(1);
        api.test("我是简单 工厂模式");

        Api api1 = SimpleFactory.createApi(2);
        api1.test(" this is simpleFactory");

        Api api2 = ConfigurateFactory.createApi("implClass");
        api2.test("可配置的");
    }
}
