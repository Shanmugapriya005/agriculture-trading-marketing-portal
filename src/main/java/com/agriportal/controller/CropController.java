package com.agriportal.controller;

import com.agriportal.model.Crop;
import com.agriportal.service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crops")
public class CropController {

    @Autowired
    private CropService cropService;

    // ✅ GET ALL CROPS (THIS WAS MISSING)
    @GetMapping
    public List<Crop> getAllCrops() {
        return cropService.getAllCrops();
    }

    // ✅ GET BY ID
    @GetMapping("/{id}")
    public Crop getCropById(@PathVariable Long id) {
        return cropService.getCropById(id);
    }

    // ✅ UPDATE
    @PutMapping("/{id}")
    public Crop updateCrop(@PathVariable Long id, @RequestBody Crop crop) {
        return cropService.updateCrop(id, crop);
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public void deleteCrop(@PathVariable Long id) {
        cropService.deleteCrop(id);
    }
    @PostMapping
public Crop createCrop(@RequestBody Crop crop) {
    return cropService.saveCrop(crop);
}
}