package za.ac.cput.domain;

public class Seller {
    private int orderIdentification;
    private String sellerName;
    private String contactNumber;
    private String username;
    private String password;

    private Seller(Builder builder) {
        this.orderIdentification = builder.orderIdentification;
        this.sellerName = builder.sellerName;
        this.contactNumber = builder.contactNumber;
        this.username = builder.username;
        this.password = builder.password;
    }

    public int getOrderIdentification() {
        return orderIdentification;
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "orderIdentification=" + orderIdentification +
                ", sellerName='" + sellerName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {
        private int orderIdentification;
        private String sellerName;
        private String contactNumber;
        private String username;
        private String password;

        public Builder setOrderIdentification(int orderIdentification) {
            this.orderIdentification = orderIdentification;
            return this;
        }

        public Builder setSellerName(String sellerName) {
            this.sellerName = sellerName;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Seller build() {
            return new Seller(this);
        }
    }
}
