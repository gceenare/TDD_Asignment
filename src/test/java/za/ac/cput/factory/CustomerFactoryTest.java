package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = CustomerFactory.createCustomer("123 Main Street, Cape Town", "Credit Card");
    }

    @AfterEach
    void tearDown() {
        customer = null;
    }

    @Test
    void createCustomer_Success() {
        assertNotNull(customer, "Customer should not be null");
        assertEquals("123 Main Street, Cape Town", customer.getAddress(), "Address should match");
        assertEquals("Credit Card", customer.getPayment(), "Payment method should match");
    }

    @Test
    void createCustomer_Failure_EmptyAddress() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CustomerFactory.createCustomer("", "Credit Card");
        });
        assertEquals("Address and payment method cannot be empty.", exception.getMessage());
    }

    @Test
    void createCustomer_Failure_NullPayment() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CustomerFactory.createCustomer("456 High Street, Joburg", null);
        });
        assertEquals("Address and payment method cannot be empty.", exception.getMessage());
    }
}
