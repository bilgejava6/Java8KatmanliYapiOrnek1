package com.muhammet.services;

import com.muhammet.repository.BegeniRepostory;
import com.muhammet.repository.entity.Begeni;
import com.muhammet.utility.MyFactoryService;

public class BegeniService extends MyFactoryService<Begeni, BegeniRepostory> {
        public BegeniService() {
            super(new BegeniRepostory());
        }
}
