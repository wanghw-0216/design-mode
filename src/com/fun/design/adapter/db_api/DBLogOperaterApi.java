package com.fun.design.adapter.db_api;


import com.fun.design.adapter.model.LogModel;

import java.util.List;

/**
 * @Author whw
 * @Description //使用db存储日志信息
 * @Date 13:22 2019/9/24
 * @Param
 * @return
 */
public interface DBLogOperaterApi {
    /**
     * @Author whw
     * @Description //add log
     * @Date 13:23 2019/9/24
     * @Param [lm]
     * @return void
     */
    public void addLog(LogModel lm);

    /**
     * @Author whw
     * @Description //get all logs
     * @Date 13:24 2019/9/24
     * @Param []
     * @return java.util.List<com.fun.design.adapter.model.LogModel>
     */
    public List<LogModel> getAll();
}
