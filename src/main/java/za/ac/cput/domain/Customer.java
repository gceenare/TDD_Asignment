package za.ac.cput.domain;

public class Customer {

   private String address;
   private String payment;


    public Customer() {
    }

    public Customer(String address, String payment) {
        this.address = address;
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}


