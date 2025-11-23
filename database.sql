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

INSERT INTO courses(course_name) VALUES ("Java Programming"), ("DBMS"), ("OOP Concepts");

CREATE TABLE registrations(
    reg_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT
);
