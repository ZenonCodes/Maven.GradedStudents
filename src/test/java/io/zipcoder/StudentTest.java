package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class StudentTest {

    @Test
    public void getExamScores() {
        // Given
        String firstName = "Dave";
        String lastName = "Krillton";
        Double[] examScores = {97.0,93.2,65.71,81.4};
        Student student = new Student(firstName, lastName, examScores);

// When
        String output = student.getExamScores();

// Then
        System.out.println(output);
    }
    @Test
    @DisplayName("Tests getExamScores when score array is empty ☺")
    public void getExamScoresEmpty() {
        // Given
        String firstName = "Dave";
        String lastName = "Krillton";

        Student student = new Student(firstName, lastName);

// When
        String output = student.getExamScores();

// Then
        System.out.println(output);
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setFullName() {
    }

    @Test
    public void getFullName() {
    }

    @Test
    @DisplayName("Tests the ability to set multiple scores")
    public void setExamScores() {
    }

    @Test
    public void printScores() {
    }

    @Test
    public void addExamScore() {
        //Given
        String firstName = "Dave";
        String lastName = "Krillton";
        Student student = new Student(firstName,lastName);

        //When
        student.addExamScore(88.4);
        String output = student.getExamScores();
        //Then
        System.out.println(output);
    }

    @Test
    @DisplayName("Add multiple score to non-empty array")
    public void addExamScores() {
    }
}

//    @Test
//    public void testSetScores() {
//        //Given
//        Student dave = new Student("Dave", "Krillton");
//        //When
//        Double[] expectedScores = {97.0,93.2,65.71,81.4};
//        dave.setScores(expectedScores);
//        Double[] actualScores = dave.getScores();
//
//        //Then
//        Assert.assertArrayEquals(actualScores, expectedScores);
//    }
//@Test
//public void testPrintScores() {
//    //Given
//    Student student = new Student("Dave", "Krillton");
//
//    //When
//    student.setExamScores(97.0,93.2,65.71,81.4);
//    String actualPrint = student.printScores();
//    String expectedPrint = (student.firstName + " " + student.lastName + ", you have earned the following grades so far this quarter: ");
//    for(Double score: student.examScores) {
//        expectedPrint += (score + " ");
//    }
//    //Then
//    Assert.assertEquals(expectedPrint, actualPrint);
//}