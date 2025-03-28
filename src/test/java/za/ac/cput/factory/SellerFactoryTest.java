package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Seller;

import static org.junit.jupiter.api.Assertions.*;

class SellerFactoryTest {

    private Seller seller;

    @BeforeEach
    void setUp() {
        seller = SellerFactory.createSeller(101, "John Doe", "123-456-7890", "johndoe", "password123");
    }

    @AfterEach
    void tearDown() {
        seller = null;
    }

    @Test
    void testCreateSeller() {
        assertNotNull(seller, "Seller object should not be null");
        assertEquals(101, seller.getOrderIdentification(), "Order ID should be 101");
        assertEquals("John Doe", seller.getSellerName(), "Seller name should be 'John Doe'");
        assertEquals("123-456-7890", seller.getContactNumber(), "Contact number should be '123-456-7890'");
        assertEquals("johndoe", seller.getUsername(), "Username should be 'johndoe'");
        assertEquals("password123", seller.getPassword(), "Password should be 'password123'");
    }

    @Test
    void testInvalidSellerCreation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            SellerFactory.createSeller(0, "", "", "", "");
        });
        assertTrue(exception.getMessage().contains("Invalid"), "Exception message should indicate invalid input");
    }
}
