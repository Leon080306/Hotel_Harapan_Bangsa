package models;

import java.time.LocalDateTime;

public class Payment_Cash extends Payment{
    private double amountPayed;

    public Payment_Cash(double totalPrice, LocalDateTime paymentDate, double amountPayed) {
        super(totalPrice, paymentDate, PaymentType.CASH);
        this.amountPayed = amountPayed;
    }

    public double getChange() {
        return amountPayed - getTotalPrice();
    }

    @Override
    public boolean processPayment() {
        return true;
    }

    public double getAmountPayed() {
        return amountPayed;
    }
    public void setAmountPayed(double amountPayed) {
        this.amountPayed = amountPayed;
    }
}
