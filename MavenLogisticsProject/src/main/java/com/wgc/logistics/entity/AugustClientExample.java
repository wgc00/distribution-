package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AugustClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustClientExample() {
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

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("client_id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("client_id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("client_id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("client_id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("client_id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("client_id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("client_id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientGenderIsNull() {
            addCriterion("client_gender is null");
            return (Criteria) this;
        }

        public Criteria andClientGenderIsNotNull() {
            addCriterion("client_gender is not null");
            return (Criteria) this;
        }

        public Criteria andClientGenderEqualTo(Integer value) {
            addCriterion("client_gender =", value, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderNotEqualTo(Integer value) {
            addCriterion("client_gender <>", value, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderGreaterThan(Integer value) {
            addCriterion("client_gender >", value, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_gender >=", value, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderLessThan(Integer value) {
            addCriterion("client_gender <", value, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderLessThanOrEqualTo(Integer value) {
            addCriterion("client_gender <=", value, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderIn(List<Integer> values) {
            addCriterion("client_gender in", values, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderNotIn(List<Integer> values) {
            addCriterion("client_gender not in", values, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderBetween(Integer value1, Integer value2) {
            addCriterion("client_gender between", value1, value2, "clientGender");
            return (Criteria) this;
        }

        public Criteria andClientGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("client_gender not between", value1, value2, "clientGender");
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andClientPasswordIsNull() {
            addCriterion("client_password is null");
            return (Criteria) this;
        }

        public Criteria andClientPasswordIsNotNull() {
            addCriterion("client_password is not null");
            return (Criteria) this;
        }

        public Criteria andClientPasswordEqualTo(String value) {
            addCriterion("client_password =", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordNotEqualTo(String value) {
            addCriterion("client_password <>", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordGreaterThan(String value) {
            addCriterion("client_password >", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("client_password >=", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordLessThan(String value) {
            addCriterion("client_password <", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordLessThanOrEqualTo(String value) {
            addCriterion("client_password <=", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordLike(String value) {
            addCriterion("client_password like", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordNotLike(String value) {
            addCriterion("client_password not like", value, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordIn(List<String> values) {
            addCriterion("client_password in", values, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordNotIn(List<String> values) {
            addCriterion("client_password not in", values, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordBetween(String value1, String value2) {
            addCriterion("client_password between", value1, value2, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPasswordNotBetween(String value1, String value2) {
            addCriterion("client_password not between", value1, value2, "clientPassword");
            return (Criteria) this;
        }

        public Criteria andClientPhoneIsNull() {
            addCriterion("client_phone is null");
            return (Criteria) this;
        }

        public Criteria andClientPhoneIsNotNull() {
            addCriterion("client_phone is not null");
            return (Criteria) this;
        }

        public Criteria andClientPhoneEqualTo(String value) {
            addCriterion("client_phone =", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneNotEqualTo(String value) {
            addCriterion("client_phone <>", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneGreaterThan(String value) {
            addCriterion("client_phone >", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("client_phone >=", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneLessThan(String value) {
            addCriterion("client_phone <", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneLessThanOrEqualTo(String value) {
            addCriterion("client_phone <=", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneLike(String value) {
            addCriterion("client_phone like", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneNotLike(String value) {
            addCriterion("client_phone not like", value, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneIn(List<String> values) {
            addCriterion("client_phone in", values, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneNotIn(List<String> values) {
            addCriterion("client_phone not in", values, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneBetween(String value1, String value2) {
            addCriterion("client_phone between", value1, value2, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientPhoneNotBetween(String value1, String value2) {
            addCriterion("client_phone not between", value1, value2, "clientPhone");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateIsNull() {
            addCriterion("client_birth_date is null");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateIsNotNull() {
            addCriterion("client_birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateEqualTo(Date value) {
            addCriterion("client_birth_date =", value, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateNotEqualTo(Date value) {
            addCriterion("client_birth_date <>", value, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateGreaterThan(Date value) {
            addCriterion("client_birth_date >", value, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("client_birth_date >=", value, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateLessThan(Date value) {
            addCriterion("client_birth_date <", value, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("client_birth_date <=", value, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateIn(List<Date> values) {
            addCriterion("client_birth_date in", values, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateNotIn(List<Date> values) {
            addCriterion("client_birth_date not in", values, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateBetween(Date value1, Date value2) {
            addCriterion("client_birth_date between", value1, value2, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("client_birth_date not between", value1, value2, "clientBirthDate");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNull() {
            addCriterion("client_address is null");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNotNull() {
            addCriterion("client_address is not null");
            return (Criteria) this;
        }

        public Criteria andClientAddressEqualTo(String value) {
            addCriterion("client_address =", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotEqualTo(String value) {
            addCriterion("client_address <>", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThan(String value) {
            addCriterion("client_address >", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("client_address >=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThan(String value) {
            addCriterion("client_address <", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThanOrEqualTo(String value) {
            addCriterion("client_address <=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLike(String value) {
            addCriterion("client_address like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotLike(String value) {
            addCriterion("client_address not like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressIn(List<String> values) {
            addCriterion("client_address in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotIn(List<String> values) {
            addCriterion("client_address not in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressBetween(String value1, String value2) {
            addCriterion("client_address between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotBetween(String value1, String value2) {
            addCriterion("client_address not between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientRemarksIsNull() {
            addCriterion("client_remarks is null");
            return (Criteria) this;
        }

        public Criteria andClientRemarksIsNotNull() {
            addCriterion("client_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andClientRemarksEqualTo(String value) {
            addCriterion("client_remarks =", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotEqualTo(String value) {
            addCriterion("client_remarks <>", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksGreaterThan(String value) {
            addCriterion("client_remarks >", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("client_remarks >=", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksLessThan(String value) {
            addCriterion("client_remarks <", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksLessThanOrEqualTo(String value) {
            addCriterion("client_remarks <=", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksLike(String value) {
            addCriterion("client_remarks like", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotLike(String value) {
            addCriterion("client_remarks not like", value, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksIn(List<String> values) {
            addCriterion("client_remarks in", values, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotIn(List<String> values) {
            addCriterion("client_remarks not in", values, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksBetween(String value1, String value2) {
            addCriterion("client_remarks between", value1, value2, "clientRemarks");
            return (Criteria) this;
        }

        public Criteria andClientRemarksNotBetween(String value1, String value2) {
            addCriterion("client_remarks not between", value1, value2, "clientRemarks");
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