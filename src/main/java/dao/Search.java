package dao;

/**
 * Created by baeonejune on 15. 1. 5..
 */
public class Search {
    private int dataId;
    private String productName;

    public int getId() {
        return dataId;
    }

    public void setId(int id) {
        this.dataId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
