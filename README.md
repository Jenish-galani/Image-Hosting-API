# 🌥️📸 Image-Hosting-API

# First, create a database named 'SalesCampaign' and then run it.

# Features
- 📤 Image Uploading: Upload images of various formats (JPG, PNG, GIF, etc.) using simple API calls.
- 🛠️ Image Transformation: Resize, crop, rotate, and apply filters to images directly through the API.
- 🔍 Image Management: List, view, delete, and organize images with detailed metadata.
- 🔒 Secure Access: Implements OAuth2 for secure authentication and ensures safe image storage.
- 🗂️ Storage Options: Images are stored in scalable, secure cloud storage, with automatic backups and durability.
- 📊 Usage Analytics: Monitor and analyze image upload/download traffic, storage usage, and performance metrics.

# 💻 Technologies Used
- Language & Framework: Java with Spring Boot
- Database: MySQL

# ⚙️ Installation and Usage
- Java 17+
- Maven
- MySQL Database

# 🏗️ Project Structure
- Image-Hosting-Spring-Boot/
- ├── src/
- │   ├── main/
- │   │   ├── java/
- │   │   │   ├── com/
- │   │   │   │   ├── example/
- │   │   │   │   │   ├── config/        # Configuration files like properties, YAML, etc.
- │   │   │   │   │   ├── controller/    # REST API endpoints
- │   │   │   │   │   ├── service/       # Business logic and services
- │   │   │   ├── ImageHostingApplication.java  # Main entry point for the Spring Boot application
- │   │   └── resources/                     # Configuration files, properties, and external resources
- │   └── test/                              # Unit tests and integration tests
- ├── .gitignore                             # Git ignore settings
- ├── build.gradle                           # Gradle build configuration
- ├── pom.xml                                 # Maven build configuration
- ├── application.properties                  # Application-level configuration
- └── README.md                               # Documentation file
