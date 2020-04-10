package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testAdd() {
        Person person1 = new Person(661136L, "Joe");
        Person person2 = new Person(661139L, "Will");
        Person person3 = new Person(661144L, "Andrew");
        Person person4 = new Person(661148L, "Josh");
        Person person5 = new Person(661149L, "Drake");

        List<Person> allPeople = new ArrayList<>();

        allPeople.add(person1);
        allPeople.add(person2);
        allPeople.add(person3);
        allPeople.add(person4);

        People people = new People(allPeople);

        people.add(person5);

        Assert.assertEquals(person5, people.findById(661149L));
    }

    @Test
    public void testRemove() {
        Person person1 = new Person(661136L, "Joe");
        Person person2 = new Person(661139L, "Will");
        Person person3 = new Person(661144L, "Andrew");
        Person person4 = new Person(661148L, "Josh");
        Person person5 = new Person(661149L, "Drake");

        List<Person> allPeople = new ArrayList<>();

        allPeople.add(person1);
        allPeople.add(person2);
        allPeople.add(person3);
        allPeople.add(person4);
        allPeople.add(person5);

        People people = new People(allPeople);

        people.remove(661149L);

        Assert.assertNotSame(person5, people.findById(661149L));
    }

    @Test
    public void testFindById() {
        Person person1 = new Person(661136L, "Joe");
        Person person2 = new Person(661139L, "Will");
        Person person3 = new Person(661144L, "Andrew");
        Person person4 = new Person(661148L, "Josh");
        Person person5 = new Person(661149L, "Drake");

        List<Person> allPeople = new ArrayList<>();

        allPeople.add(person1);
        allPeople.add(person2);
        allPeople.add(person3);
        allPeople.add(person4);
        allPeople.add(person5);

        People people = new People(allPeople);

        Assert.assertEquals(person5, people.findById(661149L));
    }
}
