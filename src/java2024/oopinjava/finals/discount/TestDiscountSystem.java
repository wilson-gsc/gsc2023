package java2024.oopinjava.finals.discount;

import java.util.Date;

public class TestDiscountSystem {
	public static void main(String[] args) {
		// Create a new visit
		Visit visit = new Visit("Alice", new Date());

		// Set customer as a premium member
		visit.getCustomer().setMember(true);
		visit.getCustomer().setMemberType("Premium");

		// Set expenses
		visit.setServiceExpense(100);
		visit.setProductExpense(50);

		// Print visit details and total bill
		System.out.println(visit);
		//$100 - $20 + $50 - $5 = $125
		System.out.println(visit.displayComputation());
		System.out.println("\nTotal expense with Premium membership: ₱" + visit.getTotalExpense());
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");

		// Test with different membership types
		visit.getCustomer().setMemberType("Gold");
		System.out.println("\n"+visit);
		// System.out.println("\Gold Member: ₱100 - ₱15 + ₱50 - ₱5 = ₱130");
		System.out.println(visit.displayComputation());
		System.out.println("\nTotal expense with Gold membership: ₱" + visit.getTotalExpense());
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");
		
		visit.getCustomer().setMemberType("Silver");
		System.out.println("\n"+visit);
		// System.out.println("\Silver Member: ₱100 - ₱10 + ₱50 - ₱5 = ₱135");
		System.out.println(visit.displayComputation());
		System.out.println("\nTotal expense with Silver membership: ₱" + visit.getTotalExpense());
		
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");
		
		// Test with non-member
		visit.getCustomer().setMember(false);
		System.out.println("\n"+visit);
		// System.out.println("\Non-Member: ₱100 + ₱50 = ₱150");
//		System.out.println("\nNon-Member Computation: ₱" + visit.getServiceExpense()
//		+ " + ₱" + visit.getProductExpense() 
//		+ " = ₱" + visit.getTotalExpense());
		System.out.println(visit.displayComputation());
		System.out.println("\nTotal expense without membership: ₱" + visit.getTotalExpense());
	}
}
