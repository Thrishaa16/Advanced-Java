# 📘 Java Program Repository

## 🗂 Overview

This repository provides a comprehensive collection of Java programs that demonstrate a wide range of concepts from core programming to advanced web-based applications. Each program is categorized and well-documented to help learners and developers understand Java functionalities more effectively.

Each program includes:

* The problem statement as a comment at the top of the file.
* Inline comments that explain the logic step-by-step.
* Clear and descriptive filenames indicating the topic and purpose.

This setup ensures clarity, maintainability, and ease of access across the project.

---

## 📁 Categories

Programs are grouped into the following categories:

* **ArrayList Programs** – Demonstrates operations such as adding, removing, updating, searching, and sorting elements in an `ArrayList`.
* **LinkedList Programs** – Covers iteration, insertion, deletion, and element manipulation using Java's `LinkedList`.
* **String and StringBuilder Programs** – Focuses on string manipulation, formatting, performance comparison, and utility functions.
* **Swing Programs** – Implements GUI components and interactions using Java Swing for desktop-based applications.
* **Servlet Programs** – Server-side Java programs for processing HTML form inputs and generating dynamic web content.
* **JSP and Session/Cookie Management** – Web applications using JavaServer Pages with support for sessions and cookies.
* **JDBC with MySQL (CRUD Operations)** – Java programs for creating, reading, updating, and deleting data from MySQL databases using JDBC.

---

## ✅ How to Run

### 🔹 Java Console Applications

1. Clone or download this repository to your local machine.
2. Open `.java` files using any Java IDE such as IntelliJ IDEA, Eclipse, or NetBeans.
3. Compile and run the programs either from the IDE or using terminal commands (`javac` and `java`).

### 🔹 Web Applications (Servlets/JSP)

1. Install [Apache Tomcat](https://tomcat.apache.org/) and [XAMPP](https://www.apachefriends.org/) for Apache and MySQL.
2. Copy the web project folders into the `webapps` directory of the Apache Tomcat installation.
3. Launch Apache and MySQL services via XAMPP.
4. Use `phpMyAdmin` (available in XAMPP) to create the required databases and tables.
5. Configure database connection details in `.java` or `.jsp` files:

   ```java
   String url = "jdbc:mysql://localhost:3306/your_database";
   String user = "root";
   String password = "";
   ```
6. Deploy the application and access it through `http://localhost:8080/YourProjectFolder/` in a web browser.

---

## 📌 Notes

* Programs are structured and labeled according to their topic.
* Dynamic web projects include `.java`, `.jsp`, and `.html` files.
* JDBC-based applications include:

  * SQL schema for database and table creation.
  * Connection setup and exception handling.
  * Functional examples of CRUD operations.
