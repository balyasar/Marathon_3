package com.yasar.marathon_3.mapper;

import com.yasar.marathon_3.dto.request.ProductSaveRequestDto;
import com.yasar.marathon_3.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product fromProductSaveDto(ProductSaveRequestDto dto);
}
