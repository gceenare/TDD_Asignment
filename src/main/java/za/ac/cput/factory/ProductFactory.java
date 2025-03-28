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

    public static Product updateProduct(int orderIdentification, String productDetails, String productList) {
        if (productDatabase.containsKey(orderIdentification)) {
            Product updatedProduct = new Product.Builder()
                    .setOrderIdentification(orderIdentification)
                    .setProductDetails(productDetails)
                    .setProductList(productList)
                    .build();

            productDatabase.put(orderIdentification, updatedProduct);
            return updatedProduct;
        }
        return null;
    }

    public static boolean deleteProduct(int orderIdentification) {
        return productDatabase.remove(orderIdentification) != null;
    }

    public static void main(String[] args) {
        Product p1 = createProduct(101, "Laptop - 16GB RAM, 512GB SSD", "Electronics");
        System.out.println("Created: " + p1);

        Product readP1 = readProduct(101);
        System.out.println("Read: " + readP1);

        Product updatedP1 = updateProduct(101, "Laptop - 32GB RAM, 1TB SSD", "Electronics");
        System.out.println("Updated: " + updatedP1);

        boolean deletedP1 = deleteProduct(101);
        System.out.println("Deleted: " + deletedP1);
    }
}
