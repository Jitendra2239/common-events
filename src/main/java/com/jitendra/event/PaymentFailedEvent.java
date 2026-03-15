package com.jitendra.event;

import java.time.LocalDateTime;

public class PaymentFailedEvent {

    private Long orderId;
    private String paymentId;
    private double amount;
    private String reason;
    private LocalDateTime timestamp;

    public PaymentFailedEvent() {
    }

    public PaymentFailedEvent(Long orderId, String paymentId, double amount, String reason, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.paymentId = paymentId;
        this.amount = amount;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}