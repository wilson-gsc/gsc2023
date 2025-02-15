package java2024.oopinjava.finals.discount.retake;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
    	// Create a new Visit object
		Visit2 visit1 = new Visit2("Peter", new Date());
		visit1.getCustomer().setMember(true);
		visit1.getCustomer().setMemberType("Premium");
		
		// Set expenses
		visit1.setServiceExpense(100);
		visit1.setProductExpense(50);

		// Print the visit details
		System.out.println(visit1); 
		
		Visit2 visit2 = new Visit2("Gilbert", new Date());
		// Update customer membership
		 visit2.getCustomer().setMember(false);
		//visit2.getCustomer().setMember(true);
		//visit2.getCustomer().setMemberType("Gold");
		
		visit2.setServiceExpense(100);
		visit2.setProductExpense(50);

		// Print the updated visit details (with discounts applied)
		System.out.println("\n"+visit2); 
		
		double expenseDifference = visit1.getTotalExpense() - visit2.getTotalExpense();
		
		System.out.println("\nDifference in total expenses "
        		+ "of " + visit1.getCustomer().getName() + " and " + visit2.getCustomer().getName()
        		+ " is Php " + expenseDifference);
    }
}