package com.jitendra.event;


import java.time.LocalDateTime;

public class PaymentSuccessEvent {

    private Long orderId;
    private String paymentId;
    private  String email;
    private  String name;
    private  String phone;
    private LocalDateTime timestamp;
    private double amount;

    public PaymentSuccessEvent(Long orderId, double amount, LocalDateTime timestamp, String phone, String name, String email, String paymentId) {
        this.orderId = orderId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.paymentId = paymentId;
    }

    public PaymentSuccessEvent() {
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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
}