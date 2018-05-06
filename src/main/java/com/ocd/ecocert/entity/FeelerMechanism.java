package com.ocd.ecocert.entity;

import java.util.Date;

public class FeelerMechanism {
    private Integer id;

    private String name;

    private String range;

    private Date period;

    private Float prcie;

    private String registrant;

    private String ramarks;

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

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public Float getPrcie() {
        return prcie;
    }

    public void setPrcie(Float prcie) {
        this.prcie = prcie;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant == null ? null : registrant.trim();
    }

    public String getRamarks() {
        return ramarks;
    }

    public void setRamarks(String ramarks) {
        this.ramarks = ramarks == null ? null : ramarks.trim();
    }
}