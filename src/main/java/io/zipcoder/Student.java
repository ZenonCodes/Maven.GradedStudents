package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    Double[] examScores;
    Integer examsTaken;

    public String getExamScores(){
       int i = 1;
       String returnString = "Exam Scores:";
        for (int j = 0; j < examScores.length; j++){
           returnString += ("\n\tExam " + i + " -> " + examScores[j]);
           i++;
        }
        return returnString;
    }

    public Student(String firstName, String lastName, Double ... scores)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = scores;

//        for(Double score : scores){
//            this.scores.add(score);
//        }

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

    public void setFullName (String first, String last){
        this.firstName = first;
        this.lastName = last;
    }
    public String getFullName(){
        return (firstName + " " + lastName);
    }
    public void setExamScores(Double ... grades){
        ArrayList<Double> mutateGrades = new ArrayList<Double>(Arrays.asList(grades));
        mutateGrades.clear();
        for (Double grade : grades){
            mutateGrades.add(grade);
        }
        examScores = mutateGrades.toArray(examScores);
    }
//    public Double[] getExamScores(){
//        return examScores;
//    }
    public String printScores (){
        String print = (firstName + " " + lastName + ", you have earned the following grades so far this quarter: ");
        for(Double score : examScores){
            print += (score + " ");
        }
        return print;
    }


}
