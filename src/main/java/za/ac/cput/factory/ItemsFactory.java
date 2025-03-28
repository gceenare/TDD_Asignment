package za.ac.cput.factory;

import za.ac.cput.domain.Items;

public class ItemsFactory {

    public static Items createItems(int orderIdentification, String itemsNames, String itemPrice) {
        return new Items.Builder()
                .setOrderIdentification(orderIdentification)
                .setItemsNames(itemsNames)
                .setItemPrice(itemPrice)
                .build();
    }
}
