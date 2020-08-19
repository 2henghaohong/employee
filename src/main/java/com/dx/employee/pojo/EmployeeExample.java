package com.dx.employee.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andNsexIsNull() {
            addCriterion("nSex is null");
            return (Criteria) this;
        }

        public Criteria andNsexIsNotNull() {
            addCriterion("nSex is not null");
            return (Criteria) this;
        }

        public Criteria andNsexEqualTo(String value) {
            addCriterion("nSex =", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotEqualTo(String value) {
            addCriterion("nSex <>", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexGreaterThan(String value) {
            addCriterion("nSex >", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexGreaterThanOrEqualTo(String value) {
            addCriterion("nSex >=", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexLessThan(String value) {
            addCriterion("nSex <", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexLessThanOrEqualTo(String value) {
            addCriterion("nSex <=", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexLike(String value) {
            addCriterion("nSex like", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotLike(String value) {
            addCriterion("nSex not like", value, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexIn(List<String> values) {
            addCriterion("nSex in", values, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotIn(List<String> values) {
            addCriterion("nSex not in", values, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexBetween(String value1, String value2) {
            addCriterion("nSex between", value1, value2, "nsex");
            return (Criteria) this;
        }

        public Criteria andNsexNotBetween(String value1, String value2) {
            addCriterion("nSex not between", value1, value2, "nsex");
            return (Criteria) this;
        }

        public Criteria andStatecodeIsNull() {
            addCriterion("StateCode is null");
            return (Criteria) this;
        }

        public Criteria andStatecodeIsNotNull() {
            addCriterion("StateCode is not null");
            return (Criteria) this;
        }

        public Criteria andStatecodeEqualTo(String value) {
            addCriterion("StateCode =", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeNotEqualTo(String value) {
            addCriterion("StateCode <>", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeGreaterThan(String value) {
            addCriterion("StateCode >", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("StateCode >=", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeLessThan(String value) {
            addCriterion("StateCode <", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeLessThanOrEqualTo(String value) {
            addCriterion("StateCode <=", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeLike(String value) {
            addCriterion("StateCode like", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeNotLike(String value) {
            addCriterion("StateCode not like", value, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeIn(List<String> values) {
            addCriterion("StateCode in", values, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeNotIn(List<String> values) {
            addCriterion("StateCode not in", values, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeBetween(String value1, String value2) {
            addCriterion("StateCode between", value1, value2, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatecodeNotBetween(String value1, String value2) {
            addCriterion("StateCode not between", value1, value2, "statecode");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNull() {
            addCriterion("StateName is null");
            return (Criteria) this;
        }

        public Criteria andStatenameIsNotNull() {
            addCriterion("StateName is not null");
            return (Criteria) this;
        }

        public Criteria andStatenameEqualTo(String value) {
            addCriterion("StateName =", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotEqualTo(String value) {
            addCriterion("StateName <>", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThan(String value) {
            addCriterion("StateName >", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameGreaterThanOrEqualTo(String value) {
            addCriterion("StateName >=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThan(String value) {
            addCriterion("StateName <", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLessThanOrEqualTo(String value) {
            addCriterion("StateName <=", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameLike(String value) {
            addCriterion("StateName like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotLike(String value) {
            addCriterion("StateName not like", value, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameIn(List<String> values) {
            addCriterion("StateName in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotIn(List<String> values) {
            addCriterion("StateName not in", values, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameBetween(String value1, String value2) {
            addCriterion("StateName between", value1, value2, "statename");
            return (Criteria) this;
        }

        public Criteria andStatenameNotBetween(String value1, String value2) {
            addCriterion("StateName not between", value1, value2, "statename");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNull() {
            addCriterion("DeptCode is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("DeptCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("DeptCode =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("DeptCode <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("DeptCode >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DeptCode >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("DeptCode <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("DeptCode <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("DeptCode like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("DeptCode not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("DeptCode in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("DeptCode not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("DeptCode between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("DeptCode not between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("DeptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DeptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DeptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DeptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DeptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DeptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DeptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DeptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DeptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DeptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DeptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DeptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DeptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DeptName not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("AreaName is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("AreaName is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("AreaName =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("AreaName <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("AreaName >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("AreaName >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("AreaName <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("AreaName <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("AreaName like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("AreaName not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("AreaName in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("AreaName not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("AreaName between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("AreaName not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andZbnameIsNull() {
            addCriterion("ZBName is null");
            return (Criteria) this;
        }

        public Criteria andZbnameIsNotNull() {
            addCriterion("ZBName is not null");
            return (Criteria) this;
        }

        public Criteria andZbnameEqualTo(String value) {
            addCriterion("ZBName =", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameNotEqualTo(String value) {
            addCriterion("ZBName <>", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameGreaterThan(String value) {
            addCriterion("ZBName >", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameGreaterThanOrEqualTo(String value) {
            addCriterion("ZBName >=", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameLessThan(String value) {
            addCriterion("ZBName <", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameLessThanOrEqualTo(String value) {
            addCriterion("ZBName <=", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameLike(String value) {
            addCriterion("ZBName like", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameNotLike(String value) {
            addCriterion("ZBName not like", value, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameIn(List<String> values) {
            addCriterion("ZBName in", values, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameNotIn(List<String> values) {
            addCriterion("ZBName not in", values, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameBetween(String value1, String value2) {
            addCriterion("ZBName between", value1, value2, "zbname");
            return (Criteria) this;
        }

        public Criteria andZbnameNotBetween(String value1, String value2) {
            addCriterion("ZBName not between", value1, value2, "zbname");
            return (Criteria) this;
        }

        public Criteria andJobcodeIsNull() {
            addCriterion("JobCode is null");
            return (Criteria) this;
        }

        public Criteria andJobcodeIsNotNull() {
            addCriterion("JobCode is not null");
            return (Criteria) this;
        }

        public Criteria andJobcodeEqualTo(String value) {
            addCriterion("JobCode =", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotEqualTo(String value) {
            addCriterion("JobCode <>", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThan(String value) {
            addCriterion("JobCode >", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeGreaterThanOrEqualTo(String value) {
            addCriterion("JobCode >=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThan(String value) {
            addCriterion("JobCode <", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLessThanOrEqualTo(String value) {
            addCriterion("JobCode <=", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeLike(String value) {
            addCriterion("JobCode like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotLike(String value) {
            addCriterion("JobCode not like", value, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeIn(List<String> values) {
            addCriterion("JobCode in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotIn(List<String> values) {
            addCriterion("JobCode not in", values, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeBetween(String value1, String value2) {
            addCriterion("JobCode between", value1, value2, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobcodeNotBetween(String value1, String value2) {
            addCriterion("JobCode not between", value1, value2, "jobcode");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("JobName is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("JobName is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("JobName =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("JobName <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("JobName >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("JobName >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("JobName <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("JobName <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("JobName like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("JobName not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("JobName in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("JobName not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("JobName between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("JobName not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("JobType is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("JobType is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(String value) {
            addCriterion("JobType =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(String value) {
            addCriterion("JobType <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(String value) {
            addCriterion("JobType >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("JobType >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(String value) {
            addCriterion("JobType <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(String value) {
            addCriterion("JobType <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLike(String value) {
            addCriterion("JobType like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotLike(String value) {
            addCriterion("JobType not like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<String> values) {
            addCriterion("JobType in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<String> values) {
            addCriterion("JobType not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(String value1, String value2) {
            addCriterion("JobType between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(String value1, String value2) {
            addCriterion("JobType not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andEducodeIsNull() {
            addCriterion("EduCode is null");
            return (Criteria) this;
        }

        public Criteria andEducodeIsNotNull() {
            addCriterion("EduCode is not null");
            return (Criteria) this;
        }

        public Criteria andEducodeEqualTo(String value) {
            addCriterion("EduCode =", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeNotEqualTo(String value) {
            addCriterion("EduCode <>", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeGreaterThan(String value) {
            addCriterion("EduCode >", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeGreaterThanOrEqualTo(String value) {
            addCriterion("EduCode >=", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeLessThan(String value) {
            addCriterion("EduCode <", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeLessThanOrEqualTo(String value) {
            addCriterion("EduCode <=", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeLike(String value) {
            addCriterion("EduCode like", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeNotLike(String value) {
            addCriterion("EduCode not like", value, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeIn(List<String> values) {
            addCriterion("EduCode in", values, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeNotIn(List<String> values) {
            addCriterion("EduCode not in", values, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeBetween(String value1, String value2) {
            addCriterion("EduCode between", value1, value2, "educode");
            return (Criteria) this;
        }

        public Criteria andEducodeNotBetween(String value1, String value2) {
            addCriterion("EduCode not between", value1, value2, "educode");
            return (Criteria) this;
        }

        public Criteria andEdunameIsNull() {
            addCriterion("EduName is null");
            return (Criteria) this;
        }

        public Criteria andEdunameIsNotNull() {
            addCriterion("EduName is not null");
            return (Criteria) this;
        }

        public Criteria andEdunameEqualTo(String value) {
            addCriterion("EduName =", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotEqualTo(String value) {
            addCriterion("EduName <>", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameGreaterThan(String value) {
            addCriterion("EduName >", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameGreaterThanOrEqualTo(String value) {
            addCriterion("EduName >=", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLessThan(String value) {
            addCriterion("EduName <", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLessThanOrEqualTo(String value) {
            addCriterion("EduName <=", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLike(String value) {
            addCriterion("EduName like", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotLike(String value) {
            addCriterion("EduName not like", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameIn(List<String> values) {
            addCriterion("EduName in", values, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotIn(List<String> values) {
            addCriterion("EduName not in", values, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameBetween(String value1, String value2) {
            addCriterion("EduName between", value1, value2, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotBetween(String value1, String value2) {
            addCriterion("EduName not between", value1, value2, "eduname");
            return (Criteria) this;
        }

        public Criteria andNschoolIsNull() {
            addCriterion("nSchool is null");
            return (Criteria) this;
        }

        public Criteria andNschoolIsNotNull() {
            addCriterion("nSchool is not null");
            return (Criteria) this;
        }

        public Criteria andNschoolEqualTo(String value) {
            addCriterion("nSchool =", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotEqualTo(String value) {
            addCriterion("nSchool <>", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolGreaterThan(String value) {
            addCriterion("nSchool >", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolGreaterThanOrEqualTo(String value) {
            addCriterion("nSchool >=", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolLessThan(String value) {
            addCriterion("nSchool <", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolLessThanOrEqualTo(String value) {
            addCriterion("nSchool <=", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolLike(String value) {
            addCriterion("nSchool like", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotLike(String value) {
            addCriterion("nSchool not like", value, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolIn(List<String> values) {
            addCriterion("nSchool in", values, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotIn(List<String> values) {
            addCriterion("nSchool not in", values, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolBetween(String value1, String value2) {
            addCriterion("nSchool between", value1, value2, "nschool");
            return (Criteria) this;
        }

        public Criteria andNschoolNotBetween(String value1, String value2) {
            addCriterion("nSchool not between", value1, value2, "nschool");
            return (Criteria) this;
        }

        public Criteria andPoltypeIsNull() {
            addCriterion("PolType is null");
            return (Criteria) this;
        }

        public Criteria andPoltypeIsNotNull() {
            addCriterion("PolType is not null");
            return (Criteria) this;
        }

        public Criteria andPoltypeEqualTo(String value) {
            addCriterion("PolType =", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeNotEqualTo(String value) {
            addCriterion("PolType <>", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeGreaterThan(String value) {
            addCriterion("PolType >", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeGreaterThanOrEqualTo(String value) {
            addCriterion("PolType >=", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeLessThan(String value) {
            addCriterion("PolType <", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeLessThanOrEqualTo(String value) {
            addCriterion("PolType <=", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeLike(String value) {
            addCriterion("PolType like", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeNotLike(String value) {
            addCriterion("PolType not like", value, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeIn(List<String> values) {
            addCriterion("PolType in", values, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeNotIn(List<String> values) {
            addCriterion("PolType not in", values, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeBetween(String value1, String value2) {
            addCriterion("PolType between", value1, value2, "poltype");
            return (Criteria) this;
        }

        public Criteria andPoltypeNotBetween(String value1, String value2) {
            addCriterion("PolType not between", value1, value2, "poltype");
            return (Criteria) this;
        }

        public Criteria andHouregIsNull() {
            addCriterion("HouReg is null");
            return (Criteria) this;
        }

        public Criteria andHouregIsNotNull() {
            addCriterion("HouReg is not null");
            return (Criteria) this;
        }

        public Criteria andHouregEqualTo(String value) {
            addCriterion("HouReg =", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregNotEqualTo(String value) {
            addCriterion("HouReg <>", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregGreaterThan(String value) {
            addCriterion("HouReg >", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregGreaterThanOrEqualTo(String value) {
            addCriterion("HouReg >=", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregLessThan(String value) {
            addCriterion("HouReg <", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregLessThanOrEqualTo(String value) {
            addCriterion("HouReg <=", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregLike(String value) {
            addCriterion("HouReg like", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregNotLike(String value) {
            addCriterion("HouReg not like", value, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregIn(List<String> values) {
            addCriterion("HouReg in", values, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregNotIn(List<String> values) {
            addCriterion("HouReg not in", values, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregBetween(String value1, String value2) {
            addCriterion("HouReg between", value1, value2, "houreg");
            return (Criteria) this;
        }

        public Criteria andHouregNotBetween(String value1, String value2) {
            addCriterion("HouReg not between", value1, value2, "houreg");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("Nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("Nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andCbunitIsNull() {
            addCriterion("CBUnit is null");
            return (Criteria) this;
        }

        public Criteria andCbunitIsNotNull() {
            addCriterion("CBUnit is not null");
            return (Criteria) this;
        }

        public Criteria andCbunitEqualTo(String value) {
            addCriterion("CBUnit =", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitNotEqualTo(String value) {
            addCriterion("CBUnit <>", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitGreaterThan(String value) {
            addCriterion("CBUnit >", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitGreaterThanOrEqualTo(String value) {
            addCriterion("CBUnit >=", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitLessThan(String value) {
            addCriterion("CBUnit <", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitLessThanOrEqualTo(String value) {
            addCriterion("CBUnit <=", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitLike(String value) {
            addCriterion("CBUnit like", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitNotLike(String value) {
            addCriterion("CBUnit not like", value, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitIn(List<String> values) {
            addCriterion("CBUnit in", values, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitNotIn(List<String> values) {
            addCriterion("CBUnit not in", values, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitBetween(String value1, String value2) {
            addCriterion("CBUnit between", value1, value2, "cbunit");
            return (Criteria) this;
        }

        public Criteria andCbunitNotBetween(String value1, String value2) {
            addCriterion("CBUnit not between", value1, value2, "cbunit");
            return (Criteria) this;
        }

        public Criteria andNationnameIsNull() {
            addCriterion("NationName is null");
            return (Criteria) this;
        }

        public Criteria andNationnameIsNotNull() {
            addCriterion("NationName is not null");
            return (Criteria) this;
        }

        public Criteria andNationnameEqualTo(String value) {
            addCriterion("NationName =", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameNotEqualTo(String value) {
            addCriterion("NationName <>", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameGreaterThan(String value) {
            addCriterion("NationName >", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameGreaterThanOrEqualTo(String value) {
            addCriterion("NationName >=", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameLessThan(String value) {
            addCriterion("NationName <", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameLessThanOrEqualTo(String value) {
            addCriterion("NationName <=", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameLike(String value) {
            addCriterion("NationName like", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameNotLike(String value) {
            addCriterion("NationName not like", value, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameIn(List<String> values) {
            addCriterion("NationName in", values, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameNotIn(List<String> values) {
            addCriterion("NationName not in", values, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameBetween(String value1, String value2) {
            addCriterion("NationName between", value1, value2, "nationname");
            return (Criteria) this;
        }

        public Criteria andNationnameNotBetween(String value1, String value2) {
            addCriterion("NationName not between", value1, value2, "nationname");
            return (Criteria) this;
        }

        public Criteria andMarstatusIsNull() {
            addCriterion("MarStatus is null");
            return (Criteria) this;
        }

        public Criteria andMarstatusIsNotNull() {
            addCriterion("MarStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMarstatusEqualTo(String value) {
            addCriterion("MarStatus =", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusNotEqualTo(String value) {
            addCriterion("MarStatus <>", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusGreaterThan(String value) {
            addCriterion("MarStatus >", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusGreaterThanOrEqualTo(String value) {
            addCriterion("MarStatus >=", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusLessThan(String value) {
            addCriterion("MarStatus <", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusLessThanOrEqualTo(String value) {
            addCriterion("MarStatus <=", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusLike(String value) {
            addCriterion("MarStatus like", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusNotLike(String value) {
            addCriterion("MarStatus not like", value, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusIn(List<String> values) {
            addCriterion("MarStatus in", values, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusNotIn(List<String> values) {
            addCriterion("MarStatus not in", values, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusBetween(String value1, String value2) {
            addCriterion("MarStatus between", value1, value2, "marstatus");
            return (Criteria) this;
        }

        public Criteria andMarstatusNotBetween(String value1, String value2) {
            addCriterion("MarStatus not between", value1, value2, "marstatus");
            return (Criteria) this;
        }

        public Criteria andNaddressIsNull() {
            addCriterion("nAddress is null");
            return (Criteria) this;
        }

        public Criteria andNaddressIsNotNull() {
            addCriterion("nAddress is not null");
            return (Criteria) this;
        }

        public Criteria andNaddressEqualTo(String value) {
            addCriterion("nAddress =", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressNotEqualTo(String value) {
            addCriterion("nAddress <>", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressGreaterThan(String value) {
            addCriterion("nAddress >", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressGreaterThanOrEqualTo(String value) {
            addCriterion("nAddress >=", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressLessThan(String value) {
            addCriterion("nAddress <", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressLessThanOrEqualTo(String value) {
            addCriterion("nAddress <=", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressLike(String value) {
            addCriterion("nAddress like", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressNotLike(String value) {
            addCriterion("nAddress not like", value, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressIn(List<String> values) {
            addCriterion("nAddress in", values, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressNotIn(List<String> values) {
            addCriterion("nAddress not in", values, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressBetween(String value1, String value2) {
            addCriterion("nAddress between", value1, value2, "naddress");
            return (Criteria) this;
        }

        public Criteria andNaddressNotBetween(String value1, String value2) {
            addCriterion("nAddress not between", value1, value2, "naddress");
            return (Criteria) this;
        }

        public Criteria andIageIsNull() {
            addCriterion("iAge is null");
            return (Criteria) this;
        }

        public Criteria andIageIsNotNull() {
            addCriterion("iAge is not null");
            return (Criteria) this;
        }

        public Criteria andIageEqualTo(Integer value) {
            addCriterion("iAge =", value, "iage");
            return (Criteria) this;
        }

        public Criteria andIageNotEqualTo(Integer value) {
            addCriterion("iAge <>", value, "iage");
            return (Criteria) this;
        }

        public Criteria andIageGreaterThan(Integer value) {
            addCriterion("iAge >", value, "iage");
            return (Criteria) this;
        }

        public Criteria andIageGreaterThanOrEqualTo(Integer value) {
            addCriterion("iAge >=", value, "iage");
            return (Criteria) this;
        }

        public Criteria andIageLessThan(Integer value) {
            addCriterion("iAge <", value, "iage");
            return (Criteria) this;
        }

        public Criteria andIageLessThanOrEqualTo(Integer value) {
            addCriterion("iAge <=", value, "iage");
            return (Criteria) this;
        }

        public Criteria andIageIn(List<Integer> values) {
            addCriterion("iAge in", values, "iage");
            return (Criteria) this;
        }

        public Criteria andIageNotIn(List<Integer> values) {
            addCriterion("iAge not in", values, "iage");
            return (Criteria) this;
        }

        public Criteria andIageBetween(Integer value1, Integer value2) {
            addCriterion("iAge between", value1, value2, "iage");
            return (Criteria) this;
        }

        public Criteria andIageNotBetween(Integer value1, Integer value2) {
            addCriterion("iAge not between", value1, value2, "iage");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BirthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BirthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("BirthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("BirthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("BirthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("BirthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("BirthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("BirthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("BirthDate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("BirthDate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("BirthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("BirthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("BirthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("BirthDate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNull() {
            addCriterion("EntryDate is null");
            return (Criteria) this;
        }

        public Criteria andEntrydateIsNotNull() {
            addCriterion("EntryDate is not null");
            return (Criteria) this;
        }

        public Criteria andEntrydateEqualTo(String value) {
            addCriterion("EntryDate =", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotEqualTo(String value) {
            addCriterion("EntryDate <>", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThan(String value) {
            addCriterion("EntryDate >", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateGreaterThanOrEqualTo(String value) {
            addCriterion("EntryDate >=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThan(String value) {
            addCriterion("EntryDate <", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLessThanOrEqualTo(String value) {
            addCriterion("EntryDate <=", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateLike(String value) {
            addCriterion("EntryDate like", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotLike(String value) {
            addCriterion("EntryDate not like", value, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateIn(List<String> values) {
            addCriterion("EntryDate in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotIn(List<String> values) {
            addCriterion("EntryDate not in", values, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateBetween(String value1, String value2) {
            addCriterion("EntryDate between", value1, value2, "entrydate");
            return (Criteria) this;
        }

        public Criteria andEntrydateNotBetween(String value1, String value2) {
            addCriterion("EntryDate not between", value1, value2, "entrydate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateIsNull() {
            addCriterion("CorrectionDate is null");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateIsNotNull() {
            addCriterion("CorrectionDate is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateEqualTo(String value) {
            addCriterion("CorrectionDate =", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateNotEqualTo(String value) {
            addCriterion("CorrectionDate <>", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateGreaterThan(String value) {
            addCriterion("CorrectionDate >", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateGreaterThanOrEqualTo(String value) {
            addCriterion("CorrectionDate >=", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateLessThan(String value) {
            addCriterion("CorrectionDate <", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateLessThanOrEqualTo(String value) {
            addCriterion("CorrectionDate <=", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateLike(String value) {
            addCriterion("CorrectionDate like", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateNotLike(String value) {
            addCriterion("CorrectionDate not like", value, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateIn(List<String> values) {
            addCriterion("CorrectionDate in", values, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateNotIn(List<String> values) {
            addCriterion("CorrectionDate not in", values, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateBetween(String value1, String value2) {
            addCriterion("CorrectionDate between", value1, value2, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andCorrectiondateNotBetween(String value1, String value2) {
            addCriterion("CorrectionDate not between", value1, value2, "correctiondate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNull() {
            addCriterion("LeaveDate is null");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNotNull() {
            addCriterion("LeaveDate is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedateEqualTo(String value) {
            addCriterion("LeaveDate =", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotEqualTo(String value) {
            addCriterion("LeaveDate <>", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThan(String value) {
            addCriterion("LeaveDate >", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThanOrEqualTo(String value) {
            addCriterion("LeaveDate >=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThan(String value) {
            addCriterion("LeaveDate <", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThanOrEqualTo(String value) {
            addCriterion("LeaveDate <=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLike(String value) {
            addCriterion("LeaveDate like", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotLike(String value) {
            addCriterion("LeaveDate not like", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIn(List<String> values) {
            addCriterion("LeaveDate in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotIn(List<String> values) {
            addCriterion("LeaveDate not in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateBetween(String value1, String value2) {
            addCriterion("LeaveDate between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotBetween(String value1, String value2) {
            addCriterion("LeaveDate not between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andContimesIsNull() {
            addCriterion("ConTimes is null");
            return (Criteria) this;
        }

        public Criteria andContimesIsNotNull() {
            addCriterion("ConTimes is not null");
            return (Criteria) this;
        }

        public Criteria andContimesEqualTo(Integer value) {
            addCriterion("ConTimes =", value, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesNotEqualTo(Integer value) {
            addCriterion("ConTimes <>", value, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesGreaterThan(Integer value) {
            addCriterion("ConTimes >", value, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConTimes >=", value, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesLessThan(Integer value) {
            addCriterion("ConTimes <", value, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesLessThanOrEqualTo(Integer value) {
            addCriterion("ConTimes <=", value, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesIn(List<Integer> values) {
            addCriterion("ConTimes in", values, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesNotIn(List<Integer> values) {
            addCriterion("ConTimes not in", values, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesBetween(Integer value1, Integer value2) {
            addCriterion("ConTimes between", value1, value2, "contimes");
            return (Criteria) this;
        }

        public Criteria andContimesNotBetween(Integer value1, Integer value2) {
            addCriterion("ConTimes not between", value1, value2, "contimes");
            return (Criteria) this;
        }

        public Criteria andConstartdateIsNull() {
            addCriterion("ConStartDate is null");
            return (Criteria) this;
        }

        public Criteria andConstartdateIsNotNull() {
            addCriterion("ConStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andConstartdateEqualTo(String value) {
            addCriterion("ConStartDate =", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateNotEqualTo(String value) {
            addCriterion("ConStartDate <>", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateGreaterThan(String value) {
            addCriterion("ConStartDate >", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateGreaterThanOrEqualTo(String value) {
            addCriterion("ConStartDate >=", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateLessThan(String value) {
            addCriterion("ConStartDate <", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateLessThanOrEqualTo(String value) {
            addCriterion("ConStartDate <=", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateLike(String value) {
            addCriterion("ConStartDate like", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateNotLike(String value) {
            addCriterion("ConStartDate not like", value, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateIn(List<String> values) {
            addCriterion("ConStartDate in", values, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateNotIn(List<String> values) {
            addCriterion("ConStartDate not in", values, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateBetween(String value1, String value2) {
            addCriterion("ConStartDate between", value1, value2, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConstartdateNotBetween(String value1, String value2) {
            addCriterion("ConStartDate not between", value1, value2, "constartdate");
            return (Criteria) this;
        }

        public Criteria andConenddateIsNull() {
            addCriterion("ConEndDate is null");
            return (Criteria) this;
        }

        public Criteria andConenddateIsNotNull() {
            addCriterion("ConEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andConenddateEqualTo(String value) {
            addCriterion("ConEndDate =", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateNotEqualTo(String value) {
            addCriterion("ConEndDate <>", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateGreaterThan(String value) {
            addCriterion("ConEndDate >", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateGreaterThanOrEqualTo(String value) {
            addCriterion("ConEndDate >=", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateLessThan(String value) {
            addCriterion("ConEndDate <", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateLessThanOrEqualTo(String value) {
            addCriterion("ConEndDate <=", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateLike(String value) {
            addCriterion("ConEndDate like", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateNotLike(String value) {
            addCriterion("ConEndDate not like", value, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateIn(List<String> values) {
            addCriterion("ConEndDate in", values, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateNotIn(List<String> values) {
            addCriterion("ConEndDate not in", values, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateBetween(String value1, String value2) {
            addCriterion("ConEndDate between", value1, value2, "conenddate");
            return (Criteria) this;
        }

        public Criteria andConenddateNotBetween(String value1, String value2) {
            addCriterion("ConEndDate not between", value1, value2, "conenddate");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("IDCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("IDCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("IDCardNo =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("IDCardNo <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("IDCardNo >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("IDCardNo >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("IDCardNo <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("IDCardNo <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("IDCardNo like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("IDCardNo not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("IDCardNo in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("IDCardNo not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("IDCardNo between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("IDCardNo not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdexpdateIsNull() {
            addCriterion("IDEXPDate is null");
            return (Criteria) this;
        }

        public Criteria andIdexpdateIsNotNull() {
            addCriterion("IDEXPDate is not null");
            return (Criteria) this;
        }

        public Criteria andIdexpdateEqualTo(String value) {
            addCriterion("IDEXPDate =", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateNotEqualTo(String value) {
            addCriterion("IDEXPDate <>", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateGreaterThan(String value) {
            addCriterion("IDEXPDate >", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateGreaterThanOrEqualTo(String value) {
            addCriterion("IDEXPDate >=", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateLessThan(String value) {
            addCriterion("IDEXPDate <", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateLessThanOrEqualTo(String value) {
            addCriterion("IDEXPDate <=", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateLike(String value) {
            addCriterion("IDEXPDate like", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateNotLike(String value) {
            addCriterion("IDEXPDate not like", value, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateIn(List<String> values) {
            addCriterion("IDEXPDate in", values, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateNotIn(List<String> values) {
            addCriterion("IDEXPDate not in", values, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateBetween(String value1, String value2) {
            addCriterion("IDEXPDate between", value1, value2, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andIdexpdateNotBetween(String value1, String value2) {
            addCriterion("IDEXPDate not between", value1, value2, "idexpdate");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("Telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("Telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("Telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("Telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("Telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("Telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("Telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("Telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("Telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("Telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("Telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmecontactsIsNull() {
            addCriterion("EmeContacts is null");
            return (Criteria) this;
        }

        public Criteria andEmecontactsIsNotNull() {
            addCriterion("EmeContacts is not null");
            return (Criteria) this;
        }

        public Criteria andEmecontactsEqualTo(String value) {
            addCriterion("EmeContacts =", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsNotEqualTo(String value) {
            addCriterion("EmeContacts <>", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsGreaterThan(String value) {
            addCriterion("EmeContacts >", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsGreaterThanOrEqualTo(String value) {
            addCriterion("EmeContacts >=", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsLessThan(String value) {
            addCriterion("EmeContacts <", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsLessThanOrEqualTo(String value) {
            addCriterion("EmeContacts <=", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsLike(String value) {
            addCriterion("EmeContacts like", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsNotLike(String value) {
            addCriterion("EmeContacts not like", value, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsIn(List<String> values) {
            addCriterion("EmeContacts in", values, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsNotIn(List<String> values) {
            addCriterion("EmeContacts not in", values, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsBetween(String value1, String value2) {
            addCriterion("EmeContacts between", value1, value2, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmecontactsNotBetween(String value1, String value2) {
            addCriterion("EmeContacts not between", value1, value2, "emecontacts");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneIsNull() {
            addCriterion("EmeTelephone is null");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneIsNotNull() {
            addCriterion("EmeTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneEqualTo(String value) {
            addCriterion("EmeTelephone =", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneNotEqualTo(String value) {
            addCriterion("EmeTelephone <>", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneGreaterThan(String value) {
            addCriterion("EmeTelephone >", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("EmeTelephone >=", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneLessThan(String value) {
            addCriterion("EmeTelephone <", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneLessThanOrEqualTo(String value) {
            addCriterion("EmeTelephone <=", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneLike(String value) {
            addCriterion("EmeTelephone like", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneNotLike(String value) {
            addCriterion("EmeTelephone not like", value, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneIn(List<String> values) {
            addCriterion("EmeTelephone in", values, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneNotIn(List<String> values) {
            addCriterion("EmeTelephone not in", values, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneBetween(String value1, String value2) {
            addCriterion("EmeTelephone between", value1, value2, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andEmetelephoneNotBetween(String value1, String value2) {
            addCriterion("EmeTelephone not between", value1, value2, "emetelephone");
            return (Criteria) this;
        }

        public Criteria andSocstartdateIsNull() {
            addCriterion("SocStartDate is null");
            return (Criteria) this;
        }

        public Criteria andSocstartdateIsNotNull() {
            addCriterion("SocStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andSocstartdateEqualTo(Date value) {
            addCriterion("SocStartDate =", value, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateNotEqualTo(Date value) {
            addCriterion("SocStartDate <>", value, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateGreaterThan(Date value) {
            addCriterion("SocStartDate >", value, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SocStartDate >=", value, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateLessThan(Date value) {
            addCriterion("SocStartDate <", value, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateLessThanOrEqualTo(Date value) {
            addCriterion("SocStartDate <=", value, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateIn(List<Date> values) {
            addCriterion("SocStartDate in", values, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateNotIn(List<Date> values) {
            addCriterion("SocStartDate not in", values, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateBetween(Date value1, Date value2) {
            addCriterion("SocStartDate between", value1, value2, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocstartdateNotBetween(Date value1, Date value2) {
            addCriterion("SocStartDate not between", value1, value2, "socstartdate");
            return (Criteria) this;
        }

        public Criteria andSocenddateIsNull() {
            addCriterion("SocEndDate is null");
            return (Criteria) this;
        }

        public Criteria andSocenddateIsNotNull() {
            addCriterion("SocEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andSocenddateEqualTo(Date value) {
            addCriterion("SocEndDate =", value, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateNotEqualTo(Date value) {
            addCriterion("SocEndDate <>", value, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateGreaterThan(Date value) {
            addCriterion("SocEndDate >", value, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("SocEndDate >=", value, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateLessThan(Date value) {
            addCriterion("SocEndDate <", value, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateLessThanOrEqualTo(Date value) {
            addCriterion("SocEndDate <=", value, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateIn(List<Date> values) {
            addCriterion("SocEndDate in", values, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateNotIn(List<Date> values) {
            addCriterion("SocEndDate not in", values, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateBetween(Date value1, Date value2) {
            addCriterion("SocEndDate between", value1, value2, "socenddate");
            return (Criteria) this;
        }

        public Criteria andSocenddateNotBetween(Date value1, Date value2) {
            addCriterion("SocEndDate not between", value1, value2, "socenddate");
            return (Criteria) this;
        }

        public Criteria andComstartdateIsNull() {
            addCriterion("ComStartDate is null");
            return (Criteria) this;
        }

        public Criteria andComstartdateIsNotNull() {
            addCriterion("ComStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andComstartdateEqualTo(Date value) {
            addCriterion("ComStartDate =", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateNotEqualTo(Date value) {
            addCriterion("ComStartDate <>", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateGreaterThan(Date value) {
            addCriterion("ComStartDate >", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ComStartDate >=", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateLessThan(Date value) {
            addCriterion("ComStartDate <", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateLessThanOrEqualTo(Date value) {
            addCriterion("ComStartDate <=", value, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateIn(List<Date> values) {
            addCriterion("ComStartDate in", values, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateNotIn(List<Date> values) {
            addCriterion("ComStartDate not in", values, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateBetween(Date value1, Date value2) {
            addCriterion("ComStartDate between", value1, value2, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComstartdateNotBetween(Date value1, Date value2) {
            addCriterion("ComStartDate not between", value1, value2, "comstartdate");
            return (Criteria) this;
        }

        public Criteria andComenddateIsNull() {
            addCriterion("ComEndDate is null");
            return (Criteria) this;
        }

        public Criteria andComenddateIsNotNull() {
            addCriterion("ComEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andComenddateEqualTo(Date value) {
            addCriterion("ComEndDate =", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateNotEqualTo(Date value) {
            addCriterion("ComEndDate <>", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateGreaterThan(Date value) {
            addCriterion("ComEndDate >", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ComEndDate >=", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateLessThan(Date value) {
            addCriterion("ComEndDate <", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateLessThanOrEqualTo(Date value) {
            addCriterion("ComEndDate <=", value, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateIn(List<Date> values) {
            addCriterion("ComEndDate in", values, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateNotIn(List<Date> values) {
            addCriterion("ComEndDate not in", values, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateBetween(Date value1, Date value2) {
            addCriterion("ComEndDate between", value1, value2, "comenddate");
            return (Criteria) this;
        }

        public Criteria andComenddateNotBetween(Date value1, Date value2) {
            addCriterion("ComEndDate not between", value1, value2, "comenddate");
            return (Criteria) this;
        }

        public Criteria andLeavereasonIsNull() {
            addCriterion("LeaveReason is null");
            return (Criteria) this;
        }

        public Criteria andLeavereasonIsNotNull() {
            addCriterion("LeaveReason is not null");
            return (Criteria) this;
        }

        public Criteria andLeavereasonEqualTo(String value) {
            addCriterion("LeaveReason =", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotEqualTo(String value) {
            addCriterion("LeaveReason <>", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonGreaterThan(String value) {
            addCriterion("LeaveReason >", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonGreaterThanOrEqualTo(String value) {
            addCriterion("LeaveReason >=", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonLessThan(String value) {
            addCriterion("LeaveReason <", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonLessThanOrEqualTo(String value) {
            addCriterion("LeaveReason <=", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonLike(String value) {
            addCriterion("LeaveReason like", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotLike(String value) {
            addCriterion("LeaveReason not like", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonIn(List<String> values) {
            addCriterion("LeaveReason in", values, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotIn(List<String> values) {
            addCriterion("LeaveReason not in", values, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonBetween(String value1, String value2) {
            addCriterion("LeaveReason between", value1, value2, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotBetween(String value1, String value2) {
            addCriterion("LeaveReason not between", value1, value2, "leavereason");
            return (Criteria) this;
        }

        public Criteria andIntroducerIsNull() {
            addCriterion("Introducer is null");
            return (Criteria) this;
        }

        public Criteria andIntroducerIsNotNull() {
            addCriterion("Introducer is not null");
            return (Criteria) this;
        }

        public Criteria andIntroducerEqualTo(String value) {
            addCriterion("Introducer =", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotEqualTo(String value) {
            addCriterion("Introducer <>", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerGreaterThan(String value) {
            addCriterion("Introducer >", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerGreaterThanOrEqualTo(String value) {
            addCriterion("Introducer >=", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerLessThan(String value) {
            addCriterion("Introducer <", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerLessThanOrEqualTo(String value) {
            addCriterion("Introducer <=", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerLike(String value) {
            addCriterion("Introducer like", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotLike(String value) {
            addCriterion("Introducer not like", value, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerIn(List<String> values) {
            addCriterion("Introducer in", values, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotIn(List<String> values) {
            addCriterion("Introducer not in", values, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerBetween(String value1, String value2) {
            addCriterion("Introducer between", value1, value2, "introducer");
            return (Criteria) this;
        }

        public Criteria andIntroducerNotBetween(String value1, String value2) {
            addCriterion("Introducer not between", value1, value2, "introducer");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIsNull() {
            addCriterion("LeaveType is null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIsNotNull() {
            addCriterion("LeaveType is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeEqualTo(String value) {
            addCriterion("LeaveType =", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotEqualTo(String value) {
            addCriterion("LeaveType <>", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeGreaterThan(String value) {
            addCriterion("LeaveType >", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeGreaterThanOrEqualTo(String value) {
            addCriterion("LeaveType >=", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLessThan(String value) {
            addCriterion("LeaveType <", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLessThanOrEqualTo(String value) {
            addCriterion("LeaveType <=", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLike(String value) {
            addCriterion("LeaveType like", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotLike(String value) {
            addCriterion("LeaveType not like", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIn(List<String> values) {
            addCriterion("LeaveType in", values, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotIn(List<String> values) {
            addCriterion("LeaveType not in", values, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeBetween(String value1, String value2) {
            addCriterion("LeaveType between", value1, value2, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotBetween(String value1, String value2) {
            addCriterion("LeaveType not between", value1, value2, "leavetype");
            return (Criteria) this;
        }

        public Criteria andCmemoIsNull() {
            addCriterion("cMemo is null");
            return (Criteria) this;
        }

        public Criteria andCmemoIsNotNull() {
            addCriterion("cMemo is not null");
            return (Criteria) this;
        }

        public Criteria andCmemoEqualTo(String value) {
            addCriterion("cMemo =", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoNotEqualTo(String value) {
            addCriterion("cMemo <>", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoGreaterThan(String value) {
            addCriterion("cMemo >", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoGreaterThanOrEqualTo(String value) {
            addCriterion("cMemo >=", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoLessThan(String value) {
            addCriterion("cMemo <", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoLessThanOrEqualTo(String value) {
            addCriterion("cMemo <=", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoLike(String value) {
            addCriterion("cMemo like", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoNotLike(String value) {
            addCriterion("cMemo not like", value, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoIn(List<String> values) {
            addCriterion("cMemo in", values, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoNotIn(List<String> values) {
            addCriterion("cMemo not in", values, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoBetween(String value1, String value2) {
            addCriterion("cMemo between", value1, value2, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCmemoNotBetween(String value1, String value2) {
            addCriterion("cMemo not between", value1, value2, "cmemo");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("Creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("Creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("Creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("Creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("Creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("Creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("Creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("Creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("Creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("Creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("Creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("Creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("Creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("Creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
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