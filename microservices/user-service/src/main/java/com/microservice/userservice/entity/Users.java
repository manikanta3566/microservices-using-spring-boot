package com.microservice.userservice.entity;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private Long id;
    private String name;
    List<Contact> contact=new ArrayList<>();
 
    public Users() {
    }
    public Users(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Users(Long id, String name, List<Contact> contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Contact> getContact() {
        return contact;
    }
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
    
    
}
