package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Delivery;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryFactoryTest {

    private Delivery delivery;

    @BeforeEach
    void setUp() {
        delivery = DeliveryFactory.createDelivery(1001, "Express Delivery", "2025-03-30");
    }

    @AfterEach
    void tearDown() {
        delivery = null;
    }

    @Test
    void testCreateDelivery() {
        assertNotNull(delivery, "Delivery object should not be null");
        assertEquals(1001, delivery.getOrderIdentification(), "Order ID should be 1001");
        assertEquals("Express Delivery", delivery.getName(), "Name should be 'Express Delivery'");
        assertEquals("2025-03-30", delivery.getDate(), "Date should be '2025-03-30'");
    }

    @Test
    void testInvalidDeliveryCreation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DeliveryFactory.createDelivery(0, "", "");
        });
        assertTrue(exception.getMessage().contains("Invalid"), "Exception message should indicate invalid input");
    }
}
