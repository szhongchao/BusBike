package busbike.base.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZoneInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZoneInfoExample() {
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

        public Criteria andZoneIdIsNull() {
            addCriterion("zone_id is null");
            return (Criteria) this;
        }

        public Criteria andZoneIdIsNotNull() {
            addCriterion("zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andZoneIdEqualTo(String value) {
            addCriterion("zone_id =", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotEqualTo(String value) {
            addCriterion("zone_id <>", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThan(String value) {
            addCriterion("zone_id >", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("zone_id >=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThan(String value) {
            addCriterion("zone_id <", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLessThanOrEqualTo(String value) {
            addCriterion("zone_id <=", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdLike(String value) {
            addCriterion("zone_id like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotLike(String value) {
            addCriterion("zone_id not like", value, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdIn(List<String> values) {
            addCriterion("zone_id in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotIn(List<String> values) {
            addCriterion("zone_id not in", values, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdBetween(String value1, String value2) {
            addCriterion("zone_id between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneIdNotBetween(String value1, String value2) {
            addCriterion("zone_id not between", value1, value2, "zoneId");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNull() {
            addCriterion("zone_name is null");
            return (Criteria) this;
        }

        public Criteria andZoneNameIsNotNull() {
            addCriterion("zone_name is not null");
            return (Criteria) this;
        }

        public Criteria andZoneNameEqualTo(String value) {
            addCriterion("zone_name =", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotEqualTo(String value) {
            addCriterion("zone_name <>", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThan(String value) {
            addCriterion("zone_name >", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameGreaterThanOrEqualTo(String value) {
            addCriterion("zone_name >=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThan(String value) {
            addCriterion("zone_name <", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLessThanOrEqualTo(String value) {
            addCriterion("zone_name <=", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameLike(String value) {
            addCriterion("zone_name like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotLike(String value) {
            addCriterion("zone_name not like", value, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameIn(List<String> values) {
            addCriterion("zone_name in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotIn(List<String> values) {
            addCriterion("zone_name not in", values, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameBetween(String value1, String value2) {
            addCriterion("zone_name between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andZoneNameNotBetween(String value1, String value2) {
            addCriterion("zone_name not between", value1, value2, "zoneName");
            return (Criteria) this;
        }

        public Criteria andCenterLatIsNull() {
            addCriterion("center_lat is null");
            return (Criteria) this;
        }

        public Criteria andCenterLatIsNotNull() {
            addCriterion("center_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCenterLatEqualTo(String value) {
            addCriterion("center_lat =", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotEqualTo(String value) {
            addCriterion("center_lat <>", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatGreaterThan(String value) {
            addCriterion("center_lat >", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatGreaterThanOrEqualTo(String value) {
            addCriterion("center_lat >=", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatLessThan(String value) {
            addCriterion("center_lat <", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatLessThanOrEqualTo(String value) {
            addCriterion("center_lat <=", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatLike(String value) {
            addCriterion("center_lat like", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotLike(String value) {
            addCriterion("center_lat not like", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatIn(List<String> values) {
            addCriterion("center_lat in", values, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotIn(List<String> values) {
            addCriterion("center_lat not in", values, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatBetween(String value1, String value2) {
            addCriterion("center_lat between", value1, value2, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotBetween(String value1, String value2) {
            addCriterion("center_lat not between", value1, value2, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLngIsNull() {
            addCriterion("center_lng is null");
            return (Criteria) this;
        }

        public Criteria andCenterLngIsNotNull() {
            addCriterion("center_lng is not null");
            return (Criteria) this;
        }

        public Criteria andCenterLngEqualTo(String value) {
            addCriterion("center_lng =", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngNotEqualTo(String value) {
            addCriterion("center_lng <>", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngGreaterThan(String value) {
            addCriterion("center_lng >", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngGreaterThanOrEqualTo(String value) {
            addCriterion("center_lng >=", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngLessThan(String value) {
            addCriterion("center_lng <", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngLessThanOrEqualTo(String value) {
            addCriterion("center_lng <=", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngLike(String value) {
            addCriterion("center_lng like", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngNotLike(String value) {
            addCriterion("center_lng not like", value, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngIn(List<String> values) {
            addCriterion("center_lng in", values, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngNotIn(List<String> values) {
            addCriterion("center_lng not in", values, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngBetween(String value1, String value2) {
            addCriterion("center_lng between", value1, value2, "centerLng");
            return (Criteria) this;
        }

        public Criteria andCenterLngNotBetween(String value1, String value2) {
            addCriterion("center_lng not between", value1, value2, "centerLng");
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

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andIsvisbleIsNull() {
            addCriterion("isvisble is null");
            return (Criteria) this;
        }

        public Criteria andIsvisbleIsNotNull() {
            addCriterion("isvisble is not null");
            return (Criteria) this;
        }

        public Criteria andIsvisbleEqualTo(String value) {
            addCriterion("isvisble =", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleNotEqualTo(String value) {
            addCriterion("isvisble <>", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleGreaterThan(String value) {
            addCriterion("isvisble >", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleGreaterThanOrEqualTo(String value) {
            addCriterion("isvisble >=", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleLessThan(String value) {
            addCriterion("isvisble <", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleLessThanOrEqualTo(String value) {
            addCriterion("isvisble <=", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleLike(String value) {
            addCriterion("isvisble like", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleNotLike(String value) {
            addCriterion("isvisble not like", value, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleIn(List<String> values) {
            addCriterion("isvisble in", values, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleNotIn(List<String> values) {
            addCriterion("isvisble not in", values, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleBetween(String value1, String value2) {
            addCriterion("isvisble between", value1, value2, "isvisble");
            return (Criteria) this;
        }

        public Criteria andIsvisbleNotBetween(String value1, String value2) {
            addCriterion("isvisble not between", value1, value2, "isvisble");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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