package busbike.business.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class RentReturnInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentReturnInfoExample() {
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

        public Criteria andHostSeriIsNull() {
            addCriterion("HOST_SERI is null");
            return (Criteria) this;
        }

        public Criteria andHostSeriIsNotNull() {
            addCriterion("HOST_SERI is not null");
            return (Criteria) this;
        }

        public Criteria andHostSeriEqualTo(String value) {
            addCriterion("HOST_SERI =", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriNotEqualTo(String value) {
            addCriterion("HOST_SERI <>", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriGreaterThan(String value) {
            addCriterion("HOST_SERI >", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_SERI >=", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriLessThan(String value) {
            addCriterion("HOST_SERI <", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriLessThanOrEqualTo(String value) {
            addCriterion("HOST_SERI <=", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriLike(String value) {
            addCriterion("HOST_SERI like", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriNotLike(String value) {
            addCriterion("HOST_SERI not like", value, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriIn(List<String> values) {
            addCriterion("HOST_SERI in", values, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriNotIn(List<String> values) {
            addCriterion("HOST_SERI not in", values, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriBetween(String value1, String value2) {
            addCriterion("HOST_SERI between", value1, value2, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andHostSeriNotBetween(String value1, String value2) {
            addCriterion("HOST_SERI not between", value1, value2, "hostSeri");
            return (Criteria) this;
        }

        public Criteria andTranDateIsNull() {
            addCriterion("TRAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTranDateIsNotNull() {
            addCriterion("TRAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTranDateEqualTo(String value) {
            addCriterion("TRAN_DATE =", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotEqualTo(String value) {
            addCriterion("TRAN_DATE <>", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateGreaterThan(String value) {
            addCriterion("TRAN_DATE >", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateGreaterThanOrEqualTo(String value) {
            addCriterion("TRAN_DATE >=", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLessThan(String value) {
            addCriterion("TRAN_DATE <", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLessThanOrEqualTo(String value) {
            addCriterion("TRAN_DATE <=", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateLike(String value) {
            addCriterion("TRAN_DATE like", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotLike(String value) {
            addCriterion("TRAN_DATE not like", value, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateIn(List<String> values) {
            addCriterion("TRAN_DATE in", values, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotIn(List<String> values) {
            addCriterion("TRAN_DATE not in", values, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateBetween(String value1, String value2) {
            addCriterion("TRAN_DATE between", value1, value2, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranDateNotBetween(String value1, String value2) {
            addCriterion("TRAN_DATE not between", value1, value2, "tranDate");
            return (Criteria) this;
        }

        public Criteria andTranTimeIsNull() {
            addCriterion("TRAN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTranTimeIsNotNull() {
            addCriterion("TRAN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTranTimeEqualTo(String value) {
            addCriterion("TRAN_TIME =", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotEqualTo(String value) {
            addCriterion("TRAN_TIME <>", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeGreaterThan(String value) {
            addCriterion("TRAN_TIME >", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRAN_TIME >=", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeLessThan(String value) {
            addCriterion("TRAN_TIME <", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeLessThanOrEqualTo(String value) {
            addCriterion("TRAN_TIME <=", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeLike(String value) {
            addCriterion("TRAN_TIME like", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotLike(String value) {
            addCriterion("TRAN_TIME not like", value, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeIn(List<String> values) {
            addCriterion("TRAN_TIME in", values, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotIn(List<String> values) {
            addCriterion("TRAN_TIME not in", values, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeBetween(String value1, String value2) {
            addCriterion("TRAN_TIME between", value1, value2, "tranTime");
            return (Criteria) this;
        }

        public Criteria andTranTimeNotBetween(String value1, String value2) {
            addCriterion("TRAN_TIME not between", value1, value2, "tranTime");
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

        public Criteria andRentNetidIsNull() {
            addCriterion("RENT_NETID is null");
            return (Criteria) this;
        }

        public Criteria andRentNetidIsNotNull() {
            addCriterion("RENT_NETID is not null");
            return (Criteria) this;
        }

        public Criteria andRentNetidEqualTo(String value) {
            addCriterion("RENT_NETID =", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotEqualTo(String value) {
            addCriterion("RENT_NETID <>", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidGreaterThan(String value) {
            addCriterion("RENT_NETID >", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidGreaterThanOrEqualTo(String value) {
            addCriterion("RENT_NETID >=", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidLessThan(String value) {
            addCriterion("RENT_NETID <", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidLessThanOrEqualTo(String value) {
            addCriterion("RENT_NETID <=", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidLike(String value) {
            addCriterion("RENT_NETID like", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotLike(String value) {
            addCriterion("RENT_NETID not like", value, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidIn(List<String> values) {
            addCriterion("RENT_NETID in", values, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotIn(List<String> values) {
            addCriterion("RENT_NETID not in", values, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidBetween(String value1, String value2) {
            addCriterion("RENT_NETID between", value1, value2, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNetidNotBetween(String value1, String value2) {
            addCriterion("RENT_NETID not between", value1, value2, "rentNetid");
            return (Criteria) this;
        }

        public Criteria andRentNumIsNull() {
            addCriterion("RENT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRentNumIsNotNull() {
            addCriterion("RENT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRentNumEqualTo(String value) {
            addCriterion("RENT_NUM =", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotEqualTo(String value) {
            addCriterion("RENT_NUM <>", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumGreaterThan(String value) {
            addCriterion("RENT_NUM >", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumGreaterThanOrEqualTo(String value) {
            addCriterion("RENT_NUM >=", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLessThan(String value) {
            addCriterion("RENT_NUM <", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLessThanOrEqualTo(String value) {
            addCriterion("RENT_NUM <=", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLike(String value) {
            addCriterion("RENT_NUM like", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotLike(String value) {
            addCriterion("RENT_NUM not like", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumIn(List<String> values) {
            addCriterion("RENT_NUM in", values, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotIn(List<String> values) {
            addCriterion("RENT_NUM not in", values, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumBetween(String value1, String value2) {
            addCriterion("RENT_NUM between", value1, value2, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotBetween(String value1, String value2) {
            addCriterion("RENT_NUM not between", value1, value2, "rentNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("CAR_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("CAR_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("CAR_NUM =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("CAR_NUM <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("CAR_NUM >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("CAR_NUM >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("CAR_NUM <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("CAR_NUM <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("CAR_NUM like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("CAR_NUM not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("CAR_NUM in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("CAR_NUM not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("CAR_NUM between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("CAR_NUM not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andInstCardIsNull() {
            addCriterion("INST_CARD is null");
            return (Criteria) this;
        }

        public Criteria andInstCardIsNotNull() {
            addCriterion("INST_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andInstCardEqualTo(String value) {
            addCriterion("INST_CARD =", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotEqualTo(String value) {
            addCriterion("INST_CARD <>", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardGreaterThan(String value) {
            addCriterion("INST_CARD >", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardGreaterThanOrEqualTo(String value) {
            addCriterion("INST_CARD >=", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardLessThan(String value) {
            addCriterion("INST_CARD <", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardLessThanOrEqualTo(String value) {
            addCriterion("INST_CARD <=", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardLike(String value) {
            addCriterion("INST_CARD like", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotLike(String value) {
            addCriterion("INST_CARD not like", value, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardIn(List<String> values) {
            addCriterion("INST_CARD in", values, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotIn(List<String> values) {
            addCriterion("INST_CARD not in", values, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardBetween(String value1, String value2) {
            addCriterion("INST_CARD between", value1, value2, "instCard");
            return (Criteria) this;
        }

        public Criteria andInstCardNotBetween(String value1, String value2) {
            addCriterion("INST_CARD not between", value1, value2, "instCard");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(String value) {
            addCriterion("RETURN_DATE =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(String value) {
            addCriterion("RETURN_DATE <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(String value) {
            addCriterion("RETURN_DATE >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_DATE >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(String value) {
            addCriterion("RETURN_DATE <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(String value) {
            addCriterion("RETURN_DATE <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLike(String value) {
            addCriterion("RETURN_DATE like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotLike(String value) {
            addCriterion("RETURN_DATE not like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<String> values) {
            addCriterion("RETURN_DATE in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<String> values) {
            addCriterion("RETURN_DATE not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(String value1, String value2) {
            addCriterion("RETURN_DATE between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(String value1, String value2) {
            addCriterion("RETURN_DATE not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("RETURN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("RETURN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(String value) {
            addCriterion("RETURN_TIME =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(String value) {
            addCriterion("RETURN_TIME <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(String value) {
            addCriterion("RETURN_TIME >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_TIME >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(String value) {
            addCriterion("RETURN_TIME <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_TIME <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLike(String value) {
            addCriterion("RETURN_TIME like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotLike(String value) {
            addCriterion("RETURN_TIME not like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<String> values) {
            addCriterion("RETURN_TIME in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<String> values) {
            addCriterion("RETURN_TIME not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(String value1, String value2) {
            addCriterion("RETURN_TIME between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(String value1, String value2) {
            addCriterion("RETURN_TIME not between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeIsNull() {
            addCriterion("return_date_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeIsNotNull() {
            addCriterion("return_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeEqualTo(String value) {
            addCriterion("return_date_time =", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeNotEqualTo(String value) {
            addCriterion("return_date_time <>", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeGreaterThan(String value) {
            addCriterion("return_date_time >", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("return_date_time >=", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeLessThan(String value) {
            addCriterion("return_date_time <", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeLessThanOrEqualTo(String value) {
            addCriterion("return_date_time <=", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeLike(String value) {
            addCriterion("return_date_time like", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeNotLike(String value) {
            addCriterion("return_date_time not like", value, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeIn(List<String> values) {
            addCriterion("return_date_time in", values, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeNotIn(List<String> values) {
            addCriterion("return_date_time not in", values, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeBetween(String value1, String value2) {
            addCriterion("return_date_time between", value1, value2, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnDateTimeNotBetween(String value1, String value2) {
            addCriterion("return_date_time not between", value1, value2, "returnDateTime");
            return (Criteria) this;
        }

        public Criteria andReturnNetidIsNull() {
            addCriterion("RETURN_NETID is null");
            return (Criteria) this;
        }

        public Criteria andReturnNetidIsNotNull() {
            addCriterion("RETURN_NETID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNetidEqualTo(String value) {
            addCriterion("RETURN_NETID =", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotEqualTo(String value) {
            addCriterion("RETURN_NETID <>", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidGreaterThan(String value) {
            addCriterion("RETURN_NETID >", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_NETID >=", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidLessThan(String value) {
            addCriterion("RETURN_NETID <", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidLessThanOrEqualTo(String value) {
            addCriterion("RETURN_NETID <=", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidLike(String value) {
            addCriterion("RETURN_NETID like", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotLike(String value) {
            addCriterion("RETURN_NETID not like", value, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidIn(List<String> values) {
            addCriterion("RETURN_NETID in", values, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotIn(List<String> values) {
            addCriterion("RETURN_NETID not in", values, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidBetween(String value1, String value2) {
            addCriterion("RETURN_NETID between", value1, value2, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andReturnNetidNotBetween(String value1, String value2) {
            addCriterion("RETURN_NETID not between", value1, value2, "returnNetid");
            return (Criteria) this;
        }

        public Criteria andParkNumIsNull() {
            addCriterion("PARK_NUM is null");
            return (Criteria) this;
        }

        public Criteria andParkNumIsNotNull() {
            addCriterion("PARK_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andParkNumEqualTo(String value) {
            addCriterion("PARK_NUM =", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotEqualTo(String value) {
            addCriterion("PARK_NUM <>", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumGreaterThan(String value) {
            addCriterion("PARK_NUM >", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumGreaterThanOrEqualTo(String value) {
            addCriterion("PARK_NUM >=", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumLessThan(String value) {
            addCriterion("PARK_NUM <", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumLessThanOrEqualTo(String value) {
            addCriterion("PARK_NUM <=", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumLike(String value) {
            addCriterion("PARK_NUM like", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotLike(String value) {
            addCriterion("PARK_NUM not like", value, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumIn(List<String> values) {
            addCriterion("PARK_NUM in", values, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotIn(List<String> values) {
            addCriterion("PARK_NUM not in", values, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumBetween(String value1, String value2) {
            addCriterion("PARK_NUM between", value1, value2, "parkNum");
            return (Criteria) this;
        }

        public Criteria andParkNumNotBetween(String value1, String value2) {
            addCriterion("PARK_NUM not between", value1, value2, "parkNum");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andTranFlagIsNull() {
            addCriterion("TRAN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTranFlagIsNotNull() {
            addCriterion("TRAN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTranFlagEqualTo(String value) {
            addCriterion("TRAN_FLAG =", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagNotEqualTo(String value) {
            addCriterion("TRAN_FLAG <>", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagGreaterThan(String value) {
            addCriterion("TRAN_FLAG >", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TRAN_FLAG >=", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagLessThan(String value) {
            addCriterion("TRAN_FLAG <", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagLessThanOrEqualTo(String value) {
            addCriterion("TRAN_FLAG <=", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagLike(String value) {
            addCriterion("TRAN_FLAG like", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagNotLike(String value) {
            addCriterion("TRAN_FLAG not like", value, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagIn(List<String> values) {
            addCriterion("TRAN_FLAG in", values, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagNotIn(List<String> values) {
            addCriterion("TRAN_FLAG not in", values, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagBetween(String value1, String value2) {
            addCriterion("TRAN_FLAG between", value1, value2, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andTranFlagNotBetween(String value1, String value2) {
            addCriterion("TRAN_FLAG not between", value1, value2, "tranFlag");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNull() {
            addCriterion("RENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNotNull() {
            addCriterion("RENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRentTypeEqualTo(String value) {
            addCriterion("RENT_TYPE =", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotEqualTo(String value) {
            addCriterion("RENT_TYPE <>", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThan(String value) {
            addCriterion("RENT_TYPE >", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RENT_TYPE >=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThan(String value) {
            addCriterion("RENT_TYPE <", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThanOrEqualTo(String value) {
            addCriterion("RENT_TYPE <=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLike(String value) {
            addCriterion("RENT_TYPE like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotLike(String value) {
            addCriterion("RENT_TYPE not like", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeIn(List<String> values) {
            addCriterion("RENT_TYPE in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotIn(List<String> values) {
            addCriterion("RENT_TYPE not in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeBetween(String value1, String value2) {
            addCriterion("RENT_TYPE between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotBetween(String value1, String value2) {
            addCriterion("RENT_TYPE not between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andChTypeIsNull() {
            addCriterion("CH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChTypeIsNotNull() {
            addCriterion("CH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChTypeEqualTo(String value) {
            addCriterion("CH_TYPE =", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeNotEqualTo(String value) {
            addCriterion("CH_TYPE <>", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeGreaterThan(String value) {
            addCriterion("CH_TYPE >", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CH_TYPE >=", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeLessThan(String value) {
            addCriterion("CH_TYPE <", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeLessThanOrEqualTo(String value) {
            addCriterion("CH_TYPE <=", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeLike(String value) {
            addCriterion("CH_TYPE like", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeNotLike(String value) {
            addCriterion("CH_TYPE not like", value, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeIn(List<String> values) {
            addCriterion("CH_TYPE in", values, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeNotIn(List<String> values) {
            addCriterion("CH_TYPE not in", values, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeBetween(String value1, String value2) {
            addCriterion("CH_TYPE between", value1, value2, "chType");
            return (Criteria) this;
        }

        public Criteria andChTypeNotBetween(String value1, String value2) {
            addCriterion("CH_TYPE not between", value1, value2, "chType");
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