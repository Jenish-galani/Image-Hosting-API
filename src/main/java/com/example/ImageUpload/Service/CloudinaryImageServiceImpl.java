package com.example.ImageUpload.Service;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service  // 📦 Marks this class as a service to handle business logic
public class CloudinaryImageServiceImpl implements CloudinaryImageService {

    @Autowired  // 🤝 Injects the Cloudinary client for image uploading
    private Cloudinary cloudinary;

    // Constructor to initialize Cloudinary
    public CloudinaryImageServiceImpl(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    @Override
    public Map upload(MultipartFile file) {
        try {
            // 🔄 Uploads the image to Cloudinary and returns the response
            Map data = this.cloudinary.uploader().upload(file.getBytes(), Map.of());
            return data;
        } catch (IOException e) {
            // 🚨 Handles any errors during the image upload process
            throw new RuntimeException("Image uploading fail !!");
        }
    }
}
