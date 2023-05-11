package com.muhammet.services;

import com.muhammet.repository.UserRepository;
import com.muhammet.repository.entity.User;
import com.muhammet.utility.MyFactoryService;

public class UserService extends MyFactoryService<User, UserRepository> {
    public UserService() {
        super(new UserRepository());
    }
}
