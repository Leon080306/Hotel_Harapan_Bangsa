package models;

import java.time.LocalDateTime;

public class Payment_E_Wallet extends Payment{
    private String provider;
    private String accountID;

    public Payment_E_Wallet(double totalPrice, LocalDateTime paymentDate) {
        super(totalPrice, paymentDate, PaymentType.E_WALLET);
    }

    @Override
    public boolean processPayment() {
        return true;
    }
}
