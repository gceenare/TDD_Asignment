package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import java.util.Scanner;

public class CustomerFactory {

    public static Customer createCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Payment Method: ");
        String payment = scanner.nextLine();

        Customer customer = new Customer(address, payment);

        System.out.println("Customer Paid: " + customer);

        return customer;
    }

    public static void main(String[] args) {
        createCustomer();
    }
}
