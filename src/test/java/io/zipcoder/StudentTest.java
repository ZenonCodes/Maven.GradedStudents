package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

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
    @Test
    public void testPrintScores() {
        //Given
        Student dave = new Student("Dave", "Krillton");

        //When
        dave.setExamScores(97.0,93.2,65.71,81.4);
        String actualPrint = dave.printScores();
        String expectedPrint = (dave.firstName + " " + dave.lastName + ", you have earned the following grades so far this quarter: ");
        for(Double score: dave.examScores) {
                  expectedPrint += (score + " ");
              }
        //Then
    Assert.assertEquals(expectedPrint, actualPrint);
    }

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
    public void setExamScores() {
    }

    @Test
    public void printScores() {
    }
}