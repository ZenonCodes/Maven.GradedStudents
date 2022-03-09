package io.zipcoder;

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

}
