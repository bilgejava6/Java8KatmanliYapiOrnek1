package com.muhammet.services;

import com.muhammet.repository.LokasyonRespository;
import com.muhammet.repository.entity.Lokasyon;
import com.muhammet.utility.MyFactoryService;

public class LokasyonService extends MyFactoryService<Lokasyon, LokasyonRespository> {
    public LokasyonService() {
        super(new LokasyonRespository());
    }
}
