package com.supply.portal.model;

import javax.persistence.*;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Entity
@Table( name = "users")
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    @Column( name = "user_full_name")
    private String name;

    private String username;

    private String password;

    private boolean userStatus;

    @ManyToOne
    @JoinColumn( name = "role_id")
    private Role role;

    public User() {

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
