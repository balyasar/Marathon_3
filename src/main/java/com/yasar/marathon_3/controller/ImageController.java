package com.yasar.marathon_3.controller;

import com.yasar.marathon_3.dto.request.ImageSaveRequestDto;
import com.yasar.marathon_3.entity.Image;
import com.yasar.marathon_3.exception.ErrorType;
import com.yasar.marathon_3.exception.MarathonException;
import com.yasar.marathon_3.service.ImageService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.yasar.marathon_3.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(IMAGE)
public class ImageController {
    private final ImageService service;

    @PostMapping(SAVE)
    public ResponseEntity<Image> save(@RequestBody @Valid ImageSaveRequestDto dto){
        if (Objects.isNull(dto.getProductId())){
            if (Objects.isNull(dto.getIsMainImage()) || Objects.isNull(dto.getImageUrl())){
                throw new MarathonException(ErrorType.IMAGE_INVALID_PARAMETER_ERROR);
            }
        }
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Image>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

}
