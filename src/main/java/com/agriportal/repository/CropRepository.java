package com.agriportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agriportal.model.Crop;

public interface CropRepository extends JpaRepository<Crop, Long> {
}
