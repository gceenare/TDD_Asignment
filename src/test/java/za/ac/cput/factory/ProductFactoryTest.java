package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {

    @Test
    void testCreateProduct() {
        Product product = ProductFactory.createProduct(101, "Laptop - 16GB RAM, 512GB SSD", "Electronics");

        assertNotNull(product, "Product should not be null");
        assertEquals(101, product.getOrderIdentification(), "Order ID should be 101");
        assertEquals("Laptop - 16GB RAM, 512GB SSD", product.getProductDetails(), "Product details should match");
        assertEquals("Electronics", product.getProductList(), "Product list should be 'Electronics'");
    }
}
