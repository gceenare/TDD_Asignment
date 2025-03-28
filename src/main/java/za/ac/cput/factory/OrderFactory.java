package za.ac.cput.factory;

import za.ac.cput.domain.Order;

public class OrderFactory {

    public static Order createOrder(int orderIdentification, String productDetails, String orderType) {
        return new Order.Builder()
                .setOrderIdentification(orderIdentification)
                .setProductDetails(productDetails)
                .setOrderType(orderType)
                .build();
    }
}
