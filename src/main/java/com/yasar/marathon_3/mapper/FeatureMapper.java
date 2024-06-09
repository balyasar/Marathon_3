package com.yasar.marathon_3.mapper;

import com.yasar.marathon_3.dto.request.FeatureSaveRequest;
import com.yasar.marathon_3.entity.Feature;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FeatureMapper {
    FeatureMapper INSTANCE = Mappers.getMapper(FeatureMapper.class);

    Feature fromProductFeaturesSave(FeatureSaveRequest dto);
}
