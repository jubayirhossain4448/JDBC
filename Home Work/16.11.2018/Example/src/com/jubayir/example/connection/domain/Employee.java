package com.jubayir.example.connection.domain;

public class Employee {

    private int employeeid;
    private String name;

    public Employee() {
    }

    public Employee(int employeeid, String name) {
        this.employeeid = employeeid;
        this.name = name;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
