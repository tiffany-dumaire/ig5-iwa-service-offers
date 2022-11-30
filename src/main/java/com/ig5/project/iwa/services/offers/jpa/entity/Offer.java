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
    @Column(name="offer_id")
    private int offer_id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="company_id")
    private int company_id;

    @Column(name="created_by")
    private int created_by;

    @Column(name="created_at")
    private Date created_at;

    @Column(name="open_at")
    private Date open_at;

    @Column(name="closed_at")
    private Date closed_at;

    /**
     * Offer_id getter
     * @return offer_id : int
     */
    public int getOffer_id() {
        return this.offer_id;
    }

    /**
     * Offer_id setter
     * @param offer_id : int
     */
    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public int getCompany_id() {
        return company_id;
    }

    /**
     *
     * @param company_id
     */
    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    /**
     *
     * @return
     */
    public int getCreated_by() {
        return created_by;
    }

    /**
     *
     * @param created_by
     */
    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    /**
     *
     * @return
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     *
     * @param created_at
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     *
     * @return
     */
    public Date getOpen_at() {
        return open_at;
    }

    /**
     *
     * @param open_at
     */
    public void setOpen_at(Date open_at) {
        this.open_at = open_at;
    }

    /**
     *
     * @return
     */
    public Date getClosed_at() {
        return closed_at;
    }

    /**
     *
     * @param closed_at
     */
    public void setClosed_at(Date closed_at) {
        this.closed_at = closed_at;
    }
}
