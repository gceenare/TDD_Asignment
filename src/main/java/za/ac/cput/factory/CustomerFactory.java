package za.ac.cput.factory;

import za.ac.cput.domain.Customer;

public class CustomerFactory {

    public static Customer createCustomer() {
        String address = "123 Main Street, Cape Town";
        String payment = "Credit Card";

        Customer customer = new Customer.Builder()
                .setAddress(address)
                .setPayment(payment)
                .build();

        System.out.println("Customer Created: " + customer);

        return customer;
    }

    public static void main(String[] args) {
        createCustomer();
    }
}
