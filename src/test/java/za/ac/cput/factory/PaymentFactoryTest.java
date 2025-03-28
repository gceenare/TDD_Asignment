package za.ac.cput.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    private Payment payment;

    @BeforeEach
    void setUp() {
        payment = PaymentFactory.createPayment(5001, "R1200.00", "1234-5678-9012-3456");
    }

    @AfterEach
    void tearDown() {
        payment = null;
    }

    @Test
    void testCreatePayment() {
        assertNotNull(payment, "Payment object should not be null");
        assertEquals(5001, payment.getOrderIdentificationNumber(), "Order ID should be 5001");
        assertEquals("R1200.00", payment.getAmount(), "Amount should be 'R1200.00'");
        assertEquals("1234-5678-9012-3456", payment.getCardNumber(), "Card number should be '1234-5678-9012-3456'");
    }

    @Test
    void testInvalidPaymentCreation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PaymentFactory.createPayment(0, "", "");
        });
        assertTrue(exception.getMessage().contains("Invalid"), "Exception message should indicate invalid input");
    }
}
