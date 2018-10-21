package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.List;

public class AugustUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustUserExample() {
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

        public Criteria andUserNubmerIsNull() {
            addCriterion("user_nubmer is null");
            return (Criteria) this;
        }

        public Criteria andUserNubmerIsNotNull() {
            addCriterion("user_nubmer is not null");
            return (Criteria) this;
        }

        public Criteria andUserNubmerEqualTo(Integer value) {
            addCriterion("user_nubmer =", value, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerNotEqualTo(Integer value) {
            addCriterion("user_nubmer <>", value, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerGreaterThan(Integer value) {
            addCriterion("user_nubmer >", value, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_nubmer >=", value, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerLessThan(Integer value) {
            addCriterion("user_nubmer <", value, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerLessThanOrEqualTo(Integer value) {
            addCriterion("user_nubmer <=", value, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerIn(List<Integer> values) {
            addCriterion("user_nubmer in", values, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerNotIn(List<Integer> values) {
            addCriterion("user_nubmer not in", values, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerBetween(Integer value1, Integer value2) {
            addCriterion("user_nubmer between", value1, value2, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNubmerNotBetween(Integer value1, Integer value2) {
            addCriterion("user_nubmer not between", value1, value2, "userNubmer");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserRemarksIsNull() {
            addCriterion("user_remarks is null");
            return (Criteria) this;
        }

        public Criteria andUserRemarksIsNotNull() {
            addCriterion("user_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andUserRemarksEqualTo(String value) {
            addCriterion("user_remarks =", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksNotEqualTo(String value) {
            addCriterion("user_remarks <>", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksGreaterThan(String value) {
            addCriterion("user_remarks >", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("user_remarks >=", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksLessThan(String value) {
            addCriterion("user_remarks <", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksLessThanOrEqualTo(String value) {
            addCriterion("user_remarks <=", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksLike(String value) {
            addCriterion("user_remarks like", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksNotLike(String value) {
            addCriterion("user_remarks not like", value, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksIn(List<String> values) {
            addCriterion("user_remarks in", values, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksNotIn(List<String> values) {
            addCriterion("user_remarks not in", values, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksBetween(String value1, String value2) {
            addCriterion("user_remarks between", value1, value2, "userRemarks");
            return (Criteria) this;
        }

        public Criteria andUserRemarksNotBetween(String value1, String value2) {
            addCriterion("user_remarks not between", value1, value2, "userRemarks");
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