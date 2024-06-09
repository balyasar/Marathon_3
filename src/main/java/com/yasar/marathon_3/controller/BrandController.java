package com.yasar.marathon_3.controller;

import com.yasar.marathon_3.dto.request.BrandSaveRequestDto;
import com.yasar.marathon_3.entity.Brand;
import com.yasar.marathon_3.service.BrandService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.yasar.marathon_3.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(BRAND)
public class BrandController {
    private final BrandService service;

    @PostMapping(SAVE)
    public ResponseEntity<Brand> save(@RequestBody @Valid BrandSaveRequestDto dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Brand>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
