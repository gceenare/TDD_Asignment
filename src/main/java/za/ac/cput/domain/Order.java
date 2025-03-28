package za.ac.cput.domain;

public class Order {
    private int orderIdentification;
    private int productDetails;
    private String orderType;

    private Order(Builder builder) {
        this.orderIdentification = builder.orderIdentification;
        this.productDetails = builder.productDetails;
        this.orderType = builder.orderType;
    }

    public int getOrderIdentification() {
        return orderIdentification;
    }

    public int getProductDetails() {
        return productDetails;
    }

    public String getOrderType() {
        return orderType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderIdentification=" + orderIdentification +
                ", productDetails=" + productDetails +
                ", orderType='" + orderType + '\'' +
                '}';
    }

    public static class Builder {
        private int orderIdentification;
        private int productDetails;
        private String orderType;

        public Builder setOrderIdentification(int orderIdentification) {
            this.orderIdentification = orderIdentification;
            return this;
        }

        public Builder setProductDetails(int productDetails) {
            this.productDetails = productDetails;
            return this;
        }

        public Builder setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
