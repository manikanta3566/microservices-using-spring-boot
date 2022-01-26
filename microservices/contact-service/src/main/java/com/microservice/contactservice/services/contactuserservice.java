package com.microservice.contactservice.services;

import java.util.List;

import com.microservice.contactservice.entity.contact;

public interface contactuserservice {
    List<contact> getById(Long id);
}
