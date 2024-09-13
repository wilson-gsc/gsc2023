package java2024.oopinjava.prelim.exercises.emp;

public class Employee {
    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for id
    public int getId() { return id; }

    // Getter for firstName
    public String getFirstName() { return firstName; }

    // Getter for lastName
    public String getLastName() { return lastName; }

    // Getter for full name
    public String getName() { return firstName + " " + lastName; }

    // Getter for salary
    public int getSalary() { return salary; }

    // Setter for salary
    public void setSalary(int salary) { this.salary = salary; }

    // Method to calculate and return annual salary
    public int getAnnualSalary() { return salary * 12; }

    // Method to raise salary by a given percentage
    public int raiseSalary(int percent) {
        this.salary += (this.salary * percent / 100);
        return this.salary;
    }

    // Override toString() method for string representation of Employee
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
