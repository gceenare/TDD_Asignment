package za.ac.cput;

import za.ac.cput.domain.*;
import za.ac.cput.repository.Repository;

public class Main {

    private static final Repository repository = new Repository();

    private static final String LINE = "-----------------------------------------------------------";

    public static void customer() {
        try {
            System.out.println("\n" + LINE);
            System.out.println("\033[1;36mCUSTOMER OPERATIONS\033[0m");
            System.out.println(LINE);

            Customer c1 = za.ac.cput.factory.CustomerFactory.createCustomer("123 Main Street, Cape Town", "Credit Card");
            System.out.println("\033[1;32mCreated:\033[0m " + c1);

            Customer readC1 = repository.readCustomer("123 Main Street, Cape Town");
            System.out.println("\033[1;33mRead:\033[0m " + readC1);

            Customer updatedC1 = repository.updateCustomer("123 Main Street, Cape Town", "PayPal");
            System.out.println("\033[1;34mUpdated:\033[0m " + updatedC1);

            boolean deletedC1 = repository.deleteCustomer("123 Main Street, Cape Town");
            System.out.println("\033[1;31mDeleted:\033[0m " + deletedC1);

            System.out.println(LINE);
        } catch (IllegalArgumentException e) {
            System.err.println("\033[1;31mError: " + e.getMessage() + "\033[0m");
        }
    }

    public static void product() {
        System.out.println("\n" + LINE);
        System.out.println("\033[1;36mPRODUCT OPERATIONS\033[0m");
        System.out.println(LINE);

        Product p1 = za.ac.cput.factory.ProductFactory.createProduct(101, "Laptop - 16GB RAM, 512GB SSD", "Electronics");
        System.out.println("\033[1;32mCreated:\033[0m " + p1);

        Product readP1 = repository.readProduct(101);
        System.out.println("\033[1;33mRead:\033[0m " + readP1);

        Product updatedP1 = repository.updateProduct(101, "Laptop - 32GB RAM, 1TB SSD", "hdhd");
        System.out.println("\033[1;34mUpdated:\033[0m " + updatedP1);

        boolean deletedP1 = repository.deleteProduct(101);
        System.out.println("\033[1;31mDeleted:\033[0m " + deletedP1);

        System.out.println(LINE);
    }

    public static void order() {
        System.out.println("\n" + LINE);
        System.out.println("\033[1;36mORDER OPERATIONS\033[0m");
        System.out.println(LINE);

        Order o1 = za.ac.cput.factory.OrderFactory.createOrder(102, "Laptop - 16GB RAM, 512GB SSD", "Standard");
        System.out.println("\033[1;32mCreated:\033[0m " + o1);

        Order readO1 = repository.readOrder(102);
        System.out.println("\033[1;33mRead:\033[0m " + readO1);

        Order updatedO1 = repository.updateOrder(102, "Laptop - 32GB RAM, 1TB SSD", "Express");
        System.out.println("\033[1;34mUpdated:\033[0m " + updatedO1);

        boolean deletedO1 = repository.deleteOrder(102);
        System.out.println("\033[1;31mDeleted:\033[0m " + deletedO1);

        System.out.println(LINE);
    }

    public static void delivery() {
        System.out.println("\n" + LINE);
        System.out.println("\033[1;36mDELIVERY OPERATIONS\033[0m");
        System.out.println(LINE);

        Delivery d1 = za.ac.cput.factory.DeliveryFactory.createDelivery(102, "John Doe", "2025-03-28");
        System.out.println("\033[1;32mCreated:\033[0m " + d1);

        Delivery readD1 = repository.readDelivery(102);
        System.out.println("\033[1;33mRead:\033[0m " + readD1);

        Delivery updatedD1 = repository.updateDelivery(102, "Jane Doe", "2025-04-01");
        System.out.println("\033[1;34mUpdated:\033[0m " + updatedD1);

        boolean deletedD1 = repository.deleteDelivery(102);
        System.out.println("\033[1;31mDeleted:\033[0m " + deletedD1);

        System.out.println(LINE);
    }

    public static void payment() {
        System.out.println("\n" + LINE);
        System.out.println("\033[1;36mPAYMENT OPERATIONS\033[0m");
        System.out.println(LINE);

        Payment p1 = za.ac.cput.factory.PaymentFactory.createPayment(102, "R 3999.00", "1234-5678-9876-5432");
        System.out.println("\033[1;32mCreated:\033[0m " + p1);

        Payment readP1 = repository.readPayment(102);
        System.out.println("\033[1;33mRead:\033[0m " + readP1);

        Payment updatedP1 = repository.updatePayment(102, "R 4999.00", "1111-2222-3333-4444");
        System.out.println("\033[1;34mUpdated:\033[0m " + updatedP1);

        boolean deletedP1 = repository.deletePayment(102);
        System.out.println("\033[1;31mDeleted:\033[0m " + deletedP1);

        System.out.println(LINE);
    }

    public static void seller() {
        System.out.println("\n" + LINE);
        System.out.println("\033[1;36mSELLER OPERATIONS\033[0m");
        System.out.println(LINE);

        Seller s1 = za.ac.cput.factory.SellerFactory.createSeller(102, "Alice", "123-456-7890", "alice123", "password");
        System.out.println("\033[1;32mCreated:\033[0m " + s1);

        Seller readS1 = repository.readSeller(102);
        System.out.println("\033[1;33mRead:\033[0m " + readS1);

        Seller updatedS1 = repository.updateSeller(102, "Bob", "987-654-3210", "bob123", "newpassword");
        System.out.println("\033[1;34mUpdated:\033[0m " + updatedS1);

        boolean deletedS1 = repository.deleteSeller(102);
        System.out.println("\033[1;31mDeleted:\033[0m " + deletedS1);

        System.out.println(LINE);
    }

    public static void main(String[] args) {
        System.out.println("\033[1;35mWELCOME TO THE SYSTEM\033[0m\n");
        customer();
        product();
        order();
        delivery();
        payment();
        seller();
    }
}
