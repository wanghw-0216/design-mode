package com.fun.design.adapter.file_api.impl;

import com.fun.design.adapter.file_api.LogFileOperateApi;
import com.fun.design.adapter.model.LogModel;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

/**
 * @ClassName logFileOperateApiImp
 * @Description
 * @Author whw
 * @Date 2019/9/24 11:06
 * @Version 1.0
 */
@Service
public class LogFileOperateApiImp implements LogFileOperateApi {
    //定义一个日志文件，此处默认为项目根目录下的test.log
    private String filePathName = "test.log";
    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        File f = new File(filePathName);
        ObjectInputStream oin = null;

        try {
            oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
            list = (List<LogModel>) oin.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                oin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File f = new File(filePathName);
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            outputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
