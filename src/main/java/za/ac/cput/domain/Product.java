package za.ac.cput.domain;

public class Product {
    private int orderIdentification;
    private String productDetails;
    private String productList;

    private Product(Builder builder) {
        this.orderIdentification = builder.orderIdentification;
        this.productDetails = builder.productDetails;
        this.productList = builder.productList;
    }

    public int getOrderIdentification() {
        return orderIdentification;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public String getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "orderIdentification=" + orderIdentification +
                ", productDetails='" + productDetails + '\'' +
                ", productList='" + productList + '\'' +
                '}';
    }

    public static class Builder {
        private int orderIdentification;
        private String productDetails;
        private String productList;

        public Builder setOrderIdentification(int orderIdentification) {
            this.orderIdentification = orderIdentification;
            return this;
        }

        public Builder setProductDetails(String productDetails) {
            this.productDetails = productDetails;
            return this;
        }

        public Builder setProductList(String productList) {
            this.productList = productList;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

