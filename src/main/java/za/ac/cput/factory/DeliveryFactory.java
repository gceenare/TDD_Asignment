package za.ac.cput.factory;

import za.ac.cput.domain.Delivery;

public class DeliveryFactory {

    public static Delivery createDelivery(int orderIdentification, String name, String date) {
        return new Delivery.Builder()
                .setOrderIdentification(orderIdentification)
                .setName(name)
                .setDate(date)
                .build();
    }
}
