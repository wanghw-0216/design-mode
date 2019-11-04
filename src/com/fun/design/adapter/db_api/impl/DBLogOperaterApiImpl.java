package com.fun.design.adapter.db_api.impl;

import com.fun.design.adapter.db_api.DBLogOperaterApi;
import com.fun.design.adapter.model.LogModel;

import java.util.List;

/**
 * @ClassName DBLogOperaterApiImpl
 * @Description TODO
 * @Author whw
 * @Date 2019/9/24 13:24
 * @Version 1.0
 */
public class DBLogOperaterApiImpl implements DBLogOperaterApi {
    @Override
    public void addLog(LogModel lm) {
        System.out.println("db add log success");
    }

    @Override
    public List<LogModel> getAll() {
        System.out.println("get all log  , give you !");
        return null;
    }
}
