package com.supply.portal.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "outbounds")
public class Outbound {

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

    @Column( name = "delivered_quantity")
    private Number deliveredQuantity;

    public Outbound() {

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

    public Number getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(Number deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }
}
