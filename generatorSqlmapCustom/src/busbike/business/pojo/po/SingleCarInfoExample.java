package busbike.business.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SingleCarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SingleCarInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRentNetidIsNull() {
            addCriterion("rent_netid is null");
            return (Criteria) this;
        }

        public Criteria andRentNetidIsNotNull() {
            addCriterion("rent_netid is not null");
            return (Criteria) this;
        }

        public Criteria andRentNetidEqualTo(String value) {
            addCriterion("rent_netid =", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotEqualTo(String value) {
            addCriterion("rent_netid <>", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidGreaterThan(String value) {
            addCriterion("rent_netid >", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidGreaterThanOrEqualTo(String value) {
            addCriterion("rent_netid >=", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidLessThan(String value) {
            addCriterion("rent_netid <", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidLessThanOrEqualTo(String value) {
            addCriterion("rent_netid <=", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidLike(String value) {
            addCriterion("rent_netid like", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotLike(String value) {
            addCriterion("rent_netid not like", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidIn(List<String> values) {
            addCriterion("rent_netid in", values, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotIn(List<String> values) {
            addCriterion("rent_netid not in", values, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidBetween(String value1, String value2) {
            addCriterion("rent_netid between", value1, value2, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotBetween(String value1, String value2) {
            addCriterion("rent_netid not between", value1, value2, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidIsNull() {
            addCriterion("return_netid is null");
            return (Criteria) this;
        }

        public Criteria andReturnNetidIsNotNull() {
            addCriterion("return_netid is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNetidEqualTo(String value) {
            addCriterion("return_netid =", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotEqualTo(String value) {
            addCriterion("return_netid <>", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidGreaterThan(String value) {
            addCriterion("return_netid >", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidGreaterThanOrEqualTo(String value) {
            addCriterion("return_netid >=", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidLessThan(String value) {
            addCriterion("return_netid <", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidLessThanOrEqualTo(String value) {
            addCriterion("return_netid <=", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidLike(String value) {
            addCriterion("return_netid like", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotLike(String value) {
            addCriterion("return_netid not like", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidIn(List<String> values) {
            addCriterion("return_netid in", values, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotIn(List<String> values) {
            addCriterion("return_netid not in", values, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidBetween(String value1, String value2) {
            addCriterion("return_netid between", value1, value2, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotBetween(String value1, String value2) {
            addCriterion("return_netid not between", value1, value2, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeIsNull() {
            addCriterion("rent_date_time is null");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeIsNotNull() {
            addCriterion("rent_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeEqualTo(String value) {
            addCriterion("rent_date_time =", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeNotEqualTo(String value) {
            addCriterion("rent_date_time <>", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeGreaterThan(String value) {
            addCriterion("rent_date_time >", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_date_time >=", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeLessThan(String value) {
            addCriterion("rent_date_time <", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeLessThanOrEqualTo(String value) {
            addCriterion("rent_date_time <=", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeLike(String value) {
            addCriterion("rent_date_time like", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeNotLike(String value) {
            addCriterion("rent_date_time not like", value, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeIn(List<String> values) {
            addCriterion("rent_date_time in", values, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeNotIn(List<String> values) {
            addCriterion("rent_date_time not in", values, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeBetween(String value1, String value2) {
            addCriterion("rent_date_time between", value1, value2, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andRentDateTimeNotBetween(String value1, String value2) {
            addCriterion("rent_date_time not between", value1, value2, "rentDateTime");
            return (Criteria) this;
        }

        public Criteria andTranDateIsNull() {
            addCriterion("tran_date is null");
            return (Criteria) this;
        }

        public Criteria andTranDateIsNotNull() {
            addCriterion("tran_date is not null");
            return (Criteria) this;
        }

        public Criteria andTranDateEqualTo(String value) {
            addCriterion("tran_date =", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotEqualTo(String value) {
            addCriterion("tran_date <>", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateGreaterThan(String value) {
            addCriterion("tran_date >", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateGreaterThanOrEqualTo(String value) {
            addCriterion("tran_date >=", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLessThan(String value) {
            addCriterion("tran_date <", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLessThanOrEqualTo(String value) {
            addCriterion("tran_date <=", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLike(String value) {
            addCriterion("tran_date like", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotLike(String value) {
            addCriterion("tran_date not like", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateIn(List<String> values) {
            addCriterion("tran_date in", values, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotIn(List<String> values) {
            addCriterion("tran_date not in", values, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateBetween(String value1, String value2) {
            addCriterion("tran_date between", value1, value2, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotBetween(String value1, String value2) {
            addCriterion("tran_date not between", value1, value2, "tranDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(String value) {
            addCriterion("return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(String value) {
            addCriterion("return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(String value) {
            addCriterion("return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(String value) {
            addCriterion("return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(String value) {
            addCriterion("return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLike(String value) {
            addCriterion("return_date like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotLike(String value) {
            addCriterion("return_date not like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<String> values) {
            addCriterion("return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<String> values) {
            addCriterion("return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(String value1, String value2) {
            addCriterion("return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(String value1, String value2) {
            addCriterion("return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andTranTimeIsNull() {
            addCriterion("tran_time is null");
            return (Criteria) this;
        }

        public Criteria andTranTimeIsNotNull() {
            addCriterion("tran_time is not null");
            return (Criteria) this;
        }

        public Criteria andTranTimeEqualTo(String value) {
            addCriterion("tran_time =", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotEqualTo(String value) {
            addCriterion("tran_time <>", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeGreaterThan(String value) {
            addCriterion("tran_time >", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeGreaterThanOrEqualTo(String value) {
            addCriterion("tran_time >=", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeLessThan(String value) {
            addCriterion("tran_time <", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeLessThanOrEqualTo(String value) {
            addCriterion("tran_time <=", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeLike(String value) {
            addCriterion("tran_time like", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotLike(String value) {
            addCriterion("tran_time not like", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeIn(List<String> values) {
            addCriterion("tran_time in", values, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotIn(List<String> values) {
            addCriterion("tran_time not in", values, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeBetween(String value1, String value2) {
            addCriterion("tran_time between", value1, value2, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotBetween(String value1, String value2) {
            addCriterion("tran_time not between", value1, value2, "tranTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(String value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(String value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(String value) {
            addCriterion("return_time >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(String value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLike(String value) {
            addCriterion("return_time like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotLike(String value) {
            addCriterion("return_time not like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<String> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<String> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(String value1, String value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(String value1, String value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andInstCardIsNull() {
            addCriterion("inst_card is null");
            return (Criteria) this;
        }

        public Criteria andInstCardIsNotNull() {
            addCriterion("inst_card is not null");
            return (Criteria) this;
        }

        public Criteria andInstCardEqualTo(String value) {
            addCriterion("inst_card =", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotEqualTo(String value) {
            addCriterion("inst_card <>", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardGreaterThan(String value) {
            addCriterion("inst_card >", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardGreaterThanOrEqualTo(String value) {
            addCriterion("inst_card >=", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardLessThan(String value) {
            addCriterion("inst_card <", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardLessThanOrEqualTo(String value) {
            addCriterion("inst_card <=", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardLike(String value) {
            addCriterion("inst_card like", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotLike(String value) {
            addCriterion("inst_card not like", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardIn(List<String> values) {
            addCriterion("inst_card in", values, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotIn(List<String> values) {
            addCriterion("inst_card not in", values, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardBetween(String value1, String value2) {
            addCriterion("inst_card between", value1, value2, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotBetween(String value1, String value2) {
            addCriterion("inst_card not between", value1, value2, "instCard");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("car_num like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("car_num not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andUseMinIsNull() {
            addCriterion("use_min is null");
            return (Criteria) this;
        }

        public Criteria andUseMinIsNotNull() {
            addCriterion("use_min is not null");
            return (Criteria) this;
        }

        public Criteria andUseMinEqualTo(Integer value) {
            addCriterion("use_min =", value, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinNotEqualTo(Integer value) {
            addCriterion("use_min <>", value, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinGreaterThan(Integer value) {
            addCriterion("use_min >", value, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_min >=", value, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinLessThan(Integer value) {
            addCriterion("use_min <", value, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinLessThanOrEqualTo(Integer value) {
            addCriterion("use_min <=", value, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinIn(List<Integer> values) {
            addCriterion("use_min in", values, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinNotIn(List<Integer> values) {
            addCriterion("use_min not in", values, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinBetween(Integer value1, Integer value2) {
            addCriterion("use_min between", value1, value2, "useMin");
            return (Criteria) this;
        }

        public Criteria andUseMinNotBetween(Integer value1, Integer value2) {
            addCriterion("use_min not between", value1, value2, "useMin");
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