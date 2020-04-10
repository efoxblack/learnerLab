package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(135716L, "Joe");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(135716L, "Joe");

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor();

        Student student = new Student();

        Double expected = 25.92;

        student.learn(3.25);
        Double start = student.getTotalStudyTime();

        instructor.teach(student, 22.67);
        Double end = student.getTotalStudyTime();

        Assert.assertEquals(expected, end, 0.0);
    }

    @Test
    public void testLecture() {

    }
}
