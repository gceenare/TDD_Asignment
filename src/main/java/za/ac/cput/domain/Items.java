package za.ac.cput.domain;

public class Items {
    private int orderIdentification;
    private String itemsNames;
    private String itemPrice;

    private Items(Builder builder) {
        this.orderIdentification = builder.orderIdentification;
        this.itemsNames = builder.itemsNames;
        this.itemPrice = builder.itemPrice;
    }

    public int getOrderIdentification() {
        return orderIdentification;
    }

    public String getItemsNames() {
        return itemsNames;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    @Override
    public String toString() {
        return "Items{" +
                "orderIdentification=" + orderIdentification +
                ", itemsNames='" + itemsNames + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                '}';
    }

    public static class Builder {
        private int orderIdentification;
        private String itemsNames;
        private String itemPrice;

        public Builder setOrderIdentification(int orderIdentification) {
            this.orderIdentification = orderIdentification;
            return this;
        }

        public Builder setItemsNames(String itemsNames) {
            this.itemsNames = itemsNames;
            return this;
        }

        public Builder setItemPrice(String itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }

        public Items build() {
            return new Items(this);
        }
    }
}