package comprog12.finals.exam.employee;

public class Employee {
    // Private fields
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
    
    // Getter methods
    public int getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getName() {
        return firstName + " " + lastName;
    }
    
    public int getSalary() {
        return salary;
    }
    
    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    // Method to get the annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }
    
    // Method to raise the salary by a given percentage
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }
    
    // toString method
    @Override
    public String toString() {
        return "Employee {"
        		+ "\n\tId: " + id + ",\n\tName: " + firstName + " " + lastName + ","
        				+ "\n\tSalary: " + salary + "\n}";
    }
}

