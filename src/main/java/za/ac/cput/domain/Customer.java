package za.ac.cput.domain;

public class Customer {
    private String address;
    private String payment;

    private Customer(Builder builder) {
        this.address = builder.address;
        this.payment = builder.payment;
    }

    public String getAddress() {
        return address;
    }

    public String getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }

    public static class Builder {
        private String address;
        private String payment;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPayment(String payment) {
            this.payment = payment;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
