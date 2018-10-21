package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.List;

public class AugustAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustAdminExample() {
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

        public Criteria andAdminNumberIsNull() {
            addCriterion("admin_number is null");
            return (Criteria) this;
        }

        public Criteria andAdminNumberIsNotNull() {
            addCriterion("admin_number is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNumberEqualTo(Integer value) {
            addCriterion("admin_number =", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberNotEqualTo(Integer value) {
            addCriterion("admin_number <>", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberGreaterThan(Integer value) {
            addCriterion("admin_number >", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_number >=", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberLessThan(Integer value) {
            addCriterion("admin_number <", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberLessThanOrEqualTo(Integer value) {
            addCriterion("admin_number <=", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberIn(List<Integer> values) {
            addCriterion("admin_number in", values, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberNotIn(List<Integer> values) {
            addCriterion("admin_number not in", values, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberBetween(Integer value1, Integer value2) {
            addCriterion("admin_number between", value1, value2, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_number not between", value1, value2, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminGenderIsNull() {
            addCriterion("admin_gender is null");
            return (Criteria) this;
        }

        public Criteria andAdminGenderIsNotNull() {
            addCriterion("admin_gender is not null");
            return (Criteria) this;
        }

        public Criteria andAdminGenderEqualTo(Integer value) {
            addCriterion("admin_gender =", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderNotEqualTo(Integer value) {
            addCriterion("admin_gender <>", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderGreaterThan(Integer value) {
            addCriterion("admin_gender >", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_gender >=", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderLessThan(Integer value) {
            addCriterion("admin_gender <", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderLessThanOrEqualTo(Integer value) {
            addCriterion("admin_gender <=", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderIn(List<Integer> values) {
            addCriterion("admin_gender in", values, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderNotIn(List<Integer> values) {
            addCriterion("admin_gender not in", values, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderBetween(Integer value1, Integer value2) {
            addCriterion("admin_gender between", value1, value2, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_gender not between", value1, value2, "adminGender");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(Integer value) {
            addCriterion("user_number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(Integer value) {
            addCriterion("user_number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(Integer value) {
            addCriterion("user_number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(Integer value) {
            addCriterion("user_number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(Integer value) {
            addCriterion("user_number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<Integer> values) {
            addCriterion("user_number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<Integer> values) {
            addCriterion("user_number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(Integer value1, Integer value2) {
            addCriterion("user_number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("user_number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("admin_state is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("admin_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(Integer value) {
            addCriterion("admin_state =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(Integer value) {
            addCriterion("admin_state <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(Integer value) {
            addCriterion("admin_state >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_state >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(Integer value) {
            addCriterion("admin_state <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(Integer value) {
            addCriterion("admin_state <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<Integer> values) {
            addCriterion("admin_state in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<Integer> values) {
            addCriterion("admin_state not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(Integer value1, Integer value2) {
            addCriterion("admin_state between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_state not between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityIsNull() {
            addCriterion("admin_where_city is null");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityIsNotNull() {
            addCriterion("admin_where_city is not null");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityEqualTo(String value) {
            addCriterion("admin_where_city =", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityNotEqualTo(String value) {
            addCriterion("admin_where_city <>", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityGreaterThan(String value) {
            addCriterion("admin_where_city >", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityGreaterThanOrEqualTo(String value) {
            addCriterion("admin_where_city >=", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityLessThan(String value) {
            addCriterion("admin_where_city <", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityLessThanOrEqualTo(String value) {
            addCriterion("admin_where_city <=", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityLike(String value) {
            addCriterion("admin_where_city like", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityNotLike(String value) {
            addCriterion("admin_where_city not like", value, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityIn(List<String> values) {
            addCriterion("admin_where_city in", values, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityNotIn(List<String> values) {
            addCriterion("admin_where_city not in", values, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityBetween(String value1, String value2) {
            addCriterion("admin_where_city between", value1, value2, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminWhereCityNotBetween(String value1, String value2) {
            addCriterion("admin_where_city not between", value1, value2, "adminWhereCity");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNull() {
            addCriterion("admin_address is null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNotNull() {
            addCriterion("admin_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressEqualTo(String value) {
            addCriterion("admin_address =", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotEqualTo(String value) {
            addCriterion("admin_address <>", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThan(String value) {
            addCriterion("admin_address >", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThanOrEqualTo(String value) {
            addCriterion("admin_address >=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThan(String value) {
            addCriterion("admin_address <", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThanOrEqualTo(String value) {
            addCriterion("admin_address <=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLike(String value) {
            addCriterion("admin_address like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotLike(String value) {
            addCriterion("admin_address not like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIn(List<String> values) {
            addCriterion("admin_address in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotIn(List<String> values) {
            addCriterion("admin_address not in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressBetween(String value1, String value2) {
            addCriterion("admin_address between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotBetween(String value1, String value2) {
            addCriterion("admin_address not between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksIsNull() {
            addCriterion("admin_remarks is null");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksIsNotNull() {
            addCriterion("admin_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksEqualTo(String value) {
            addCriterion("admin_remarks =", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksNotEqualTo(String value) {
            addCriterion("admin_remarks <>", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksGreaterThan(String value) {
            addCriterion("admin_remarks >", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("admin_remarks >=", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksLessThan(String value) {
            addCriterion("admin_remarks <", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksLessThanOrEqualTo(String value) {
            addCriterion("admin_remarks <=", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksLike(String value) {
            addCriterion("admin_remarks like", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksNotLike(String value) {
            addCriterion("admin_remarks not like", value, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksIn(List<String> values) {
            addCriterion("admin_remarks in", values, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksNotIn(List<String> values) {
            addCriterion("admin_remarks not in", values, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksBetween(String value1, String value2) {
            addCriterion("admin_remarks between", value1, value2, "adminRemarks");
            return (Criteria) this;
        }

        public Criteria andAdminRemarksNotBetween(String value1, String value2) {
            addCriterion("admin_remarks not between", value1, value2, "adminRemarks");
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