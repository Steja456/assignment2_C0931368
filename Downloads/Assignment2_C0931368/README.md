Blog Management System
This is a simple Java-based blog management system that uses the builder pattern to create Person and BlogPost instances, with additional functionality to display details about blog posts and contributors. The system also uses Lombok annotations to reduce boilerplate code.

Features
Person Creation: Create a person using the builder pattern with attributes like id, firstName, lastName, age, and gender.
BlogPost Creation: Create blog posts using the builder pattern with id, authorId, and postContent.
Blog Management: Manage multiple blog posts and contributors (persons).
Lombok Integration: Use Lombok annotations (@Getter, @ToString, @EqualsAndHashCode) to reduce boilerplate code.
JUnit Testing: Unit tests are included to validate the functionality of the Person and BlogPost classes.
Project Structure
css
Copy
.
├── src
│   └── main
│       └── java
│           └── com
│               └── sample
│                   ├── Blog.java
│                   ├── BlogPost.java
│                   ├── MainClass.java
│                   └── Person.java
│   └── test
│       └── java
│           └── com
│               └── sample
│                   ├── BlogPostTest.java
│                   └── PersonTest.java
└── README.md
Class Overview
MainClass.java: Entry point of the application. Demonstrates creating Person and BlogPost instances and displaying their details.
Blog.java: Represents a blog consisting of multiple blog posts and contributors.
BlogPost.java: Represents an individual blog post with an id, authorId, and postContent.
Person.java: Represents a person with an id, firstName, lastName, age, and gender. Uses the builder pattern for instantiation.
Requirements
Java 11+
Maven (for dependency management)
Lombok (for annotations to generate getters, setters, etc.)
JUnit (for unit testing)