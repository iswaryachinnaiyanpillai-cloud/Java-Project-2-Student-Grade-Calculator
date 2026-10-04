package com.iswarya.gradecalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       STUDENT GRADE CALCULATOR");
        System.out.println("========================================");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        int numberOfSubjects;

        while (true) {
            System.out.print("Enter number of subjects: ");
            numberOfSubjects = scanner.nextInt();

            if (numberOfSubjects > 0) {
                break;
            }

            System.out.println(
                    "Invalid number of subjects! Please enter a value greater than 0."
            );
        }

        int totalMarks = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {

            int marks;

            while (true) {
                System.out.print(
                        "Enter marks for Subject " + i + " (0-100): "
                );

                marks = scanner.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks! Please enter a value between 0 and 100."
                );
            }

            totalMarks += marks;
        }

        double averagePercentage =
                GradeCalculator.calculateAverage(
                        totalMarks,
                        numberOfSubjects
                );

        String grade =
                GradeCalculator.calculateGrade(averagePercentage);

        String result =
                GradeCalculator.calculateResult(averagePercentage);

        System.out.println();
        System.out.println("========================================");
        System.out.println("             RESULT SUMMARY");
        System.out.println("========================================");
        System.out.println("Student Name       : " + studentName);
        System.out.println("Number of Subjects : " + numberOfSubjects);
        System.out.println(
                "Total Marks        : "
                        + totalMarks
                        + "/"
                        + (numberOfSubjects * 100)
        );
        System.out.printf(
                "Average Percentage : %.2f%%%n",
                averagePercentage
        );
        System.out.println("Grade              : " + grade);
        System.out.println("Result             : " + result);
        System.out.println("========================================");

        scanner.close();
    }
}
