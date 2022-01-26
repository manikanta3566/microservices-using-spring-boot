package com.microservice.userservice.services;

import java.util.List;

import com.microservice.userservice.entity.Users;

public interface userservice {
    Users getUserById(Long id);
}
