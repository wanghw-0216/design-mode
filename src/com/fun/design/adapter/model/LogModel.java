package com.fun.design.adapter.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName LogModel
 * @Description 日志对象，
 * @Author whw
 * @Date 2019/9/24 10:48
 * @Version 1.0
 */
@Data
public class LogModel implements Serializable {

    private static final long serialVersionUID = -1732957693212370125L;
    //日志编号
    private String logId;

    //操作人员
    private String operateUser;

    //操作时间
    private String operateTime;

    //日志内容
    private String logContent;

    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", logContent='" + logContent + '\'' +
                '}';
    }
}
