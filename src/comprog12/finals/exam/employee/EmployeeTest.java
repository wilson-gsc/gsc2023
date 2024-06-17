package comprog12.finals.exam.employee;

public class EmployeeTest {
	public static void main(String[] args) {
		// Test constructor and toString()
		System.out.println("Create Employee e1 instance using constructor");
		Employee e1 = new Employee(8, "Peter", "Tan", 2500);
		System.out.println("\n" + e1);  // toString();

		// Test Setters and Getters
		System.out.println("\ne1 instance update salary to 999 ");
		e1.setSalary(999);
		System.out.println("\n" + e1);  // toString();
		System.out.println("\nDisplay e1 instance details");
		System.out.println("\nId: " + e1.getId());
		System.out.println("First Name: " + e1.getFirstName());
		System.out.println("Last Name: " + e1.getLastName());
		System.out.println("Salary: " + e1.getSalary());

		System.out.println("\nFull Name: " + e1.getName());
		System.out.println("Annual Salary: " + e1.getAnnualSalary()); // Test method

		// Test raiseSalary()
		System.out.println("\nRaise Salary to 10%: " + e1.raiseSalary(10));
		System.out.println("\n" + e1);
	}
}