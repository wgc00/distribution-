package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.List;

public class AugustAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustAreaExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaPriceIsNull() {
            addCriterion("area_price is null");
            return (Criteria) this;
        }

        public Criteria andAreaPriceIsNotNull() {
            addCriterion("area_price is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPriceEqualTo(Long value) {
            addCriterion("area_price =", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceNotEqualTo(Long value) {
            addCriterion("area_price <>", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceGreaterThan(Long value) {
            addCriterion("area_price >", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("area_price >=", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceLessThan(Long value) {
            addCriterion("area_price <", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceLessThanOrEqualTo(Long value) {
            addCriterion("area_price <=", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceIn(List<Long> values) {
            addCriterion("area_price in", values, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceNotIn(List<Long> values) {
            addCriterion("area_price not in", values, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceBetween(Long value1, Long value2) {
            addCriterion("area_price between", value1, value2, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceNotBetween(Long value1, Long value2) {
            addCriterion("area_price not between", value1, value2, "areaPrice");
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

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andStattionIdIsNull() {
            addCriterion("stattion_id is null");
            return (Criteria) this;
        }

        public Criteria andStattionIdIsNotNull() {
            addCriterion("stattion_id is not null");
            return (Criteria) this;
        }

        public Criteria andStattionIdEqualTo(Integer value) {
            addCriterion("stattion_id =", value, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdNotEqualTo(Integer value) {
            addCriterion("stattion_id <>", value, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdGreaterThan(Integer value) {
            addCriterion("stattion_id >", value, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stattion_id >=", value, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdLessThan(Integer value) {
            addCriterion("stattion_id <", value, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdLessThanOrEqualTo(Integer value) {
            addCriterion("stattion_id <=", value, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdIn(List<Integer> values) {
            addCriterion("stattion_id in", values, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdNotIn(List<Integer> values) {
            addCriterion("stattion_id not in", values, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdBetween(Integer value1, Integer value2) {
            addCriterion("stattion_id between", value1, value2, "stattionId");
            return (Criteria) this;
        }

        public Criteria andStattionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stattion_id not between", value1, value2, "stattionId");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksIsNull() {
            addCriterion("area_remarks is null");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksIsNotNull() {
            addCriterion("area_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksEqualTo(String value) {
            addCriterion("area_remarks =", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksNotEqualTo(String value) {
            addCriterion("area_remarks <>", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksGreaterThan(String value) {
            addCriterion("area_remarks >", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("area_remarks >=", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksLessThan(String value) {
            addCriterion("area_remarks <", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksLessThanOrEqualTo(String value) {
            addCriterion("area_remarks <=", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksLike(String value) {
            addCriterion("area_remarks like", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksNotLike(String value) {
            addCriterion("area_remarks not like", value, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksIn(List<String> values) {
            addCriterion("area_remarks in", values, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksNotIn(List<String> values) {
            addCriterion("area_remarks not in", values, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksBetween(String value1, String value2) {
            addCriterion("area_remarks between", value1, value2, "areaRemarks");
            return (Criteria) this;
        }

        public Criteria andAreaRemarksNotBetween(String value1, String value2) {
            addCriterion("area_remarks not between", value1, value2, "areaRemarks");
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