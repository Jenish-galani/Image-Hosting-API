package com.example.ImageUpload.Config;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProjectConfig {
    @Value("${cloudinary.cloud-name}")
    private String cloudName;

    @Value("${cloudinary.api-key}")
    private String apiKey;

    @Value("${cloudinary.api-secret}")
    private String apiSecret;

    @Bean
    public Cloudinary getCloudinary() {
        Map<String, String> config = new HashMap();

        // Create account on https://cloudinary.com
        // Configure Cloudinary with credentials
        config.put("cloud_name","");
        config.put("api_key","");
        config.put("api_secret","");

        return new Cloudinary(config);
    }
}
