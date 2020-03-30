package com.supply.portal.model.dto;

import com.supply.portal.model.Role;
import com.supply.portal.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by pc on 3/30/2020.
 */
public class MyUserDetail implements UserDetails {

    /**
     *
     */
    private static final long serialVersionUID = 3182266328459637187L;
    private User user;
    private Role role;
    public MyUserDetail() {}

    public MyUserDetail(User user,Role role) {
        this.user = user;
        this.role=role;

    }

    public User getUsers(){
        return user;
    }
    public Role getRoles() {
        return role;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {


        return getAuthorities(role);

    }
    private Collection<? extends GrantedAuthority> getAuthorities (Role role) {
        List<GrantedAuthority> auth = new ArrayList<>();
        auth.add(new SimpleGrantedAuthority(role.getName()));

        return auth;
    }

    @Override
    public String getPassword() {
        System.out.println("getPassword from DetailsClass:"+user.getPassword());
        return user.getPassword();

    }

    @Override
    public String getUsername() {
        System.out.println("getUserName from DetailsClass:"+user.getUsername());
        return user.getUsername();

    }

    @Override
    public boolean isAccountNonExpired() {
        return true;

    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;

    }

    @Override
    public boolean isEnabled() {
        return  true;

    }
}