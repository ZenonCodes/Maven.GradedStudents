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
        System.out.println("--BEGIN(getExamScores)--");
        System.out.println(output);
        System.out.println("\t\t--END--\n");    }
    @Test
    public void getExamScoresEmpty() {
        // Given
        String firstName = "Dave";
        String lastName = "Krillton";

        Student student = new Student(firstName, lastName);

// When
        String output = student.getExamScores();

// Then
        System.out.println("--BEGIN(getExamScoresEmpty)--");
        System.out.println(output);
        System.out.println("\t\t--END--\n");    }

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
    public void setExamScore() {
        //Given
        String firstName = "Dave";
        String lastName = "Krillton";
        Double[] examScores = {100.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1,200.0);
        String output = student.getExamScores();

        //Then
        System.out.println("--BEGIN(setExamScore)--");
        System.out.println(output);
        System.out.println("\t\t--END--\n");

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
        double actual = 88.4;
        student.addExamScore(actual);
        double expected = student.examScores[student.examsTaken-1];
        //Then
        Assert.assertEquals(expected,actual, Integer.MIN_VALUE);
    }


    @Test
    public void getAverageExamScore() {
        // Given
        String firstName = "Dave";
        String lastName = "Krillton";
        Double[] examScores = {93.4,34.2,99.33, 100.76,100.87, 78.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        double average = (93.4 + 34.2 + 99.33 + 100.76 + 100.87 + 78.0)/examScores.length;
        double output = student.getAverageExamScore();


        // Then
        Assert.assertEquals(average, output, Integer.MIN_VALUE);

    }

    @Test
    public void resetScores() {
    }

    @Test
    public void addExamScores() {
    }

    @Test
    public void testToString() {

        // Given
        String firstName = "Dave";
        String lastName = "Krillton";
        Double[] examScores = {93.4,34.2, 99.33, 100.76, 100.87, 78.0};
        Student student = new Student(firstName, lastName, examScores);

        // When

        String output = student.toString();

        // Then
        System.out.println("--BEGIN(testToString)--");
        System.out.println(output);
        System.out.println("\t\t--END--\n");
    }
}

//    @Test
//    @DisplayName("Add multiple score to non-empty array")
//    public void addExamScores() {
//    }
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