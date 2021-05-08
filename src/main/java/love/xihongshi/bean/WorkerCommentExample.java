package love.xihongshi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkerCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkerCommentExample() {
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

        public Criteria andWcidIsNull() {
            addCriterion("wcid is null");
            return (Criteria) this;
        }

        public Criteria andWcidIsNotNull() {
            addCriterion("wcid is not null");
            return (Criteria) this;
        }

        public Criteria andWcidEqualTo(Long value) {
            addCriterion("wcid =", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidNotEqualTo(Long value) {
            addCriterion("wcid <>", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidGreaterThan(Long value) {
            addCriterion("wcid >", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidGreaterThanOrEqualTo(Long value) {
            addCriterion("wcid >=", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidLessThan(Long value) {
            addCriterion("wcid <", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidLessThanOrEqualTo(Long value) {
            addCriterion("wcid <=", value, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidIn(List<Long> values) {
            addCriterion("wcid in", values, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidNotIn(List<Long> values) {
            addCriterion("wcid not in", values, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidBetween(Long value1, Long value2) {
            addCriterion("wcid between", value1, value2, "wcid");
            return (Criteria) this;
        }

        public Criteria andWcidNotBetween(Long value1, Long value2) {
            addCriterion("wcid not between", value1, value2, "wcid");
            return (Criteria) this;
        }

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Long value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Long value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Long value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Long value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Long value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Long value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Long> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Long> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Long value1, Long value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Long value1, Long value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("releaseDate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(Date value) {
            addCriterion("releaseDate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(Date value) {
            addCriterion("releaseDate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(Date value) {
            addCriterion("releaseDate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(Date value) {
            addCriterion("releaseDate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(Date value) {
            addCriterion("releaseDate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(Date value) {
            addCriterion("releaseDate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<Date> values) {
            addCriterion("releaseDate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<Date> values) {
            addCriterion("releaseDate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(Date value1, Date value2) {
            addCriterion("releaseDate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(Date value1, Date value2) {
            addCriterion("releaseDate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andL1IsNull() {
            addCriterion("l1 is null");
            return (Criteria) this;
        }

        public Criteria andL1IsNotNull() {
            addCriterion("l1 is not null");
            return (Criteria) this;
        }

        public Criteria andL1EqualTo(String value) {
            addCriterion("l1 =", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotEqualTo(String value) {
            addCriterion("l1 <>", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1GreaterThan(String value) {
            addCriterion("l1 >", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1GreaterThanOrEqualTo(String value) {
            addCriterion("l1 >=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1LessThan(String value) {
            addCriterion("l1 <", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1LessThanOrEqualTo(String value) {
            addCriterion("l1 <=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1Like(String value) {
            addCriterion("l1 like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotLike(String value) {
            addCriterion("l1 not like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andL1In(List<String> values) {
            addCriterion("l1 in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotIn(List<String> values) {
            addCriterion("l1 not in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andL1Between(String value1, String value2) {
            addCriterion("l1 between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andL1NotBetween(String value1, String value2) {
            addCriterion("l1 not between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andL2IsNull() {
            addCriterion("l2 is null");
            return (Criteria) this;
        }

        public Criteria andL2IsNotNull() {
            addCriterion("l2 is not null");
            return (Criteria) this;
        }

        public Criteria andL2EqualTo(String value) {
            addCriterion("l2 =", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotEqualTo(String value) {
            addCriterion("l2 <>", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2GreaterThan(String value) {
            addCriterion("l2 >", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2GreaterThanOrEqualTo(String value) {
            addCriterion("l2 >=", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2LessThan(String value) {
            addCriterion("l2 <", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2LessThanOrEqualTo(String value) {
            addCriterion("l2 <=", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2Like(String value) {
            addCriterion("l2 like", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotLike(String value) {
            addCriterion("l2 not like", value, "l2");
            return (Criteria) this;
        }

        public Criteria andL2In(List<String> values) {
            addCriterion("l2 in", values, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotIn(List<String> values) {
            addCriterion("l2 not in", values, "l2");
            return (Criteria) this;
        }

        public Criteria andL2Between(String value1, String value2) {
            addCriterion("l2 between", value1, value2, "l2");
            return (Criteria) this;
        }

        public Criteria andL2NotBetween(String value1, String value2) {
            addCriterion("l2 not between", value1, value2, "l2");
            return (Criteria) this;
        }

        public Criteria andL3IsNull() {
            addCriterion("l3 is null");
            return (Criteria) this;
        }

        public Criteria andL3IsNotNull() {
            addCriterion("l3 is not null");
            return (Criteria) this;
        }

        public Criteria andL3EqualTo(String value) {
            addCriterion("l3 =", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotEqualTo(String value) {
            addCriterion("l3 <>", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3GreaterThan(String value) {
            addCriterion("l3 >", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3GreaterThanOrEqualTo(String value) {
            addCriterion("l3 >=", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3LessThan(String value) {
            addCriterion("l3 <", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3LessThanOrEqualTo(String value) {
            addCriterion("l3 <=", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3Like(String value) {
            addCriterion("l3 like", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotLike(String value) {
            addCriterion("l3 not like", value, "l3");
            return (Criteria) this;
        }

        public Criteria andL3In(List<String> values) {
            addCriterion("l3 in", values, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotIn(List<String> values) {
            addCriterion("l3 not in", values, "l3");
            return (Criteria) this;
        }

        public Criteria andL3Between(String value1, String value2) {
            addCriterion("l3 between", value1, value2, "l3");
            return (Criteria) this;
        }

        public Criteria andL3NotBetween(String value1, String value2) {
            addCriterion("l3 not between", value1, value2, "l3");
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