package models;

import java.time.LocalDateTime;

public abstract class Payment {
    private double totalPrice;
    private LocalDateTime paymentDate;
    private PaymentType paymentType;
    private boolean isSuccessful;

    public Payment(double totalPrice, LocalDateTime paymentDate, PaymentType paymentType,  boolean isSuccessful) {
        this.totalPrice = totalPrice;
        this.paymentDate = paymentDate;
        this.paymentType = paymentType;
        this.isSuccessful = isSuccessful;
    }

    public abstract boolean processPayment();

    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
    public PaymentType getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public boolean isSuccessful() {
        return isSuccessful;
    }
    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }
}
