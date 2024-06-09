package com.yasar.marathon_3.repository;

import com.yasar.marathon_3.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ImageRepository extends JpaRepository<Image, Long> {

    @Query("select COUNT(i)>0 from Image i where i.productId= :productId and i.isMainImage= true ")
    Boolean existMainImage(@Param("productId") Long productId);
}
