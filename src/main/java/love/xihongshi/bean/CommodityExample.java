package love.xihongshi.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }



        public Criteria andCintroduceIsNull() {
            addCriterion("cintroduce is null");
            return (Criteria) this;
        }

        public Criteria andCintroduceIsNotNull() {
            addCriterion("cintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andCintroduceEqualTo(String value) {
            addCriterion("cintroduce =", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceNotEqualTo(String value) {
            addCriterion("cintroduce <>", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceGreaterThan(String value) {
            addCriterion("cintroduce >", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("cintroduce >=", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceLessThan(String value) {
            addCriterion("cintroduce <", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCnintroduceLessThanOrEqualTo(String value) {
            addCriterion("cintroduce <=", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceLike(String value) {
            addCriterion("cintroduce like", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceNotLike(String value) {
            addCriterion("cintroduce not like", value, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceIn(List<String> values) {
            addCriterion("cintroduce in", values, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceNotIn(List<String> values) {
            addCriterion("cintroduce not in", values, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceBetween(String value1, String value2) {
            addCriterion("cintroduce between", value1, value2, "cintroduce");
            return (Criteria) this;
        }

        public Criteria andCintroduceNotBetween(String value1, String value2) {
            addCriterion("cintroduce not between", value1, value2, "cintroduce");
            return (Criteria) this;
        }





        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andSalesamountIsNull() {
            addCriterion("salesamount is null");
            return (Criteria) this;
        }

        public Criteria andSalesamountIsNotNull() {
            addCriterion("salesamount is not null");
            return (Criteria) this;
        }

        public Criteria andSalesamountEqualTo(Long value) {
            addCriterion("salesamount =", value, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountNotEqualTo(Long value) {
            addCriterion("salesamount <>", value, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountGreaterThan(Long value) {
            addCriterion("salesamount >", value, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountGreaterThanOrEqualTo(Long value) {
            addCriterion("salesamount >=", value, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountLessThan(Long value) {
            addCriterion("salesamount <", value, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountLessThanOrEqualTo(Long value) {
            addCriterion("salesamount <=", value, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountIn(List<Long> values) {
            addCriterion("salesamount in", values, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountNotIn(List<Long> values) {
            addCriterion("salesamount not in", values, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountBetween(Long value1, Long value2) {
            addCriterion("salesamount between", value1, value2, "salesamount");
            return (Criteria) this;
        }

        public Criteria andSalesamountNotBetween(Long value1, Long value2) {
            addCriterion("salesamount not between", value1, value2, "salesamount");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Long value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Long value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Long value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Long value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Long value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Long value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Long> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Long> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Long value1, Long value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Long value1, Long value2) {
            addCriterion("mid not between", value1, value2, "mid");
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