package com.hamza.springboot.training.thymeleafdemo.model;



public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String favoriteLanguage;

    private String operatingsystems;

    public Student() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getOperatingsystems() {
        return operatingsystems;
    }

    public void setOperatingsystems(String operatingsystems) {
        this.operatingsystems = operatingsystems;
    }
}
