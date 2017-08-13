package com.cqupt.rms.model.basic;

import java.util.ArrayList;
import java.util.List;

public class BackgoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackgoodsExample() {
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

        public Criteria andBackgoodsidIsNull() {
            addCriterion("backGoodsId is null");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidIsNotNull() {
            addCriterion("backGoodsId is not null");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidEqualTo(String value) {
            addCriterion("backGoodsId =", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidNotEqualTo(String value) {
            addCriterion("backGoodsId <>", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidGreaterThan(String value) {
            addCriterion("backGoodsId >", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("backGoodsId >=", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidLessThan(String value) {
            addCriterion("backGoodsId <", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidLessThanOrEqualTo(String value) {
            addCriterion("backGoodsId <=", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidLike(String value) {
            addCriterion("backGoodsId like", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidNotLike(String value) {
            addCriterion("backGoodsId not like", value, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidIn(List<String> values) {
            addCriterion("backGoodsId in", values, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidNotIn(List<String> values) {
            addCriterion("backGoodsId not in", values, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidBetween(String value1, String value2) {
            addCriterion("backGoodsId between", value1, value2, "backgoodsid");
            return (Criteria) this;
        }

        public Criteria andBackgoodsidNotBetween(String value1, String value2) {
            addCriterion("backGoodsId not between", value1, value2, "backgoodsid");
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

        public Criteria andBackempidIsNull() {
            addCriterion("backEmpId is null");
            return (Criteria) this;
        }

        public Criteria andBackempidIsNotNull() {
            addCriterion("backEmpId is not null");
            return (Criteria) this;
        }

        public Criteria andBackempidEqualTo(String value) {
            addCriterion("backEmpId =", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidNotEqualTo(String value) {
            addCriterion("backEmpId <>", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidGreaterThan(String value) {
            addCriterion("backEmpId >", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidGreaterThanOrEqualTo(String value) {
            addCriterion("backEmpId >=", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidLessThan(String value) {
            addCriterion("backEmpId <", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidLessThanOrEqualTo(String value) {
            addCriterion("backEmpId <=", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidLike(String value) {
            addCriterion("backEmpId like", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidNotLike(String value) {
            addCriterion("backEmpId not like", value, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidIn(List<String> values) {
            addCriterion("backEmpId in", values, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidNotIn(List<String> values) {
            addCriterion("backEmpId not in", values, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidBetween(String value1, String value2) {
            addCriterion("backEmpId between", value1, value2, "backempid");
            return (Criteria) this;
        }

        public Criteria andBackempidNotBetween(String value1, String value2) {
            addCriterion("backEmpId not between", value1, value2, "backempid");
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