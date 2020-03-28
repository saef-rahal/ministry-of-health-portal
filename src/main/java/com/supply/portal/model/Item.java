package com.supply.portal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity( name = "items")
@Table( name = "items")
public class Item {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String unit;

    @JsonBackReference
    @ManyToOne(fetch=FetchType.EAGER, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToMany(targetEntity = Report.class, mappedBy = "item", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Report> reports;

    @OneToMany(targetEntity = Inbound.class, mappedBy = "item", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Inbound> inbounds;

    @OneToMany(targetEntity = Outbound.class, mappedBy = "item", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Outbound> outbounds;

    public Item() {

    }

    public Item(long id, String name, String unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public List<Inbound> getInbounds() {
        return inbounds;
    }

    public void setInbounds(List<Inbound> inbounds) {
        this.inbounds = inbounds;
    }

    public List<Outbound> getOutbounds() {
        return outbounds;
    }

    public void setOutbounds(List<Outbound> outbounds) {
        this.outbounds = outbounds;
    }
}
