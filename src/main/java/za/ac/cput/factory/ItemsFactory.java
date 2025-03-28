package za.ac.cput.factory;

import za.ac.cput.domain.Items;

public class ItemsFactory {

    public static Items createItems() {
        int orderIdentification = 101;
        String itemsNames = "Asus";
        String itemPrice = "R 3999.00";

        return new Items.Builder()
                .setOrderIdentification(orderIdentification) // Fixed: Added order ID
                .setItemsNames(itemsNames)
                .setItemPrice(itemPrice)
                .build();
    }
}
