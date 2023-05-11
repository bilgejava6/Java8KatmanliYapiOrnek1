package com.muhammet.repository;

import com.muhammet.repository.entity.Takipci;
import com.muhammet.utility.MyFactoryRepository;

public class TakipciRepository extends MyFactoryRepository<Takipci,Long> {

        public TakipciRepository() {
            super(new Takipci());
        }
}
