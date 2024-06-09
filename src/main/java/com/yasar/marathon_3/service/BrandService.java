package com.yasar.marathon_3.service;

import com.yasar.marathon_3.dto.request.BrandSaveRequestDto;
import com.yasar.marathon_3.entity.Brand;
import com.yasar.marathon_3.mapper.BrandMapper;
import com.yasar.marathon_3.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {
    private final BrandRepository repository;

    public Brand save(BrandSaveRequestDto dto) {
        return repository.save(BrandMapper.INSTANCE.fromBrandSaveDto(dto));
    }

    public List<Brand> getAll() {
        return repository.findAll();
    }
}
