# Student Grade Calculator

A Java-based Student Grade Calculator developed as part of the DecodeLabs Industrial Training Kit Batch 2026 â€“ Java Programming.

## Objective

The Student Grade Calculator accepts marks for multiple subjects and calculates:

- Total marks
- Average percentage
- Grade
- Pass/Fail result

## Features

- Accepts the student's name
- Allows the user to enter the number of subjects
- Accepts marks for each subject
- Validates marks between 0 and 100
- Calculates total marks
- Calculates average percentage
- Assigns a grade based on the average percentage
- Displays PASS or FAIL
- Handles invalid number of subjects
- Includes automated JUnit tests

## Technologies Used

- Java 17
- Maven
- JUnit 5
- Visual Studio Code

## Grade Criteria

| Percentage | Grade |
|------------|-------|
| 90 - 100   | A+    |
| 80 - 89    | A     |
| 70 - 79    | B     |
| 60 - 69    | C     |
| 50 - 59    | D     |
| Below 50   | F     |

> Note: The grade thresholds above are the implementation criteria used in this project.

## Project Structure

```text
Java-Project-2-Student-Grade-Calculator
â”‚
â”œâ”€â”€ pom.xml
â”œâ”€â”€ README.md
â”‚
â”œâ”€â”€ src
â”‚   â”œâ”€â”€ main
â”‚   â”‚   â””â”€â”€ java
â”‚   â”‚       â””â”€â”€ com
â”‚   â”‚           â””â”€â”€ iswarya
â”‚   â”‚               â””â”€â”€ gradecalculator
â”‚   â”‚                   â”œâ”€â”€ StudentGradeCalculator.java
â”‚   â”‚                   â””â”€â”€ GradeCalculator.java
â”‚   â”‚
â”‚   â””â”€â”€ test
â”‚       â””â”€â”€ java
â”‚           â””â”€â”€ com
â”‚               â””â”€â”€ iswarya
â”‚                   â””â”€â”€ gradecalculator
â”‚                       â””â”€â”€ StudentGradeCalculatorTest.java
â”‚
â””â”€â”€ target
