package com.ocd.ecocert.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("test_type is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("test_type is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(String value) {
            addCriterion("test_type =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(String value) {
            addCriterion("test_type <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(String value) {
            addCriterion("test_type >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("test_type >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(String value) {
            addCriterion("test_type <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(String value) {
            addCriterion("test_type <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLike(String value) {
            addCriterion("test_type like", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotLike(String value) {
            addCriterion("test_type not like", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<String> values) {
            addCriterion("test_type in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<String> values) {
            addCriterion("test_type not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(String value1, String value2) {
            addCriterion("test_type between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(String value1, String value2) {
            addCriterion("test_type not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestIsNull() {
            addCriterion("test is null");
            return (Criteria) this;
        }

        public Criteria andTestIsNotNull() {
            addCriterion("test is not null");
            return (Criteria) this;
        }

        public Criteria andTestEqualTo(String value) {
            addCriterion("test =", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotEqualTo(String value) {
            addCriterion("test <>", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThan(String value) {
            addCriterion("test >", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestGreaterThanOrEqualTo(String value) {
            addCriterion("test >=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThan(String value) {
            addCriterion("test <", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLessThanOrEqualTo(String value) {
            addCriterion("test <=", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestLike(String value) {
            addCriterion("test like", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotLike(String value) {
            addCriterion("test not like", value, "test");
            return (Criteria) this;
        }

        public Criteria andTestIn(List<String> values) {
            addCriterion("test in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotIn(List<String> values) {
            addCriterion("test not in", values, "test");
            return (Criteria) this;
        }

        public Criteria andTestBetween(String value1, String value2) {
            addCriterion("test between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andTestNotBetween(String value1, String value2) {
            addCriterion("test not between", value1, value2, "test");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableIsNull() {
            addCriterion("amount_receivable is null");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableIsNotNull() {
            addCriterion("amount_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableEqualTo(Float value) {
            addCriterion("amount_receivable =", value, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableNotEqualTo(Float value) {
            addCriterion("amount_receivable <>", value, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableGreaterThan(Float value) {
            addCriterion("amount_receivable >", value, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableGreaterThanOrEqualTo(Float value) {
            addCriterion("amount_receivable >=", value, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableLessThan(Float value) {
            addCriterion("amount_receivable <", value, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableLessThanOrEqualTo(Float value) {
            addCriterion("amount_receivable <=", value, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableIn(List<Float> values) {
            addCriterion("amount_receivable in", values, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableNotIn(List<Float> values) {
            addCriterion("amount_receivable not in", values, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableBetween(Float value1, Float value2) {
            addCriterion("amount_receivable between", value1, value2, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andAmountReceivableNotBetween(Float value1, Float value2) {
            addCriterion("amount_receivable not between", value1, value2, "amountReceivable");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Float value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Float value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Float value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Float value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Float value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Float> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Float> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Float value1, Float value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Float value1, Float value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismIsNull() {
            addCriterion("feeler_mechanism is null");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismIsNotNull() {
            addCriterion("feeler_mechanism is not null");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismEqualTo(String value) {
            addCriterion("feeler_mechanism =", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismNotEqualTo(String value) {
            addCriterion("feeler_mechanism <>", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismGreaterThan(String value) {
            addCriterion("feeler_mechanism >", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("feeler_mechanism >=", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismLessThan(String value) {
            addCriterion("feeler_mechanism <", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismLessThanOrEqualTo(String value) {
            addCriterion("feeler_mechanism <=", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismLike(String value) {
            addCriterion("feeler_mechanism like", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismNotLike(String value) {
            addCriterion("feeler_mechanism not like", value, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismIn(List<String> values) {
            addCriterion("feeler_mechanism in", values, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismNotIn(List<String> values) {
            addCriterion("feeler_mechanism not in", values, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismBetween(String value1, String value2) {
            addCriterion("feeler_mechanism between", value1, value2, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andFeelerMechanismNotBetween(String value1, String value2) {
            addCriterion("feeler_mechanism not between", value1, value2, "feelerMechanism");
            return (Criteria) this;
        }

        public Criteria andExaminingReportIsNull() {
            addCriterion("examining_report is null");
            return (Criteria) this;
        }

        public Criteria andExaminingReportIsNotNull() {
            addCriterion("examining_report is not null");
            return (Criteria) this;
        }

        public Criteria andExaminingReportEqualTo(String value) {
            addCriterion("examining_report =", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportNotEqualTo(String value) {
            addCriterion("examining_report <>", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportGreaterThan(String value) {
            addCriterion("examining_report >", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportGreaterThanOrEqualTo(String value) {
            addCriterion("examining_report >=", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportLessThan(String value) {
            addCriterion("examining_report <", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportLessThanOrEqualTo(String value) {
            addCriterion("examining_report <=", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportLike(String value) {
            addCriterion("examining_report like", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportNotLike(String value) {
            addCriterion("examining_report not like", value, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportIn(List<String> values) {
            addCriterion("examining_report in", values, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportNotIn(List<String> values) {
            addCriterion("examining_report not in", values, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportBetween(String value1, String value2) {
            addCriterion("examining_report between", value1, value2, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andExaminingReportNotBetween(String value1, String value2) {
            addCriterion("examining_report not between", value1, value2, "examiningReport");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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