package com.wgc.logistics.entity;

import java.util.ArrayList;
import java.util.List;

public class AugustOrderListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AugustOrderListExample() {
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

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
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

        public Criteria andOrderGoodsNameIsNull() {
            addCriterion("order_goods_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameIsNotNull() {
            addCriterion("order_goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameEqualTo(String value) {
            addCriterion("order_goods_name =", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotEqualTo(String value) {
            addCriterion("order_goods_name <>", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameGreaterThan(String value) {
            addCriterion("order_goods_name >", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_name >=", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameLessThan(String value) {
            addCriterion("order_goods_name <", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("order_goods_name <=", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameLike(String value) {
            addCriterion("order_goods_name like", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotLike(String value) {
            addCriterion("order_goods_name not like", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameIn(List<String> values) {
            addCriterion("order_goods_name in", values, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotIn(List<String> values) {
            addCriterion("order_goods_name not in", values, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameBetween(String value1, String value2) {
            addCriterion("order_goods_name between", value1, value2, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotBetween(String value1, String value2) {
            addCriterion("order_goods_name not between", value1, value2, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightIsNull() {
            addCriterion("order_goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightIsNotNull() {
            addCriterion("order_goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightEqualTo(Integer value) {
            addCriterion("order_goods_weight =", value, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightNotEqualTo(Integer value) {
            addCriterion("order_goods_weight <>", value, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightGreaterThan(Integer value) {
            addCriterion("order_goods_weight >", value, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_weight >=", value, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightLessThan(Integer value) {
            addCriterion("order_goods_weight <", value, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_weight <=", value, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightIn(List<Integer> values) {
            addCriterion("order_goods_weight in", values, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightNotIn(List<Integer> values) {
            addCriterion("order_goods_weight not in", values, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_weight between", value1, value2, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_weight not between", value1, value2, "orderGoodsWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMailerIsNull() {
            addCriterion("order_mailer is null");
            return (Criteria) this;
        }

        public Criteria andOrderMailerIsNotNull() {
            addCriterion("order_mailer is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMailerEqualTo(String value) {
            addCriterion("order_mailer =", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerNotEqualTo(String value) {
            addCriterion("order_mailer <>", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerGreaterThan(String value) {
            addCriterion("order_mailer >", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerGreaterThanOrEqualTo(String value) {
            addCriterion("order_mailer >=", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerLessThan(String value) {
            addCriterion("order_mailer <", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerLessThanOrEqualTo(String value) {
            addCriterion("order_mailer <=", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerLike(String value) {
            addCriterion("order_mailer like", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerNotLike(String value) {
            addCriterion("order_mailer not like", value, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerIn(List<String> values) {
            addCriterion("order_mailer in", values, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerNotIn(List<String> values) {
            addCriterion("order_mailer not in", values, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerBetween(String value1, String value2) {
            addCriterion("order_mailer between", value1, value2, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailerNotBetween(String value1, String value2) {
            addCriterion("order_mailer not between", value1, value2, "orderMailer");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressIsNull() {
            addCriterion("order_mail_address is null");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressIsNotNull() {
            addCriterion("order_mail_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressEqualTo(String value) {
            addCriterion("order_mail_address =", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressNotEqualTo(String value) {
            addCriterion("order_mail_address <>", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressGreaterThan(String value) {
            addCriterion("order_mail_address >", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_mail_address >=", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressLessThan(String value) {
            addCriterion("order_mail_address <", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressLessThanOrEqualTo(String value) {
            addCriterion("order_mail_address <=", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressLike(String value) {
            addCriterion("order_mail_address like", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressNotLike(String value) {
            addCriterion("order_mail_address not like", value, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressIn(List<String> values) {
            addCriterion("order_mail_address in", values, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressNotIn(List<String> values) {
            addCriterion("order_mail_address not in", values, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressBetween(String value1, String value2) {
            addCriterion("order_mail_address between", value1, value2, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderMailAddressNotBetween(String value1, String value2) {
            addCriterion("order_mail_address not between", value1, value2, "orderMailAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressIsNull() {
            addCriterion("order_receiving_address is null");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressIsNotNull() {
            addCriterion("order_receiving_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressEqualTo(String value) {
            addCriterion("order_receiving_address =", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressNotEqualTo(String value) {
            addCriterion("order_receiving_address <>", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressGreaterThan(String value) {
            addCriterion("order_receiving_address >", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_receiving_address >=", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressLessThan(String value) {
            addCriterion("order_receiving_address <", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressLessThanOrEqualTo(String value) {
            addCriterion("order_receiving_address <=", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressLike(String value) {
            addCriterion("order_receiving_address like", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressNotLike(String value) {
            addCriterion("order_receiving_address not like", value, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressIn(List<String> values) {
            addCriterion("order_receiving_address in", values, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressNotIn(List<String> values) {
            addCriterion("order_receiving_address not in", values, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressBetween(String value1, String value2) {
            addCriterion("order_receiving_address between", value1, value2, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderReceivingAddressNotBetween(String value1, String value2) {
            addCriterion("order_receiving_address not between", value1, value2, "orderReceivingAddress");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneIsNull() {
            addCriterion("order_mailer_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneIsNotNull() {
            addCriterion("order_mailer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneEqualTo(String value) {
            addCriterion("order_mailer_phone =", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneNotEqualTo(String value) {
            addCriterion("order_mailer_phone <>", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneGreaterThan(String value) {
            addCriterion("order_mailer_phone >", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_mailer_phone >=", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneLessThan(String value) {
            addCriterion("order_mailer_phone <", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneLessThanOrEqualTo(String value) {
            addCriterion("order_mailer_phone <=", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneLike(String value) {
            addCriterion("order_mailer_phone like", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneNotLike(String value) {
            addCriterion("order_mailer_phone not like", value, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneIn(List<String> values) {
            addCriterion("order_mailer_phone in", values, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneNotIn(List<String> values) {
            addCriterion("order_mailer_phone not in", values, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneBetween(String value1, String value2) {
            addCriterion("order_mailer_phone between", value1, value2, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderMailerPhoneNotBetween(String value1, String value2) {
            addCriterion("order_mailer_phone not between", value1, value2, "orderMailerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeIsNull() {
            addCriterion("order_consignee is null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeIsNotNull() {
            addCriterion("order_consignee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeEqualTo(String value) {
            addCriterion("order_consignee =", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotEqualTo(String value) {
            addCriterion("order_consignee <>", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeGreaterThan(String value) {
            addCriterion("order_consignee >", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("order_consignee >=", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeLessThan(String value) {
            addCriterion("order_consignee <", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeLessThanOrEqualTo(String value) {
            addCriterion("order_consignee <=", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeLike(String value) {
            addCriterion("order_consignee like", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotLike(String value) {
            addCriterion("order_consignee not like", value, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeIn(List<String> values) {
            addCriterion("order_consignee in", values, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotIn(List<String> values) {
            addCriterion("order_consignee not in", values, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeBetween(String value1, String value2) {
            addCriterion("order_consignee between", value1, value2, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNotBetween(String value1, String value2) {
            addCriterion("order_consignee not between", value1, value2, "orderConsignee");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneIsNull() {
            addCriterion("order_consignee_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneIsNotNull() {
            addCriterion("order_consignee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneEqualTo(String value) {
            addCriterion("order_consignee_phone =", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotEqualTo(String value) {
            addCriterion("order_consignee_phone <>", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneGreaterThan(String value) {
            addCriterion("order_consignee_phone >", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_consignee_phone >=", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneLessThan(String value) {
            addCriterion("order_consignee_phone <", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneLessThanOrEqualTo(String value) {
            addCriterion("order_consignee_phone <=", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneLike(String value) {
            addCriterion("order_consignee_phone like", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotLike(String value) {
            addCriterion("order_consignee_phone not like", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneIn(List<String> values) {
            addCriterion("order_consignee_phone in", values, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotIn(List<String> values) {
            addCriterion("order_consignee_phone not in", values, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneBetween(String value1, String value2) {
            addCriterion("order_consignee_phone between", value1, value2, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotBetween(String value1, String value2) {
            addCriterion("order_consignee_phone not between", value1, value2, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityIsNull() {
            addCriterion("order_start_city is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityIsNotNull() {
            addCriterion("order_start_city is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityEqualTo(String value) {
            addCriterion("order_start_city =", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityNotEqualTo(String value) {
            addCriterion("order_start_city <>", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityGreaterThan(String value) {
            addCriterion("order_start_city >", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityGreaterThanOrEqualTo(String value) {
            addCriterion("order_start_city >=", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityLessThan(String value) {
            addCriterion("order_start_city <", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityLessThanOrEqualTo(String value) {
            addCriterion("order_start_city <=", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityLike(String value) {
            addCriterion("order_start_city like", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityNotLike(String value) {
            addCriterion("order_start_city not like", value, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityIn(List<String> values) {
            addCriterion("order_start_city in", values, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityNotIn(List<String> values) {
            addCriterion("order_start_city not in", values, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityBetween(String value1, String value2) {
            addCriterion("order_start_city between", value1, value2, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderStartCityNotBetween(String value1, String value2) {
            addCriterion("order_start_city not between", value1, value2, "orderStartCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityIsNull() {
            addCriterion("order_midpoint_city is null");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityIsNotNull() {
            addCriterion("order_midpoint_city is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityEqualTo(String value) {
            addCriterion("order_midpoint_city =", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityNotEqualTo(String value) {
            addCriterion("order_midpoint_city <>", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityGreaterThan(String value) {
            addCriterion("order_midpoint_city >", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityGreaterThanOrEqualTo(String value) {
            addCriterion("order_midpoint_city >=", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityLessThan(String value) {
            addCriterion("order_midpoint_city <", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityLessThanOrEqualTo(String value) {
            addCriterion("order_midpoint_city <=", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityLike(String value) {
            addCriterion("order_midpoint_city like", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityNotLike(String value) {
            addCriterion("order_midpoint_city not like", value, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityIn(List<String> values) {
            addCriterion("order_midpoint_city in", values, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityNotIn(List<String> values) {
            addCriterion("order_midpoint_city not in", values, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityBetween(String value1, String value2) {
            addCriterion("order_midpoint_city between", value1, value2, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderMidpointCityNotBetween(String value1, String value2) {
            addCriterion("order_midpoint_city not between", value1, value2, "orderMidpointCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityIsNull() {
            addCriterion("order_end_city is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityIsNotNull() {
            addCriterion("order_end_city is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityEqualTo(String value) {
            addCriterion("order_end_city =", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityNotEqualTo(String value) {
            addCriterion("order_end_city <>", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityGreaterThan(String value) {
            addCriterion("order_end_city >", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityGreaterThanOrEqualTo(String value) {
            addCriterion("order_end_city >=", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityLessThan(String value) {
            addCriterion("order_end_city <", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityLessThanOrEqualTo(String value) {
            addCriterion("order_end_city <=", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityLike(String value) {
            addCriterion("order_end_city like", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityNotLike(String value) {
            addCriterion("order_end_city not like", value, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityIn(List<String> values) {
            addCriterion("order_end_city in", values, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityNotIn(List<String> values) {
            addCriterion("order_end_city not in", values, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityBetween(String value1, String value2) {
            addCriterion("order_end_city between", value1, value2, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderEndCityNotBetween(String value1, String value2) {
            addCriterion("order_end_city not between", value1, value2, "orderEndCity");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceIsNull() {
            addCriterion("order_delivery_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceIsNotNull() {
            addCriterion("order_delivery_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceEqualTo(Long value) {
            addCriterion("order_delivery_price =", value, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceNotEqualTo(Long value) {
            addCriterion("order_delivery_price <>", value, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceGreaterThan(Long value) {
            addCriterion("order_delivery_price >", value, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("order_delivery_price >=", value, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceLessThan(Long value) {
            addCriterion("order_delivery_price <", value, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceLessThanOrEqualTo(Long value) {
            addCriterion("order_delivery_price <=", value, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceIn(List<Long> values) {
            addCriterion("order_delivery_price in", values, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceNotIn(List<Long> values) {
            addCriterion("order_delivery_price not in", values, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceBetween(Long value1, Long value2) {
            addCriterion("order_delivery_price between", value1, value2, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryPriceNotBetween(Long value1, Long value2) {
            addCriterion("order_delivery_price not between", value1, value2, "orderDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceIsNull() {
            addCriterion("order_distribution_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceIsNotNull() {
            addCriterion("order_distribution_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceEqualTo(Long value) {
            addCriterion("order_distribution_price =", value, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceNotEqualTo(Long value) {
            addCriterion("order_distribution_price <>", value, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceGreaterThan(Long value) {
            addCriterion("order_distribution_price >", value, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("order_distribution_price >=", value, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceLessThan(Long value) {
            addCriterion("order_distribution_price <", value, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceLessThanOrEqualTo(Long value) {
            addCriterion("order_distribution_price <=", value, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceIn(List<Long> values) {
            addCriterion("order_distribution_price in", values, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceNotIn(List<Long> values) {
            addCriterion("order_distribution_price not in", values, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceBetween(Long value1, Long value2) {
            addCriterion("order_distribution_price between", value1, value2, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderDistributionPriceNotBetween(Long value1, Long value2) {
            addCriterion("order_distribution_price not between", value1, value2, "orderDistributionPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceIsNull() {
            addCriterion("order_transport_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceIsNotNull() {
            addCriterion("order_transport_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceEqualTo(Long value) {
            addCriterion("order_transport_price =", value, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceNotEqualTo(Long value) {
            addCriterion("order_transport_price <>", value, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceGreaterThan(Long value) {
            addCriterion("order_transport_price >", value, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("order_transport_price >=", value, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceLessThan(Long value) {
            addCriterion("order_transport_price <", value, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceLessThanOrEqualTo(Long value) {
            addCriterion("order_transport_price <=", value, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceIn(List<Long> values) {
            addCriterion("order_transport_price in", values, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceNotIn(List<Long> values) {
            addCriterion("order_transport_price not in", values, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceBetween(Long value1, Long value2) {
            addCriterion("order_transport_price between", value1, value2, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTransportPriceNotBetween(Long value1, Long value2) {
            addCriterion("order_transport_price not between", value1, value2, "orderTransportPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNull() {
            addCriterion("order_total_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNotNull() {
            addCriterion("order_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceEqualTo(Long value) {
            addCriterion("order_total_price =", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotEqualTo(Long value) {
            addCriterion("order_total_price <>", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThan(Long value) {
            addCriterion("order_total_price >", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("order_total_price >=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThan(Long value) {
            addCriterion("order_total_price <", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("order_total_price <=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIn(List<Long> values) {
            addCriterion("order_total_price in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotIn(List<Long> values) {
            addCriterion("order_total_price not in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceBetween(Long value1, Long value2) {
            addCriterion("order_total_price between", value1, value2, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("order_total_price not between", value1, value2, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderLorryIsNull() {
            addCriterion("order_lorry is null");
            return (Criteria) this;
        }

        public Criteria andOrderLorryIsNotNull() {
            addCriterion("order_lorry is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLorryEqualTo(String value) {
            addCriterion("order_lorry =", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryNotEqualTo(String value) {
            addCriterion("order_lorry <>", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryGreaterThan(String value) {
            addCriterion("order_lorry >", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryGreaterThanOrEqualTo(String value) {
            addCriterion("order_lorry >=", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryLessThan(String value) {
            addCriterion("order_lorry <", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryLessThanOrEqualTo(String value) {
            addCriterion("order_lorry <=", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryLike(String value) {
            addCriterion("order_lorry like", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryNotLike(String value) {
            addCriterion("order_lorry not like", value, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryIn(List<String> values) {
            addCriterion("order_lorry in", values, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryNotIn(List<String> values) {
            addCriterion("order_lorry not in", values, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryBetween(String value1, String value2) {
            addCriterion("order_lorry between", value1, value2, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderLorryNotBetween(String value1, String value2) {
            addCriterion("order_lorry not between", value1, value2, "orderLorry");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksIsNull() {
            addCriterion("order_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksIsNotNull() {
            addCriterion("order_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksEqualTo(String value) {
            addCriterion("order_remarks =", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotEqualTo(String value) {
            addCriterion("order_remarks <>", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksGreaterThan(String value) {
            addCriterion("order_remarks >", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("order_remarks >=", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLessThan(String value) {
            addCriterion("order_remarks <", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLessThanOrEqualTo(String value) {
            addCriterion("order_remarks <=", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLike(String value) {
            addCriterion("order_remarks like", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotLike(String value) {
            addCriterion("order_remarks not like", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksIn(List<String> values) {
            addCriterion("order_remarks in", values, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotIn(List<String> values) {
            addCriterion("order_remarks not in", values, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksBetween(String value1, String value2) {
            addCriterion("order_remarks between", value1, value2, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotBetween(String value1, String value2) {
            addCriterion("order_remarks not between", value1, value2, "orderRemarks");
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