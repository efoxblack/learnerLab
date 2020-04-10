package io.zipcoder.interfaces;

public class InstructorTester {

    public static void main(String[] args) {

        Instructor instructor = new Instructor();

        Student stud1 = new Student();
        Student stud2 = new Student();

        Student[] students = {stud1, stud2};

        instructor.lecture(students, 5.5);

        System.out.println(stud1.getTotalStudyTime() + stud2.getTotalStudyTime());
    }
}
