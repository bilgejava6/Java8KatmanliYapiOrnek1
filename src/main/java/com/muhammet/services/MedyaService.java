package com.muhammet.services;

import com.muhammet.repository.MedyaRepository;
import com.muhammet.repository.entity.Medya;
import com.muhammet.utility.MyFactoryService;

public class MedyaService extends MyFactoryService<Medya, MedyaRepository> {
    public MedyaService() {
        super(new MedyaRepository());
    }
}
