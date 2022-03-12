package io.zipcoder;

import java.util.*;
import java.util.function.Predicate;

public class Classroom  {
    Student[] students;
    int maxNumberOfStudents;
    int rollCall = this.students.length;

    public Classroom(Student...students){
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom()
    {
        students = new Student[30];
    }

    public Student[] getStudents(){
        return students;
    }

    public Double getAverageExamScore (){
        Student[] students = getStudents();
        Double sum = 0.0;
        for(Student student : students){
            sum += student.getAverageExamScore();
        }
        Double weightedAverage = sum/ rollCall;
        //each student should be placed into an array and passed to classroom
        return weightedAverage;
    }

    public void addStudent(Student... students){
        //create an arraylist so that we can append our Student array
        //convert the array of Students using Arrays.asList(students)
        ArrayList<Student> enroll = new ArrayList<>(Arrays.asList(this.students));
        // Iterate through the passed parameter and add each student
        for(Student student : students){
            if(enroll.size() == maxNumberOfStudents){break;}
            enroll.add(student);

        }
        //update field
        this.students = enroll.toArray(this.students);
    }
    public void removeStudent(String firstName, String lastName){
        ArrayList<Student> prunedClass = new ArrayList(Arrays.asList(this.students));
        String fullName = firstName + " " + lastName;

        //Test to see if person in the class can be enrolled aka
        //does not match the name of student we want to remove
        Predicate<String> canEnroll = person -> (!person.equals(fullName));
        // for every student in our classroom that passes the can enroll test
        // add them to our dynamic arrayList
        for(Student student : this.students){
            if(canEnroll.test(student.getFullName())) {
                prunedClass.add(student);
            }

        }
        // convert ArrayList back to Student array and set to
        // our classroom's Student Array
        this.students = prunedClass.toArray(this.students);
    }

    public Student[] getStudentsByScore(){
        return Student.returnSorted(this.students);
    }

    public int getPercIndex(int percentile, int N){

        int ordinalRankIndex = ((percentile/100) * N) - 1;
        return ordinalRankIndex;

    }
    /**
     * Returns an array of indexes for each grade cutoff
     * */
    public Double[] gradeCutOff (Student... students){
        Double a, b, c, d;
        Double[] grades = new Double[4];

        //Pass in the sorted Class Averages of each student
        // for each Ordinal index get a corresponding grade cutoff for that percentile
        a = students[getPercIndex(90, rollCall)].getAverageExamScore();
        b = students[getPercIndex(70, rollCall)].getAverageExamScore();
        c = students[getPercIndex(50, rollCall)].getAverageExamScore();
        d = students[getPercIndex(11, rollCall)].getAverageExamScore();
//        grades = {a,b,c,d};
    }
    public String getGradeBook(){

        ArrayList<Student> stuList = new ArrayList<Student>(Arrays.asList(getStudentsByScore()));
        Student[] lToG = new Student[rollCall];
        Collections.reverse(stuList);
        lToG = stuList.toArray(lToG);
        //if 10Perc = students[n]
        //n = (P/100) x N, where P = percentile,
        //P = Math.round((n/N) * 100);
        // N = number of values in a data set
        // (sorted from smallest to largest),
        // and n = ordinal rank of a given value.
        HashMap<Character, ArrayList<Student>> GradeBook = new HashMap<Character, ArrayList<Student>>();
    }

}
