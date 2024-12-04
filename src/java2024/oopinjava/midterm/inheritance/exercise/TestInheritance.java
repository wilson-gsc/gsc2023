package java2024.oopinjava.midterm.inheritance.exercise;

import java2024.oopinjava.midterm.inheritance.eg3.Person;

public class TestInheritance {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person.toString());

        // Creating a Student object
        Student student = new Student("Alice Smith", "456 College Ave", "Computer Science", 2023, 12000.50);
        System.out.println(student.toString());

        // Creating a Staff object
        Staff staff = new Staff("Robert Brown", "789 University Blvd", "Engineering", 50000.00);
        System.out.println(staff.toString());

        // Demonstrating polymorphism
        Person personAsStudent = new Student("David Williams", "101 Campus Dr", "Mathematics", 2022, 13000.75);
        System.out.println(personAsStudent.toString());

        Person personAsStaff = new Staff("Sarah Johnson", "102 Office Rd", "Administration", 60000.25);
        System.out.println(personAsStaff.toString());
    }
}

