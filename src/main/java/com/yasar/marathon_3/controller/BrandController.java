package com.yasar.marathon_3.controller;

import com.yasar.marathon_3.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class BrandController {
    private final BrandService service;
}
