package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        // Given
        Long id = 12571712L;
        // When
        Person person = new Person(id, "John");
        // Then
        Assert.assertEquals(id, person.getId());
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person(1468942L, "Bob");
        // When
        String newName = "Joe";
        person.setName(newName);
        // Then
        Assert.assertEquals(newName, person.getName());
    }

}
