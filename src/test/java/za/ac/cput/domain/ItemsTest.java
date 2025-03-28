package za.ac.cput.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {

    private Items items;

    @BeforeEach
    void setUp() {
        items = new Items.Builder()
                .setOrderIdentification(101)
                .setItemsNames("Asus")
                .setItemPrice("R3999.00")
                .build();
    }

    @AfterEach
    void tearDown() {
        items = null;
    }

    @Test
    void testItemCreationUsingBuilder() {
        assertNotNull(items, "Items object should not be null");
    }

    @Test
    void testGetOrderIdentification() {
        assertEquals(101, items.getOrderIdentification(), "Order ID should be 101");
    }

    @Test
    void testGetItemsNames() {
        assertEquals("Asus", items.getItemsNames(), "Item name should be 'Asus'");
    }

    @Test
    void testGetItemPrice() {
        assertEquals("R3999.00", items.getItemPrice(), "Item price should be 'R3999.00'");
    }

    @Test
    void testToString() {
        String expected = "Items{orderIdentification=101, itemsNames='Asus', itemPrice='R3999.00'}";
        assertEquals(expected, items.toString(), "toString() output should match expected format");
    }
}
