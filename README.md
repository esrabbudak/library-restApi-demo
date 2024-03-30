# **Book Management System REST API**

This project provides a simple RESTful API for book management. Users can list books, add new books, update existing books, or delete them.

## **Getting Started**

To run the project, follow these steps:

### **Prerequisites**

- Java 8 or above
- Maven
- MySQL
- Postman (optional, can be used to test the API)

### **Database Configuration**

Update your database connection details in the **`application.properties`** file:

```
propertiesCopy code
spring.datasource.username=username
spring.datasource.password=password
spring.datasource.url=jdbc:mysql://localhost:3306/books

Save to grepper

```

### **Running the Project**

Open a terminal in the project directory and run the following command:

```bash
bashCopy code
mvn spring-boot:run

Save to grepper

```

### **Using the API**

Once the project is successfully running, you can use the API with Postman or any other REST API testing tool.

## **API Endpoints**

- **List All Books**:
    - **HTTP Method**: GET
    - **Endpoint**: **`/api/books`**
    - Lists all books.
- **Get a Specific Book**:
    - **HTTP Method**: GET
    - **Endpoint**: **`/api/books/{id}`**
    - Retrieves a specific book by ID.
- **Add a New Book**:
    - **HTTP Method**: POST
    - **Endpoint**: **`/api/books`**
    - Adds a new book.
- **Update a Book**:
    - **HTTP Method**: PUT
    - **Endpoint**: **`/api/books/{id}`**
    - Updates an existing book.
- **Delete a Book**:
    - **HTTP Method**: DELETE
    - **Endpoint**: **`/api/books/{id}`**
    - Deletes an existing book.
