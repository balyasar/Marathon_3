package com.yasar.marathon_3.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get, set, toString
@AllArgsConstructor // parametreli constructorların tümü
@NoArgsConstructor // default constructor
@Builder
public class ProductSaveRequestDto {
    @NotNull
    private String name;
    @NotNull
    private Double price;
    private Double taxRate;
    private Integer stock;
    private String barcode;
    private Long brandId;
    private Long modelId;
}
