package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student stud1 = new Student();

        Assert.assertTrue(stud1 instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student stud1 = new Student();

        Assert.assertTrue(stud1 instanceof Person);
    }

    @Test
    public void testLearn() {

        Student stud1 = new Student();

        stud1.learn(22.6);

        Double expected = 22.6;

        Double actual = stud1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.0);
    }
}
