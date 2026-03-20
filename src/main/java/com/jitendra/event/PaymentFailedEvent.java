package com.jitendra.event;

import java.time.LocalDateTime;

public class PaymentFailedEvent {

    private Long orderId;
    private String paymentId;
    private double amount;
    private String reason;
    private LocalDateTime timestamp;
    private  String email;
    private  String name;
    private  String phone;

    public PaymentFailedEvent() {
    }


    public PaymentFailedEvent(Long orderId, String phone, String name, String email, LocalDateTime timestamp, String reason, double amount, String paymentId) {
        this.orderId = orderId;
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.timestamp = timestamp;
        this.reason = reason;
        this.amount = amount;
        this.paymentId = paymentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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