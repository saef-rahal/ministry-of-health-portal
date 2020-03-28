package com.supply.portal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @OneToMany(targetEntity = Report.class, mappedBy = "hospital", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Report> reports;

    @OneToMany(targetEntity = Outbound.class, mappedBy = "hospital", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Outbound> outbounds;

    public Hospital() {

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public List<Outbound> getOutbounds() {
        return outbounds;
    }

    public void setOutbounds(List<Outbound> outbounds) {
        this.outbounds = outbounds;
    }
}
