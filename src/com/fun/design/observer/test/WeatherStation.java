package com.fun.design.observer.test;

import com.fun.design.observer.CurrentConditionsDisplay;
import com.fun.design.observer.NewsPaper;
import com.fun.design.observer.Reader;
import com.fun.design.observer.WeathreData;

/**
 * @ClassName Weather
 * @Description TODO
 * @Author whw
 * @Date 2019/8/28 20:00
 * @Version 1.0
 */
public class WeatherStation {
    public static void main(String[] args) {
        Reader reader1 = new Reader("张三");
        Reader reader2 = new Reader("李四");
        Reader reader3 = new Reader("赵五");
        NewsPaper newsPaper = new NewsPaper();
        newsPaper.registerObserver(reader1);
        newsPaper.registerObserver(reader2);
        newsPaper.registerObserver(reader3);
        newsPaper.removeObserver(reader2);
        newsPaper.publishPaper();

    }
}
