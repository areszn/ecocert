package com.ocd.ecocert.entity;

import java.util.Date;

public class Qualification {
    private Integer id;

    private Integer userId;

    private Integer authenticationDomainId;

    private String qualificationName;

    private String qualificationRegistrationMark;

    private Date beginTime;

    private Date endTime;

    private String status;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAuthenticationDomainId() {
        return authenticationDomainId;
    }

    public void setAuthenticationDomainId(Integer authenticationDomainId) {
        this.authenticationDomainId = authenticationDomainId;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName == null ? null : qualificationName.trim();
    }

    public String getQualificationRegistrationMark() {
        return qualificationRegistrationMark;
    }

    public void setQualificationRegistrationMark(String qualificationRegistrationMark) {
        this.qualificationRegistrationMark = qualificationRegistrationMark == null ? null : qualificationRegistrationMark.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}