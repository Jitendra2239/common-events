package com.jitendra.event;


import java.time.LocalDateTime;


public class ShipmentStatusUpdatedEvent {

    private Long orderId;

    private Long shipmentId;

    private String status;

    private String awbCode;

    private String courierName;

    private LocalDateTime timestamp;

    public ShipmentStatusUpdatedEvent(Long orderId, LocalDateTime timestamp, String courierName, String awbCode, String status, Long shipmentId) {
        this.orderId = orderId;
        this.timestamp = timestamp;
        this.courierName = courierName;
        this.awbCode = awbCode;
        this.status = status;
        this.shipmentId = shipmentId;
    }

    public ShipmentStatusUpdatedEvent() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getAwbCode() {
        return awbCode;
    }

    public void setAwbCode(String awbCode) {
        this.awbCode = awbCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }
}