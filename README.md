# 🌥️📸 Image-Hosting-API

# First, create a database named 'SalesCampaign' and then run it.

# Features
- 📤 Image Uploading: Upload images of various formats (JPG, PNG, GIF, etc.) using simple API calls.
- 🛠️ Image Transformation: Resize, crop, rotate, and apply filters to images directly through the API.
- 🔍 Image Management: List, view, delete, and organize images with detailed metadata.
- 🔒 Secure Access: Implements OAuth2 for secure authentication and ensures safe image storage.
- 🗂️ Storage Options: Images are stored in scalable, secure cloud storage, with automatic backups and durability.
- 📊 Usage Analytics: Monitor and analyze image upload/download traffic, storage usage, and performance metrics.

# 📸 Creating an Account on Cloudinary
- Step 1: Go to Cloudinary’s Website

- Open your web browser and go to Cloudinary.
# 🌐 The homepage will appear, inviting you to start managing images and videos in the cloud.
- Step 2: Click on "Sign Up"

- In the top-right corner of the page, you'll see a "Sign Up" button.
- 🖱️ Click it to begin the registration process.
- Step 3: Choose Your Sign-Up Method

- You can sign up using Google, GitHub, or Email.
- 🌟 Pick the method that works best for you and click on it.
- Step 4: Fill in Your Details

- If you choose Email, fill out the required information:
- 📧 Email Address
- 🔑 Password (Choose a strong password)
- 📝 Company Name (Optional)
- Step 5: Accept Cloudinary's Terms

- Read through Cloudinary's Terms of Service and Privacy Policy.
- 📝 Once you're ready, check the box to accept the terms.
- Step 6: Create Your Account

- 📩 After filling out the details, click "Create Your Account".
- Your account will be created, and you'll receive a confirmation email shortly.
- Step 7: Verify Your Email

- 🌈 Go to your email inbox and find the confirmation email from Cloudinary.
- 📧 Click the verification link inside the email to confirm your account.
- Step 8: Welcome to Cloudinary

- 🎉 Once verified, you'll be taken to the Cloudinary Dashboard where you can start managing your images and videos.
- From here, you can access your credentials (Cloud Name, API Key, API Secret) and start integrating Cloudinary into your project.

# 💻 Technologies Used
- Language & Framework: Java with Spring Boot
- Database: MySQL

# ⚙️ Installation and Usage
- Java 17+
- Maven
- MySQL Database
- Cloudinary server

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
