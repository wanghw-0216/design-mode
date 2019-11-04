package com.fun.design.simpleFactory.factory;

import com.fun.design.simpleFactory.Api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @ClassName ConfigurateFactory
 * @Description 通过读取 配置文件的方式实现简单工厂模式,此方式可配置~
 * @Author whw
 * @Date 2019/9/17 15:22
 * @Version 1.0
 */
public class ConfigurateFactory {

    public static Api createApi(String s){
        Properties properties = new Properties();
        InputStream in = null;
        in = ConfigurateFactory.class.getResourceAsStream("factory.properties");
        try {
            properties.load(new InputStreamReader(in, "utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Api api = null;
        try {
            api = (Api) Class.forName(properties.getProperty(s)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
