package com.microservice.userservice.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.microservice.userservice.entity.Users;
import com.microservice.userservice.proxy.contactproxy;
import com.microservice.userservice.services.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class usercontroller {
    @Autowired
    private userservice userservice;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    contactproxy proxy;
    
  @GetMapping(path="/user/{id}",produces = MediaType.APPLICATION_JSON)
    public Users getUserById(@PathVariable("id") Long id){
        Users user=this.userservice.getUserById(id);
       List contacts= restTemplate.getForObject("http://localhost:9002/user/contact/"+user.getId(),List.class);
user.setContact(contacts);
return user;
    }
    @GetMapping(path = "/user-feign/{id}",produces = MediaType.APPLICATION_JSON)
    public Users getUserFiegn(@PathVariable("id") Long id){
      Users user=this.userservice.getUserById(id);
  List contacts=proxy.getContact(user.getId());
   user.setContact(contacts);
   return user;
    }
}
