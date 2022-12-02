package com.ig5.project.iwa.services.offers.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="recommendations")
public class Recommandation {
    @Id
    @Column(name="recommendation_id")
    private int recommendation_id;

    @Column(name="offer_id")
    private int offer_id;

    @Column(name="userid")
    private int userid;

    @Column(name="created_at")
    private Date created_at;

    public int getRecommendation_id() {
        return recommendation_id;
    }

    public void setRecommendation_id(int recommendation_id) {
        this.recommendation_id = recommendation_id;
    }

    public int getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
