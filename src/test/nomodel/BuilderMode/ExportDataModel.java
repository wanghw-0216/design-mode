package test.nomodel.BuilderMode;

/**
 * @ClassName ExportDataModel
 * @Description 输出数据
 * @Author whw
 * @Date 2019/11/15 13:29
 * @Version 1.0
 */
public class ExportDataModel {
    private String productId;

    private double privce;

    private double amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrivce() {
        return privce;
    }

    public void setPrivce(double privce) {
        this.privce = privce;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
