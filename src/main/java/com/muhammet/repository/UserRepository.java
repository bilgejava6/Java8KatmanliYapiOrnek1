package com.muhammet.repository;

import com.muhammet.repository.entity.User;
import com.muhammet.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User,Long> {

            public UserRepository() {
                super(new User());
            }
}
