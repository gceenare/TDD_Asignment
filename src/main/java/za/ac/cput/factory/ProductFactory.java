package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    private static final Map<Integer, Product> productDatabase = new HashMap<>();

    public static Product createProduct(int orderIdentification, String productDetails, String productList) {
        Product product = new Product.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(productDetails)
                .setProductList(productList)
                .build();

        productDatabase.put(orderIdentification, product);
        return product;
    }

    public static Product readProduct(int orderIdentification) {
        return productDatabase.get(orderIdentification);
    }

    public static Product updateProduct(int orderIdentification, String newProductDetails, String newProductList) {
        if (productDatabase.containsKey(orderIdentification)) {
            Product updatedProduct = new Product.Builder()
                    .setOrderIdentification(orderIdentification)
                    .setProductDetails(newProductDetails)
                    .setProductList(newProductList)
                    .build();

            productDatabase.put(orderIdentification, updatedProduct);
            return updatedProduct;
        }
        return null;
    }

    public static boolean deleteProduct(int orderIdentification) {
        return productDatabase.remove(orderIdentification) != null;
    }
}
