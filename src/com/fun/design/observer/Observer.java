package com.fun.design.observer;

/**
 * @Author whw
 * @Description //观察者接口
 * @Date 17:06 2019/8/28
 * @Param
 * @return
 */
public interface Observer {
    public void updateStatus(float temparature, float humidity, float pressure);

    void getNewsPaper();
}
