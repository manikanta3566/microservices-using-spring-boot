package com.microservice.userservice.services;

import java.util.ArrayList;
import java.util.List;

import com.microservice.userservice.entity.Users;


import org.springframework.stereotype.Service;
@Service
public class userserviceimpl implements userservice{

    
   List<Users> list=List.of(new Users(1001L, "mani"), 
   new Users(1002L, "sairaj"));

@Override
public Users getUserById(Long id) {
   
    return list.stream().filter(user->user.getId().equals(id)).findAny().orElse(null);
}
    
    
}
