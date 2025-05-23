# 📘 Java Program Repository

## 🗂 Overview

This repository contains a comprehensive collection of Java programs covering both core and advanced topics. The programs are organized into clearly structured folders for easy navigation and reference.

Each program includes:

* The problem statement as a comment at the top of the file.
* Inline comments explaining the logic and functionality.
* Clear and descriptive filenames related to their topic.

---

## 📁 Categories

* **ArrayList Programs**
* **LinkedList Programs**
* **String and StringBuilder Programs**
* **Swing Programs**
* **Servlet Programs**
* **JSP and Session/Cookie Management**
* **JDBC with MySQL (CRUD Operations)**

---

## ✅ How to Run

### 🔹 Java Console Applications

1. Clone or download the repository.
2. Open `.java` files using a Java IDE (e.g., IntelliJ, Eclipse).
3. Compile and run using the IDE or terminal.

### 🔹 Web Applications (Servlets/JSP)

1. Install [Apache Tomcat](https://tomcat.apache.org/) and [XAMPP](https://www.apachefriends.org/).
2. Copy web project folders to the `webapps` directory of Tomcat.
3. Start Apache and MySQL via XAMPP.
4. Use `phpMyAdmin` to create required databases and tables.
5. Update DB connection details in the code:

   ```java
   String url = "jdbc:mysql://localhost:3306/your_database";
   String user = "root";
   String password = "";
   ```
6. Access applications via `http://localhost:8080/YourProjectFolder/`.

---

## 📌 Notes

* Programs are organized by topic for easy reference.
* All dynamic project files include `.java`, `.jsp`, and `.html` as applicable.
* JDBC-related files include database setup and connection logic.
