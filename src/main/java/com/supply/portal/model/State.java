package com.supply.portal.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "states")
public class State {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @JsonManagedReference
    @OneToMany(targetEntity = Hospital.class, mappedBy = "state", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Hospital> hospitals;

    @OneToMany(targetEntity = Report.class, mappedBy = "state", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Report> reports;

    @OneToMany(targetEntity = Outbound.class, mappedBy = "state", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Outbound> outbounds;

    public State() {

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

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
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
