package za.ac.cput.factory;

import za.ac.cput.domain.Seller;

public class SellerFactory {

    public static Seller createSeller(int orderIdentification, String sellerName, String contactNumber, String username, String password) {
        return new Seller.Builder()
                .setOrderIdentification(orderIdentification)
                .setSellerName(sellerName)
                .setContactNumber(contactNumber)
                .setUsername(username)
                .setPassword(password)
                .build();
    }
}
