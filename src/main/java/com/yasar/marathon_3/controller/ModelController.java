package com.yasar.marathon_3.controller;


import com.yasar.marathon_3.dto.request.ModelSaveRequestDto;
import com.yasar.marathon_3.entity.Model;
import com.yasar.marathon_3.service.ModelService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.yasar.marathon_3.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MODEL)
public class ModelController {
    private final ModelService service;

    @PostMapping(SAVE)
    public ResponseEntity<Model> save(@RequestBody @Valid ModelSaveRequestDto dto) {
        return ResponseEntity.ok(service.save(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<Model>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
