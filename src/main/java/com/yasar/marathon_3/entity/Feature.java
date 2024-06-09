package com.yasar.marathon_3.entity;

import com.yasar.marathon_3.entity.enums.ECategoryName;
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
@Table(name = "tbl_product_features")
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID için otomatik artan bir HB sequence oluşturur.
    private Long id;
    private ECategoryName categoryName;
    private String featureName;
    private String description;
    private Long productId;
}
