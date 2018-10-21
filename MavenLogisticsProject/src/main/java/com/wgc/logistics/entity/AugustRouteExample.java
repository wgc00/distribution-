package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.List;

public class AugustRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustRouteExample() {
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

        public Criteria andRouteNameIsNull() {
            addCriterion("route_name is null");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNotNull() {
            addCriterion("route_name is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNameEqualTo(String value) {
            addCriterion("route_name =", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotEqualTo(String value) {
            addCriterion("route_name <>", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThan(String value) {
            addCriterion("route_name >", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThanOrEqualTo(String value) {
            addCriterion("route_name >=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThan(String value) {
            addCriterion("route_name <", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThanOrEqualTo(String value) {
            addCriterion("route_name <=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLike(String value) {
            addCriterion("route_name like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotLike(String value) {
            addCriterion("route_name not like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameIn(List<String> values) {
            addCriterion("route_name in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotIn(List<String> values) {
            addCriterion("route_name not in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameBetween(String value1, String value2) {
            addCriterion("route_name between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotBetween(String value1, String value2) {
            addCriterion("route_name not between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberIsNull() {
            addCriterion("province_start_number is null");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberIsNotNull() {
            addCriterion("province_start_number is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberEqualTo(Integer value) {
            addCriterion("province_start_number =", value, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberNotEqualTo(Integer value) {
            addCriterion("province_start_number <>", value, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberGreaterThan(Integer value) {
            addCriterion("province_start_number >", value, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_start_number >=", value, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberLessThan(Integer value) {
            addCriterion("province_start_number <", value, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberLessThanOrEqualTo(Integer value) {
            addCriterion("province_start_number <=", value, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberIn(List<Integer> values) {
            addCriterion("province_start_number in", values, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberNotIn(List<Integer> values) {
            addCriterion("province_start_number not in", values, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberBetween(Integer value1, Integer value2) {
            addCriterion("province_start_number between", value1, value2, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceStartNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("province_start_number not between", value1, value2, "provinceStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberIsNull() {
            addCriterion("city_start_number is null");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberIsNotNull() {
            addCriterion("city_start_number is not null");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberEqualTo(Integer value) {
            addCriterion("city_start_number =", value, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberNotEqualTo(Integer value) {
            addCriterion("city_start_number <>", value, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberGreaterThan(Integer value) {
            addCriterion("city_start_number >", value, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_start_number >=", value, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberLessThan(Integer value) {
            addCriterion("city_start_number <", value, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberLessThanOrEqualTo(Integer value) {
            addCriterion("city_start_number <=", value, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberIn(List<Integer> values) {
            addCriterion("city_start_number in", values, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberNotIn(List<Integer> values) {
            addCriterion("city_start_number not in", values, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberBetween(Integer value1, Integer value2) {
            addCriterion("city_start_number between", value1, value2, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andCityStartNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("city_start_number not between", value1, value2, "cityStartNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberIsNull() {
            addCriterion("province_midpoint_number is null");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberIsNotNull() {
            addCriterion("province_midpoint_number is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberEqualTo(Integer value) {
            addCriterion("province_midpoint_number =", value, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberNotEqualTo(Integer value) {
            addCriterion("province_midpoint_number <>", value, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberGreaterThan(Integer value) {
            addCriterion("province_midpoint_number >", value, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_midpoint_number >=", value, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberLessThan(Integer value) {
            addCriterion("province_midpoint_number <", value, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberLessThanOrEqualTo(Integer value) {
            addCriterion("province_midpoint_number <=", value, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberIn(List<Integer> values) {
            addCriterion("province_midpoint_number in", values, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberNotIn(List<Integer> values) {
            addCriterion("province_midpoint_number not in", values, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberBetween(Integer value1, Integer value2) {
            addCriterion("province_midpoint_number between", value1, value2, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceMidpointNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("province_midpoint_number not between", value1, value2, "provinceMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberIsNull() {
            addCriterion("city_midpoint_number is null");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberIsNotNull() {
            addCriterion("city_midpoint_number is not null");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberEqualTo(Integer value) {
            addCriterion("city_midpoint_number =", value, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberNotEqualTo(Integer value) {
            addCriterion("city_midpoint_number <>", value, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberGreaterThan(Integer value) {
            addCriterion("city_midpoint_number >", value, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_midpoint_number >=", value, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberLessThan(Integer value) {
            addCriterion("city_midpoint_number <", value, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberLessThanOrEqualTo(Integer value) {
            addCriterion("city_midpoint_number <=", value, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberIn(List<Integer> values) {
            addCriterion("city_midpoint_number in", values, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberNotIn(List<Integer> values) {
            addCriterion("city_midpoint_number not in", values, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberBetween(Integer value1, Integer value2) {
            addCriterion("city_midpoint_number between", value1, value2, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andCityMidpointNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("city_midpoint_number not between", value1, value2, "cityMidpointNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberIsNull() {
            addCriterion("province_end_number is null");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberIsNotNull() {
            addCriterion("province_end_number is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberEqualTo(Integer value) {
            addCriterion("province_end_number =", value, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberNotEqualTo(Integer value) {
            addCriterion("province_end_number <>", value, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberGreaterThan(Integer value) {
            addCriterion("province_end_number >", value, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_end_number >=", value, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberLessThan(Integer value) {
            addCriterion("province_end_number <", value, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberLessThanOrEqualTo(Integer value) {
            addCriterion("province_end_number <=", value, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberIn(List<Integer> values) {
            addCriterion("province_end_number in", values, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberNotIn(List<Integer> values) {
            addCriterion("province_end_number not in", values, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberBetween(Integer value1, Integer value2) {
            addCriterion("province_end_number between", value1, value2, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andProvinceEndNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("province_end_number not between", value1, value2, "provinceEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberIsNull() {
            addCriterion("city_end_number is null");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberIsNotNull() {
            addCriterion("city_end_number is not null");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberEqualTo(Integer value) {
            addCriterion("city_end_number =", value, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberNotEqualTo(Integer value) {
            addCriterion("city_end_number <>", value, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberGreaterThan(Integer value) {
            addCriterion("city_end_number >", value, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_end_number >=", value, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberLessThan(Integer value) {
            addCriterion("city_end_number <", value, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberLessThanOrEqualTo(Integer value) {
            addCriterion("city_end_number <=", value, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberIn(List<Integer> values) {
            addCriterion("city_end_number in", values, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberNotIn(List<Integer> values) {
            addCriterion("city_end_number not in", values, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberBetween(Integer value1, Integer value2) {
            addCriterion("city_end_number between", value1, value2, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andCityEndNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("city_end_number not between", value1, value2, "cityEndNumber");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceIsNull() {
            addCriterion("route_transport_price is null");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceIsNotNull() {
            addCriterion("route_transport_price is not null");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceEqualTo(Long value) {
            addCriterion("route_transport_price =", value, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceNotEqualTo(Long value) {
            addCriterion("route_transport_price <>", value, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceGreaterThan(Long value) {
            addCriterion("route_transport_price >", value, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("route_transport_price >=", value, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceLessThan(Long value) {
            addCriterion("route_transport_price <", value, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceLessThanOrEqualTo(Long value) {
            addCriterion("route_transport_price <=", value, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceIn(List<Long> values) {
            addCriterion("route_transport_price in", values, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceNotIn(List<Long> values) {
            addCriterion("route_transport_price not in", values, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceBetween(Long value1, Long value2) {
            addCriterion("route_transport_price between", value1, value2, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteTransportPriceNotBetween(Long value1, Long value2) {
            addCriterion("route_transport_price not between", value1, value2, "routeTransportPrice");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksIsNull() {
            addCriterion("route_remarks is null");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksIsNotNull() {
            addCriterion("route_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksEqualTo(String value) {
            addCriterion("route_remarks =", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksNotEqualTo(String value) {
            addCriterion("route_remarks <>", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksGreaterThan(String value) {
            addCriterion("route_remarks >", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("route_remarks >=", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksLessThan(String value) {
            addCriterion("route_remarks <", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksLessThanOrEqualTo(String value) {
            addCriterion("route_remarks <=", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksLike(String value) {
            addCriterion("route_remarks like", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksNotLike(String value) {
            addCriterion("route_remarks not like", value, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksIn(List<String> values) {
            addCriterion("route_remarks in", values, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksNotIn(List<String> values) {
            addCriterion("route_remarks not in", values, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksBetween(String value1, String value2) {
            addCriterion("route_remarks between", value1, value2, "routeRemarks");
            return (Criteria) this;
        }

        public Criteria andRouteRemarksNotBetween(String value1, String value2) {
            addCriterion("route_remarks not between", value1, value2, "routeRemarks");
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