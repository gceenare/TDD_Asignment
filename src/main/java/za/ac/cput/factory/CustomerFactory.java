package za.ac.cput.factory;

import za.ac.cput.domain.Customer;

public class CustomerFactory {

    public static Customer createCustomer(String address, String payment) {
        return new Customer.Builder()
                .setAddress(address)
                .setPayment(payment)
                .build();
    }
}
