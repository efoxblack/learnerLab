package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    private Double totalStudyTime;

    public Student (Long id, String name) {
        super(id, name);
        totalStudyTime = 0.0;
    }

    public Student () {
        super(0L, null);
        totalStudyTime = 0.0;
    }

    public void learn (double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
