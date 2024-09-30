# Products Store Documentation 
# Intoduction
The "Best Store" project is a web application designed to manage a collection of products, allowing users to perform CRUD (Create, Read, Update, Delete) operations. The application is built using Spring Boot for the backend and Thymeleaf for the frontend, and it supports image uploads for products.

# Components
HTML Templates
The application includes several HTML templates that render different views for users. These templates are styled using Bootstrap for a responsive and user-friendly interface. The key templates include:

 # Main Page: The entry page of the application, providing a welcome message and a link to the products list.
Products List: Displays a list of all products with options to create, edit, and delete products.
Create Product: A form for creating a new product, including fields for product name, brand, category, price, description, and image upload.
Edit Product: A form for editing an existing product with pre-populated fields based on the product's current data.
Delete product: To click on delete button it will show message are you sure or not if you click on ok then it will auto matically delete the product
Product Model
The Product model represents the structure of a product in the application. It includes attributes such as:

id: The unique identifier for the product.
name: The name of the product.
brand: The brand of the product.
category: The category to which the product belongs (e.g., Phones, Computers, Accessories).
price: The price of the product.
description: A description of the product.
imageFileName: The file name of the product's image.
createdAt: The date and time when the product was created.
 # ProductDTO
The ProductDTO (Data Transfer Object) is used to transfer data between the client and the server. It encapsulates the data needed for creating and updating products, including:

name
brand
category
price
description
imageFile
ProductsController
The ProductsController handles HTTP requests related to products and maps them to appropriate service calls. Key functionalities include:

 # Displaying the list of products.
Showing the form to create a new product.
Handling the submission of the new product form.
Showing the form to edit an existing product.
Handling the submission of the edit product form.
Deleting a product.

 # ProductsRepository
The ProductsRepository interface extends Spring Data JPA's JpaRepository and provides methods for interacting with the database. It includes methods for standard CRUD operations.

 # Image Handling
The application supports image uploads for products. When a user uploads an image, it is stored on the server, and the file name is saved in the database. The images are displayed on the product list and product detail views.

# Validation
The application includes server-side validation to ensure that the data submitted by users is correct and complete. For example, fields such as name, brand, category, and price are validated to prevent the submission of invalid or incomplete data.

# Dependencies
The project relies on several dependencies, managed through Maven, including:

Spring Boot Starter Web: For building web applications.
Spring Boot Starter Thymeleaf: For using Thymeleaf as the templating engine.
Spring Boot Starter Data JPA: For database interactions using JPA.
Bootstrap: For styling the HTML templates and providing a responsive layout.
Running the Application
To run the application, follow these steps:

# To run the application:
Open a web browser and navigate to http://localhost:8080 to access the application.

# Conclusion
The "Best Store" project is a comprehensive example of a Spring Boot web application with Thymeleaf for the frontend. It demonstrates how to manage a collection of products, including image uploads and CRUD operations, with a clean and responsive user interface. This documentation provides an overview of the key components and functionalities of the application.
