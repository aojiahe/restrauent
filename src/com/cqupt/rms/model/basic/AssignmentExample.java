package com.cqupt.rms.model.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssignmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssignmentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAssidIsNull() {
            addCriterion("assId is null");
            return (Criteria) this;
        }

        public Criteria andAssidIsNotNull() {
            addCriterion("assId is not null");
            return (Criteria) this;
        }

        public Criteria andAssidEqualTo(String value) {
            addCriterion("assId =", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidNotEqualTo(String value) {
            addCriterion("assId <>", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidGreaterThan(String value) {
            addCriterion("assId >", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidGreaterThanOrEqualTo(String value) {
            addCriterion("assId >=", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidLessThan(String value) {
            addCriterion("assId <", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidLessThanOrEqualTo(String value) {
            addCriterion("assId <=", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidLike(String value) {
            addCriterion("assId like", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidNotLike(String value) {
            addCriterion("assId not like", value, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidIn(List<String> values) {
            addCriterion("assId in", values, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidNotIn(List<String> values) {
            addCriterion("assId not in", values, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidBetween(String value1, String value2) {
            addCriterion("assId between", value1, value2, "assid");
            return (Criteria) this;
        }

        public Criteria andAssidNotBetween(String value1, String value2) {
            addCriterion("assId not between", value1, value2, "assid");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("empId is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empId is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("empId =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("empId <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("empId >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("empId >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("empId <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("empId <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("empId like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("empId not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("empId in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("empId not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("empId between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("empId not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("deptId like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("deptId not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeIsNull() {
            addCriterion("assignmentTime is null");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeIsNotNull() {
            addCriterion("assignmentTime is not null");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeEqualTo(Date value) {
            addCriterionForJDBCDate("assignmentTime =", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("assignmentTime <>", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("assignmentTime >", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("assignmentTime >=", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeLessThan(Date value) {
            addCriterionForJDBCDate("assignmentTime <", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("assignmentTime <=", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeIn(List<Date> values) {
            addCriterionForJDBCDate("assignmentTime in", values, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("assignmentTime not in", values, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("assignmentTime between", value1, value2, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("assignmentTime not between", value1, value2, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andOperateempidIsNull() {
            addCriterion("operateEmpId is null");
            return (Criteria) this;
        }

        public Criteria andOperateempidIsNotNull() {
            addCriterion("operateEmpId is not null");
            return (Criteria) this;
        }

        public Criteria andOperateempidEqualTo(String value) {
            addCriterion("operateEmpId =", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidNotEqualTo(String value) {
            addCriterion("operateEmpId <>", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidGreaterThan(String value) {
            addCriterion("operateEmpId >", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidGreaterThanOrEqualTo(String value) {
            addCriterion("operateEmpId >=", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidLessThan(String value) {
            addCriterion("operateEmpId <", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidLessThanOrEqualTo(String value) {
            addCriterion("operateEmpId <=", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidLike(String value) {
            addCriterion("operateEmpId like", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidNotLike(String value) {
            addCriterion("operateEmpId not like", value, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidIn(List<String> values) {
            addCriterion("operateEmpId in", values, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidNotIn(List<String> values) {
            addCriterion("operateEmpId not in", values, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidBetween(String value1, String value2) {
            addCriterion("operateEmpId between", value1, value2, "operateempid");
            return (Criteria) this;
        }

        public Criteria andOperateempidNotBetween(String value1, String value2) {
            addCriterion("operateEmpId not between", value1, value2, "operateempid");
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