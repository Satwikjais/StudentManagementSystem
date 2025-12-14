# 🎓 Student Management System  
### Spring Boot REST API | Java | MySQL

A production-style RESTful backend application built using **Spring Boot** to manage student records efficiently.  
The system supports full **CRUD operations**, **searching**, and **course-based filtering**, following **clean layered architecture** and industry best practices.
---
## ✨ Project Overview

The **Student Management System** is designed to simplify student data management for educational institutions.  
It provides a robust REST API that allows users to **add, update, retrieve, search, and delete** student records while maintaining clean separation of concerns and scalable design.

This project demonstrates real-world backend development using modern Java and Spring technologies.
---
## 🚀 Features

- Add new student records
- Retrieve all students
- Retrieve a student by ID
- Update student details
- Delete student records
- Filter students by course
- Search students by name (partial & case-insensitive)
- Automatic database and table creation
- RESTful API design

---
## 🛠️ Tech Stack

### Backend
- Java 21  
- Spring Boot 4  
- Spring Web (REST API)  
- Spring Data JPA  
- Hibernate ORM 7  
### Database
- MySQL  
- JPA-based ORM mapping  
- Auto DDL management  
### Tools
- Maven  
- Embedded Tomcat  
- Postman  
- Git & GitHub  

---

## 🧱 Architecture

The application follows a layered architecture:

- **Controller Layer** – Handles HTTP requests and responses  
- **Service Layer** – Contains business logic  
- **Repository Layer** – Handles database operations using JPA  
- **Entity Layer** – Represents database tables  


---

## 📡 API Endpoints

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/api/students` | Add new student |
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| PUT | `/api/students/{id}` | Update student |
| DELETE | `/api/students/{id}` | Delete student |
| GET | `/api/students/course/{course}` | Filter by course |
| GET | `/api/students/search?name=` | Search by name |

## 🎯 Learning Outcomes

-REST API development with Spring Boot
-Hibernate & JPA ORM
-MySQL database integration
-Clean layered architecture
-GitHub version control workflow
-Debugging real-world configuration issues




