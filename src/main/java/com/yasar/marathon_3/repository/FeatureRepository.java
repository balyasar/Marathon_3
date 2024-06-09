package com.yasar.marathon_3.repository;

import com.yasar.marathon_3.entity.Feature;
import com.yasar.marathon_3.entity.Product;
import com.yasar.marathon_3.entity.enums.ECategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

    @Query("select f.productId from Feature f where f.categoryName = :categoryName and f.featureName = :featureName ")
    List<Product> findAllProductsByFeatures(@Param("categoryName") ECategoryName categoryName, @Param("featureName") String featureName);
}
