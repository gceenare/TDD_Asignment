package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {

    @BeforeEach
    void setUp() {
        ProductFactory.createProduct(101, "Laptop - 16GB RAM, 512GB SSD", "Electronics");
    }

    @AfterEach
    void tearDown() {
        ProductFactory.deleteProduct(101);
    }

    @Test
    void testCreateProduct() {
        Product product = ProductFactory.createProduct(102, "Smartphone - 8GB RAM, 256GB Storage", "Electronics");

        assertNotNull(product);
        assertEquals(102, product.getOrderIdentification());
        assertEquals("Smartphone - 8GB RAM, 256GB Storage", product.getProductDetails());
        assertEquals("Electronics", product.getProductList());
    }

    @Test
    void testReadProduct() {
        Product product = ProductFactory.readProduct(101);
        assertNotNull(product);
        assertEquals("Laptop - 16GB RAM, 512GB SSD", product.getProductDetails());
    }

    @Test
    void testUpdateProduct() {
        Product updatedProduct = ProductFactory.updateProduct(101, "Gaming Laptop - 32GB RAM, 1TB SSD","list");
        assertNotNull(updatedProduct);
        assertEquals("Gaming Laptop - 32GB RAM, 1TB SSD", updatedProduct.getProductDetails());
    }

    @Test
    void testDeleteProduct() {
        assertTrue(ProductFactory.deleteProduct(101));
        assertNull(ProductFactory.readProduct(101));
    }

    @Test
    void testMain() {
        assertDoesNotThrow(() -> ProductFactory.main(new String[]{}));
    }
}
