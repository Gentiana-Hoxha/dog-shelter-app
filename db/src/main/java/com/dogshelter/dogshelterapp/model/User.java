package com.dogshelter.dogshelterapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, updatable= false)
    private Long id;
    private String name;
    private String email;
    private String role;
    private String phone;
    private String imageURL;
    private String userCode;
    
    public User(){}

    public User(String name, String email, String role, String phone, String imageURL, String userCode){
        this.name = name;
        this.email = email;
        this.role = role;
        this.phone = phone;
        this.imageURL = imageURL;
        this.userCode = userCode;
    }
    
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "User : name=" + name + 
                ", email=" + email + 
                ", id=" + id + 
                ", imageURL=" + imageURL + 
                ",  phone=" + phone+ 
                ", role=" + role + "]";
    }
    
}