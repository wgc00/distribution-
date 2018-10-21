package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AugustDeliveryReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustDeliveryReceiptExample() {
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

        public Criteria andReceiptIdIsNull() {
            addCriterion("receipt_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIsNotNull() {
            addCriterion("receipt_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptIdEqualTo(Integer value) {
            addCriterion("receipt_id =", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotEqualTo(Integer value) {
            addCriterion("receipt_id <>", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThan(Integer value) {
            addCriterion("receipt_id >", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt_id >=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThan(Integer value) {
            addCriterion("receipt_id <", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdLessThanOrEqualTo(Integer value) {
            addCriterion("receipt_id <=", value, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdIn(List<Integer> values) {
            addCriterion("receipt_id in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotIn(List<Integer> values) {
            addCriterion("receipt_id not in", values, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdBetween(Integer value1, Integer value2) {
            addCriterion("receipt_id between", value1, value2, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt_id not between", value1, value2, "receiptId");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityIsNull() {
            addCriterion("receipt_start_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityIsNotNull() {
            addCriterion("receipt_start_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityEqualTo(String value) {
            addCriterion("receipt_start_city =", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityNotEqualTo(String value) {
            addCriterion("receipt_start_city <>", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityGreaterThan(String value) {
            addCriterion("receipt_start_city >", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_start_city >=", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityLessThan(String value) {
            addCriterion("receipt_start_city <", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityLessThanOrEqualTo(String value) {
            addCriterion("receipt_start_city <=", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityLike(String value) {
            addCriterion("receipt_start_city like", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityNotLike(String value) {
            addCriterion("receipt_start_city not like", value, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityIn(List<String> values) {
            addCriterion("receipt_start_city in", values, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityNotIn(List<String> values) {
            addCriterion("receipt_start_city not in", values, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityBetween(String value1, String value2) {
            addCriterion("receipt_start_city between", value1, value2, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStartCityNotBetween(String value1, String value2) {
            addCriterion("receipt_start_city not between", value1, value2, "receiptStartCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityIsNull() {
            addCriterion("receipt_end_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityIsNotNull() {
            addCriterion("receipt_end_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityEqualTo(String value) {
            addCriterion("receipt_end_city =", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityNotEqualTo(String value) {
            addCriterion("receipt_end_city <>", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityGreaterThan(String value) {
            addCriterion("receipt_end_city >", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_end_city >=", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityLessThan(String value) {
            addCriterion("receipt_end_city <", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityLessThanOrEqualTo(String value) {
            addCriterion("receipt_end_city <=", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityLike(String value) {
            addCriterion("receipt_end_city like", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityNotLike(String value) {
            addCriterion("receipt_end_city not like", value, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityIn(List<String> values) {
            addCriterion("receipt_end_city in", values, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityNotIn(List<String> values) {
            addCriterion("receipt_end_city not in", values, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityBetween(String value1, String value2) {
            addCriterion("receipt_end_city between", value1, value2, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptEndCityNotBetween(String value1, String value2) {
            addCriterion("receipt_end_city not between", value1, value2, "receiptEndCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityIsNull() {
            addCriterion("receipt_arrive_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityIsNotNull() {
            addCriterion("receipt_arrive_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityEqualTo(String value) {
            addCriterion("receipt_arrive_city =", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityNotEqualTo(String value) {
            addCriterion("receipt_arrive_city <>", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityGreaterThan(String value) {
            addCriterion("receipt_arrive_city >", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_arrive_city >=", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityLessThan(String value) {
            addCriterion("receipt_arrive_city <", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityLessThanOrEqualTo(String value) {
            addCriterion("receipt_arrive_city <=", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityLike(String value) {
            addCriterion("receipt_arrive_city like", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityNotLike(String value) {
            addCriterion("receipt_arrive_city not like", value, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityIn(List<String> values) {
            addCriterion("receipt_arrive_city in", values, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityNotIn(List<String> values) {
            addCriterion("receipt_arrive_city not in", values, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityBetween(String value1, String value2) {
            addCriterion("receipt_arrive_city between", value1, value2, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptArriveCityNotBetween(String value1, String value2) {
            addCriterion("receipt_arrive_city not between", value1, value2, "receiptArriveCity");
            return (Criteria) this;
        }

        public Criteria andReceiptStateIsNull() {
            addCriterion("receipt_state is null");
            return (Criteria) this;
        }

        public Criteria andReceiptStateIsNotNull() {
            addCriterion("receipt_state is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptStateEqualTo(Integer value) {
            addCriterion("receipt_state =", value, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateNotEqualTo(Integer value) {
            addCriterion("receipt_state <>", value, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateGreaterThan(Integer value) {
            addCriterion("receipt_state >", value, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt_state >=", value, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateLessThan(Integer value) {
            addCriterion("receipt_state <", value, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateLessThanOrEqualTo(Integer value) {
            addCriterion("receipt_state <=", value, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateIn(List<Integer> values) {
            addCriterion("receipt_state in", values, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateNotIn(List<Integer> values) {
            addCriterion("receipt_state not in", values, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateBetween(Integer value1, Integer value2) {
            addCriterion("receipt_state between", value1, value2, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptStateNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt_state not between", value1, value2, "receiptState");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeIsNull() {
            addCriterion("receipt_generate_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeIsNotNull() {
            addCriterion("receipt_generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeEqualTo(Date value) {
            addCriterion("receipt_generate_time =", value, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeNotEqualTo(Date value) {
            addCriterion("receipt_generate_time <>", value, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeGreaterThan(Date value) {
            addCriterion("receipt_generate_time >", value, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receipt_generate_time >=", value, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeLessThan(Date value) {
            addCriterion("receipt_generate_time <", value, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeLessThanOrEqualTo(Date value) {
            addCriterion("receipt_generate_time <=", value, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeIn(List<Date> values) {
            addCriterion("receipt_generate_time in", values, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeNotIn(List<Date> values) {
            addCriterion("receipt_generate_time not in", values, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeBetween(Date value1, Date value2) {
            addCriterion("receipt_generate_time between", value1, value2, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptGenerateTimeNotBetween(Date value1, Date value2) {
            addCriterion("receipt_generate_time not between", value1, value2, "receiptGenerateTime");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksIsNull() {
            addCriterion("receipt_remarks is null");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksIsNotNull() {
            addCriterion("receipt_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksEqualTo(String value) {
            addCriterion("receipt_remarks =", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksNotEqualTo(String value) {
            addCriterion("receipt_remarks <>", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksGreaterThan(String value) {
            addCriterion("receipt_remarks >", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_remarks >=", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksLessThan(String value) {
            addCriterion("receipt_remarks <", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksLessThanOrEqualTo(String value) {
            addCriterion("receipt_remarks <=", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksLike(String value) {
            addCriterion("receipt_remarks like", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksNotLike(String value) {
            addCriterion("receipt_remarks not like", value, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksIn(List<String> values) {
            addCriterion("receipt_remarks in", values, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksNotIn(List<String> values) {
            addCriterion("receipt_remarks not in", values, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksBetween(String value1, String value2) {
            addCriterion("receipt_remarks between", value1, value2, "receiptRemarks");
            return (Criteria) this;
        }

        public Criteria andReceiptRemarksNotBetween(String value1, String value2) {
            addCriterion("receipt_remarks not between", value1, value2, "receiptRemarks");
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