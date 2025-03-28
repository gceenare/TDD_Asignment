package za.ac.cput.factory;

import za.ac.cput.domain.Product;

public class ProductFactory {

    public static Product createProduct(int orderIdentification, String productDetails, String productList) {
        return new Product.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(productDetails)
                .setProductList(productList)
                .build();
    }
}
