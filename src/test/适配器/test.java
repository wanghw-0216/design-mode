package test.适配器;

import com.fun.design.adapter.Adapter;
import com.fun.design.adapter.db_api.DBLogOperaterApi;
import com.fun.design.adapter.db_api.impl.DBLogOperaterApiImpl;
import com.fun.design.adapter.file_api.LogFileOperateApi;
import com.fun.design.adapter.file_api.impl.LogFileOperateApiImp;
import com.fun.design.adapter.model.LogModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName test
 * @Description TODO
 * @Author whw
 * @Date 2019/9/24 11:22
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogContent("test log no.1");
        logModel.setLogId("000001");
        logModel.setOperateUser("No.1");
        logModel.setOperateTime(new Date().toString());
        List<LogModel> list = new ArrayList<>();
        list.add(logModel);


        LogFileOperateApi logFileOperateApi = new LogFileOperateApiImp();

        DBLogOperaterApi dbLogOperaterApi = new DBLogOperaterApiImpl();
        //write log
//        logFileOperateApi.writeLogFile(list);
        //read log
        List<LogModel> logModels = logFileOperateApi.readLogFile();
        for (LogModel model : logModels) {
            System.out.println(model.toString());
        }
//        dbLogOperaterApi.addLog(logModel);
        dbLogOperaterApi.getAll();


        //调用适配器
        DBLogOperaterApi adapter = new Adapter();
        adapter.addLog(logModel);
        adapter.getAll();

    }
}
