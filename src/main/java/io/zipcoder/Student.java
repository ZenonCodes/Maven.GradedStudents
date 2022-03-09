package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    Double[] examScores;
    Integer examsTaken = 0;
    public Student(String firstName, String lastName, Double ... scores)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = scores;
        if(examScores.length > 0) {
            examsTaken = examScores.length;
        }

    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }


    /**
     * Returns a string representation of all exams taken.
     *
     * */
    public String getExamScores() {
        int i = 1;
        if (examScores.length > 0) {
            String returnString = "Exam Score(s):";
            for (int j = 0; j < examScores.length; j++) {
                returnString += ("\n\tExam " + i + " -> " + examScores[j]);
                i++;
            }
            return returnString;
        }else return "You haven't taken any exams yet.";
    }


    /**
     * Adds a new exam score to the array of scores and updates the exams
     * taken count.
     * @param score Score to add to array of scores.
     *
     * */
    public void addExamScore(Double score){
        ArrayList<Double> mutateScores = new ArrayList<Double>(Arrays.asList(examScores));
        mutateScores.add(score);
        this.examScores = mutateScores.toArray(examScores);
        this.examsTaken += 1;
    }

    /**
     * Takes the number of an exam and modifies it's score.
     * If the exam number does not exist then it adds the new
     * score as a new exam.
     * @param examNumber Exam to modify
     * @param newScore score to set given exam number to
     * */
    public void setExamScore(int examNumber, Double newScore) {
        if (examNumber > 0) {
            int examIndex = examNumber - 1;
            examScores[examIndex] = newScore;
            if (examIndex >= examScores.length) {
                addExamScore(newScore);
            }
        }
    }

    /**
     * Calculates the average score of all exams taken.
     * @return Average of student's exam scores.
     * */
    public Double getAverageExamScore(){
        Double sum = 0.0;
        for(Double score : examScores){
            sum += score;
        }
        return sum/examScores.length;
    }

    //Play Methods
    public void resetScores(Double ... scores){
        ArrayList<Double> mutateGrades = new ArrayList<Double>(Arrays.asList(scores));
        mutateGrades.clear();
        for (Double score : scores){
            mutateGrades.add(score);
            examsTaken += 1;
        }
        examScores = mutateGrades.toArray(examScores);
    }

    public String printScores (){
        String print = (firstName + " " + lastName + ", you have earned the following grades so far this quarter: ");
        for(Double score : examScores){
            print += (score + " ");
        }
        return print;
    }
    public void addExamScores(Double ... scores){
        ArrayList<Double> mutateGrades = new ArrayList<Double>(Arrays.asList(scores));
        for (Double score : scores){
            mutateGrades.add(score);
        }
        examScores = mutateGrades.toArray(examScores);
    }
    public void setFullName (String first, String last){
        this.firstName = first;
        this.lastName = last;
    }
    public String getFullName(){
        return (firstName + " " + lastName);
    }

}
