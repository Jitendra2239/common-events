package com.jitendra.event;



public class PaymentSuccessEvent {

    private Long orderId;
    private String paymentId;

    public PaymentSuccessEvent(Long orderId, String paymentId) {
        this.orderId = orderId;
        this.paymentId = paymentId;
    }

    public PaymentSuccessEvent() {
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
}git