package com.muhammet.repository;

import com.muhammet.repository.entity.Begeni;
import com.muhammet.utility.MyFactoryRepository;

public class BegeniRepostory extends MyFactoryRepository<Begeni,Long> {
    public BegeniRepostory() {
        super(new Begeni());
    }
}
