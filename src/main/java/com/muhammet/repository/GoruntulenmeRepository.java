package com.muhammet.repository;

import com.muhammet.repository.entity.Goruntulenme;
import com.muhammet.utility.MyFactoryRepository;

public class GoruntulenmeRepository extends MyFactoryRepository<Goruntulenme,Long> {

        public GoruntulenmeRepository() {
            super(new Goruntulenme());
        }
}
