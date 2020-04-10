package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {

    private List<Person> personList;

    public People(List<Person> personList) {
        this.personList = new ArrayList<>();
        this.personList = personList;
    }


    public void add(Person person) {
        personList.add(person);
    }

    public Person findById (Long id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Long id) {
        Person person = findById(id);
        if (person != null) {
            personList.remove((int)getIndexOf(person));
        }
    }

    public Integer getIndexOf (Person person) {
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).equals(person)){
                return i;
            }
        }
        return -1;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Object[] toArray() {
        return personList.toArray();
    }

    public Iterator iterator() {
        return personList.iterator();
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}
