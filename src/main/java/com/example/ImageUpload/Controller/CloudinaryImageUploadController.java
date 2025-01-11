package com.example.ImageUpload.Controller;

import com.example.ImageUpload.Service.CloudinaryImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController  // 📱 Marks this class as a REST controller for handling HTTP requests
@RequestMapping("cloud/upload")  // 📂 Base URL for image upload endpoint
public class CloudinaryImageUploadController {

    @Autowired  // 🤝 Injects CloudinaryImageService to handle image uploads
    private CloudinaryImageService cloudinaryImageService;

    @PostMapping  // 📸 Endpoint to handle image uploads
    public ResponseEntity<Map> uploadImage(@RequestParam("image") MultipartFile file) {
        Map data = this.cloudinaryImageService.upload(file);  // 🔄 Calls service to handle image upload
        return new ResponseEntity<>(data, HttpStatus.OK);  // 🎉 Returns response with uploaded image data
    }
}
