package com.muhammet.repository;

import com.muhammet.repository.entity.Takip;
import com.muhammet.utility.MyFactoryRepository;

public class TakipRepository extends MyFactoryRepository<Takip,Long> {

        public TakipRepository() {
            super(new Takip());
        }
}
