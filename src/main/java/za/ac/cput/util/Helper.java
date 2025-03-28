package za.ac.cput.util;

public class Helper {


    public static boolean isValidString(String value) {
        return value != null && !value.trim().isEmpty();
    }

    
    public static boolean isValidNumber(int value) {
        return value > 0;
    }


    public static boolean validateOrder(int orderId, String productDetails, String orderType) {
        return isValidNumber(orderId) && isValidString(productDetails) && isValidString(orderType);
    }


    public static boolean validateCustomer(String address, String payment) {
        return isValidString(address) && isValidString(payment);
    }


    public static boolean validatePayment(int orderId, String cardNumber, String amount) {
        return isValidNumber(orderId) && isValidString(cardNumber) && isValidString(amount);
    }


    public static boolean validateDelivery(int orderId, String name, String date, String address) {
        return isValidNumber(orderId) && isValidString(name) && isValidString(date) && isValidString(address);
    }


    public static boolean validateItems(int orderId, String itemNames, String itemPrice) {
        return isValidNumber(orderId) && isValidString(itemNames) && isValidString(itemPrice);
    }


    public static boolean validateProduct(int orderId, String productDetails, String productList) {
        return isValidNumber(orderId) && isValidString(productDetails) && isValidString(productList);
    }


    public static boolean validateSeller(int orderId, String sellerName, String sellerAge,
                                         String contactNumber, String userName, String password) {
        return isValidNumber(orderId) && isValidString(sellerName) && isValidString(sellerAge) &&
                isValidString(contactNumber) && isValidString(userName) && isValidString(password);
    }
}
