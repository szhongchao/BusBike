package busbike.business.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class RentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentInfoExample() {
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

        public Criteria andRentIdIsNull() {
            addCriterion("rent_id is null");
            return (Criteria) this;
        }

        public Criteria andRentIdIsNotNull() {
            addCriterion("rent_id is not null");
            return (Criteria) this;
        }

        public Criteria andRentIdEqualTo(String value) {
            addCriterion("rent_id =", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdNotEqualTo(String value) {
            addCriterion("rent_id <>", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdGreaterThan(String value) {
            addCriterion("rent_id >", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdGreaterThanOrEqualTo(String value) {
            addCriterion("rent_id >=", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdLessThan(String value) {
            addCriterion("rent_id <", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdLessThanOrEqualTo(String value) {
            addCriterion("rent_id <=", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdLike(String value) {
            addCriterion("rent_id like", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdNotLike(String value) {
            addCriterion("rent_id not like", value, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdIn(List<String> values) {
            addCriterion("rent_id in", values, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdNotIn(List<String> values) {
            addCriterion("rent_id not in", values, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdBetween(String value1, String value2) {
            addCriterion("rent_id between", value1, value2, "rentId");
            return (Criteria) this;
        }

        public Criteria andRentIdNotBetween(String value1, String value2) {
            addCriterion("rent_id not between", value1, value2, "rentId");
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

        public Criteria andRoadIsNull() {
            addCriterion("road is null");
            return (Criteria) this;
        }

        public Criteria andRoadIsNotNull() {
            addCriterion("road is not null");
            return (Criteria) this;
        }

        public Criteria andRoadEqualTo(String value) {
            addCriterion("road =", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotEqualTo(String value) {
            addCriterion("road <>", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadGreaterThan(String value) {
            addCriterion("road >", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadGreaterThanOrEqualTo(String value) {
            addCriterion("road >=", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadLessThan(String value) {
            addCriterion("road <", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadLessThanOrEqualTo(String value) {
            addCriterion("road <=", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadLike(String value) {
            addCriterion("road like", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotLike(String value) {
            addCriterion("road not like", value, "road");
            return (Criteria) this;
        }

        public Criteria andRoadIn(List<String> values) {
            addCriterion("road in", values, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotIn(List<String> values) {
            addCriterion("road not in", values, "road");
            return (Criteria) this;
        }

        public Criteria andRoadBetween(String value1, String value2) {
            addCriterion("road between", value1, value2, "road");
            return (Criteria) this;
        }

        public Criteria andRoadNotBetween(String value1, String value2) {
            addCriterion("road not between", value1, value2, "road");
            return (Criteria) this;
        }

        public Criteria andRentNameIsNull() {
            addCriterion("rent_name is null");
            return (Criteria) this;
        }

        public Criteria andRentNameIsNotNull() {
            addCriterion("rent_name is not null");
            return (Criteria) this;
        }

        public Criteria andRentNameEqualTo(String value) {
            addCriterion("rent_name =", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameNotEqualTo(String value) {
            addCriterion("rent_name <>", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameGreaterThan(String value) {
            addCriterion("rent_name >", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameGreaterThanOrEqualTo(String value) {
            addCriterion("rent_name >=", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameLessThan(String value) {
            addCriterion("rent_name <", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameLessThanOrEqualTo(String value) {
            addCriterion("rent_name <=", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameLike(String value) {
            addCriterion("rent_name like", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameNotLike(String value) {
            addCriterion("rent_name not like", value, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameIn(List<String> values) {
            addCriterion("rent_name in", values, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameNotIn(List<String> values) {
            addCriterion("rent_name not in", values, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameBetween(String value1, String value2) {
            addCriterion("rent_name between", value1, value2, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentNameNotBetween(String value1, String value2) {
            addCriterion("rent_name not between", value1, value2, "rentName");
            return (Criteria) this;
        }

        public Criteria andRentPositionIsNull() {
            addCriterion("rent_position is null");
            return (Criteria) this;
        }

        public Criteria andRentPositionIsNotNull() {
            addCriterion("rent_position is not null");
            return (Criteria) this;
        }

        public Criteria andRentPositionEqualTo(String value) {
            addCriterion("rent_position =", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionNotEqualTo(String value) {
            addCriterion("rent_position <>", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionGreaterThan(String value) {
            addCriterion("rent_position >", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionGreaterThanOrEqualTo(String value) {
            addCriterion("rent_position >=", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionLessThan(String value) {
            addCriterion("rent_position <", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionLessThanOrEqualTo(String value) {
            addCriterion("rent_position <=", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionLike(String value) {
            addCriterion("rent_position like", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionNotLike(String value) {
            addCriterion("rent_position not like", value, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionIn(List<String> values) {
            addCriterion("rent_position in", values, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionNotIn(List<String> values) {
            addCriterion("rent_position not in", values, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionBetween(String value1, String value2) {
            addCriterion("rent_position between", value1, value2, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andRentPositionNotBetween(String value1, String value2) {
            addCriterion("rent_position not between", value1, value2, "rentPosition");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNull() {
            addCriterion("max_number is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNotNull() {
            addCriterion("max_number is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberEqualTo(Integer value) {
            addCriterion("max_number =", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotEqualTo(Integer value) {
            addCriterion("max_number <>", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThan(Integer value) {
            addCriterion("max_number >", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_number >=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThan(Integer value) {
            addCriterion("max_number <", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThanOrEqualTo(Integer value) {
            addCriterion("max_number <=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIn(List<Integer> values) {
            addCriterion("max_number in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotIn(List<Integer> values) {
            addCriterion("max_number not in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberBetween(Integer value1, Integer value2) {
            addCriterion("max_number between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("max_number not between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightIsNull() {
            addCriterion("left_or_right is null");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightIsNotNull() {
            addCriterion("left_or_right is not null");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightEqualTo(String value) {
            addCriterion("left_or_right =", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightNotEqualTo(String value) {
            addCriterion("left_or_right <>", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightGreaterThan(String value) {
            addCriterion("left_or_right >", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightGreaterThanOrEqualTo(String value) {
            addCriterion("left_or_right >=", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightLessThan(String value) {
            addCriterion("left_or_right <", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightLessThanOrEqualTo(String value) {
            addCriterion("left_or_right <=", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightLike(String value) {
            addCriterion("left_or_right like", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightNotLike(String value) {
            addCriterion("left_or_right not like", value, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightIn(List<String> values) {
            addCriterion("left_or_right in", values, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightNotIn(List<String> values) {
            addCriterion("left_or_right not in", values, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightBetween(String value1, String value2) {
            addCriterion("left_or_right between", value1, value2, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andLeftOrRightNotBetween(String value1, String value2) {
            addCriterion("left_or_right not between", value1, value2, "leftOrRight");
            return (Criteria) this;
        }

        public Criteria andRentRankIsNull() {
            addCriterion("rent_rank is null");
            return (Criteria) this;
        }

        public Criteria andRentRankIsNotNull() {
            addCriterion("rent_rank is not null");
            return (Criteria) this;
        }

        public Criteria andRentRankEqualTo(String value) {
            addCriterion("rent_rank =", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankNotEqualTo(String value) {
            addCriterion("rent_rank <>", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankGreaterThan(String value) {
            addCriterion("rent_rank >", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankGreaterThanOrEqualTo(String value) {
            addCriterion("rent_rank >=", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankLessThan(String value) {
            addCriterion("rent_rank <", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankLessThanOrEqualTo(String value) {
            addCriterion("rent_rank <=", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankLike(String value) {
            addCriterion("rent_rank like", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankNotLike(String value) {
            addCriterion("rent_rank not like", value, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankIn(List<String> values) {
            addCriterion("rent_rank in", values, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankNotIn(List<String> values) {
            addCriterion("rent_rank not in", values, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankBetween(String value1, String value2) {
            addCriterion("rent_rank between", value1, value2, "rentRank");
            return (Criteria) this;
        }

        public Criteria andRentRankNotBetween(String value1, String value2) {
            addCriterion("rent_rank not between", value1, value2, "rentRank");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andTopLimitIsNull() {
            addCriterion("top_limit is null");
            return (Criteria) this;
        }

        public Criteria andTopLimitIsNotNull() {
            addCriterion("top_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTopLimitEqualTo(String value) {
            addCriterion("top_limit =", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitNotEqualTo(String value) {
            addCriterion("top_limit <>", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitGreaterThan(String value) {
            addCriterion("top_limit >", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitGreaterThanOrEqualTo(String value) {
            addCriterion("top_limit >=", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitLessThan(String value) {
            addCriterion("top_limit <", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitLessThanOrEqualTo(String value) {
            addCriterion("top_limit <=", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitLike(String value) {
            addCriterion("top_limit like", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitNotLike(String value) {
            addCriterion("top_limit not like", value, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitIn(List<String> values) {
            addCriterion("top_limit in", values, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitNotIn(List<String> values) {
            addCriterion("top_limit not in", values, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitBetween(String value1, String value2) {
            addCriterion("top_limit between", value1, value2, "topLimit");
            return (Criteria) this;
        }

        public Criteria andTopLimitNotBetween(String value1, String value2) {
            addCriterion("top_limit not between", value1, value2, "topLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitIsNull() {
            addCriterion("low_limit is null");
            return (Criteria) this;
        }

        public Criteria andLowLimitIsNotNull() {
            addCriterion("low_limit is not null");
            return (Criteria) this;
        }

        public Criteria andLowLimitEqualTo(String value) {
            addCriterion("low_limit =", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotEqualTo(String value) {
            addCriterion("low_limit <>", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitGreaterThan(String value) {
            addCriterion("low_limit >", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitGreaterThanOrEqualTo(String value) {
            addCriterion("low_limit >=", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitLessThan(String value) {
            addCriterion("low_limit <", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitLessThanOrEqualTo(String value) {
            addCriterion("low_limit <=", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitLike(String value) {
            addCriterion("low_limit like", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotLike(String value) {
            addCriterion("low_limit not like", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitIn(List<String> values) {
            addCriterion("low_limit in", values, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotIn(List<String> values) {
            addCriterion("low_limit not in", values, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitBetween(String value1, String value2) {
            addCriterion("low_limit between", value1, value2, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotBetween(String value1, String value2) {
            addCriterion("low_limit not between", value1, value2, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andOperNumIsNull() {
            addCriterion("oper_num is null");
            return (Criteria) this;
        }

        public Criteria andOperNumIsNotNull() {
            addCriterion("oper_num is not null");
            return (Criteria) this;
        }

        public Criteria andOperNumEqualTo(Integer value) {
            addCriterion("oper_num =", value, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumNotEqualTo(Integer value) {
            addCriterion("oper_num <>", value, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumGreaterThan(Integer value) {
            addCriterion("oper_num >", value, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("oper_num >=", value, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumLessThan(Integer value) {
            addCriterion("oper_num <", value, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumLessThanOrEqualTo(Integer value) {
            addCriterion("oper_num <=", value, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumIn(List<Integer> values) {
            addCriterion("oper_num in", values, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumNotIn(List<Integer> values) {
            addCriterion("oper_num not in", values, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumBetween(Integer value1, Integer value2) {
            addCriterion("oper_num between", value1, value2, "operNum");
            return (Criteria) this;
        }

        public Criteria andOperNumNotBetween(Integer value1, Integer value2) {
            addCriterion("oper_num not between", value1, value2, "operNum");
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