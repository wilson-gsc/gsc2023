package java2024.oopinjava.finals.discount;

import java.util.Date;
import java.util.Scanner;

public class TestDiscountSystemWithInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get customer name
		System.out.print("Enter customer name: ");
		String name = scanner.nextLine();

		// Get visit date (for simplicity, we'll use the current date)
		Date date = new Date(); 

		// Create a new visit
		Visit visit = new Visit(name, date);

		// Get membership information
		System.out.print("Is the customer a member (yes/no)? ");
		String memberInput = scanner.nextLine().toLowerCase();
		boolean isMember = memberInput.equals("yes"); 

		if (isMember) {
			System.out.print("Enter member type (Premium, Gold, Silver): ");
			String memberType = scanner.nextLine();
			visit.getCustomer().setMember(true);
			visit.getCustomer().setMemberType(memberType);
		}

		// Get service and product expenses
		System.out.print("Enter service expense: ");
		double serviceExpense = scanner.nextDouble();
		visit.setServiceExpense(serviceExpense);

		System.out.print("Enter product expense: ");
		double productExpense = scanner.nextDouble();
		visit.setProductExpense(productExpense);

		// Print visit details and total bill
		System.out.println("\n--- Visit Details ---\n");
		System.out.println(visit);
		
		System.out.println(visit.displayExpense());
		scanner.close(); 
	}
}
