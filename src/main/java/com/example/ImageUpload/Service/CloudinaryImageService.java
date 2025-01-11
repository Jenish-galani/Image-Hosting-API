package com.example.ImageUpload.Service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface CloudinaryImageService {
    // 📂 Method to handle image uploads to Cloudinary
    public Map upload(MultipartFile file);
}
