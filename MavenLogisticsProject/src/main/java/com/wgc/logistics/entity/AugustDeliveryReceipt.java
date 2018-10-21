package com.wgc.logistics.entity;

import java.util.Date;

public class AugustDeliveryReceipt {
    private Integer receiptId;

    private String receiptStartCity;

    private String receiptEndCity;

    private String receiptArriveCity;

    private Integer receiptState;

    private Date receiptGenerateTime;

    private String receiptRemarks;

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public String getReceiptStartCity() {
        return receiptStartCity;
    }

    public void setReceiptStartCity(String receiptStartCity) {
        this.receiptStartCity = receiptStartCity;
    }

    public String getReceiptEndCity() {
        return receiptEndCity;
    }

    public void setReceiptEndCity(String receiptEndCity) {
        this.receiptEndCity = receiptEndCity;
    }

    public String getReceiptArriveCity() {
        return receiptArriveCity;
    }

    public void setReceiptArriveCity(String receiptArriveCity) {
        this.receiptArriveCity = receiptArriveCity;
    }

    public Integer getReceiptState() {
        return receiptState;
    }

    public void setReceiptState(Integer receiptState) {
        this.receiptState = receiptState;
    }

    public Date getReceiptGenerateTime() {
        return receiptGenerateTime;
    }

    public void setReceiptGenerateTime(Date receiptGenerateTime) {
        this.receiptGenerateTime = receiptGenerateTime;
    }

    public String getReceiptRemarks() {
        return receiptRemarks;
    }

    public void setReceiptRemarks(String receiptRemarks) {
        this.receiptRemarks = receiptRemarks;
    }
}