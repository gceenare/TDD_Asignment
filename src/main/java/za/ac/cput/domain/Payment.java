package za.ac.cput.domain;



    public class Payment {
        private  int orderIdentificationNumber;
        public   String amount;
        public String cardNumber;


        private Payment(Builder builder) {
            this.orderIdentificationNumber = builder.orderIdentificationNumber;
            this.amount = builder.amount;
            this.cardNumber= builder.cardNumber;
        }

        public int getOrderIdentificationNumber() {
            return orderIdentificationNumber;
        }

        public String getAmount() {
            return amount;
        }

        public String getCardNumber() {
            return cardNumber;
        }

        @Override
        public String toString() {
            return "Payment{" +
                    "orderIdentificationNumber=" + orderIdentificationNumber +
                    ", amount=" + amount +
                    ", paymentMethod='" + cardNumber+ '\'' +
                    '}';
        }


        public static class Builder {
            private int orderIdentificationNumber;
            private String amount;
            private String cardNumber;

            public Builder setOrderIdentificationNumber(int orderIdentificationNumber) {
                this.orderIdentificationNumber = orderIdentificationNumber;
                return this;
            }

            public Builder setAmount(String amount) {
                this.amount = amount;
                return this;
            }

            public Builder setCardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
                return this;
            }

            public Payment build() {
                return new Payment(this);
            }
        }
    }

