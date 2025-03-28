package za.ac.cput.util;

public class Helper {


    public static boolean validateOrder(int orderId, String productDetails, String orderType) {
        return orderId > 0 && isNotEmpty(productDetails) && isNotEmpty(orderType);
    }


    public static boolean validateCustomer(String address, String payment) {
        return isNotEmpty(address) && isNotEmpty(payment);
    }


    public static boolean validatePayment(int orderId, String cardNumber, String amount) {
        return orderId > 0 && isNotEmpty(cardNumber) && isNotEmpty(amount);
    }


    public static boolean validateDelivery(int orderId, String name, String date, String address) {
        return orderId > 0 && isNotEmpty(name) && isNotEmpty(date) && isNotEmpty(address);
    }


    public static boolean validateItems(int orderId, String itemNames, String itemPrice) {
        return orderId > 0 && isNotEmpty(itemNames) && isNotEmpty(itemPrice);
    }


    public static boolean validateProduct(int orderId, String productDetails, String productList) {
        return orderId > 0 && isNotEmpty(productDetails) && isNotEmpty(productList);
    }


    public static boolean validateSeller(int orderId, String sellerName, String sellerAge,
                                         String contactNumber, String userName, String password) {
        return orderId > 0 && isNotEmpty(sellerName) && isNotEmpty(sellerAge) &&
                isNotEmpty(contactNumber) && isNotEmpty(userName) && isNotEmpty(password);
    }


    private static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
