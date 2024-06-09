package com.yasar.marathon_3.service;

import com.yasar.marathon_3.dto.request.ImageSaveRequestDto;
import com.yasar.marathon_3.entity.Image;
import com.yasar.marathon_3.exception.ErrorType;
import com.yasar.marathon_3.exception.MarathonException;
import com.yasar.marathon_3.mapper.ImageMapper;
import com.yasar.marathon_3.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository repository;

    public Image save(ImageSaveRequestDto dto) {
        if (!repository.existMainImage(dto.getProductId()) || dto.getIsMainImage().equals(false)) {
            return repository.save(ImageMapper.INSTANCE.fromImageSaveDto(dto));
        }
        throw new MarathonException(ErrorType.MAIN_IMAGE_ALREADY_EXIST);
    }

    public List<Image> getAll() {
        return repository.findAll();
    }

}
