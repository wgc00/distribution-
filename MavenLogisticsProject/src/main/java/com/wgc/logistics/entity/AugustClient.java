package com.wgc.logistics.entity;

import java.util.Date;

public class AugustClient {
    private Integer clientId;

    private String clientName;

    private Integer clientGender;

    private Integer userId;

    private Integer orderId;

    private String clientPassword;

    private String clientPhone;

    private Date clientBirthDate;

    private String clientAddress;

    private String clientRemarks;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getClientGender() {
        return clientGender;
    }

    public void setClientGender(Integer clientGender) {
        this.clientGender = clientGender;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public Date getClientBirthDate() {
        return clientBirthDate;
    }

    public void setClientBirthDate(Date clientBirthDate) {
        this.clientBirthDate = clientBirthDate;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientRemarks() {
        return clientRemarks;
    }

    public void setClientRemarks(String clientRemarks) {
        this.clientRemarks = clientRemarks;
    }
}