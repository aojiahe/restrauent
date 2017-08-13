package com.cqupt.rms.model.basic;

import java.util.ArrayList;
import java.util.List;

public class PackagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackagesExample() {
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

        public Criteria andPackageidIsNull() {
            addCriterion("packageId is null");
            return (Criteria) this;
        }

        public Criteria andPackageidIsNotNull() {
            addCriterion("packageId is not null");
            return (Criteria) this;
        }

        public Criteria andPackageidEqualTo(Integer value) {
            addCriterion("packageId =", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotEqualTo(Integer value) {
            addCriterion("packageId <>", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThan(Integer value) {
            addCriterion("packageId >", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("packageId >=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThan(Integer value) {
            addCriterion("packageId <", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThanOrEqualTo(Integer value) {
            addCriterion("packageId <=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidIn(List<Integer> values) {
            addCriterion("packageId in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotIn(List<Integer> values) {
            addCriterion("packageId not in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidBetween(Integer value1, Integer value2) {
            addCriterion("packageId between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotBetween(Integer value1, Integer value2) {
            addCriterion("packageId not between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNull() {
            addCriterion("packageName is null");
            return (Criteria) this;
        }

        public Criteria andPackagenameIsNotNull() {
            addCriterion("packageName is not null");
            return (Criteria) this;
        }

        public Criteria andPackagenameEqualTo(String value) {
            addCriterion("packageName =", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotEqualTo(String value) {
            addCriterion("packageName <>", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThan(String value) {
            addCriterion("packageName >", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameGreaterThanOrEqualTo(String value) {
            addCriterion("packageName >=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThan(String value) {
            addCriterion("packageName <", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLessThanOrEqualTo(String value) {
            addCriterion("packageName <=", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameLike(String value) {
            addCriterion("packageName like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotLike(String value) {
            addCriterion("packageName not like", value, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameIn(List<String> values) {
            addCriterion("packageName in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotIn(List<String> values) {
            addCriterion("packageName not in", values, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameBetween(String value1, String value2) {
            addCriterion("packageName between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagenameNotBetween(String value1, String value2) {
            addCriterion("packageName not between", value1, value2, "packagename");
            return (Criteria) this;
        }

        public Criteria andPackagepriceIsNull() {
            addCriterion("packagePrice is null");
            return (Criteria) this;
        }

        public Criteria andPackagepriceIsNotNull() {
            addCriterion("packagePrice is not null");
            return (Criteria) this;
        }

        public Criteria andPackagepriceEqualTo(Float value) {
            addCriterion("packagePrice =", value, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceNotEqualTo(Float value) {
            addCriterion("packagePrice <>", value, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceGreaterThan(Float value) {
            addCriterion("packagePrice >", value, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("packagePrice >=", value, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceLessThan(Float value) {
            addCriterion("packagePrice <", value, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceLessThanOrEqualTo(Float value) {
            addCriterion("packagePrice <=", value, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceIn(List<Float> values) {
            addCriterion("packagePrice in", values, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceNotIn(List<Float> values) {
            addCriterion("packagePrice not in", values, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceBetween(Float value1, Float value2) {
            addCriterion("packagePrice between", value1, value2, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagepriceNotBetween(Float value1, Float value2) {
            addCriterion("packagePrice not between", value1, value2, "packageprice");
            return (Criteria) this;
        }

        public Criteria andPackagediscountIsNull() {
            addCriterion("packageDiscount is null");
            return (Criteria) this;
        }

        public Criteria andPackagediscountIsNotNull() {
            addCriterion("packageDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andPackagediscountEqualTo(Float value) {
            addCriterion("packageDiscount =", value, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountNotEqualTo(Float value) {
            addCriterion("packageDiscount <>", value, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountGreaterThan(Float value) {
            addCriterion("packageDiscount >", value, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountGreaterThanOrEqualTo(Float value) {
            addCriterion("packageDiscount >=", value, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountLessThan(Float value) {
            addCriterion("packageDiscount <", value, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountLessThanOrEqualTo(Float value) {
            addCriterion("packageDiscount <=", value, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountIn(List<Float> values) {
            addCriterion("packageDiscount in", values, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountNotIn(List<Float> values) {
            addCriterion("packageDiscount not in", values, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountBetween(Float value1, Float value2) {
            addCriterion("packageDiscount between", value1, value2, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackagediscountNotBetween(Float value1, Float value2) {
            addCriterion("packageDiscount not between", value1, value2, "packagediscount");
            return (Criteria) this;
        }

        public Criteria andPackageunitIsNull() {
            addCriterion("packageUnit is null");
            return (Criteria) this;
        }

        public Criteria andPackageunitIsNotNull() {
            addCriterion("packageUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPackageunitEqualTo(Integer value) {
            addCriterion("packageUnit =", value, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitNotEqualTo(Integer value) {
            addCriterion("packageUnit <>", value, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitGreaterThan(Integer value) {
            addCriterion("packageUnit >", value, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("packageUnit >=", value, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitLessThan(Integer value) {
            addCriterion("packageUnit <", value, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitLessThanOrEqualTo(Integer value) {
            addCriterion("packageUnit <=", value, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitIn(List<Integer> values) {
            addCriterion("packageUnit in", values, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitNotIn(List<Integer> values) {
            addCriterion("packageUnit not in", values, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitBetween(Integer value1, Integer value2) {
            addCriterion("packageUnit between", value1, value2, "packageunit");
            return (Criteria) this;
        }

        public Criteria andPackageunitNotBetween(Integer value1, Integer value2) {
            addCriterion("packageUnit not between", value1, value2, "packageunit");
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