package com.jitendra.event;


public class ShipmentCreatedEvent {
    private Long orderId;
    private String trackingId;
    private String courier;

    public ShipmentCreatedEvent(Long orderId, String courier, String trackingId) {
        this.orderId = orderId;
        this.courier = courier;
        this.trackingId = trackingId;
    }

    public ShipmentCreatedEvent() {
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCourier() {
        return courier;
    }

    public String getTrackingId() {
        return trackingId;
    }
}