package com.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class PersonTest {
    
    @Test
    void testValidPersonCreation() {
        // Creating a Person object using the builder pattern
        Person person = new Person.PersonBuilder()
                .id("P003")
                .firstName("Alice")
                .lastName("Green")
                .age(32)
                .gender("Female")
                .build();

        // Asserting that the values set using builder are correctly assigned
        assertEquals("P003", person.getId());
        assertEquals("Alice", person.getFirstName());
        assertEquals("Green", person.getLastName());
        assertEquals(32, person.getAge());
        assertEquals("Female", person.getGender());
    }

    @Test
    void testInvalidPersonCreation() {
        // Testing for IllegalArgumentException when an invalid person is created
        assertThrows(IllegalArgumentException.class, () -> new Person.PersonBuilder()
                .id(null)  // id cannot be null
                .firstName("Alice")
                .lastName("Green")
                .age(32)
                .gender("Female")
                .build());
    }

    @Test
    void testInvalidPersonCreationWithNegativeAge() {
        // Testing for IllegalArgumentException when an invalid age is provided
        assertThrows(IllegalArgumentException.class, () -> new Person.PersonBuilder()
                .id("P004")
                .firstName("Bob")
                .lastName("White")
                .age(-5)  // Age cannot be negative
                .gender("Male")
                .build());
    }
}
