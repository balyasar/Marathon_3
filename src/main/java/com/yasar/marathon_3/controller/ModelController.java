package com.yasar.marathon_3.controller;

import com.yasar.marathon_3.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class ModelController {
    private final ModelService service;
}