package love.xihongshi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DemandExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Long value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Long value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Long value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Long value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Long value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Long value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Long> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Long> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Long value1, Long value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Long value1, Long value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

//        *********************************************************************

        public Criteria andReleasedateIsNull() {
            addCriterion("releasedate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releasedate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(Date value) {
            addCriterion("releasedate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(Date value) {
            addCriterion("releasedate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(Date value) {
            addCriterion("releasedate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(Date value) {
            addCriterion("releasedate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(Date value) {
            addCriterion("releasedate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(Date value) {
            addCriterion("releasedate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<Date> values) {
            addCriterion("releasedate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<Date> values) {
            addCriterion("releasedate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(Date value1, Date value2) {
            addCriterion("releasedate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(Date value1, Date value2) {
            addCriterion("releasedate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

//        *********************************************************************

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

//        *********************************************************************

        public Criteria andDstatusIsNull() {
            addCriterion("dstatus is null");
            return (Criteria) this;
        }

        public Criteria andDstatusIsNotNull() {
            addCriterion("dstatus is not null");
            return (Criteria) this;
        }

        public Criteria andDstatusEqualTo(String value) {
            addCriterion("dstatus =", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotEqualTo(String value) {
            addCriterion("dstatus <>", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThan(String value) {
            addCriterion("dstatus >", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusGreaterThanOrEqualTo(String value) {
            addCriterion("dstatus >=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThan(String value) {
            addCriterion("dstatus <", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLessThanOrEqualTo(String value) {
            addCriterion("dstatus <=", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusLike(String value) {
            addCriterion("dstatus like", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotLike(String value) {
            addCriterion("dstatus not like", value, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusIn(List<String> values) {
            addCriterion("dstatus in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotIn(List<String> values) {
            addCriterion("dstatus not in", values, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusBetween(String value1, String value2) {
            addCriterion("dstatus between", value1, value2, "dstatus");
            return (Criteria) this;
        }

        public Criteria andDstatusNotBetween(String value1, String value2) {
            addCriterion("dstatus not between", value1, value2, "dstatus");
            return (Criteria) this;
        }

//        *********************************************************************

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

//        *********************************************************************

        public Criteria andPhonenumIsNull() {
            addCriterion("phonenum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phonenum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(Integer value) {
            addCriterion("phonenum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(Integer value) {
            addCriterion("phonenum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(Integer value) {
            addCriterion("phonenum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("phonenum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(Integer value) {
            addCriterion("phonenum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(Integer value) {
            addCriterion("phonenum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<Integer> values) {
            addCriterion("phonenum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<Integer> values) {
            addCriterion("phonenum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(Integer value1, Integer value2) {
            addCriterion("phonenum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(Integer value1, Integer value2) {
            addCriterion("phonenum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

//        *********************************************************************

        public Criteria andShortCutIsNull() {
            addCriterion("shortcut is null");
            return (Criteria) this;
        }

        public Criteria andShortCutIsNotNull() {
            addCriterion("shortcut is not null");
            return (Criteria) this;
        }

        public Criteria andShortCutEqualTo(String value) {
            addCriterion("shortcut =", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutNotEqualTo(String value) {
            addCriterion("shortcut <>", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutGreaterThan(String value) {
            addCriterion("shortcut >", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutGreaterThanOrEqualTo(String value) {
            addCriterion("shortcut >=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutLessThan(String value) {
            addCriterion("shortcut <", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutLessThanOrEqualTo(String value) {
            addCriterion("shortcut <=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutLike(String value) {
            addCriterion("shortcut like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutNotLike(String value) {
            addCriterion("shortcut not like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutIn(List<String> values) {
            addCriterion("shortcut in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutNotIn(List<String> values) {
            addCriterion("shortcut not in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutBetween(String value1, String value2) {
            addCriterion("shortcut between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andShortCutNotBetween(String value1, String value2) {
            addCriterion("shortcut not between", value1, value2, "l1");
            return (Criteria) this;
        }

//        *********************************************************************

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "l1");
            return (Criteria) this;
        }

//        *********************************************************************

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "l1");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "l1");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "l1");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "l1");
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