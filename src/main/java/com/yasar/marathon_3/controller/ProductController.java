package com.yasar.marathon_3.controller;

import com.yasar.marathon_3.dto.request.ProductSaveRequestDto;
import com.yasar.marathon_3.entity.Product;
import com.yasar.marathon_3.entity.enums.ECategoryName;
import com.yasar.marathon_3.exception.ErrorType;
import com.yasar.marathon_3.exception.MarathonException;
import com.yasar.marathon_3.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.yasar.marathon_3.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(PRODUCT)
public class ProductController {
    private final ProductService service;

    @PostMapping(SAVE)
    public ResponseEntity<Product> save(@RequestBody @Valid ProductSaveRequestDto dto) {
        if (Objects.isNull(dto.getName())) {
            if (Objects.isNull(dto.getBrandId()) || Objects.isNull(dto.getModelId())) {
                throw new MarathonException(ErrorType.PRODUCT_INVALID_PARAMETER_ERROR);
            }
        }
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(GETALLPRODUCTBYFEATURES)
    public ResponseEntity<List<Product>> getAllProductsByFeatures(ECategoryName categoryName, String featureName) {
        return ResponseEntity.ok(service.getAllProductsByFeatures(categoryName, featureName));
    }
}

