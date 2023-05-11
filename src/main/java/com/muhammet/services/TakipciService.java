package com.muhammet.services;

import com.muhammet.repository.TakipciRepository;
import com.muhammet.repository.entity.Takipci;
import com.muhammet.utility.MyFactoryService;

public class TakipciService extends MyFactoryService<Takipci, TakipciRepository> {
    public TakipciService() {
        super(new TakipciRepository());
    }
}

