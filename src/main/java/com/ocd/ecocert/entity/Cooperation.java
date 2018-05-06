package com.ocd.ecocert.entity;

public class Cooperation {
    private Integer id;

    private String name;

    private String contacts;

    private String phone;

    private Integer domain;

    private Float feiScale;

    private String region;

    private String developerid;

    private String guardianid;

    private Integer status;

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

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getDomain() {
        return domain;
    }

    public void setDomain(Integer domain) {
        this.domain = domain;
    }

    public Float getFeiScale() {
        return feiScale;
    }

    public void setFeiScale(Float feiScale) {
        this.feiScale = feiScale;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getDeveloperid() {
        return developerid;
    }

    public void setDeveloperid(String developerid) {
        this.developerid = developerid == null ? null : developerid.trim();
    }

    public String getGuardianid() {
        return guardianid;
    }

    public void setGuardianid(String guardianid) {
        this.guardianid = guardianid == null ? null : guardianid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}