package za.ac.cput.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer.Builder()
                .setAddress("123 Main Street")
                .setPayment("Credit Card")
                .build();
    }

    @AfterEach
    void tearDown() {
        customer = null;
    }

    @Test
    void testGetAddress() {
        assertEquals("123 Main Street", customer.getAddress());
    }

    @Test
    void testGetPayment() {
        assertEquals("Credit Card", customer.getPayment());
    }

    @Test
    void testToString() {
        String expected = "Customer{address='123 Main Street', payment='Credit Card'}";
        assertEquals(expected, customer.toString());
    }
}
