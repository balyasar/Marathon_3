package com.yasar.marathon_3.mapper;

import com.yasar.marathon_3.dto.request.BrandSaveRequestDto;
import com.yasar.marathon_3.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    Brand fromBrandSaveDto(BrandSaveRequestDto dto);
}
