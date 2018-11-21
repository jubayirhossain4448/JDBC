package com.jubayir.domain;

public class User {

    private int id;
    private String username;
    private String password;
    private String firstname;
    private String lastName;
    private String email;
    private String mobile;
    private String regiDate;
    private boolean status;

    public User() {
    }

    public User(String username, String password, String firstname, String lastName, String email, String mobile, String regiDate, boolean status) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.regiDate = regiDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(String regiDate) {
        this.regiDate = regiDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

}
