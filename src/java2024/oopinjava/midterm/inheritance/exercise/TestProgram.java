package java2024.oopinjava.midterm.inheritance.exercise;

import java2024.oopinjava.midterm.inheritance.eg3.Person;

public class TestProgram {
    public static void main(String[] args) {
        // Create instances of Person, Student, and Staff
        Person person = new Person("John Doe", "123 Main St");
        Student student = new Student("Alice Johnson", "456 Elm St", "BSIT", 2, 15000.50);
        Staff staff = new Staff("Bob Smith", "789 Oak St", "UC Main", 55000.75);

        // Output their details using the toString() method
        System.out.println(person);
        System.out.println("\n"+student);
        System.out.println("\n"+staff);

        // Testing the getter methods for Student
        System.out.println("\nStudent's program: " + student.getProgram());
        System.out.println("Student's year: " + student.getYear());
        System.out.println("Student's fee: " + student.getFee());

        // Testing the setter methods for Staff
        staff.setSchool("Mathematics");
        staff.setPay(60000.00);
        System.out.println("\nUpdated Staff: " + staff);

        // Test updating and getting attributes of the person class
        person.setAddress("012 New St");
        System.out.println("\nUpdated Person: " + person);
    }
}

