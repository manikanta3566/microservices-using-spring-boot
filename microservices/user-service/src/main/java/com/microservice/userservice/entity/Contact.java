package com.microservice.userservice.entity;

public class Contact {
    private Long cid;
    private String contactName;
    private String email;
    private Long number;
    private Long id;
    public Contact() {
    }
    public Contact(Long cid, String contactName, String email, Long number,Long id) {
        this.cid = cid;
        this.contactName = contactName;
        this.email = email;
        this.number = number;
        this.id=id;
    }
    public Long getCid() {
        return cid;
    }
    public void setCid(Long cid) {
        this.cid = cid;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getNumber() {
        return number;
    }
    public void setNumber(Long number) {
        this.number = number;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
  
  
    
    
    
}
