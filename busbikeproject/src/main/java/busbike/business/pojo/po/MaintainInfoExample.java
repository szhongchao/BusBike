package busbike.business.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class MaintainInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainInfoExample() {
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

        public Criteria andMaintainIdIsNull() {
            addCriterion("maintain_id is null");
            return (Criteria) this;
        }

        public Criteria andMaintainIdIsNotNull() {
            addCriterion("maintain_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainIdEqualTo(Integer value) {
            addCriterion("maintain_id =", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotEqualTo(Integer value) {
            addCriterion("maintain_id <>", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdGreaterThan(Integer value) {
            addCriterion("maintain_id >", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintain_id >=", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLessThan(Integer value) {
            addCriterion("maintain_id <", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdLessThanOrEqualTo(Integer value) {
            addCriterion("maintain_id <=", value, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdIn(List<Integer> values) {
            addCriterion("maintain_id in", values, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotIn(List<Integer> values) {
            addCriterion("maintain_id not in", values, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdBetween(Integer value1, Integer value2) {
            addCriterion("maintain_id between", value1, value2, "maintainId");
            return (Criteria) this;
        }

        public Criteria andMaintainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maintain_id not between", value1, value2, "maintainId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNull() {
            addCriterion("repair_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("repair_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIdEqualTo(Integer value) {
            addCriterion("repair_id =", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotEqualTo(Integer value) {
            addCriterion("repair_id <>", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThan(Integer value) {
            addCriterion("repair_id >", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_id >=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThan(Integer value) {
            addCriterion("repair_id <", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(Integer value) {
            addCriterion("repair_id <=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIn(List<Integer> values) {
            addCriterion("repair_id in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotIn(List<Integer> values) {
            addCriterion("repair_id not in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdBetween(Integer value1, Integer value2) {
            addCriterion("repair_id between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_id not between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(Integer value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(Integer value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(Integer value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(Integer value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Integer value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<Integer> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<Integer> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(Integer value1, Integer value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseIsNull() {
            addCriterion("no_maintain_case is null");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseIsNotNull() {
            addCriterion("no_maintain_case is not null");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseEqualTo(String value) {
            addCriterion("no_maintain_case =", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseNotEqualTo(String value) {
            addCriterion("no_maintain_case <>", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseGreaterThan(String value) {
            addCriterion("no_maintain_case >", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseGreaterThanOrEqualTo(String value) {
            addCriterion("no_maintain_case >=", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseLessThan(String value) {
            addCriterion("no_maintain_case <", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseLessThanOrEqualTo(String value) {
            addCriterion("no_maintain_case <=", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseLike(String value) {
            addCriterion("no_maintain_case like", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseNotLike(String value) {
            addCriterion("no_maintain_case not like", value, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseIn(List<String> values) {
            addCriterion("no_maintain_case in", values, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseNotIn(List<String> values) {
            addCriterion("no_maintain_case not in", values, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseBetween(String value1, String value2) {
            addCriterion("no_maintain_case between", value1, value2, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andNoMaintainCaseNotBetween(String value1, String value2) {
            addCriterion("no_maintain_case not between", value1, value2, "noMaintainCase");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeIsNull() {
            addCriterion("latest_rent_date_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeIsNotNull() {
            addCriterion("latest_rent_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeEqualTo(String value) {
            addCriterion("latest_rent_date_time =", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeNotEqualTo(String value) {
            addCriterion("latest_rent_date_time <>", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeGreaterThan(String value) {
            addCriterion("latest_rent_date_time >", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("latest_rent_date_time >=", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeLessThan(String value) {
            addCriterion("latest_rent_date_time <", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeLessThanOrEqualTo(String value) {
            addCriterion("latest_rent_date_time <=", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeLike(String value) {
            addCriterion("latest_rent_date_time like", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeNotLike(String value) {
            addCriterion("latest_rent_date_time not like", value, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeIn(List<String> values) {
            addCriterion("latest_rent_date_time in", values, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeNotIn(List<String> values) {
            addCriterion("latest_rent_date_time not in", values, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeBetween(String value1, String value2) {
            addCriterion("latest_rent_date_time between", value1, value2, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andLatestRentDateTimeNotBetween(String value1, String value2) {
            addCriterion("latest_rent_date_time not between", value1, value2, "latestRentDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeIsNull() {
            addCriterion("report_date_time is null");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeIsNotNull() {
            addCriterion("report_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeEqualTo(String value) {
            addCriterion("report_date_time =", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeNotEqualTo(String value) {
            addCriterion("report_date_time <>", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeGreaterThan(String value) {
            addCriterion("report_date_time >", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("report_date_time >=", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeLessThan(String value) {
            addCriterion("report_date_time <", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeLessThanOrEqualTo(String value) {
            addCriterion("report_date_time <=", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeLike(String value) {
            addCriterion("report_date_time like", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeNotLike(String value) {
            addCriterion("report_date_time not like", value, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeIn(List<String> values) {
            addCriterion("report_date_time in", values, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeNotIn(List<String> values) {
            addCriterion("report_date_time not in", values, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeBetween(String value1, String value2) {
            addCriterion("report_date_time between", value1, value2, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andReportDateTimeNotBetween(String value1, String value2) {
            addCriterion("report_date_time not between", value1, value2, "reportDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeIsNull() {
            addCriterion("sheet_create_date_time is null");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeIsNotNull() {
            addCriterion("sheet_create_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeEqualTo(String value) {
            addCriterion("sheet_create_date_time =", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeNotEqualTo(String value) {
            addCriterion("sheet_create_date_time <>", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeGreaterThan(String value) {
            addCriterion("sheet_create_date_time >", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_create_date_time >=", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeLessThan(String value) {
            addCriterion("sheet_create_date_time <", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeLessThanOrEqualTo(String value) {
            addCriterion("sheet_create_date_time <=", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeLike(String value) {
            addCriterion("sheet_create_date_time like", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeNotLike(String value) {
            addCriterion("sheet_create_date_time not like", value, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeIn(List<String> values) {
            addCriterion("sheet_create_date_time in", values, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeNotIn(List<String> values) {
            addCriterion("sheet_create_date_time not in", values, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeBetween(String value1, String value2) {
            addCriterion("sheet_create_date_time between", value1, value2, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andSheetCreateDateTimeNotBetween(String value1, String value2) {
            addCriterion("sheet_create_date_time not between", value1, value2, "sheetCreateDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeIsNull() {
            addCriterion("repair_date_time is null");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeIsNotNull() {
            addCriterion("repair_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeEqualTo(String value) {
            addCriterion("repair_date_time =", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeNotEqualTo(String value) {
            addCriterion("repair_date_time <>", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeGreaterThan(String value) {
            addCriterion("repair_date_time >", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_date_time >=", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeLessThan(String value) {
            addCriterion("repair_date_time <", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeLessThanOrEqualTo(String value) {
            addCriterion("repair_date_time <=", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeLike(String value) {
            addCriterion("repair_date_time like", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeNotLike(String value) {
            addCriterion("repair_date_time not like", value, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeIn(List<String> values) {
            addCriterion("repair_date_time in", values, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeNotIn(List<String> values) {
            addCriterion("repair_date_time not in", values, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeBetween(String value1, String value2) {
            addCriterion("repair_date_time between", value1, value2, "repairDateTime");
            return (Criteria) this;
        }

        public Criteria andRepairDateTimeNotBetween(String value1, String value2) {
            addCriterion("repair_date_time not between", value1, value2, "repairDateTime");
            return (Criteria) this;
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("area_id like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("area_id not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdIsNull() {
            addCriterion("rent_net_id is null");
            return (Criteria) this;
        }

        public Criteria andRentNetIdIsNotNull() {
            addCriterion("rent_net_id is not null");
            return (Criteria) this;
        }

        public Criteria andRentNetIdEqualTo(String value) {
            addCriterion("rent_net_id =", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdNotEqualTo(String value) {
            addCriterion("rent_net_id <>", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdGreaterThan(String value) {
            addCriterion("rent_net_id >", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdGreaterThanOrEqualTo(String value) {
            addCriterion("rent_net_id >=", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdLessThan(String value) {
            addCriterion("rent_net_id <", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdLessThanOrEqualTo(String value) {
            addCriterion("rent_net_id <=", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdLike(String value) {
            addCriterion("rent_net_id like", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdNotLike(String value) {
            addCriterion("rent_net_id not like", value, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdIn(List<String> values) {
            addCriterion("rent_net_id in", values, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdNotIn(List<String> values) {
            addCriterion("rent_net_id not in", values, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdBetween(String value1, String value2) {
            addCriterion("rent_net_id between", value1, value2, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNetIdNotBetween(String value1, String value2) {
            addCriterion("rent_net_id not between", value1, value2, "rentNetId");
            return (Criteria) this;
        }

        public Criteria andRentNumIsNull() {
            addCriterion("rent_num is null");
            return (Criteria) this;
        }

        public Criteria andRentNumIsNotNull() {
            addCriterion("rent_num is not null");
            return (Criteria) this;
        }

        public Criteria andRentNumEqualTo(String value) {
            addCriterion("rent_num =", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotEqualTo(String value) {
            addCriterion("rent_num <>", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumGreaterThan(String value) {
            addCriterion("rent_num >", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumGreaterThanOrEqualTo(String value) {
            addCriterion("rent_num >=", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLessThan(String value) {
            addCriterion("rent_num <", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLessThanOrEqualTo(String value) {
            addCriterion("rent_num <=", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumLike(String value) {
            addCriterion("rent_num like", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotLike(String value) {
            addCriterion("rent_num not like", value, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumIn(List<String> values) {
            addCriterion("rent_num in", values, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotIn(List<String> values) {
            addCriterion("rent_num not in", values, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumBetween(String value1, String value2) {
            addCriterion("rent_num between", value1, value2, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNumNotBetween(String value1, String value2) {
            addCriterion("rent_num not between", value1, value2, "rentNum");
            return (Criteria) this;
        }

        public Criteria andRentNetNameIsNull() {
            addCriterion("rent_net_name is null");
            return (Criteria) this;
        }

        public Criteria andRentNetNameIsNotNull() {
            addCriterion("rent_net_name is not null");
            return (Criteria) this;
        }

        public Criteria andRentNetNameEqualTo(String value) {
            addCriterion("rent_net_name =", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameNotEqualTo(String value) {
            addCriterion("rent_net_name <>", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameGreaterThan(String value) {
            addCriterion("rent_net_name >", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameGreaterThanOrEqualTo(String value) {
            addCriterion("rent_net_name >=", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameLessThan(String value) {
            addCriterion("rent_net_name <", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameLessThanOrEqualTo(String value) {
            addCriterion("rent_net_name <=", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameLike(String value) {
            addCriterion("rent_net_name like", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameNotLike(String value) {
            addCriterion("rent_net_name not like", value, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameIn(List<String> values) {
            addCriterion("rent_net_name in", values, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameNotIn(List<String> values) {
            addCriterion("rent_net_name not in", values, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameBetween(String value1, String value2) {
            addCriterion("rent_net_name between", value1, value2, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetNameNotBetween(String value1, String value2) {
            addCriterion("rent_net_name not between", value1, value2, "rentNetName");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrIsNull() {
            addCriterion("rent_net_addr is null");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrIsNotNull() {
            addCriterion("rent_net_addr is not null");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrEqualTo(String value) {
            addCriterion("rent_net_addr =", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrNotEqualTo(String value) {
            addCriterion("rent_net_addr <>", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrGreaterThan(String value) {
            addCriterion("rent_net_addr >", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrGreaterThanOrEqualTo(String value) {
            addCriterion("rent_net_addr >=", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrLessThan(String value) {
            addCriterion("rent_net_addr <", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrLessThanOrEqualTo(String value) {
            addCriterion("rent_net_addr <=", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrLike(String value) {
            addCriterion("rent_net_addr like", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrNotLike(String value) {
            addCriterion("rent_net_addr not like", value, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrIn(List<String> values) {
            addCriterion("rent_net_addr in", values, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrNotIn(List<String> values) {
            addCriterion("rent_net_addr not in", values, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrBetween(String value1, String value2) {
            addCriterion("rent_net_addr between", value1, value2, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andRentNetAddrNotBetween(String value1, String value2) {
            addCriterion("rent_net_addr not between", value1, value2, "rentNetAddr");
            return (Criteria) this;
        }

        public Criteria andReportSourceIsNull() {
            addCriterion("report_source is null");
            return (Criteria) this;
        }

        public Criteria andReportSourceIsNotNull() {
            addCriterion("report_source is not null");
            return (Criteria) this;
        }

        public Criteria andReportSourceEqualTo(String value) {
            addCriterion("report_source =", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotEqualTo(String value) {
            addCriterion("report_source <>", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceGreaterThan(String value) {
            addCriterion("report_source >", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceGreaterThanOrEqualTo(String value) {
            addCriterion("report_source >=", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceLessThan(String value) {
            addCriterion("report_source <", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceLessThanOrEqualTo(String value) {
            addCriterion("report_source <=", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceLike(String value) {
            addCriterion("report_source like", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotLike(String value) {
            addCriterion("report_source not like", value, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceIn(List<String> values) {
            addCriterion("report_source in", values, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotIn(List<String> values) {
            addCriterion("report_source not in", values, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceBetween(String value1, String value2) {
            addCriterion("report_source between", value1, value2, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportSourceNotBetween(String value1, String value2) {
            addCriterion("report_source not between", value1, value2, "reportSource");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNull() {
            addCriterion("report_name is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("report_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("report_name =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("report_name <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("report_name >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_name >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("report_name <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("report_name <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("report_name like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("report_name not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("report_name in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("report_name not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("report_name between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("report_name not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdIsNull() {
            addCriterion("report_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdIsNotNull() {
            addCriterion("report_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdEqualTo(String value) {
            addCriterion("report_emp_id =", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdNotEqualTo(String value) {
            addCriterion("report_emp_id <>", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdGreaterThan(String value) {
            addCriterion("report_emp_id >", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_emp_id >=", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdLessThan(String value) {
            addCriterion("report_emp_id <", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdLessThanOrEqualTo(String value) {
            addCriterion("report_emp_id <=", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdLike(String value) {
            addCriterion("report_emp_id like", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdNotLike(String value) {
            addCriterion("report_emp_id not like", value, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdIn(List<String> values) {
            addCriterion("report_emp_id in", values, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdNotIn(List<String> values) {
            addCriterion("report_emp_id not in", values, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdBetween(String value1, String value2) {
            addCriterion("report_emp_id between", value1, value2, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andReportEmpIdNotBetween(String value1, String value2) {
            addCriterion("report_emp_id not between", value1, value2, "reportEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdIsNull() {
            addCriterion("check_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdIsNotNull() {
            addCriterion("check_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdEqualTo(String value) {
            addCriterion("check_emp_id =", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdNotEqualTo(String value) {
            addCriterion("check_emp_id <>", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdGreaterThan(String value) {
            addCriterion("check_emp_id >", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_emp_id >=", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdLessThan(String value) {
            addCriterion("check_emp_id <", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdLessThanOrEqualTo(String value) {
            addCriterion("check_emp_id <=", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdLike(String value) {
            addCriterion("check_emp_id like", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdNotLike(String value) {
            addCriterion("check_emp_id not like", value, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdIn(List<String> values) {
            addCriterion("check_emp_id in", values, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdNotIn(List<String> values) {
            addCriterion("check_emp_id not in", values, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdBetween(String value1, String value2) {
            addCriterion("check_emp_id between", value1, value2, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andCheckEmpIdNotBetween(String value1, String value2) {
            addCriterion("check_emp_id not between", value1, value2, "checkEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdIsNull() {
            addCriterion("repair_emp_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdIsNotNull() {
            addCriterion("repair_emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdEqualTo(String value) {
            addCriterion("repair_emp_id =", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdNotEqualTo(String value) {
            addCriterion("repair_emp_id <>", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdGreaterThan(String value) {
            addCriterion("repair_emp_id >", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("repair_emp_id >=", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdLessThan(String value) {
            addCriterion("repair_emp_id <", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdLessThanOrEqualTo(String value) {
            addCriterion("repair_emp_id <=", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdLike(String value) {
            addCriterion("repair_emp_id like", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdNotLike(String value) {
            addCriterion("repair_emp_id not like", value, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdIn(List<String> values) {
            addCriterion("repair_emp_id in", values, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdNotIn(List<String> values) {
            addCriterion("repair_emp_id not in", values, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdBetween(String value1, String value2) {
            addCriterion("repair_emp_id between", value1, value2, "repairEmpId");
            return (Criteria) this;
        }

        public Criteria andRepairEmpIdNotBetween(String value1, String value2) {
            addCriterion("repair_emp_id not between", value1, value2, "repairEmpId");
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

        public Criteria andChipNumIsNull() {
            addCriterion("chip_num is null");
            return (Criteria) this;
        }

        public Criteria andChipNumIsNotNull() {
            addCriterion("chip_num is not null");
            return (Criteria) this;
        }

        public Criteria andChipNumEqualTo(String value) {
            addCriterion("chip_num =", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumNotEqualTo(String value) {
            addCriterion("chip_num <>", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumGreaterThan(String value) {
            addCriterion("chip_num >", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumGreaterThanOrEqualTo(String value) {
            addCriterion("chip_num >=", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumLessThan(String value) {
            addCriterion("chip_num <", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumLessThanOrEqualTo(String value) {
            addCriterion("chip_num <=", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumLike(String value) {
            addCriterion("chip_num like", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumNotLike(String value) {
            addCriterion("chip_num not like", value, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumIn(List<String> values) {
            addCriterion("chip_num in", values, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumNotIn(List<String> values) {
            addCriterion("chip_num not in", values, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumBetween(String value1, String value2) {
            addCriterion("chip_num between", value1, value2, "chipNum");
            return (Criteria) this;
        }

        public Criteria andChipNumNotBetween(String value1, String value2) {
            addCriterion("chip_num not between", value1, value2, "chipNum");
            return (Criteria) this;
        }

        public Criteria andCarAddrIsNull() {
            addCriterion("car_addr is null");
            return (Criteria) this;
        }

        public Criteria andCarAddrIsNotNull() {
            addCriterion("car_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCarAddrEqualTo(String value) {
            addCriterion("car_addr =", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrNotEqualTo(String value) {
            addCriterion("car_addr <>", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrGreaterThan(String value) {
            addCriterion("car_addr >", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrGreaterThanOrEqualTo(String value) {
            addCriterion("car_addr >=", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrLessThan(String value) {
            addCriterion("car_addr <", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrLessThanOrEqualTo(String value) {
            addCriterion("car_addr <=", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrLike(String value) {
            addCriterion("car_addr like", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrNotLike(String value) {
            addCriterion("car_addr not like", value, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrIn(List<String> values) {
            addCriterion("car_addr in", values, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrNotIn(List<String> values) {
            addCriterion("car_addr not in", values, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrBetween(String value1, String value2) {
            addCriterion("car_addr between", value1, value2, "carAddr");
            return (Criteria) this;
        }

        public Criteria andCarAddrNotBetween(String value1, String value2) {
            addCriterion("car_addr not between", value1, value2, "carAddr");
            return (Criteria) this;
        }

        public Criteria andFaultNumIsNull() {
            addCriterion("fault_num is null");
            return (Criteria) this;
        }

        public Criteria andFaultNumIsNotNull() {
            addCriterion("fault_num is not null");
            return (Criteria) this;
        }

        public Criteria andFaultNumEqualTo(String value) {
            addCriterion("fault_num =", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumNotEqualTo(String value) {
            addCriterion("fault_num <>", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumGreaterThan(String value) {
            addCriterion("fault_num >", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumGreaterThanOrEqualTo(String value) {
            addCriterion("fault_num >=", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumLessThan(String value) {
            addCriterion("fault_num <", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumLessThanOrEqualTo(String value) {
            addCriterion("fault_num <=", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumLike(String value) {
            addCriterion("fault_num like", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumNotLike(String value) {
            addCriterion("fault_num not like", value, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumIn(List<String> values) {
            addCriterion("fault_num in", values, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumNotIn(List<String> values) {
            addCriterion("fault_num not in", values, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumBetween(String value1, String value2) {
            addCriterion("fault_num between", value1, value2, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultNumNotBetween(String value1, String value2) {
            addCriterion("fault_num not between", value1, value2, "faultNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumIsNull() {
            addCriterion("fault_type_num is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumIsNotNull() {
            addCriterion("fault_type_num is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumEqualTo(String value) {
            addCriterion("fault_type_num =", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumNotEqualTo(String value) {
            addCriterion("fault_type_num <>", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumGreaterThan(String value) {
            addCriterion("fault_type_num >", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumGreaterThanOrEqualTo(String value) {
            addCriterion("fault_type_num >=", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumLessThan(String value) {
            addCriterion("fault_type_num <", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumLessThanOrEqualTo(String value) {
            addCriterion("fault_type_num <=", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumLike(String value) {
            addCriterion("fault_type_num like", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumNotLike(String value) {
            addCriterion("fault_type_num not like", value, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumIn(List<String> values) {
            addCriterion("fault_type_num in", values, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumNotIn(List<String> values) {
            addCriterion("fault_type_num not in", values, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumBetween(String value1, String value2) {
            addCriterion("fault_type_num between", value1, value2, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNumNotBetween(String value1, String value2) {
            addCriterion("fault_type_num not between", value1, value2, "faultTypeNum");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNull() {
            addCriterion("fault_type is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNotNull() {
            addCriterion("fault_type is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeEqualTo(String value) {
            addCriterion("fault_type =", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotEqualTo(String value) {
            addCriterion("fault_type <>", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThan(String value) {
            addCriterion("fault_type >", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fault_type >=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThan(String value) {
            addCriterion("fault_type <", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThanOrEqualTo(String value) {
            addCriterion("fault_type <=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLike(String value) {
            addCriterion("fault_type like", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotLike(String value) {
            addCriterion("fault_type not like", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIn(List<String> values) {
            addCriterion("fault_type in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotIn(List<String> values) {
            addCriterion("fault_type not in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeBetween(String value1, String value2) {
            addCriterion("fault_type between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotBetween(String value1, String value2) {
            addCriterion("fault_type not between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultNameIsNull() {
            addCriterion("fault_name is null");
            return (Criteria) this;
        }

        public Criteria andFaultNameIsNotNull() {
            addCriterion("fault_name is not null");
            return (Criteria) this;
        }

        public Criteria andFaultNameEqualTo(String value) {
            addCriterion("fault_name =", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotEqualTo(String value) {
            addCriterion("fault_name <>", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameGreaterThan(String value) {
            addCriterion("fault_name >", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameGreaterThanOrEqualTo(String value) {
            addCriterion("fault_name >=", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLessThan(String value) {
            addCriterion("fault_name <", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLessThanOrEqualTo(String value) {
            addCriterion("fault_name <=", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLike(String value) {
            addCriterion("fault_name like", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotLike(String value) {
            addCriterion("fault_name not like", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameIn(List<String> values) {
            addCriterion("fault_name in", values, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotIn(List<String> values) {
            addCriterion("fault_name not in", values, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameBetween(String value1, String value2) {
            addCriterion("fault_name between", value1, value2, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotBetween(String value1, String value2) {
            addCriterion("fault_name not between", value1, value2, "faultName");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescIsNull() {
            addCriterion("car_fault_desc is null");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescIsNotNull() {
            addCriterion("car_fault_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescEqualTo(String value) {
            addCriterion("car_fault_desc =", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescNotEqualTo(String value) {
            addCriterion("car_fault_desc <>", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescGreaterThan(String value) {
            addCriterion("car_fault_desc >", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescGreaterThanOrEqualTo(String value) {
            addCriterion("car_fault_desc >=", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescLessThan(String value) {
            addCriterion("car_fault_desc <", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescLessThanOrEqualTo(String value) {
            addCriterion("car_fault_desc <=", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescLike(String value) {
            addCriterion("car_fault_desc like", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescNotLike(String value) {
            addCriterion("car_fault_desc not like", value, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescIn(List<String> values) {
            addCriterion("car_fault_desc in", values, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescNotIn(List<String> values) {
            addCriterion("car_fault_desc not in", values, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescBetween(String value1, String value2) {
            addCriterion("car_fault_desc between", value1, value2, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andCarFaultDescNotBetween(String value1, String value2) {
            addCriterion("car_fault_desc not between", value1, value2, "carFaultDesc");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultIsNull() {
            addCriterion("is_multi_fault is null");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultIsNotNull() {
            addCriterion("is_multi_fault is not null");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultEqualTo(String value) {
            addCriterion("is_multi_fault =", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultNotEqualTo(String value) {
            addCriterion("is_multi_fault <>", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultGreaterThan(String value) {
            addCriterion("is_multi_fault >", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_multi_fault >=", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultLessThan(String value) {
            addCriterion("is_multi_fault <", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultLessThanOrEqualTo(String value) {
            addCriterion("is_multi_fault <=", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultLike(String value) {
            addCriterion("is_multi_fault like", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultNotLike(String value) {
            addCriterion("is_multi_fault not like", value, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultIn(List<String> values) {
            addCriterion("is_multi_fault in", values, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultNotIn(List<String> values) {
            addCriterion("is_multi_fault not in", values, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultBetween(String value1, String value2) {
            addCriterion("is_multi_fault between", value1, value2, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsMultiFaultNotBetween(String value1, String value2) {
            addCriterion("is_multi_fault not between", value1, value2, "isMultiFault");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(String value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(String value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(String value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(String value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(String value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(String value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLike(String value) {
            addCriterion("is_lock like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotLike(String value) {
            addCriterion("is_lock not like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<String> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<String> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(String value1, String value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(String value1, String value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRepairModeIsNull() {
            addCriterion("repair_mode is null");
            return (Criteria) this;
        }

        public Criteria andRepairModeIsNotNull() {
            addCriterion("repair_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRepairModeEqualTo(String value) {
            addCriterion("repair_mode =", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeNotEqualTo(String value) {
            addCriterion("repair_mode <>", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeGreaterThan(String value) {
            addCriterion("repair_mode >", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_mode >=", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeLessThan(String value) {
            addCriterion("repair_mode <", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeLessThanOrEqualTo(String value) {
            addCriterion("repair_mode <=", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeLike(String value) {
            addCriterion("repair_mode like", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeNotLike(String value) {
            addCriterion("repair_mode not like", value, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeIn(List<String> values) {
            addCriterion("repair_mode in", values, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeNotIn(List<String> values) {
            addCriterion("repair_mode not in", values, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeBetween(String value1, String value2) {
            addCriterion("repair_mode between", value1, value2, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairModeNotBetween(String value1, String value2) {
            addCriterion("repair_mode not between", value1, value2, "repairMode");
            return (Criteria) this;
        }

        public Criteria andRepairTypeIsNull() {
            addCriterion("repair_type is null");
            return (Criteria) this;
        }

        public Criteria andRepairTypeIsNotNull() {
            addCriterion("repair_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepairTypeEqualTo(String value) {
            addCriterion("repair_type =", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotEqualTo(String value) {
            addCriterion("repair_type <>", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeGreaterThan(String value) {
            addCriterion("repair_type >", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repair_type >=", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeLessThan(String value) {
            addCriterion("repair_type <", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeLessThanOrEqualTo(String value) {
            addCriterion("repair_type <=", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeLike(String value) {
            addCriterion("repair_type like", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotLike(String value) {
            addCriterion("repair_type not like", value, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeIn(List<String> values) {
            addCriterion("repair_type in", values, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotIn(List<String> values) {
            addCriterion("repair_type not in", values, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeBetween(String value1, String value2) {
            addCriterion("repair_type between", value1, value2, "repairType");
            return (Criteria) this;
        }

        public Criteria andRepairTypeNotBetween(String value1, String value2) {
            addCriterion("repair_type not between", value1, value2, "repairType");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentIsNull() {
            addCriterion("is_repair_rent is null");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentIsNotNull() {
            addCriterion("is_repair_rent is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentEqualTo(String value) {
            addCriterion("is_repair_rent =", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentNotEqualTo(String value) {
            addCriterion("is_repair_rent <>", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentGreaterThan(String value) {
            addCriterion("is_repair_rent >", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentGreaterThanOrEqualTo(String value) {
            addCriterion("is_repair_rent >=", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentLessThan(String value) {
            addCriterion("is_repair_rent <", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentLessThanOrEqualTo(String value) {
            addCriterion("is_repair_rent <=", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentLike(String value) {
            addCriterion("is_repair_rent like", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentNotLike(String value) {
            addCriterion("is_repair_rent not like", value, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentIn(List<String> values) {
            addCriterion("is_repair_rent in", values, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentNotIn(List<String> values) {
            addCriterion("is_repair_rent not in", values, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentBetween(String value1, String value2) {
            addCriterion("is_repair_rent between", value1, value2, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andIsRepairRentNotBetween(String value1, String value2) {
            addCriterion("is_repair_rent not between", value1, value2, "isRepairRent");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1IsNull() {
            addCriterion("maintain_b_p1 is null");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1IsNotNull() {
            addCriterion("maintain_b_p1 is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1EqualTo(String value) {
            addCriterion("maintain_b_p1 =", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1NotEqualTo(String value) {
            addCriterion("maintain_b_p1 <>", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1GreaterThan(String value) {
            addCriterion("maintain_b_p1 >", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1GreaterThanOrEqualTo(String value) {
            addCriterion("maintain_b_p1 >=", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1LessThan(String value) {
            addCriterion("maintain_b_p1 <", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1LessThanOrEqualTo(String value) {
            addCriterion("maintain_b_p1 <=", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1Like(String value) {
            addCriterion("maintain_b_p1 like", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1NotLike(String value) {
            addCriterion("maintain_b_p1 not like", value, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1In(List<String> values) {
            addCriterion("maintain_b_p1 in", values, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1NotIn(List<String> values) {
            addCriterion("maintain_b_p1 not in", values, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1Between(String value1, String value2) {
            addCriterion("maintain_b_p1 between", value1, value2, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP1NotBetween(String value1, String value2) {
            addCriterion("maintain_b_p1 not between", value1, value2, "maintainBP1");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2IsNull() {
            addCriterion("maintain_b_p2 is null");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2IsNotNull() {
            addCriterion("maintain_b_p2 is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2EqualTo(String value) {
            addCriterion("maintain_b_p2 =", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2NotEqualTo(String value) {
            addCriterion("maintain_b_p2 <>", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2GreaterThan(String value) {
            addCriterion("maintain_b_p2 >", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2GreaterThanOrEqualTo(String value) {
            addCriterion("maintain_b_p2 >=", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2LessThan(String value) {
            addCriterion("maintain_b_p2 <", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2LessThanOrEqualTo(String value) {
            addCriterion("maintain_b_p2 <=", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2Like(String value) {
            addCriterion("maintain_b_p2 like", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2NotLike(String value) {
            addCriterion("maintain_b_p2 not like", value, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2In(List<String> values) {
            addCriterion("maintain_b_p2 in", values, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2NotIn(List<String> values) {
            addCriterion("maintain_b_p2 not in", values, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2Between(String value1, String value2) {
            addCriterion("maintain_b_p2 between", value1, value2, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP2NotBetween(String value1, String value2) {
            addCriterion("maintain_b_p2 not between", value1, value2, "maintainBP2");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3IsNull() {
            addCriterion("maintain_b_p3 is null");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3IsNotNull() {
            addCriterion("maintain_b_p3 is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3EqualTo(String value) {
            addCriterion("maintain_b_p3 =", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3NotEqualTo(String value) {
            addCriterion("maintain_b_p3 <>", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3GreaterThan(String value) {
            addCriterion("maintain_b_p3 >", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3GreaterThanOrEqualTo(String value) {
            addCriterion("maintain_b_p3 >=", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3LessThan(String value) {
            addCriterion("maintain_b_p3 <", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3LessThanOrEqualTo(String value) {
            addCriterion("maintain_b_p3 <=", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3Like(String value) {
            addCriterion("maintain_b_p3 like", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3NotLike(String value) {
            addCriterion("maintain_b_p3 not like", value, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3In(List<String> values) {
            addCriterion("maintain_b_p3 in", values, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3NotIn(List<String> values) {
            addCriterion("maintain_b_p3 not in", values, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3Between(String value1, String value2) {
            addCriterion("maintain_b_p3 between", value1, value2, "maintainBP3");
            return (Criteria) this;
        }

        public Criteria andMaintainBP3NotBetween(String value1, String value2) {
            addCriterion("maintain_b_p3 not between", value1, value2, "maintainBP3");
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