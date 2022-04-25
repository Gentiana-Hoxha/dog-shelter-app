package com.dogshelter.dogshelterapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Dog implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, updatable= false)
    private Long id;
    private String dogCode;
    private String name;
    private char gender;
    private Date birdhday;
    private String imageURL;
    private String description;
    private String location;

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, updatable= false)
    private Long dogDonationId;


    
    public Dog(){}



    public Dog(String dogCode, String name, char gender, Date birdhday, String imageURL, String description,
            String location, Long dogDonationId) {
        this.dogCode = dogCode;
        this.name = name;
        this.gender = gender;
        this.birdhday = birdhday;
        this.imageURL = imageURL;
        this.description = description;
        this.location = location;
        this.dogDonationId = dogDonationId;
    }



    public Long getId() {
        return id;
    }



    public String getDogCode() {
        return dogCode;
    }



    public void setDogCode(String dogCode) {
        this.dogCode = dogCode;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public char getGender() {
        return gender;
    }



    public void setGender(char gender) {
        this.gender = gender;
    }



    public Date getBirdhday() {
        return birdhday;
    }



    public void setBirdhday(Date birdhday) {
        this.birdhday = birdhday;
    }



    public String getImageURL() {
        return imageURL;
    }



    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }



    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }



    public String getLocation() {
        return location;
    }



    public void setLocation(String location) {
        this.location = location;
    }



    public Long getDogDonationId() {
        return dogDonationId;
    }



    public void setDogDonationId(Long dogDonationId) {
        this.dogDonationId = dogDonationId;
    }



    @Override
    public String toString() {
        return "Dog [birdhday=" + birdhday + ", description=" + description + ", dogCode=" + dogCode
                + ", dogDonationId=" + dogDonationId + ", gender=" + gender + ", id=" + id + ", imageURL=" + imageURL
                + ", location=" + location + ", name=" + name + "]";
    }

   
    
}