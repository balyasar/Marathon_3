package com.yasar.marathon_3.service;

import com.yasar.marathon_3.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;
}
