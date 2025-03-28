package za.ac.cput.domain;

public class Delivery {
    private int orderIdentification;
    private String name;
    private String date;

    private Delivery(Builder builder) {
        this.orderIdentification = builder.orderIdentification;
        this.name = builder.name;
        this.date = builder.date;
    }

    public int getOrderIdentification() {
        return orderIdentification;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "orderIdentification=" + orderIdentification +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static class Builder {
        private int orderIdentification;
        private String name;
        private String date;

        public Builder setOrderIdentification(int orderIdentification) {
            this.orderIdentification = orderIdentification;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Delivery build() {
            return new Delivery(this);
        }
    }
}
