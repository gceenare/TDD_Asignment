package za.ac.cput.domain;

public class Product {

   private int orderIdentification;
    private String productDetails;
   private String productList;


    public Product() {
    }
    public Product(int orderIdentification, String productDetails, String productList) {
        this.orderIdentification = orderIdentification;
        this.productDetails = productDetails;
        this.productList = productList;

    }
    public int getOrderIdentification() {
        return orderIdentification;
    }
    public void setOrderIdentification(int orderIdentification) {
        this.orderIdentification = orderIdentification;
    }
    public String getProductDetails() {
        return productDetails;
    }
    public void setProductDetails(String productDetails) {

        this.productDetails = productDetails;
    }
    public String getProductList() {
        return productList;
    }
    public void setProductList(String productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "orderIdentification=" + orderIdentification +
                ", productDetails='" + productDetails + '\'' +
                ", productList='" + productList + '\'' +
                '}';
    }
}


