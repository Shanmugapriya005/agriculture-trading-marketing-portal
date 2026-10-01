# 🌾 Agriculture Marketing and Trading Portal with Auction System

A web-based **Agriculture Marketing and Trading Portal** designed to connect farmers and buyers through a digital platform for agricultural product listing, trading, ordering, and auction-based selling.

The project uses **Spring Boot** for the backend, **React.js** for the frontend, and **MySQL** for database management.

---

## 📌 Project Overview

The Agriculture Marketing and Trading Portal provides a centralized platform where farmers can list their agricultural products and buyers can browse, purchase, and participate in auctions.

The system aims to simplify agricultural trading by providing digital product management, order processing, user management, and an auction mechanism.

---

## 🎯 Objectives

* Provide a digital marketplace for agricultural products.
* Allow farmers to list and manage their crops.
* Allow buyers to browse available agricultural products.
* Enable buyers to place orders.
* Provide an auction system for selected agricultural products.
* Maintain user, crop, order, and auction information.
* Reduce dependency on traditional intermediaries.
* Provide a user-friendly platform for agricultural trading.

---

## ✨ Features

### 👨‍🌾 Farmer

* Farmer registration and login
* Add agricultural products
* Update product information
* Manage crop details
* View orders
* Participate in digital agricultural trading

### 🛒 Buyer

* Buyer registration and login
* Browse agricultural products
* View crop details
* Place orders
* View order information
* Participate in auctions

### 🔨 Auction System

* Create agricultural product auctions
* Set auction details
* Allow buyers to place bids
* Manage auction information
* Track auction-related data

### 📦 Order Management

* Create orders
* Store order details
* Retrieve order information
* Manage order status

### 👤 User Management

* User registration
* User information management
* Role-based user functionality

---

## 🏗️ System Architecture

```text
                ┌─────────────────────────┐
                │       React.js          │
                │      Frontend UI        │
                └────────────┬────────────┘
                             │
                             │ REST API
                             ▼
                ┌─────────────────────────┐
                │      Spring Boot        │
                │       Backend           │
                ├─────────────────────────┤
                │ Controllers             │
                │ Services                │
                │ Repositories            │
                │ Models / Entities       │
                └────────────┬────────────┘
                             │
                             │ JPA / Hibernate
                             ▼
                ┌─────────────────────────┐
                │         MySQL           │
                │        Database         │
                └─────────────────────────┘
```

---

## 🛠️ Technologies Used

### Frontend

* React.js
* JavaScript
* HTML5
* CSS3

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* REST APIs

### Database

* MySQL

### Build Tool

* Maven

### Development Tools

* Visual Studio Code
* Git
* GitHub

---

## 📂 Project Structure

```text
agriculture-trading-marketing-portal/
│
├── agri-frontend/
│   ├── public/
│   ├── src/
│   ├── package.json
│   └── README.md
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── agriportal/
│                   ├── controller/
│                   │   ├── CropController.java
│                   │   ├── OrderController.java
│                   │   └── UserController.java
│                   │
│                   ├── model/
│                   │   ├── Auction.java
│                   │   ├── Crop.java
│                   │   ├── Order.java
│                   │   └── User.java
│                   │
│                   ├── repository/
│                   │   ├── AuctionRepository.java
│                   │   ├── CropRepository.java
│                   │   ├── OrderRepository.java
│                   │   └── UserRepository.java
│                   │
│                   └── service/
│                       ├── AuctionService.java
│                       ├── CropService.java
│                       ├── OrderService.java
│                       └── ...
│
├── pom.xml
├── .gitignore
└── README.md
```

---

## 🗄️ Database

The application uses **MySQL** as the relational database.

Main entities include:

* User
* Crop
* Order
* Auction

The database is used to store user information, agricultural product details, orders, and auction-related information.

---

## 🚀 Getting Started

### Prerequisites

Make sure the following are installed:

* Java JDK
* Maven
* Node.js and npm
* MySQL
* Git
* Visual Studio Code or another IDE

---

## ⚙️ Backend Setup

### 1. Clone the repository

```bash
git clone https://github.com/Shanmugapriya005/agriculture-trading-marketing-portal.git
```

### 2. Navigate to the project

```bash
cd agriculture-trading-marketing-portal
```

### 3. Configure MySQL

Create a database:

```sql
CREATE DATABASE agri_db;
```

Configure your local database credentials in your local Spring Boot configuration.

> **Note:** Database credentials are intentionally excluded from this repository for security reasons.

### 4. Run the Spring Boot application

Using Maven:

```bash
mvn spring-boot:run
```

Or, on Windows:

```bash
mvnw.cmd spring-boot:run
```

The backend runs on:

```text
http://localhost:8080
```

---

## 💻 Frontend Setup

Navigate to the frontend:

```bash
cd agri-frontend
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
npm start
```

If the project uses Vite, use:

```bash
npm run dev
```

The terminal will display the frontend URL.

---

## 🔗 Backend API

The Spring Boot backend provides REST endpoints for different modules.

Example modules:

```text
/users
/crops
/orders
/auctions
```

The frontend communicates with the Spring Boot backend using HTTP/REST APIs.

---

## 🔐 Security

Sensitive configuration files such as:

```text
application.properties
.env
```

are excluded from Git using `.gitignore`.

**Never commit database passwords, API keys, tokens, or other secrets to GitHub.**

---

## 📊 Main Modules

| Module             | Description                                    |
| ------------------ | ---------------------------------------------- |
| User Management    | Handles user registration and user information |
| Crop Management    | Manages agricultural products and crop details |
| Order Management   | Handles buyer orders                           |
| Auction Management | Supports auction-based agricultural trading    |
| Frontend           | Provides the user interface                    |
| Database           | Stores application data                        |

---

## 🔮 Future Enhancements

* Online payment integration
* Real-time auction bidding
* Email and SMS notifications
* Advanced search and filtering
* Product image upload
* Farmer dashboard
* Buyer dashboard
* Order tracking
* Rating and review system
* Location-based farmer and buyer matching
* Mobile application
* Improved authentication and authorization

---

## 🎓 Project Purpose

This project was developed as an academic and learning project to demonstrate the development of a full-stack agricultural trading platform using **Java, Spring Boot, React.js, REST APIs, and MySQL**.

---

## 👩‍💻 Developer

**Shanmugapriya005**

GitHub:
https://github.com/Shanmugapriya005

---

## 📄 License

This project currently does not include a specific open-source license.
