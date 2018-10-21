package com.wgc.logistics.entity;

public class AugustRoute {
    private Integer routeNumber;

    private String routeName;

    private Integer provinceStartNumber;

    private Integer cityStartNumber;

    private Integer provinceMidpointNumber;

    private Integer cityMidpointNumber;

    private Integer provinceEndNumber;

    private Integer cityEndNumber;

    private Long routeTransportPrice;

    private String routeRemarks;

    public Integer getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(Integer routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Integer getProvinceStartNumber() {
        return provinceStartNumber;
    }

    public void setProvinceStartNumber(Integer provinceStartNumber) {
        this.provinceStartNumber = provinceStartNumber;
    }

    public Integer getCityStartNumber() {
        return cityStartNumber;
    }

    public void setCityStartNumber(Integer cityStartNumber) {
        this.cityStartNumber = cityStartNumber;
    }

    public Integer getProvinceMidpointNumber() {
        return provinceMidpointNumber;
    }

    public void setProvinceMidpointNumber(Integer provinceMidpointNumber) {
        this.provinceMidpointNumber = provinceMidpointNumber;
    }

    public Integer getCityMidpointNumber() {
        return cityMidpointNumber;
    }

    public void setCityMidpointNumber(Integer cityMidpointNumber) {
        this.cityMidpointNumber = cityMidpointNumber;
    }

    public Integer getProvinceEndNumber() {
        return provinceEndNumber;
    }

    public void setProvinceEndNumber(Integer provinceEndNumber) {
        this.provinceEndNumber = provinceEndNumber;
    }

    public Integer getCityEndNumber() {
        return cityEndNumber;
    }

    public void setCityEndNumber(Integer cityEndNumber) {
        this.cityEndNumber = cityEndNumber;
    }

    public Long getRouteTransportPrice() {
        return routeTransportPrice;
    }

    public void setRouteTransportPrice(Long routeTransportPrice) {
        this.routeTransportPrice = routeTransportPrice;
    }

    public String getRouteRemarks() {
        return routeRemarks;
    }

    public void setRouteRemarks(String routeRemarks) {
        this.routeRemarks = routeRemarks;
    }
}