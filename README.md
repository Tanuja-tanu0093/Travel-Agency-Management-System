# Travel Agency Management System

## Project Overview

The **Travel Agency Management System** is a web-based application developed using **JSP, Servlets, Core Java, and Java 8** by following **Object-Oriented Programming (OOP) concepts**.
The system allows users to log in, browse travel packages, book packages, view booking history, and cancel bookings.

This project demonstrates the integration of **Java web technologies with Hibernate ORM and MySQL database** for efficient data persistence.

---

## Features

* User Login Authentication
* Travel Package Listing
* Travel Package Booking
* Booking History Tracking
* Booking Cancellation Management
* Database Integration using Hibernate
* Exception Handling for stable application flow

---

## Technologies Used

* Java 8
* JSP (Java Server Pages)
* Servlets
* Hibernate ORM
* MySQL Database
* HTML / CSS
* Apache Tomcat Server

---

## Project Architecture

The project follows a layered architecture:

Controller Layer
Handles HTTP requests using Servlets.

DAO Layer
Performs database operations using Hibernate.

DTO Layer
Represents the data objects transferred between layers.

Utility Layer
Manages Hibernate configuration and session factory.

---

## Project Structure

```
TravelAgencyManagementSystem
│
├── src
│   ├── com.travel.controller
│   │       LoginServlet.java
│   │       BookingServlet.java
│   │       CancelBookingServlet.java
│   │
│   ├── com.travel.dao
│   │       UserDAO.java
│   │       BookingDAO.java
│   │
│   ├── com.travel.dto
│   │       User.java
│   │       TravelPackage.java
│   │       Booking.java
│   │
│   └── com.travel.util
│           HibernateUtil.java
│
└── WebContent
      login.jsp
      packages.jsp
      bookingHistory.jsp
      WEB-INF
          web.xml
```

---

## Database Tables

### Users Table

| Column   | Type    |
| -------- | ------- |
| id       | INT     |
| email    | VARCHAR |
| password | VARCHAR |

### Packages Table

| Column      | Type    |
| ----------- | ------- |
| id          | INT     |
| destination | VARCHAR |
| price       | DOUBLE  |
| duration    | INT     |

### Bookings Table

| Column    | Type    |
| --------- | ------- |
| id        | INT     |
| userId    | INT     |
| packageId | INT     |
| status    | VARCHAR |

---

## Application Workflow

1. User logs into the system.
2. Available travel packages are displayed.
3. User selects and books a travel package.
4. Booking details are stored in the database.
5. User can view booking history.
6. User can cancel an existing booking.

---

## How to Run the Project

1. Import the project into **Eclipse IDE** as a Dynamic Web Project.
2. Configure **Apache Tomcat Server**.
3. Create the **MySQL database** and required tables.
4. Update database credentials in `HibernateUtil.java`.
5. Add Hibernate and MySQL connector libraries.
6. Run the project on Tomcat.

---

## Future Enhancements

* User registration module
* Admin panel for managing packages
* Dynamic package listing from database
* Improved UI using Bootstrap
* Payment gateway integration

---

## Author

Miss Tanuja
Java Full Stack & DevOps Enthusiast
