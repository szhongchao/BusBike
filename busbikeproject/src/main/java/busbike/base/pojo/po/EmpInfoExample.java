package busbike.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class EmpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpInfoExample() {
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

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdIsNull() {
            addCriterion("emp_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdIsNotNull() {
            addCriterion("emp_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdEqualTo(String value) {
            addCriterion("emp_type_id =", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdNotEqualTo(String value) {
            addCriterion("emp_type_id <>", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdGreaterThan(String value) {
            addCriterion("emp_type_id >", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_type_id >=", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdLessThan(String value) {
            addCriterion("emp_type_id <", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdLessThanOrEqualTo(String value) {
            addCriterion("emp_type_id <=", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdLike(String value) {
            addCriterion("emp_type_id like", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdNotLike(String value) {
            addCriterion("emp_type_id not like", value, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdIn(List<String> values) {
            addCriterion("emp_type_id in", values, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdNotIn(List<String> values) {
            addCriterion("emp_type_id not in", values, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdBetween(String value1, String value2) {
            addCriterion("emp_type_id between", value1, value2, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIdNotBetween(String value1, String value2) {
            addCriterion("emp_type_id not between", value1, value2, "empTypeId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNull() {
            addCriterion("emp_password is null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNotNull() {
            addCriterion("emp_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordEqualTo(String value) {
            addCriterion("emp_password =", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotEqualTo(String value) {
            addCriterion("emp_password <>", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThan(String value) {
            addCriterion("emp_password >", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("emp_password >=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThan(String value) {
            addCriterion("emp_password <", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThanOrEqualTo(String value) {
            addCriterion("emp_password <=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLike(String value) {
            addCriterion("emp_password like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotLike(String value) {
            addCriterion("emp_password not like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIn(List<String> values) {
            addCriterion("emp_password in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotIn(List<String> values) {
            addCriterion("emp_password not in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordBetween(String value1, String value2) {
            addCriterion("emp_password between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotBetween(String value1, String value2) {
            addCriterion("emp_password not between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIsNull() {
            addCriterion("emp_type is null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIsNotNull() {
            addCriterion("emp_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmpTypeEqualTo(String value) {
            addCriterion("emp_type =", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotEqualTo(String value) {
            addCriterion("emp_type <>", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeGreaterThan(String value) {
            addCriterion("emp_type >", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("emp_type >=", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLessThan(String value) {
            addCriterion("emp_type <", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLessThanOrEqualTo(String value) {
            addCriterion("emp_type <=", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeLike(String value) {
            addCriterion("emp_type like", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotLike(String value) {
            addCriterion("emp_type not like", value, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeIn(List<String> values) {
            addCriterion("emp_type in", values, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotIn(List<String> values) {
            addCriterion("emp_type not in", values, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeBetween(String value1, String value2) {
            addCriterion("emp_type between", value1, value2, "empType");
            return (Criteria) this;
        }

        public Criteria andEmpTypeNotBetween(String value1, String value2) {
            addCriterion("emp_type not between", value1, value2, "empType");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNull() {
            addCriterion("emp_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNotNull() {
            addCriterion("emp_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressEqualTo(String value) {
            addCriterion("emp_address =", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotEqualTo(String value) {
            addCriterion("emp_address <>", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThan(String value) {
            addCriterion("emp_address >", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_address >=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThan(String value) {
            addCriterion("emp_address <", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_address <=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLike(String value) {
            addCriterion("emp_address like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotLike(String value) {
            addCriterion("emp_address not like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIn(List<String> values) {
            addCriterion("emp_address in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotIn(List<String> values) {
            addCriterion("emp_address not in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressBetween(String value1, String value2) {
            addCriterion("emp_address between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotBetween(String value1, String value2) {
            addCriterion("emp_address not between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNull() {
            addCriterion("is_visible is null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNotNull() {
            addCriterion("is_visible is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleEqualTo(String value) {
            addCriterion("is_visible =", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotEqualTo(String value) {
            addCriterion("is_visible <>", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThan(String value) {
            addCriterion("is_visible >", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("is_visible >=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThan(String value) {
            addCriterion("is_visible <", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThanOrEqualTo(String value) {
            addCriterion("is_visible <=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLike(String value) {
            addCriterion("is_visible like", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotLike(String value) {
            addCriterion("is_visible not like", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIn(List<String> values) {
            addCriterion("is_visible in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotIn(List<String> values) {
            addCriterion("is_visible not in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleBetween(String value1, String value2) {
            addCriterion("is_visible between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotBetween(String value1, String value2) {
            addCriterion("is_visible not between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIsNull() {
            addCriterion("security_level is null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIsNotNull() {
            addCriterion("security_level is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelEqualTo(String value) {
            addCriterion("security_level =", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotEqualTo(String value) {
            addCriterion("security_level <>", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelGreaterThan(String value) {
            addCriterion("security_level >", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelGreaterThanOrEqualTo(String value) {
            addCriterion("security_level >=", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLessThan(String value) {
            addCriterion("security_level <", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLessThanOrEqualTo(String value) {
            addCriterion("security_level <=", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelLike(String value) {
            addCriterion("security_level like", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotLike(String value) {
            addCriterion("security_level not like", value, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelIn(List<String> values) {
            addCriterion("security_level in", values, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotIn(List<String> values) {
            addCriterion("security_level not in", values, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelBetween(String value1, String value2) {
            addCriterion("security_level between", value1, value2, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andSecurityLevelNotBetween(String value1, String value2) {
            addCriterion("security_level not between", value1, value2, "securityLevel");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdIsNull() {
            addCriterion("emp_class_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdIsNotNull() {
            addCriterion("emp_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdEqualTo(String value) {
            addCriterion("emp_class_id =", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdNotEqualTo(String value) {
            addCriterion("emp_class_id <>", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdGreaterThan(String value) {
            addCriterion("emp_class_id >", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_class_id >=", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdLessThan(String value) {
            addCriterion("emp_class_id <", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdLessThanOrEqualTo(String value) {
            addCriterion("emp_class_id <=", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdLike(String value) {
            addCriterion("emp_class_id like", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdNotLike(String value) {
            addCriterion("emp_class_id not like", value, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdIn(List<String> values) {
            addCriterion("emp_class_id in", values, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdNotIn(List<String> values) {
            addCriterion("emp_class_id not in", values, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdBetween(String value1, String value2) {
            addCriterion("emp_class_id between", value1, value2, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassIdNotBetween(String value1, String value2) {
            addCriterion("emp_class_id not between", value1, value2, "empClassId");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameIsNull() {
            addCriterion("emp_class_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameIsNotNull() {
            addCriterion("emp_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameEqualTo(String value) {
            addCriterion("emp_class_name =", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameNotEqualTo(String value) {
            addCriterion("emp_class_name <>", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameGreaterThan(String value) {
            addCriterion("emp_class_name >", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_class_name >=", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameLessThan(String value) {
            addCriterion("emp_class_name <", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameLessThanOrEqualTo(String value) {
            addCriterion("emp_class_name <=", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameLike(String value) {
            addCriterion("emp_class_name like", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameNotLike(String value) {
            addCriterion("emp_class_name not like", value, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameIn(List<String> values) {
            addCriterion("emp_class_name in", values, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameNotIn(List<String> values) {
            addCriterion("emp_class_name not in", values, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameBetween(String value1, String value2) {
            addCriterion("emp_class_name between", value1, value2, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpClassNameNotBetween(String value1, String value2) {
            addCriterion("emp_class_name not between", value1, value2, "empClassName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdIsNull() {
            addCriterion("emp_group_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdIsNotNull() {
            addCriterion("emp_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdEqualTo(String value) {
            addCriterion("emp_group_id =", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdNotEqualTo(String value) {
            addCriterion("emp_group_id <>", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdGreaterThan(String value) {
            addCriterion("emp_group_id >", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_group_id >=", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdLessThan(String value) {
            addCriterion("emp_group_id <", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdLessThanOrEqualTo(String value) {
            addCriterion("emp_group_id <=", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdLike(String value) {
            addCriterion("emp_group_id like", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdNotLike(String value) {
            addCriterion("emp_group_id not like", value, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdIn(List<String> values) {
            addCriterion("emp_group_id in", values, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdNotIn(List<String> values) {
            addCriterion("emp_group_id not in", values, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdBetween(String value1, String value2) {
            addCriterion("emp_group_id between", value1, value2, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupIdNotBetween(String value1, String value2) {
            addCriterion("emp_group_id not between", value1, value2, "empGroupId");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameIsNull() {
            addCriterion("emp_group_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameIsNotNull() {
            addCriterion("emp_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameEqualTo(String value) {
            addCriterion("emp_group_name =", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameNotEqualTo(String value) {
            addCriterion("emp_group_name <>", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameGreaterThan(String value) {
            addCriterion("emp_group_name >", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_group_name >=", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameLessThan(String value) {
            addCriterion("emp_group_name <", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameLessThanOrEqualTo(String value) {
            addCriterion("emp_group_name <=", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameLike(String value) {
            addCriterion("emp_group_name like", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameNotLike(String value) {
            addCriterion("emp_group_name not like", value, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameIn(List<String> values) {
            addCriterion("emp_group_name in", values, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameNotIn(List<String> values) {
            addCriterion("emp_group_name not in", values, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameBetween(String value1, String value2) {
            addCriterion("emp_group_name between", value1, value2, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andEmpGroupNameNotBetween(String value1, String value2) {
            addCriterion("emp_group_name not between", value1, value2, "empGroupName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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