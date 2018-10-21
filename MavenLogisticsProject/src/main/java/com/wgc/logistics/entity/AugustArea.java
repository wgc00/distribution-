package com.wgc.logistics.entity;

public class AugustArea {
    private Integer areaId;

    private String areaName;

    private Long areaPrice;

    private Integer cityId;

    private Integer stattionId;

    private String areaRemarks;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Long getAreaPrice() {
        return areaPrice;
    }

    public void setAreaPrice(Long areaPrice) {
        this.areaPrice = areaPrice;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getStattionId() {
        return stattionId;
    }

    public void setStattionId(Integer stattionId) {
        this.stattionId = stattionId;
    }

    public String getAreaRemarks() {
        return areaRemarks;
    }

    public void setAreaRemarks(String areaRemarks) {
        this.areaRemarks = areaRemarks;
    }
}