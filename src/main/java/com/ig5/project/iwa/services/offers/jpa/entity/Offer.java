package com.ig5.project.iwa.services.offers.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="offers")
public class Offer {
    @Id
    @Column(name="offerid")
    private int offerid;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="companyid")
    private int companyid;

    @Column(name="createdby")
    private int createdby;

    @Column(name="createdat")
    private Date createdat;

    @Column(name="openat")
    private Date openat;

    @Column(name="closeat")
    private Date closeat;

    public int getOfferid() {
        return offerid;
    }

    public void setOfferid(int offerid) {
        this.offerid = offerid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }

    public Date getOpenat() {
        return openat;
    }

    public void setOpenat(Date openat) {
        this.openat = openat;
    }

    public Date getCloseat() {
        return closeat;
    }

    public void setCloseat(Date closeat) {
        this.closeat = closeat;
    }
}
