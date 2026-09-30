package com.agriportal.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.agriportal.model.Crop;
import com.agriportal.repository.CropRepository;

@Service
public class CropService {

    private final CropRepository cropRepository;

    // Constructor Injection
    public CropService(CropRepository cropRepository) {
        this.cropRepository = cropRepository;
    }

    // CREATE
    public Crop addCrop(Crop crop) {
        crop.setStatus("LIVE");
        return cropRepository.save(crop);
    }

    // GET ALL
    public List<Crop> getAllCrops() {
        return cropRepository.findAll();
    }

    // GET BY ID
    public Crop getCropById(Long id) {
        return cropRepository.findById(id).orElse(null);
    }

    // SAVE (used by controller)
    public Crop saveCrop(Crop crop) {
        return cropRepository.save(crop);
    }

    // UPDATE
    public Crop updateCrop(Long id, Crop updatedCrop) {

        Crop crop = cropRepository.findById(id).orElse(null);

        if (crop != null) {
            crop.setCropName(updatedCrop.getCropName());
            crop.setQuantity(updatedCrop.getQuantity());
            crop.setBasePrice(updatedCrop.getBasePrice());
            crop.setStatus(updatedCrop.getStatus());

            return cropRepository.save(crop);
        }

        return null;
    }

    // DELETE
    public void deleteCrop(Long id) {
        cropRepository.deleteById(id);
    }
}