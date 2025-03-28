package za.ac.cput.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product.Builder()
                .setOrderIdentification(101)
                .setProductDetails("Laptop - 16GB RAM, 512GB SSD")
                .setProductList("Electronics")
                .build();
    }

    @AfterEach
    void tearDown() {
        product = null;
    }

    @Test
    void testGetOrderIdentification() {
        assertEquals(101, product.getOrderIdentification());
    }

    @Test
    void testGetProductDetails() {
        assertEquals("Laptop - 16GB RAM, 512GB SSD", product.getProductDetails());
    }

    @Test
    void testGetProductList() {
        assertEquals("Electronics", product.getProductList());
    }

    @Test
    void testToString() {
        String expected = "Product{orderIdentification=101, productDetails='Laptop - 16GB RAM, 512GB SSD', productList='Electronics'}";
        assertEquals(expected, product.toString());
    }
}