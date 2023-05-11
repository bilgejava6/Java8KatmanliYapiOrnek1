package com.muhammet.services;

import com.muhammet.repository.TakipRepository;
import com.muhammet.repository.entity.Takip;
import com.muhammet.utility.MyFactoryService;

public class TakipService extends MyFactoryService<Takip, TakipRepository> {
    public TakipService() {
        super(new TakipRepository());
    }

}
