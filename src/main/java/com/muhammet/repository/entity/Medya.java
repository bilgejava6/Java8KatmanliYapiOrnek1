package com.muhammet.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbl_medya")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medya {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String url;
    Long tweet_id;
    int media_type;
    int state;
}
