package com.yasar.marathon_3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get, set, toString
@AllArgsConstructor // parametreli constructorların tümü
@NoArgsConstructor // default constructor
@Builder
@Entity
@Table(name = "tbl")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID için otomatik artan bir HB sequence oluşturur.
    private Long id;
    private String name;
    private Double price;
    private Double taxRate;
    private Integer stock;
    private String barcode;
    private Long brandId;
    private Long modelId;
}
