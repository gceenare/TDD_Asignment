package za.ac.cput.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Delivery;
import za.ac.cput.domain.Items;
import za.ac.cput.domain.Order;
import za.ac.cput.domain.Payment;
import za.ac.cput.domain.Product;
import za.ac.cput.domain.Seller;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    private Repository repository;

    @BeforeEach
    void setUp() {
        repository = new Repository();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createCustomer() {
        Customer customer = repository.createCustomer("123 Main St", "Credit Card");
        assertNotNull(customer);
        assertEquals("123 Main St", customer.getAddress());
        assertEquals("Credit Card", customer.getPayment());
    }

    @Test
    void readCustomer() {
        repository.createCustomer("123 Main St", "Credit Card");
        Customer customer = repository.readCustomer("123 Main St");
        assertNotNull(customer);
        assertEquals("123 Main St", customer.getAddress());
    }

    @Test
    void updateCustomer() {
        repository.createCustomer("123 Main St", "Credit Card");
        Customer updatedCustomer = repository.updateCustomer("123 Main St", "PayPal");
        assertNotNull(updatedCustomer);
        assertEquals("PayPal", updatedCustomer.getPayment());
    }

    @Test
    void deleteCustomer() {
        repository.createCustomer("123 Main St", "Credit Card");
        assertTrue(repository.deleteCustomer("123 Main St"));
        assertNull(repository.readCustomer("123 Main St"));
    }

    @Test
    void createDelivery() {
        Delivery delivery = repository.createDelivery(101, "John Doe", "2025-04-01");
        assertNotNull(delivery);
        assertEquals(101, delivery.getOrderIdentification());
        assertEquals("John Doe", delivery.getName());
    }

    @Test
    void readDelivery() {
        repository.createDelivery(101, "John Doe", "2025-04-01");
        Delivery delivery = repository.readDelivery(101);
        assertNotNull(delivery);
        assertEquals(101, delivery.getOrderIdentification());
    }

    @Test
    void updateDelivery() {
        repository.createDelivery(101, "John Doe", "2025-04-01");
        Delivery updatedDelivery = repository.updateDelivery(101, "Jane Doe", "2025-04-02");
        assertNotNull(updatedDelivery);
        assertEquals("Jane Doe", updatedDelivery.getName());
    }

    @Test
    void deleteDelivery() {
        repository.createDelivery(101, "John Doe", "2025-04-01");
        assertTrue(repository.deleteDelivery(101));
        assertNull(repository.readDelivery(101));
    }

    @Test
    void createItems() {
        Items items = repository.createItems(101, "Laptop", "R 7999.00");
        assertNotNull(items);
        assertEquals(101, items.getOrderIdentification());
        assertEquals("Laptop", items.getItemsNames());
        assertEquals("R 7999.00", items.getItemPrice());
    }

    @Test
    void readItems() {
        repository.createItems(101, "Laptop", "R 7999.00");
        Items items = repository.readItems(101);
        assertNotNull(items);
        assertEquals("Laptop", items.getItemsNames());
    }

    @Test
    void updateItems() {
        repository.createItems(101, "Laptop", "R 7999.00");
        Items updatedItems = repository.updateItems(101, "Smartphone", "R 4999.00");
        assertNotNull(updatedItems);
        assertEquals("Smartphone", updatedItems.getItemsNames());
    }

    @Test
    void deleteItems() {
        repository.createItems(101, "Laptop", "R 7999.00");
        assertTrue(repository.deleteItems(101));
        assertNull(repository.readItems(101));
    }

    @Test
    void createOrder() {
        Order order = repository.createOrder(101, "Product A", "Electronics");
        assertNotNull(order);
        assertEquals(101, order.getOrderIdentification());
        assertEquals("Product A", order.getProductDetails());
    }

    @Test
    void readOrder() {
        repository.createOrder(101, "Product A", "Electronics");
        Order order = repository.readOrder(101);
        assertNotNull(order);
        assertEquals("Product A", order.getProductDetails());
    }

    @Test
    void updateOrder() {
        repository.createOrder(101, "Product A", "Electronics");
        Order updatedOrder = repository.updateOrder(101, "Product B", "Furniture");
        assertNotNull(updatedOrder);
        assertEquals("Product B", updatedOrder.getProductDetails());
    }

    @Test
    void deleteOrder() {
        repository.createOrder(101, "Product A", "Electronics");
        assertTrue(repository.deleteOrder(101));
        assertNull(repository.readOrder(101));
    }

    @Test
    void createPayment() {
        Payment payment = repository.createPayment(101, "R 7999.00", "1234-5678-9101");
        assertNotNull(payment);
        assertEquals(101, payment.getOrderIdentificationNumber());
        assertEquals("R 7999.00", payment.getAmount());
    }

    @Test
    void readPayment() {
        repository.createPayment(101, "R 7999.00", "1234-5678-9101");
        Payment payment = repository.readPayment(101);
        assertNotNull(payment);
        assertEquals("R 7999.00", payment.getAmount());
    }

    @Test
    void updatePayment() {
        repository.createPayment(101, "R 7999.00", "1234-5678-9101");
        Payment updatedPayment = repository.updatePayment(101, "R 8999.00", "1234-5678-9102");
        assertNotNull(updatedPayment);
        assertEquals("R 8999.00", updatedPayment.getAmount());
    }

    @Test
    void deletePayment() {
        repository.createPayment(101, "R 7999.00", "1234-5678-9101");
        assertTrue(repository.deletePayment(101));
        assertNull(repository.readPayment(101));
    }

    @Test
    void createProduct() {
        Product product = repository.createProduct(101, "Product A", "Product List A");
        assertNotNull(product);
        assertEquals(101, product.getOrderIdentification());
        assertEquals("Product A", product.getProductDetails());
    }

    @Test
    void readProduct() {
        repository.createProduct(101, "Product A", "Product List A");
        Product product = repository.readProduct(101);
        assertNotNull(product);
        assertEquals("Product A", product.getProductDetails());
    }

    @Test
    void updateProduct() {
        repository.createProduct(101, "Product A", "Product List A");
        Product updatedProduct = repository.updateProduct(101, "Product B", "Product List B");
        assertNotNull(updatedProduct);
        assertEquals("Product B", updatedProduct.getProductDetails());
    }

    @Test
    void deleteProduct() {
        repository.createProduct(101, "Product A", "Product List A");
        assertTrue(repository.deleteProduct(101));
        assertNull(repository.readProduct(101));
    }

    @Test
    void createSeller() {
        Seller seller = repository.createSeller(101, "Seller A", "1234567890", "username", "password");
        assertNotNull(seller);
        assertEquals(101, seller.getOrderIdentification());
        assertEquals("Seller A", seller.getSellerName());
    }

    @Test
    void readSeller() {
        repository.createSeller(101, "Seller A", "1234567890", "username", "password");
        Seller seller = repository.readSeller(101);
        assertNotNull(seller);
        assertEquals("Seller A", seller.getSellerName());
    }

    @Test
    void updateSeller() {
        repository.createSeller(101, "Seller A", "1234567890", "username", "password");
        Seller updatedSeller = repository.updateSeller(101, "Seller B", "0987654321", "newUsername", "newPassword");
        assertNotNull(updatedSeller);
        assertEquals("Seller B", updatedSeller.getSellerName());
    }

    @Test
    void deleteSeller() {
        repository.createSeller(101, "Seller A", "1234567890", "username", "password");
        assertTrue(repository.deleteSeller(101));
        assertNull(repository.readSeller(101));
    }
}
