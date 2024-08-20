# Slashcart

Slashcart is an e-commerce project developed to explore Java, Spring Boot, PostgreSQL, Hibernate ORM, JPA, and JPQL for backend development, alongside React for the frontend. This project demonstrates a full-stack application with basic e-commerce functionalities, including product management and a dynamic user interface.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [Project Structure](#project-structure)
- [Acknowledgments](#acknowledgments)

## Features

### Backend

- **CRUD Operations for Products**: Implemented using Java, Spring Boot, Hibernate, JPA, and JPQL.
- **Image File Upload**: Supports uploading images for products, with storage handled in the database.
- **Product Search API**: Provides search functionality for products.

### Frontend

- **Home Page**: Displays a list of products with a dynamic and responsive UI.
- **Add Product Page**: Allows users to add new products.
- **Update Product Page**: Enables editing of existing products.
- **Add to Cart**: Basic shopping cart functionality.
- **Theme Options**: Users can switch between dark and light themes.
- **Global State Management**: Utilized ContextAPI for handling global state across the application.

## Technologies Used

- **Backend**:
  - Java
  - Spring Boot
  - PostgreSQL
  - Hibernate ORM
  - JPA (Java Persistence API)
  - JPQL (Java Persistence Query Language)
- **Frontend**:
  - React
  - ContextAPI
  - CSS for styling

## Getting Started

Follow the instructions below to set up and run the Slashcart project locally.

### Prerequisites

- Java 8 or higher
- Maven
- Node.js
- npm (Node Package Manager)

### Clone the Repository

```bash
git clone https://github.com/Vrutik21/Slashcart.git
```

### Backend Setup

1. Navigate to the backend directory:

```bash
cd Backend
```

2. Start the Spring Boot application:

- Using Maven:

```bash
./mvnw spring-boot:run
```

- Or directly from the main application file: Open `Slashcart/Backend/src/main/java/com/parmar/explore/ExploreApplication.java` in your IDE and run the ExploreApplication class.

3. The backend server should now be running on `http://localhost:8080`.

### Frontend Setup

1. Navigate to the frontend directory:

```bash
cd Frontend
```

2. Install the necessary dependencies:

```bash
npm install
```

3. Start the development server:

```bash
npm run dev
```

4. The frontend application should now be running on `http://localhost:3000`.

## Project Structure

The project is divided into two main folders:

- Backend: Contains all backend-related code and configuration.
- Frontend: Contains all frontend-related code and assets.

## Acknowledgments

This project was developed as a learning exercise to explore the use of Java, Spring Boot, Hibernate ORM, JPA, and JPQL.
