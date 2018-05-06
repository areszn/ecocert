package com.ocd.ecocert.entity;

public class ExaminingReport {
    private Integer id;

    private String company;

    private String test;

    private String examiningReport;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }

    public String getExaminingReport() {
        return examiningReport;
    }

    public void setExaminingReport(String examiningReport) {
        this.examiningReport = examiningReport == null ? null : examiningReport.trim();
    }
}