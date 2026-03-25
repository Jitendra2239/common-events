package com.jitendra.event;



import java.time.LocalDateTime;

public class ShipmentCreatedEvent {

    private Long orderId;
    private String trackingId;
    private String courierName;
    private String status;
    private LocalDateTime estimatedDelivery;
    private LocalDateTime eventTime;
    private  String name;
    private  String email;
    private  String phone;
    // Default Constructor
    public ShipmentCreatedEvent() {}

    public ShipmentCreatedEvent(Long orderId, String phone, String email, String name, LocalDateTime eventTime, LocalDateTime estimatedDelivery, String status, String courierName, String trackingId) {
        this.orderId = orderId;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.eventTime = eventTime;
        this.estimatedDelivery = estimatedDelivery;
        this.status = status;
        this.courierName = courierName;
        this.trackingId = trackingId;
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

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getEstimatedDelivery() {
        return estimatedDelivery;
    }

    public void setEstimatedDelivery(LocalDateTime estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }
}