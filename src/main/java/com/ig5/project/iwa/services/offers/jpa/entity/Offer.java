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
    private int createby;

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
}
