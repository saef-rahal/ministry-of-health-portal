package com.supply.portal.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "inbound")
public class Inbound {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn( name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn( name = "item_id")
    private Item item;

    @Column( name = "received_quantity")
    private int receivedQuantity;

    @CreatedDate
    @Column( name = "create_date")
    private Date createDate = new Date();

    public Inbound() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getReceivedQuantity() {
        return receivedQuantity;
    }

    public void setReceivedQuantity(int receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
