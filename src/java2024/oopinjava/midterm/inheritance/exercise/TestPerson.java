package java2024.oopinjava.midterm.inheritance.exercise;

import java2024.oopinjava.midterm.inheritance.eg3.Person;

public class TestPerson {

	public static void main(String[] args) {
        // Test Person constructor and methods
        Person person = new Person("John Doe", "123 Main St.");
        System.out.println(person); // Output: Person [name=John Doe, address=123 Main St.]
        System.out.println("Test person's setAddress method");
        person.setAddress("456 Elm St.");
        System.out.println(person); // Output: Person [name=John Doe, address=456 Elm St.]

        // Test Student constructor and methods
        Student student = new Student("Jane Smith", "789 Oak St.", "Computer Science", 3, 5000.0);
        System.out.println("\n"+student); // Output: Student [Person [name=Jane Smith, address=789 Oak St.], program=Computer Science, year=3, fee=5000.0]
        System.out.println("Test student's setYear and setFee method");
        student.setYear(4);
        student.setFee(6000.0);
        System.out.println(student); // Output: Student [Person [name=Jane Smith, address=789 Oak St.], program=Computer Science, year=4, fee=6000.0]

        // Test Staff constructor and methods
        Staff staff = new Staff("Mike Johnson", "101 Pine St.", "University A", 45000.0);
        System.out.println("\n"+staff); // Output: Staff [Person [name=Mike Johnson, address=101 Pine St.], school=University A, pay=45000.0]
        System.out.println("Test staff's setPay method");
        staff.setPay(50000.0);
        System.out.println(staff); // Output: Staff [Person [name=Mike Johnson, address=101 Pine St.], school=University A, pay=50000.0]
    }
}
