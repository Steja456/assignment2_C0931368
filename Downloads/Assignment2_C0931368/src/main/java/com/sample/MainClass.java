package com.sample;

public class MainClass {
    public static void main(String[] args) {
        // Create instances of Person using the builder pattern
        Person person1 = new Person.PersonBuilder()
            .id("A")
            .firstName("B")
            .lastName("C")
            .age(12)
            .gender("Gay")
            .build();

        // Output details of the persons
        System.out.println("Person 1 Details:");
        System.out.println("ID: " + person1.getId());
        System.out.println("Name: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
        System.out.println();
    }

}
