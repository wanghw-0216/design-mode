package test.nomodel.BuilderMode;

/**
 * @ClassName ExportHeaderModel
 * @Description 导出文件的头部信息
 * @Author whw
 * @Date 2019/11/15 13:21
 * @Version 1.0
 */
public class ExportHeaderModel {

    private String depId;

    private String exportDate;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
