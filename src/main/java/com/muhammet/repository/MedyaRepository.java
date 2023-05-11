package com.muhammet.repository;

import com.muhammet.repository.entity.Medya;
import com.muhammet.utility.MyFactoryRepository;

public class MedyaRepository extends MyFactoryRepository<Medya,Long> {

        public MedyaRepository() {
            super(new Medya());
        }
}
