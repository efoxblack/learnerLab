package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleTester {

    public static void main(String[] args) {

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

        people.remove(661148L);

        System.out.println(people.findById(661149L));
    }
}
