package com.yasar.marathon_3.dto.request;

import com.yasar.marathon_3.entity.enums.ECategoryName;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get, set, toString
@AllArgsConstructor // parametreli constructorların tümü
@NoArgsConstructor // default constructor
@Builder
public class FeatureSaveRequest {
    @NotNull
    private ECategoryName categoryName;
    private String featureName;
    private String description;
    private Long productId;
}
