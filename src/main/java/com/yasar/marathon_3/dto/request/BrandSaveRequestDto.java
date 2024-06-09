package com.yasar.marathon_3.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get, set, toString
@AllArgsConstructor // parametreli constructorların tümü
@NoArgsConstructor // default constructor
@Builder
public class BrandSaveRequestDto {
    @NotNull
    private String name;
    @Size(min = 8, max = 64)
    private String brandCode;
}
