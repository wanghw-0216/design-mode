package com.fun.design.adapter.file_api;

import com.fun.design.adapter.model.LogModel;

import java.util.List;

/**
 * @Author whw
 * @Description //操作日志文件接口
 * @Date 11:00 2019/9/24
 * @Param
 * @return
 */
public interface LogFileOperateApi {
    /**
     * @Author whw
     * @Description //read  log  file
     * @Date 11:01 2019/9/24
     * @Param []
     * @return java.util.List<com.fun.design.adapter.model.LogModel>
     */
    public List<LogModel> readLogFile();

    /**
     * @Author whw
     * @Description //write log file
     * @Date 11:02 2019/9/24
     * @Param [list]
     * @return void
     */
    public void writeLogFile(List<LogModel> list);
}
