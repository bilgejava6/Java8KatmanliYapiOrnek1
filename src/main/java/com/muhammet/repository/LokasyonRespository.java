package com.muhammet.repository;

import com.muhammet.repository.entity.Lokasyon;
import com.muhammet.utility.MyFactoryRepository;

public class LokasyonRespository extends MyFactoryRepository<Lokasyon,Long> {

        public LokasyonRespository() {
            super(new Lokasyon());
        }
}
