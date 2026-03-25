package com.jitendra.event;

import java.time.LocalDateTime;

public class ShipmentFailedEvent {

    private Long orderId;
    private String reason;
    private String status;
    private LocalDateTime eventTime;
  private  String name;
  private  String email;
  private  String phone;

    public ShipmentFailedEvent(Long orderId, String phone, String email, String name, LocalDateTime eventTime, String status, String reason) {
        this.orderId = orderId;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.eventTime = eventTime;
        this.status = status;
        this.reason = reason;
    }

    public ShipmentFailedEvent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    // getters/setters
}