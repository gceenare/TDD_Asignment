package za.ac.cput.domain;


    public class Delivery extends Payment {
        private final String name;
        private final String date;
        private final String address;


        private Delivery(Builder builder) {
            super(builder); // Calls the parent class constructor
            this.name = builder.name;
            this.date = builder.date;
            this.address = builder.address;
        }


        public String getName() {
            return name;
        }

        public String getDate() {
            return date;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "Delivery{" +
                    "orderIdentificationNumber=" + getOrderIdentificationNumber() +
                    ", amount=" + getAmount() +
                    ", paymentMethod='" + getPaymentMethod() + '\'' +
                    ", name='" + name + '\'' +
                    ", date='" + date + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }


        public static class Builder extends Payment.Builder {
            private String name;
            private String date;
            private String address;

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setDate(String date) {
                this.date = date;
                return this;
            }

            public Builder setAddress(String address) {
                this.address = address;
                return this;
            }

            @Override
            public Delivery build() {
                return new Delivery(this);
            }
        }
    }

