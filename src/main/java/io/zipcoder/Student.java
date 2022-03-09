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
    public void addExamScore(Double grade){
        ArrayList<Double> mutateGrades = new ArrayList<Double>(Arrays.asList(examScores));
        mutateGrades.add(grade);
        this.examScores = mutateGrades.toArray(examScores);
        this.examsTaken += 1;
    }


    //Play Methods
    public void setExamScores(Double ... grades){
        ArrayList<Double> mutateGrades = new ArrayList<Double>(Arrays.asList(grades));
        mutateGrades.clear();
        for (Double grade : grades){
            mutateGrades.add(grade);
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
    public void addExamScores(Double ... grades){
        ArrayList<Double> mutateGrades = new ArrayList<Double>(Arrays.asList(grades));
        for (Double grade : grades){
            mutateGrades.add(grade);
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
