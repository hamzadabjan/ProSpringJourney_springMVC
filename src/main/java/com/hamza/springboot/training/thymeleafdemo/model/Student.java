package com.hamza.springboot.training.thymeleafdemo.model;


import com.hamza.springboot.training.thymeleafdemo.validate.CourseCode;
import jakarta.validation.constraints.*;


public class Student {

    private String firstName;


    @NotNull(message = "Required")
    @Size (min = 1,message = "Required")
    private String lastName;

    private String country;

    private String favoriteLanguage;

    private String operatingsystems;


    @Min(value = 18 , message = "must be greater than 18Y")
    @Max(value = 40, message = "must be younger than 40Y")
    @NotNull(message = "Required")
    private Integer age;


    @CourseCode(value = "asd" , message = "must start with 'asd' ")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }



    @NotNull(message = "Required")
    @Size (min = 1,message = "Required")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Must be 5 characters")
    private String postalCode;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
