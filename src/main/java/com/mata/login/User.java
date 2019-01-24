package com.mata.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String userName;
    private String password;
    private String activated;

    public User() {
    }

    public User(String userName, String password, String activated) {
        this.userName = userName;
        this.password = password;
        this.activated = activated;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String isActivated() {
        return activated;
    }

}
