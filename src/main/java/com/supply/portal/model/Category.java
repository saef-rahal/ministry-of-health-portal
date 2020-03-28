package com.supply.portal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "categories")
public class Category {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Item> items;

    @OneToMany(targetEntity = Report.class, mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Report> reports;

    @OneToMany(targetEntity = Inbound.class, mappedBy = "category", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Inbound> inbounds;

    @OneToMany(targetEntity = Outbound.class, mappedBy = "category", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Outbound> outbounds;

    public Category() {

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
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
