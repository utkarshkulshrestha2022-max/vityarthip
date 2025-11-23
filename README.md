Project Title : Student Course Registration System (Java + JDBC)

Overview of the Project : This is a simple console-based Java project where students can register for courses. The system stores data in a MySQL database using JDBC. The main purpose of the project is to understand how Java OOP, exception handling, and database connectivity work together in a real-world example.Especially regarding student registration system it is of utmost importance as it will tell how a student can register for course etc.

Features : Add new students , View available courses , Register a student for a course , Stores all data inside MySQL database , Uses Java OOP concepts , Handles invalid inputs using exception handling , Simple menu-based console interface

Technologies / Tools Used : Java , MySQL Server , MySQL Connector/J (JDBC driver) , VS Code and  Terminal

Steps to Install & Run the Project:
Install Java :- Install JDK from Oracle or OpenJDK.
Check installation: java -version
Install MySQL Server :- Install MySQL and set a root password.
Then open MySQL and create the database:
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students(
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50),
  email VARCHAR(50)
);

CREATE TABLE courses(
  course_id INT PRIMARY KEY AUTO_INCREMENT,
  course_name VARCHAR(50)
);

INSERT INTO courses(course_name)
VALUES ("Java Programming"), ("DBMS"), ("OOP Concepts");

CREATE TABLE registrations(
  reg_id INT PRIMARY KEY AUTO_INCREMENT,
  student_id INT,
  course_id INT
);

Add MySQL JDBC Driver

Download MySQL Connector/J → place the .jar inside a folder named lib:

project/
   lib/
      mysql-connector-j-9.5.0.jar
   DBConnection.java
   RegistrationSystem.java
   Student.java
   Course.java

Compile the project
javac -cp ".:lib/mysql-connector-j-9.5.0.jar" *.java

Run the project
java -cp ".:lib/mysql-connector-j-9.5.0.jar" RegistrationSystem

Instructions for Testing: After running the program, the menu will appear:

1. Add Student
2. View Courses
3. Register Student for Course
4. Exit

✔ Test 1 → Add a student

Choose 1, enter name and email.
Check MySQL:

SELECT * FROM students;

✔ Test 2 → View courses

Choose 2 to see the available course list.

✔ Test 3 → Register a student

Choose 3, enter student ID and course ID.
Check MySQL:

SELECT * FROM registrations;

screenshots:- 
<img width="1470" height="956" alt="Screenshot 2025-11-23 at 7 34 55 PM" src="https://github.com/user-attachments/assets/fe059ded-77b9-4790-925b-ccd2e080ce2e" />

