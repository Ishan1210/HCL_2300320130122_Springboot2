package com.example.hclassessment2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    private Long customerid;
    private String customerName;
    private String email;
    private String password;
    private String mobile;
    private String city;

    public Customer() {
    }

    public Customer(Long customerid, String customerName, String email, String password, String mobile, String city) {
        this.customerid = customerid;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.city = city;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
