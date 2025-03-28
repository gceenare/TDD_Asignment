package za.ac.cput.factory;

import za.ac.cput.domain.Items;

public class ItemsFactory {

    public static Items createItems() {
        int orderIdentification = 101;
        String itemsNames = "Asus";
        String itemPrice = "R 3999.00";

        Items items = new Items.Builder()
                .setItemsNames(itemsNames)
                .setItemPrice(itemPrice)
                .build();

        System.out.println("Items Created: " + items);

        return items;
    }

    public static void main(String[] args) {
        createItems();
    }
}