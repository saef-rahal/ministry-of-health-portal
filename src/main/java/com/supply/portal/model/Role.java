package com.supply.portal.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "roles")
public class Role {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(targetEntity = User.class, mappedBy = "role", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<User> users;

    public Role() {

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
