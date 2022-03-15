package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ClassroomTest {

    @Test
    public void testGetStudents() {
        // Given
        Student dw = new Student("Dora","Read", 99.00, 100.00,76.00,88.00,94.00);
        Student arthur = new Student("Arthur","Read", 91.00, 72.00,76.00,88.00,63.00);
        Student francine = new Student("Francine","Frensky", 83.00, 67.00,76.00,88.00,90.00);
        Student[] stuArray = {arthur,dw,francine};


        // When
        Classroom testPbs = new Classroom(arthur, dw,francine);
        Student[] actual = stuArray;
        Student[] expected = testPbs.getStudents();

        // Then
        Assert.assertArrayEquals(expected,actual);
    }


    @Test
    public void testGetAverageExamScore() {
        // Given

        // When

        // Then
    }

    @Test
    public void getStudents() {
        // Given

        // When

        // Then
    }

    @Test
    public void getAverageExamScore() {
        // Given

        // When

        // Then
    }

    @Test
    public void addStudent() {
        // Given

        // When

        // Then
    }

    @Test
    public void removeStudent() {
        // Given

        // When

        // Then
    }

    @Test
    public void getStudentsByScore() {
        // Given

        // When

        // Then
    }

    @Test
    public void getPercIndex() {
        // Given

        // When

        // Then
    }

    @Test
    public void gradeCutOff() {
        // Given

        // When

        // Then
    }

    @Test
    public void getGradeBook() {
        // Given

        // When

        // Then

    }
}
