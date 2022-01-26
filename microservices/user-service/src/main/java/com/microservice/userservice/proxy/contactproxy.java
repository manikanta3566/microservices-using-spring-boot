package com.microservice.userservice.proxy;

import java.util.List;

import com.microservice.userservice.entity.Contact;
import com.microservice.userservice.entity.Users;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="contact-services")
public interface contactproxy {
    @GetMapping("/user/contact/{id}")
    public List<Contact> getContact(@PathVariable("id") Long id);
}
