package com.yasar.marathon_3.mapper;

import com.yasar.marathon_3.dto.request.ImageSaveRequestDto;
import com.yasar.marathon_3.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ImageMapper {
    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    Image fromImageSaveDto(ImageSaveRequestDto dto);
}
