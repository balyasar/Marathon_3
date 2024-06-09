package com.yasar.marathon_3.controller;

import com.yasar.marathon_3.dto.request.FeatureSaveRequest;
import com.yasar.marathon_3.entity.Feature;
import com.yasar.marathon_3.entity.Product;
import com.yasar.marathon_3.entity.enums.ECategoryName;
import com.yasar.marathon_3.exception.ErrorType;
import com.yasar.marathon_3.exception.MarathonException;
import com.yasar.marathon_3.service.FeatureService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.yasar.marathon_3.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(PRODUCTFEATURES)
public class FeatureController {
    private final FeatureService service;

    @PostMapping(SAVE)
    public ResponseEntity<Feature> save(@RequestBody @Valid FeatureSaveRequest dto) {
        if (Objects.isNull(dto.getProductId())) {
            throw new MarathonException(ErrorType.PRODUCT_FEATURES_INVALID_PARAMETER_ERROR);
        }
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Feature>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(GETALLFEATURESLIST)
    public ResponseEntity<List<String >> getAllFeaturesList(){
       return ResponseEntity.ok(service.getAllFeaturesList());
    }



}
