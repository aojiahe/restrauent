package com.cqupt.rms.model.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SuppliesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuppliesExample() {
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

        public Criteria andSuporderidIsNull() {
            addCriterion("supOrderId is null");
            return (Criteria) this;
        }

        public Criteria andSuporderidIsNotNull() {
            addCriterion("supOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andSuporderidEqualTo(String value) {
            addCriterion("supOrderId =", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidNotEqualTo(String value) {
            addCriterion("supOrderId <>", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidGreaterThan(String value) {
            addCriterion("supOrderId >", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidGreaterThanOrEqualTo(String value) {
            addCriterion("supOrderId >=", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidLessThan(String value) {
            addCriterion("supOrderId <", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidLessThanOrEqualTo(String value) {
            addCriterion("supOrderId <=", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidLike(String value) {
            addCriterion("supOrderId like", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidNotLike(String value) {
            addCriterion("supOrderId not like", value, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidIn(List<String> values) {
            addCriterion("supOrderId in", values, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidNotIn(List<String> values) {
            addCriterion("supOrderId not in", values, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidBetween(String value1, String value2) {
            addCriterion("supOrderId between", value1, value2, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSuporderidNotBetween(String value1, String value2) {
            addCriterion("supOrderId not between", value1, value2, "suporderid");
            return (Criteria) this;
        }

        public Criteria andSupordertimeIsNull() {
            addCriterion("supOrderTime is null");
            return (Criteria) this;
        }

        public Criteria andSupordertimeIsNotNull() {
            addCriterion("supOrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andSupordertimeEqualTo(Date value) {
            addCriterionForJDBCDate("supOrderTime =", value, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("supOrderTime <>", value, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("supOrderTime >", value, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supOrderTime >=", value, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeLessThan(Date value) {
            addCriterionForJDBCDate("supOrderTime <", value, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("supOrderTime <=", value, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeIn(List<Date> values) {
            addCriterionForJDBCDate("supOrderTime in", values, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("supOrderTime not in", values, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supOrderTime between", value1, value2, "supordertime");
            return (Criteria) this;
        }

        public Criteria andSupordertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("supOrderTime not between", value1, value2, "supordertime");
            return (Criteria) this;
        }

        public Criteria andDuesIsNull() {
            addCriterion("dues is null");
            return (Criteria) this;
        }

        public Criteria andDuesIsNotNull() {
            addCriterion("dues is not null");
            return (Criteria) this;
        }

        public Criteria andDuesEqualTo(Float value) {
            addCriterion("dues =", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesNotEqualTo(Float value) {
            addCriterion("dues <>", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesGreaterThan(Float value) {
            addCriterion("dues >", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesGreaterThanOrEqualTo(Float value) {
            addCriterion("dues >=", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesLessThan(Float value) {
            addCriterion("dues <", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesLessThanOrEqualTo(Float value) {
            addCriterion("dues <=", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesIn(List<Float> values) {
            addCriterion("dues in", values, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesNotIn(List<Float> values) {
            addCriterion("dues not in", values, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesBetween(Float value1, Float value2) {
            addCriterion("dues between", value1, value2, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesNotBetween(Float value1, Float value2) {
            addCriterion("dues not between", value1, value2, "dues");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidIsNull() {
            addCriterion("alreadyPaid is null");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidIsNotNull() {
            addCriterion("alreadyPaid is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidEqualTo(Float value) {
            addCriterion("alreadyPaid =", value, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidNotEqualTo(Float value) {
            addCriterion("alreadyPaid <>", value, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidGreaterThan(Float value) {
            addCriterion("alreadyPaid >", value, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidGreaterThanOrEqualTo(Float value) {
            addCriterion("alreadyPaid >=", value, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidLessThan(Float value) {
            addCriterion("alreadyPaid <", value, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidLessThanOrEqualTo(Float value) {
            addCriterion("alreadyPaid <=", value, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidIn(List<Float> values) {
            addCriterion("alreadyPaid in", values, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidNotIn(List<Float> values) {
            addCriterion("alreadyPaid not in", values, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidBetween(Float value1, Float value2) {
            addCriterion("alreadyPaid between", value1, value2, "alreadypaid");
            return (Criteria) this;
        }

        public Criteria andAlreadypaidNotBetween(Float value1, Float value2) {
            addCriterion("alreadyPaid not between", value1, value2, "alreadypaid");
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

        public Criteria andSupidIsNull() {
            addCriterion("supId is null");
            return (Criteria) this;
        }

        public Criteria andSupidIsNotNull() {
            addCriterion("supId is not null");
            return (Criteria) this;
        }

        public Criteria andSupidEqualTo(String value) {
            addCriterion("supId =", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidNotEqualTo(String value) {
            addCriterion("supId <>", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidGreaterThan(String value) {
            addCriterion("supId >", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidGreaterThanOrEqualTo(String value) {
            addCriterion("supId >=", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidLessThan(String value) {
            addCriterion("supId <", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidLessThanOrEqualTo(String value) {
            addCriterion("supId <=", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidLike(String value) {
            addCriterion("supId like", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidNotLike(String value) {
            addCriterion("supId not like", value, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidIn(List<String> values) {
            addCriterion("supId in", values, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidNotIn(List<String> values) {
            addCriterion("supId not in", values, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidBetween(String value1, String value2) {
            addCriterion("supId between", value1, value2, "supid");
            return (Criteria) this;
        }

        public Criteria andSupidNotBetween(String value1, String value2) {
            addCriterion("supId not between", value1, value2, "supid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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