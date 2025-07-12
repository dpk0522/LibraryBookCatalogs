# Library Book Catalog API (Spring Boot)

A simple Spring Boot RESTful API for managing a library’s book catalog. This project uses Java 8+, Spring Boot. It follows REST principles and uses standard HTTP methods for CRUD operations.

---

## How to Run the Project

### Prerequisites

- Java 8 or higher
- Maven or a Spring-supported IDE (IntelliJ, Eclipse, VS Code)

### Steps

1. **Clone the repository** or download the project ZIP.

2. **Open in IDE** or terminal and run:

   ```bash
   ./mvnw spring-boot:run

---

### 1. Add a New Book
  **Request:**
    POST http://localhost:PORT/books ' 
    Content-Type: application/json

  **Body:**
    {
      "id": 1,
      "title": "Clean Code",
      "author": "Robert C. Martin",
      "isbn": "9780132350884",
      "available": true
    }
  
  **Response:**
    Book added successfully.

### 2. Get All Books
  **Request:**
    GET http://localhost:PORT/books
  
  **Response:**
    {
      "id": 1,
      "title": "Clean Code",
      "author": "Robert C. Martin",
      "isbn": "9780132350884",
      "available": true
    }

### 3. Get Book by ID
  **Request:**
    GET http://localhost:PORT/books/1
    
  **Response:**
    {
      "id": 1,
      "title": "Clean Code",
      "author": "Robert C. Martin",
      "isbn": "9780132350884",
      "available": true
    }

### 4. Update Book Availability (using PUT + JSON body)
  **Request:**
    PUT http://localhost:PORT/books/1/availability , 
    Content-Type: application/json

  **Body:**
    {
      "available": false
    }

  **Response:**
    Availability updated.
    
### 5. Delete a Book
  **Request:**
    DELETE http://localhost:PORT/books/1

  **Response:**
    Book deleted.

---

## Author

**DEEPAK KUMAR**  
  B.Tech CSE 2025 Graduate, IET Dr. Rammanohar Lohia Avadh University, Ayodhya  
  Email: deepak.kumr0022@gmail.com  
