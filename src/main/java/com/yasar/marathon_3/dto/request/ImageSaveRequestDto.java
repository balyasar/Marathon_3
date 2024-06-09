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
public class ImageSaveRequestDto {
    private String name;
    private String imageUrl;
    private Boolean isMainImage;
    private Long productId;
}
