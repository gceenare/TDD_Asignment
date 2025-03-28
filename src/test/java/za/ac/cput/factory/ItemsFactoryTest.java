package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Items;
import static org.junit.jupiter.api.Assertions.*;

class ItemsFactoryTest {

    @Test
    void testCreateItems() {
        Items item = ItemsFactory.createItems(101, "Asus", "R 3999.00");

        assertNotNull(item, "Item should not be null");
        assertEquals(101, item.getOrderIdentification(), "Order ID should be 101");
        assertEquals("Asus", item.getItemsNames(), "Item name should be 'Asus'");
        assertEquals("R 3999.00", item.getItemPrice(), "Price should be 'R 3999.00'");
    }

    @Test
    void testItemHasValidPriceFormat() {
        Items items = ItemsFactory.createItems(102, "Dell Laptop", "R 4999.99");
        assertTrue(items.getItemPrice().matches("^R \\d{1,5}(\\.\\d{2})?$"),
                "Price format should match 'R XXXX.XX'");
    }

    @Test
    void testInvalidPriceFormat() {
        Items item = ItemsFactory.createItems(103, "HP Pavilion", "4999");

        assertFalse(item.getItemPrice().matches("^R \\d{1,5}(\\.\\d{2})?$"),
                "Price format should fail validation if incorrect");
    }

    @Test
    void testItemCreationWithDifferentValues() {
        Items item = ItemsFactory.createItems(202, "MacBook Pro", "R 12999.99");

        assertNotNull(item);
        assertEquals(202, item.getOrderIdentification());
        assertEquals("MacBook Pro", item.getItemsNames());
        assertEquals("R 12999.99", item.getItemPrice());
    }
}
