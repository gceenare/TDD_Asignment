package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Items;
import static org.junit.jupiter.api.Assertions.*;

class ItemsFactoryTest {

    @Test
    void testCreateItems() {
        Items item = ItemsFactory.createItems();

        assertNotNull(item, "Item should not be null");
        assertEquals(101, item.getOrderIdentification(), "Order ID should be 101");
        assertEquals("Asus", item.getItemsNames(), "Item name should be 'Asus'");
        assertEquals("R 3999.00", item.getItemPrice(), "Price should be 'R 3999.00'");
    }

    @Test
    void testItemHasValidPriceFormat() {
        Items items = ItemsFactory.createItems();
        assertTrue(items.getItemPrice().matches("^R \\d+(\\.\\d{2})?$"),
                "Price format should match 'R XXXX.XX'");
    }
}
