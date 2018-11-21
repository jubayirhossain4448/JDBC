
package com.jubayir.inventory.domain;

import java.util.Date;

public class User {
    private int id;
    private String firstName;
    private String password;
    private String lastName;
    private String email;
    private String mobile;
    private Date regiDate;
    private boolean status;

    public User() {
    }

    public User(String firstName, String password, String lastName, String email, String mobile, Date regiDate, boolean status) {
        this.firstName = firstName;
        this.password = password;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Date getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Date regiDate) {
        this.regiDate = regiDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", password=" + password + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile + ", regiDate=" + regiDate + ", status=" + status + '}';
    }
    
    
    
}
