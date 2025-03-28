package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {

    private ProductFactory productFactory;

    @BeforeEach
    void setUp() {
        productFactory = new ProductFactory();
    }

    @AfterEach
    void tearDown() {
        productFactory = null;
    }

    @Test
    void createProduct() {
        int orderIdentification = 101;
        String productDetails = "Laptop - 16GB RAM, 512GB SSD";
        String productList = "Electronics";

        Product product = productFactory.createProduct(orderIdentification, productDetails, productList);

        assertNotNull(product);
        assertEquals(orderIdentification, product.getOrderIdentification());
        assertEquals(productDetails, product.getProductDetails());
        assertEquals(productList, product.getProductList());
    }

    @Test
    void main() {
        assertDoesNotThrow(() -> ProductFactory.main(new String[]{}));
    }
}
