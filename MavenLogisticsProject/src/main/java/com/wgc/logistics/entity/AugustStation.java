package com.wgc.logistics.entity;

public class AugustStation {
    private Integer stationId;

    private String stationName;

    private String provinceId;

    private String cityId;

    private String adminId;

    private String stationPhone;

    private String stationAdress;

    private Integer routeNumber;

    private Integer userId;

    private String stationRemarks;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getStationPhone() {
        return stationPhone;
    }

    public void setStationPhone(String stationPhone) {
        this.stationPhone = stationPhone;
    }

    public String getStationAdress() {
        return stationAdress;
    }

    public void setStationAdress(String stationAdress) {
        this.stationAdress = stationAdress;
    }

    public Integer getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(Integer routeNumber) {
        this.routeNumber = routeNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStationRemarks() {
        return stationRemarks;
    }

    public void setStationRemarks(String stationRemarks) {
        this.stationRemarks = stationRemarks;
    }
}