package com.muhammet.services;

import com.muhammet.repository.GoruntulenmeRepository;
import com.muhammet.repository.entity.Goruntulenme;
import com.muhammet.utility.MyFactoryService;

public class GoruntulenmeService extends MyFactoryService<Goruntulenme, GoruntulenmeRepository> {
    public GoruntulenmeService() {
        super(new GoruntulenmeRepository());
    }
}
