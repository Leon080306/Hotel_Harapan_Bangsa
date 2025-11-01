package models;

import java.time.LocalDateTime;

public class Payment_Card extends Payment implements SecurePayment{
    private String creditCardNumber;

    public Payment_Card(double totalPrice, LocalDateTime paymentDate) {
        super(totalPrice, paymentDate, PaymentType.CARD);
    }

    @Override
    public boolean processPayment() {
        return false;
    }
    @Override
    public boolean securePayment() {
        return true;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
