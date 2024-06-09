package com.yasar.marathon_3.service;

import com.yasar.marathon_3.repository.ProductFeaturesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductFeaturesService {
    private final ProductFeaturesRepository repository;
}
