package com.muhammet.services;

import com.muhammet.repository.TweetRepository;
import com.muhammet.repository.entity.Tweet;
import com.muhammet.utility.MyFactoryService;

public class TweetService extends MyFactoryService<Tweet, TweetRepository> {
    public TweetService() {
        super(new TweetRepository());
    }
}
