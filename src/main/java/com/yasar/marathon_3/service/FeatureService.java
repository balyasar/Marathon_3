package com.yasar.marathon_3.service;

import com.yasar.marathon_3.dto.request.FeatureSaveRequest;
import com.yasar.marathon_3.entity.Feature;
import com.yasar.marathon_3.entity.Product;
import com.yasar.marathon_3.entity.enums.ECategoryName;
import com.yasar.marathon_3.mapper.FeatureMapper;
import com.yasar.marathon_3.repository.FeatureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeatureService {
    private final FeatureRepository repository;

    public Feature save(FeatureSaveRequest dto) {
        return repository.save(FeatureMapper.INSTANCE.fromProductFeaturesSave(dto));
    }

    public List<Feature> getAll() {
        return repository.findAll();
    }


    public List<Product> getAllProductsByFeatures(ECategoryName categoryName, String featureName) {
        return repository.findAllProductsByFeatures(categoryName, featureName);
    }

    public List<String > getAllFeaturesList() {
        List<Feature> featureList = getAll();
        List<String > features = new ArrayList<>();
        featureList.forEach(x-> {
            for (int i = 0; i < ECategoryName.values().length; i++) {
                features.add(x.getCategoryName().name());
                for (int j = 0; j < featureList.size(); j++) {
                    if (featureList.get(j).getCategoryName().name().equals(x.getCategoryName().name())) {
                        features.add(x.getFeatureName());
                    }
                }
            }
        });
        return features;
    }
}
