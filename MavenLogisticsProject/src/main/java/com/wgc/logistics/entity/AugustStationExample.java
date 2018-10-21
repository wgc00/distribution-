package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.List;

public class AugustStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustStationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andStationPhoneIsNull() {
            addCriterion("station_phone is null");
            return (Criteria) this;
        }

        public Criteria andStationPhoneIsNotNull() {
            addCriterion("station_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStationPhoneEqualTo(String value) {
            addCriterion("station_phone =", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneNotEqualTo(String value) {
            addCriterion("station_phone <>", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneGreaterThan(String value) {
            addCriterion("station_phone >", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("station_phone >=", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneLessThan(String value) {
            addCriterion("station_phone <", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneLessThanOrEqualTo(String value) {
            addCriterion("station_phone <=", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneLike(String value) {
            addCriterion("station_phone like", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneNotLike(String value) {
            addCriterion("station_phone not like", value, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneIn(List<String> values) {
            addCriterion("station_phone in", values, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneNotIn(List<String> values) {
            addCriterion("station_phone not in", values, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneBetween(String value1, String value2) {
            addCriterion("station_phone between", value1, value2, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationPhoneNotBetween(String value1, String value2) {
            addCriterion("station_phone not between", value1, value2, "stationPhone");
            return (Criteria) this;
        }

        public Criteria andStationAdressIsNull() {
            addCriterion("station_adress is null");
            return (Criteria) this;
        }

        public Criteria andStationAdressIsNotNull() {
            addCriterion("station_adress is not null");
            return (Criteria) this;
        }

        public Criteria andStationAdressEqualTo(String value) {
            addCriterion("station_adress =", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressNotEqualTo(String value) {
            addCriterion("station_adress <>", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressGreaterThan(String value) {
            addCriterion("station_adress >", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressGreaterThanOrEqualTo(String value) {
            addCriterion("station_adress >=", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressLessThan(String value) {
            addCriterion("station_adress <", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressLessThanOrEqualTo(String value) {
            addCriterion("station_adress <=", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressLike(String value) {
            addCriterion("station_adress like", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressNotLike(String value) {
            addCriterion("station_adress not like", value, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressIn(List<String> values) {
            addCriterion("station_adress in", values, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressNotIn(List<String> values) {
            addCriterion("station_adress not in", values, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressBetween(String value1, String value2) {
            addCriterion("station_adress between", value1, value2, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andStationAdressNotBetween(String value1, String value2) {
            addCriterion("station_adress not between", value1, value2, "stationAdress");
            return (Criteria) this;
        }

        public Criteria andRouteNumberIsNull() {
            addCriterion("route_number is null");
            return (Criteria) this;
        }

        public Criteria andRouteNumberIsNotNull() {
            addCriterion("route_number is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNumberEqualTo(Integer value) {
            addCriterion("route_number =", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotEqualTo(Integer value) {
            addCriterion("route_number <>", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberGreaterThan(Integer value) {
            addCriterion("route_number >", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_number >=", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLessThan(Integer value) {
            addCriterion("route_number <", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLessThanOrEqualTo(Integer value) {
            addCriterion("route_number <=", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberIn(List<Integer> values) {
            addCriterion("route_number in", values, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotIn(List<Integer> values) {
            addCriterion("route_number not in", values, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberBetween(Integer value1, Integer value2) {
            addCriterion("route_number between", value1, value2, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("route_number not between", value1, value2, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStationRemarksIsNull() {
            addCriterion("station_remarks is null");
            return (Criteria) this;
        }

        public Criteria andStationRemarksIsNotNull() {
            addCriterion("station_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andStationRemarksEqualTo(String value) {
            addCriterion("station_remarks =", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksNotEqualTo(String value) {
            addCriterion("station_remarks <>", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksGreaterThan(String value) {
            addCriterion("station_remarks >", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("station_remarks >=", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksLessThan(String value) {
            addCriterion("station_remarks <", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksLessThanOrEqualTo(String value) {
            addCriterion("station_remarks <=", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksLike(String value) {
            addCriterion("station_remarks like", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksNotLike(String value) {
            addCriterion("station_remarks not like", value, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksIn(List<String> values) {
            addCriterion("station_remarks in", values, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksNotIn(List<String> values) {
            addCriterion("station_remarks not in", values, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksBetween(String value1, String value2) {
            addCriterion("station_remarks between", value1, value2, "stationRemarks");
            return (Criteria) this;
        }

        public Criteria andStationRemarksNotBetween(String value1, String value2) {
            addCriterion("station_remarks not between", value1, value2, "stationRemarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}