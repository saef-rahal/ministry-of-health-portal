package com.supply.portal.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "reports")
public class Report {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn( name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn( name = "hospital_id")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn( name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn( name = "item_id")
    private Item item;

    @Column( name = "supply_request_quantity")
    private int supplyRequest;

    @CreatedDate
    @Column( name = "create_date")
    private Date createDate;

    private String comments;

    public Report() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getSupplyRequest() {
        return supplyRequest;
    }

    public void setSupplyRequest(int supplyRequest) {
        this.supplyRequest = supplyRequest;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
