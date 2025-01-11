package com.example.ImageUpload.Config;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration  // 🛠️ Marks this class as a configuration class
public class ProjectConfig {
    @Value("${cloudinary.cloud-name}")
    private String cloudName;  // 🔑 Cloudinary cloud name

    @Value("${cloudinary.api-key}")
    private String apiKey;  // 🔑 Cloudinary API key

    @Value("${cloudinary.api-secret}")
    private String apiSecret;  // 🔑 Cloudinary API secret

    @Bean  // 🛠️ Creates a Cloudinary bean to handle image uploads
    public Cloudinary getCloudinary() {
        Map<String, String> config = new HashMap();  // 📜 Map to store Cloudinary credentials

        // 📄 Create account on https://cloudinary.com
        // 📜 Configure Cloudinary with credentials
        config.put("cloud_name", "");  // 📦 Cloudinary cloud name
        config.put("api_key", "");  // 🔑 Cloudinary API key
        config.put("api_secret", "");  // 🔑 Cloudinary API secret

        return new Cloudinary(config);  // ✅ Returns a Cloudinary instance configured with credentials
    }
}
