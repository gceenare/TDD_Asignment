package za.ac.cput.factory;

import za.ac.cput.domain.Payment;

public class PaymentFactory {

    public static Payment createPayment(int orderIdentificationNumber, String amount, String cardNumber) {
        return new Payment.Builder()
                .setOrderIdentificationNumber(orderIdentificationNumber)
                .setAmount(amount)
                .setCardNumber(cardNumber)
                .build();
    }
}
