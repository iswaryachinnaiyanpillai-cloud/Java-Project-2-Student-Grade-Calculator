package com.iswarya.gradecalculator;

public class GradeCalculator {

    public static double calculateAverage(int totalMarks, int numberOfSubjects) {

        if (numberOfSubjects <= 0) {
            throw new IllegalArgumentException(
                    "Number of subjects must be greater than 0."
            );
        }

        return (double) totalMarks / numberOfSubjects;
    }

    public static String calculateGrade(double averagePercentage) {

        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static String calculateResult(double averagePercentage) {

        if (averagePercentage >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}