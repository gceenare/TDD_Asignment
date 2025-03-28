package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerFactory {

    private static final Map<String, Customer> customerDatabase = new HashMap<>();

    public static Customer createCustomer(String address, String payment) {
        if (address == null || address.isEmpty() || payment == null || payment.isEmpty()) {
            throw new IllegalArgumentException("Address and payment method cannot be empty.");
        }

        if (customerDatabase.containsKey(address)) {
            throw new IllegalArgumentException("Customer with this address already exists.");
        }

        Customer customer = new Customer.Builder()
                .setAddress(address)
                .setPayment(payment)
                .build();

        customerDatabase.put(address, customer);
        return customer;
    }

    public static Customer readCustomer(String address) {
        return customerDatabase.getOrDefault(address, null);
    }

    public static Customer updateCustomer(String address, String newPayment) {
        if (!customerDatabase.containsKey(address)) {
            throw new IllegalArgumentException("Customer not found.");
        }

        Customer updatedCustomer = new Customer.Builder()
                .setAddress(address)
                .setPayment(newPayment)
                .build();

        customerDatabase.put(address, updatedCustomer);
        return updatedCustomer;
    }

    public static boolean deleteCustomer(String address) {
        if (!customerDatabase.containsKey(address)) {
            throw new IllegalArgumentException("Customer not found.");
        }
        return customerDatabase.remove(address) != null;
    }


}
