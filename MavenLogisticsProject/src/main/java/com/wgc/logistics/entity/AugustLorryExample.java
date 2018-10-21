package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AugustLorryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustLorryExample() {
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

        public Criteria andLorryNumberIsNull() {
            addCriterion("lorry_number is null");
            return (Criteria) this;
        }

        public Criteria andLorryNumberIsNotNull() {
            addCriterion("lorry_number is not null");
            return (Criteria) this;
        }

        public Criteria andLorryNumberEqualTo(Integer value) {
            addCriterion("lorry_number =", value, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberNotEqualTo(Integer value) {
            addCriterion("lorry_number <>", value, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberGreaterThan(Integer value) {
            addCriterion("lorry_number >", value, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("lorry_number >=", value, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberLessThan(Integer value) {
            addCriterion("lorry_number <", value, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberLessThanOrEqualTo(Integer value) {
            addCriterion("lorry_number <=", value, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberIn(List<Integer> values) {
            addCriterion("lorry_number in", values, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberNotIn(List<Integer> values) {
            addCriterion("lorry_number not in", values, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberBetween(Integer value1, Integer value2) {
            addCriterion("lorry_number between", value1, value2, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("lorry_number not between", value1, value2, "lorryNumber");
            return (Criteria) this;
        }

        public Criteria andLorryModelIsNull() {
            addCriterion("lorry_model is null");
            return (Criteria) this;
        }

        public Criteria andLorryModelIsNotNull() {
            addCriterion("lorry_model is not null");
            return (Criteria) this;
        }

        public Criteria andLorryModelEqualTo(String value) {
            addCriterion("lorry_model =", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelNotEqualTo(String value) {
            addCriterion("lorry_model <>", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelGreaterThan(String value) {
            addCriterion("lorry_model >", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelGreaterThanOrEqualTo(String value) {
            addCriterion("lorry_model >=", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelLessThan(String value) {
            addCriterion("lorry_model <", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelLessThanOrEqualTo(String value) {
            addCriterion("lorry_model <=", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelLike(String value) {
            addCriterion("lorry_model like", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelNotLike(String value) {
            addCriterion("lorry_model not like", value, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelIn(List<String> values) {
            addCriterion("lorry_model in", values, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelNotIn(List<String> values) {
            addCriterion("lorry_model not in", values, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelBetween(String value1, String value2) {
            addCriterion("lorry_model between", value1, value2, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryModelNotBetween(String value1, String value2) {
            addCriterion("lorry_model not between", value1, value2, "lorryModel");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaIsNull() {
            addCriterion("lorry_producing_area is null");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaIsNotNull() {
            addCriterion("lorry_producing_area is not null");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaEqualTo(String value) {
            addCriterion("lorry_producing_area =", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaNotEqualTo(String value) {
            addCriterion("lorry_producing_area <>", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaGreaterThan(String value) {
            addCriterion("lorry_producing_area >", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaGreaterThanOrEqualTo(String value) {
            addCriterion("lorry_producing_area >=", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaLessThan(String value) {
            addCriterion("lorry_producing_area <", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaLessThanOrEqualTo(String value) {
            addCriterion("lorry_producing_area <=", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaLike(String value) {
            addCriterion("lorry_producing_area like", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaNotLike(String value) {
            addCriterion("lorry_producing_area not like", value, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaIn(List<String> values) {
            addCriterion("lorry_producing_area in", values, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaNotIn(List<String> values) {
            addCriterion("lorry_producing_area not in", values, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaBetween(String value1, String value2) {
            addCriterion("lorry_producing_area between", value1, value2, "lorryProducingArea");
            return (Criteria) this;
        }

        public Criteria andLorryProducingAreaNotBetween(String value1, String value2) {
            addCriterion("lorry_producing_area not between", value1, value2, "lorryProducingArea");
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

        public Criteria andRouteNumberEqualTo(String value) {
            addCriterion("route_number =", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotEqualTo(String value) {
            addCriterion("route_number <>", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberGreaterThan(String value) {
            addCriterion("route_number >", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberGreaterThanOrEqualTo(String value) {
            addCriterion("route_number >=", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLessThan(String value) {
            addCriterion("route_number <", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLessThanOrEqualTo(String value) {
            addCriterion("route_number <=", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberLike(String value) {
            addCriterion("route_number like", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotLike(String value) {
            addCriterion("route_number not like", value, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberIn(List<String> values) {
            addCriterion("route_number in", values, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotIn(List<String> values) {
            addCriterion("route_number not in", values, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberBetween(String value1, String value2) {
            addCriterion("route_number between", value1, value2, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andRouteNumberNotBetween(String value1, String value2) {
            addCriterion("route_number not between", value1, value2, "routeNumber");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateIsNull() {
            addCriterion("lorry_production_date is null");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateIsNotNull() {
            addCriterion("lorry_production_date is not null");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateEqualTo(Date value) {
            addCriterion("lorry_production_date =", value, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateNotEqualTo(Date value) {
            addCriterion("lorry_production_date <>", value, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateGreaterThan(Date value) {
            addCriterion("lorry_production_date >", value, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lorry_production_date >=", value, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateLessThan(Date value) {
            addCriterion("lorry_production_date <", value, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateLessThanOrEqualTo(Date value) {
            addCriterion("lorry_production_date <=", value, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateIn(List<Date> values) {
            addCriterion("lorry_production_date in", values, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateNotIn(List<Date> values) {
            addCriterion("lorry_production_date not in", values, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateBetween(Date value1, Date value2) {
            addCriterion("lorry_production_date between", value1, value2, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryProductionDateNotBetween(Date value1, Date value2) {
            addCriterion("lorry_production_date not between", value1, value2, "lorryProductionDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateIsNull() {
            addCriterion("lorry_purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateIsNotNull() {
            addCriterion("lorry_purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateEqualTo(Date value) {
            addCriterion("lorry_purchase_date =", value, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateNotEqualTo(Date value) {
            addCriterion("lorry_purchase_date <>", value, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateGreaterThan(Date value) {
            addCriterion("lorry_purchase_date >", value, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lorry_purchase_date >=", value, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateLessThan(Date value) {
            addCriterion("lorry_purchase_date <", value, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateLessThanOrEqualTo(Date value) {
            addCriterion("lorry_purchase_date <=", value, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateIn(List<Date> values) {
            addCriterion("lorry_purchase_date in", values, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateNotIn(List<Date> values) {
            addCriterion("lorry_purchase_date not in", values, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateBetween(Date value1, Date value2) {
            addCriterion("lorry_purchase_date between", value1, value2, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryPurchaseDateNotBetween(Date value1, Date value2) {
            addCriterion("lorry_purchase_date not between", value1, value2, "lorryPurchaseDate");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksIsNull() {
            addCriterion("lorry_remarks is null");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksIsNotNull() {
            addCriterion("lorry_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksEqualTo(String value) {
            addCriterion("lorry_remarks =", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksNotEqualTo(String value) {
            addCriterion("lorry_remarks <>", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksGreaterThan(String value) {
            addCriterion("lorry_remarks >", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("lorry_remarks >=", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksLessThan(String value) {
            addCriterion("lorry_remarks <", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksLessThanOrEqualTo(String value) {
            addCriterion("lorry_remarks <=", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksLike(String value) {
            addCriterion("lorry_remarks like", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksNotLike(String value) {
            addCriterion("lorry_remarks not like", value, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksIn(List<String> values) {
            addCriterion("lorry_remarks in", values, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksNotIn(List<String> values) {
            addCriterion("lorry_remarks not in", values, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksBetween(String value1, String value2) {
            addCriterion("lorry_remarks between", value1, value2, "lorryRemarks");
            return (Criteria) this;
        }

        public Criteria andLorryRemarksNotBetween(String value1, String value2) {
            addCriterion("lorry_remarks not between", value1, value2, "lorryRemarks");
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