package com.iswarya.gradecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StudentGradeCalculatorTest {

    @Test
    void testAverageCalculation() {
        double average = GradeCalculator.calculateAverage(180, 2);
        assertEquals(90.0, average, 0.001);
    }

    @Test
    void testGradeAPlus() {
        assertEquals("A+", GradeCalculator.calculateGrade(90.0));
    }

    @Test
    void testGradeA() {
        assertEquals("A", GradeCalculator.calculateGrade(85.0));
    }

    @Test
    void testGradeB() {
        assertEquals("B", GradeCalculator.calculateGrade(75.0));
    }

    @Test
    void testGradeC() {
        assertEquals("C", GradeCalculator.calculateGrade(65.0));
    }

    @Test
    void testGradeD() {
        assertEquals("D", GradeCalculator.calculateGrade(55.0));
    }

    @Test
    void testGradeF() {
        assertEquals("F", GradeCalculator.calculateGrade(40.0));
    }

    @Test
    void testPassResult() {
        assertEquals("PASS", GradeCalculator.calculateResult(75.0));
    }

    @Test
    void testFailResult() {
        assertEquals("FAIL", GradeCalculator.calculateResult(45.0));
    }

    @Test
    void testInvalidNumberOfSubjects() {
        assertThrows(
                IllegalArgumentException.class,
                () -> GradeCalculator.calculateAverage(100, 0)
        );
    }
}
