package com.cqupt.rms.model.basic;

import java.util.ArrayList;
import java.util.List;

public class RestaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RestaurantExample() {
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

        public Criteria andRestaurantidIsNull() {
            addCriterion("restaurantId is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantidIsNotNull() {
            addCriterion("restaurantId is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantidEqualTo(Integer value) {
            addCriterion("restaurantId =", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidNotEqualTo(Integer value) {
            addCriterion("restaurantId <>", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidGreaterThan(Integer value) {
            addCriterion("restaurantId >", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurantId >=", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidLessThan(Integer value) {
            addCriterion("restaurantId <", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidLessThanOrEqualTo(Integer value) {
            addCriterion("restaurantId <=", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidIn(List<Integer> values) {
            addCriterion("restaurantId in", values, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidNotIn(List<Integer> values) {
            addCriterion("restaurantId not in", values, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidBetween(Integer value1, Integer value2) {
            addCriterion("restaurantId between", value1, value2, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurantId not between", value1, value2, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameIsNull() {
            addCriterion("restaurantName is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameIsNotNull() {
            addCriterion("restaurantName is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameEqualTo(String value) {
            addCriterion("restaurantName =", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameNotEqualTo(String value) {
            addCriterion("restaurantName <>", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameGreaterThan(String value) {
            addCriterion("restaurantName >", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameGreaterThanOrEqualTo(String value) {
            addCriterion("restaurantName >=", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameLessThan(String value) {
            addCriterion("restaurantName <", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameLessThanOrEqualTo(String value) {
            addCriterion("restaurantName <=", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameLike(String value) {
            addCriterion("restaurantName like", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameNotLike(String value) {
            addCriterion("restaurantName not like", value, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameIn(List<String> values) {
            addCriterion("restaurantName in", values, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameNotIn(List<String> values) {
            addCriterion("restaurantName not in", values, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameBetween(String value1, String value2) {
            addCriterion("restaurantName between", value1, value2, "restaurantname");
            return (Criteria) this;
        }

        public Criteria andRestaurantnameNotBetween(String value1, String value2) {
            addCriterion("restaurantName not between", value1, value2, "restaurantname");
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