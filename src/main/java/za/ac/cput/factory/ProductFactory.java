package za.ac.cput.factory;

import za.ac.cput.domain.Product;

public class ProductFactory {

    public static Product createProduct(int orderIdentification, String productDetails, String productList) {
        Product product = new Product.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(productDetails)
                .setProductList(productList)
                .build();

        System.out.println("Product Created: " + product);

        return product;
    }

    public static void main(String[] args) {

        createProduct(101, "Laptop - 16GB RAM, 512GB SSD", "Electronics");
    }
}
