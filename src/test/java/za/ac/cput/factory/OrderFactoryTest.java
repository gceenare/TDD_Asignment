package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Order;

import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {

    private Order order;

    @BeforeEach
    void setUp() {
        order = OrderFactory.createOrder(2001, "Gaming Laptop - 32GB RAM", "Online");
    }

    @AfterEach
    void tearDown() {
        order = null;
    }

    @Test
    void testCreateOrder() {
        assertNotNull(order, "Order object should not be null");
        assertEquals(2001, order.getOrderIdentification(), "Order ID should be 2001");
        assertEquals("Gaming Laptop - 32GB RAM", order.getProductDetails(), "Product details should be 'Gaming Laptop - 32GB RAM'");
        assertEquals("Online", order.getOrderType(), "Order type should be 'Online'");
    }

    @Test
    void testInvalidOrderCreation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            OrderFactory.createOrder(0, "", "");
        });
        assertTrue(exception.getMessage().contains("Invalid"), "Exception message should indicate invalid input");
    }
}
