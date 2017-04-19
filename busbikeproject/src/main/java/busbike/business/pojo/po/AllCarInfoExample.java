package busbike.business.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class AllCarInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllCarInfoExample() {
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

        public Criteria andCarInfoIdIsNull() {
            addCriterion("car_info_id is null");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdIsNotNull() {
            addCriterion("car_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdEqualTo(Integer value) {
            addCriterion("car_info_id =", value, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdNotEqualTo(Integer value) {
            addCriterion("car_info_id <>", value, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdGreaterThan(Integer value) {
            addCriterion("car_info_id >", value, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_info_id >=", value, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdLessThan(Integer value) {
            addCriterion("car_info_id <", value, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_info_id <=", value, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdIn(List<Integer> values) {
            addCriterion("car_info_id in", values, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdNotIn(List<Integer> values) {
            addCriterion("car_info_id not in", values, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("car_info_id between", value1, value2, "carInfoId");
            return (Criteria) this;
        }

        public Criteria andCarInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_info_id not between", value1, value2, "carInfoId");
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

        public Criteria andCountSumIsNull() {
            addCriterion("count_sum is null");
            return (Criteria) this;
        }

        public Criteria andCountSumIsNotNull() {
            addCriterion("count_sum is not null");
            return (Criteria) this;
        }

        public Criteria andCountSumEqualTo(Integer value) {
            addCriterion("count_sum =", value, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumNotEqualTo(Integer value) {
            addCriterion("count_sum <>", value, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumGreaterThan(Integer value) {
            addCriterion("count_sum >", value, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_sum >=", value, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumLessThan(Integer value) {
            addCriterion("count_sum <", value, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumLessThanOrEqualTo(Integer value) {
            addCriterion("count_sum <=", value, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumIn(List<Integer> values) {
            addCriterion("count_sum in", values, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumNotIn(List<Integer> values) {
            addCriterion("count_sum not in", values, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumBetween(Integer value1, Integer value2) {
            addCriterion("count_sum between", value1, value2, "countSum");
            return (Criteria) this;
        }

        public Criteria andCountSumNotBetween(Integer value1, Integer value2) {
            addCriterion("count_sum not between", value1, value2, "countSum");
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