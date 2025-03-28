package za.ac.cput.domain;

import java.time.LocalDate;

public class Delivery {
    private int orderIdentification;
    private String name;
    private LocalDate date;

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

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "orderIdentification=" + orderIdentification +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder {
        private int orderIdentification;
        private String name;
        private LocalDate date;

        public Builder setOrderIdentification(int orderIdentification) {
            if (orderIdentification <= 0) {
                throw new IllegalArgumentException("Order identification must be greater than 0.");
            }
            this.orderIdentification = orderIdentification;
            return this;
        }

        public Builder setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty.");
            }
            this.name = name;
            return this;
        }

        public Builder setDate(String date) {
            try {
                this.date = LocalDate.parse(date);
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
            }
            return this;
        }

        public Delivery build() {
            if (this.orderIdentification <= 0 || this.name == null || this.date == null) {
                throw new IllegalStateException("Cannot build Delivery: Missing required fields.");
            }
            return new Delivery(this);
        }
    }
}
