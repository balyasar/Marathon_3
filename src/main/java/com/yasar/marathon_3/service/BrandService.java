package com.yasar.marathon_3.service;

import com.yasar.marathon_3.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandService {
    private final BrandRepository repository;
}
