package za.ac.cput;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Product;

import static za.ac.cput.factory.CustomerFactory.*;
import static za.ac.cput.factory.ProductFactory.*;

public class Main {

    public static void customer() {
        try {
            Customer c1 = createCustomer("123 Main Street, Cape Town", "Credit Card");
            System.out.println("Created: " + c1);

            Customer readC1 = readCustomer("123 Main Street, Cape Town");
            System.out.println("Read: " + readC1);

            Customer updatedC1 = updateCustomer("123 Main Street, Cape Town", "PayPal");
            System.out.println("Updated: " + updatedC1);

            boolean deletedC1 = deleteCustomer("123 Main Street, Cape Town");
            System.out.println("Deleted: " + deletedC1);

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void product() {
        Product p1 = createProduct(101, "Laptop - 16GB RAM, 512GB SSD", "Electronics");
        System.out.println("Created: " + p1);

        Product readP1 = readProduct(101);
        System.out.println("Read: " + readP1);

        Product updatedP1 = updateProduct(101, "Laptop - 32GB RAM, 1TB SSD","hdhd");
        System.out.println("Updated: " + updatedP1);

        boolean deletedP1 = deleteProduct(101);
        System.out.println("Deleted: " + deletedP1);
    }

    public static void main(String[] args) {
        customer();
        product();
    }
}
