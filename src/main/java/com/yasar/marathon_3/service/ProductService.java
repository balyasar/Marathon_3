package com.yasar.marathon_3.service;

import com.yasar.marathon_3.dto.request.ProductSaveRequestDto;
import com.yasar.marathon_3.entity.Product;
import com.yasar.marathon_3.entity.enums.ECategoryName;
import com.yasar.marathon_3.mapper.ProductMapper;
import com.yasar.marathon_3.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    private final FeatureService featureService;

    public Product save(ProductSaveRequestDto dto) {
        return repository.save(ProductMapper.INSTANCE.fromProductSaveDto(dto));
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public List<Product> getAllProductsByFeatures(ECategoryName categoryName, String featureName) {
        return featureService.getAllProductsByFeatures(categoryName, featureName);
    }
}
