package com.muhammet.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tlb_lokasyon")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lokasyon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Long lon;
    Long lat;
}
