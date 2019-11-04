package com.fun.design.adapter;

import com.fun.design.adapter.db_api.DBLogOperaterApi;
import com.fun.design.adapter.file_api.LogFileOperateApi;
import com.fun.design.adapter.model.LogModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Adapter
 * @Description 适配器，将文件存储和db存储组合在一起供客户端调用
 * @Author whw
 * @Date 2019/9/24 14:07
 * @Version 1.0
 * 此处适配器实现了db操作日志的接口，并注入文件操作日志的接口。
 *客户端在调用适配器方法的时候，经过适配器的转调，可以直接调用第一版本的文件记录方式。
 */
public class Adapter implements DBLogOperaterApi {

    @Autowired
    private LogFileOperateApi logFileOperateApi;


    @Override
    public void addLog(LogModel lm) {
        List<LogModel> list = new ArrayList<>();
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAll() {
        List<LogModel> logModels = logFileOperateApi.readLogFile();
        return logModels;
    }
}
