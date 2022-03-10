package io.zipcoder;

import java.util.*;
import java.util.function.Predicate;

public class Classroom  {
    Student[] students;
    int maxNumberOfStudents;

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
        Double weightedAverage = sum/ students.length;
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

    public String getGradeBook(){
        ArrayList<Student> stuList =
                new ArrayList<Student>(Arrays.asList(getStudentsByScore()));
        HashMap<Character, ArrayList<Student>> GradeBook = new HashMap<Character, ArrayList<Student>>();
        Student[] lToG = new Student[this.students.length];
        Collections.reverse(stuList);
        this.students = stuList.toArray(this.students);
        Double ninetyPerc, seventyonePerc,
                thirtyPerc, fiftyOnePerc,
                eighNinePerc, elevenPerc;
        int n = 0;
        //find 90th percentile
        n = ((90/100) * students.length) - 1;
        ninetyPerc = students[n].getAverageExamScore();
        //find 71th percentile
        n = ((71/100) * students.length) - 1;
        seventyonePerc = students[n].getAverageExamScore();

        //if 10Perc = students[n]
        //n = (P/100) x N, where P = percentile,
        //P = Math.round((n/N) * 100);
        // N = number of values in a data set
        // (sorted from smallest to largest),
        // and n = ordinal rank of a given value.

    }

}
