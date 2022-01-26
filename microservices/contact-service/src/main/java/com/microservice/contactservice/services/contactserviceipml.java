package com.microservice.contactservice.services;

import java.util.List;

import java.util.stream.Collectors;

import com.microservice.contactservice.entity.contact;

import org.springframework.stereotype.Service;
@Service
public class contactserviceipml implements contactuserservice {

    List<contact> list=List.of(new contact(2001L,"manikanta","mani@gmail.com",782918277L,1001L),
    new contact(2001L,"mani","m@gmail.com",76529277L,1001L),
    new contact(2002L,"chiru","chiru@gmail.com",37739277L,1002L),
    new contact(2003L,"jinga","jionga@gmail.com",50788277L,1002L)
    );
    @Override
    public List<contact> getById(Long id) {
       return this.list.stream().filter(contact->contact.getId().equals(id)).collect(Collectors.toList());
   
    }
    
}
