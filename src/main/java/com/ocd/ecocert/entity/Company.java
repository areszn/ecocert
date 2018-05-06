package com.ocd.ecocert.entity;

public class Company {
    private Integer id;

    private String name;

    private String testType;

    private String test;

    private Float amountReceivable;

    private Float payAmount;

    private String feelerMechanism;

    private String examiningReport;

    private String developer;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType == null ? null : testType.trim();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }

    public Float getAmountReceivable() {
        return amountReceivable;
    }

    public void setAmountReceivable(Float amountReceivable) {
        this.amountReceivable = amountReceivable;
    }

    public Float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Float payAmount) {
        this.payAmount = payAmount;
    }

    public String getFeelerMechanism() {
        return feelerMechanism;
    }

    public void setFeelerMechanism(String feelerMechanism) {
        this.feelerMechanism = feelerMechanism == null ? null : feelerMechanism.trim();
    }

    public String getExaminingReport() {
        return examiningReport;
    }

    public void setExaminingReport(String examiningReport) {
        this.examiningReport = examiningReport == null ? null : examiningReport.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}