package com.muhammet.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbl_tweet")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long retweet_id;
    Long comment_id;
    Long parent_id;
    String comment;
    Long user_id;
    int yorum_sayisi;
    int begeni_sayisi;
    int goruntulanme_sayisi;
    Long paylasim_zamani;
    int puan;
    int state;
}
