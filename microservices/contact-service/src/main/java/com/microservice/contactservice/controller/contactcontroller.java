package com.microservice.contactservice.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.microservice.contactservice.entity.contact;
import com.microservice.contactservice.services.contactuserservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contactcontroller {
    @Autowired
    contactuserservice contactservice;    

@GetMapping(path="/user/contact/{id}",produces=MediaType.APPLICATION_JSON)
    public List<contact> getContact(@PathVariable("id") Long id){
return this.contactservice.getById(id);
    }
}
