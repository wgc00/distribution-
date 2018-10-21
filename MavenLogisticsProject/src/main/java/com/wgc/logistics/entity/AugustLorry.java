package com.wgc.logistics.entity;

import java.util.Date;

public class AugustLorry {
    private Integer lorryNumber;

    private String lorryModel;

    private String lorryProducingArea;

    private String routeNumber;

    private Date lorryProductionDate;

    private Date lorryPurchaseDate;

    private String lorryRemarks;

    public Integer getLorryNumber() {
        return lorryNumber;
    }

    public void setLorryNumber(Integer lorryNumber) {
        this.lorryNumber = lorryNumber;
    }

    public String getLorryModel() {
        return lorryModel;
    }

    public void setLorryModel(String lorryModel) {
        this.lorryModel = lorryModel;
    }

    public String getLorryProducingArea() {
        return lorryProducingArea;
    }

    public void setLorryProducingArea(String lorryProducingArea) {
        this.lorryProducingArea = lorryProducingArea;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public Date getLorryProductionDate() {
        return lorryProductionDate;
    }

    public void setLorryProductionDate(Date lorryProductionDate) {
        this.lorryProductionDate = lorryProductionDate;
    }

    public Date getLorryPurchaseDate() {
        return lorryPurchaseDate;
    }

    public void setLorryPurchaseDate(Date lorryPurchaseDate) {
        this.lorryPurchaseDate = lorryPurchaseDate;
    }

    public String getLorryRemarks() {
        return lorryRemarks;
    }

    public void setLorryRemarks(String lorryRemarks) {
        this.lorryRemarks = lorryRemarks;
    }
}