package com.yasar.marathon_3.mapper;

import com.yasar.marathon_3.dto.request.ModelSaveRequestDto;
import com.yasar.marathon_3.entity.Model;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    Model fromModelSaveDto (ModelSaveRequestDto dto);
}
