package java2024.oopinjava.finals.discount;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	// SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd yyyy E hh:mm a");
	SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd yyyy");

	public Visit(String name, Date date) {
		this.customer = new Customer(name);
		this.date = date;
	}


	public Customer getCustomer() {
		return customer;
	}

	public Date getDate() {
		return date;
	}

	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double ex) {
		this.productExpense = ex;
	}

	public double getTotalExpense() {
		double discountedService = getDiscountedService();
		double discountedProduct = getDiscountedProduct();

		return discountedService + discountedProduct;
	}

	public double getServiceDiscount(){
		double serviceDiscount = customer.isMember() ? 
				DiscountRate.getServiceDiscountRate(customer.getMemberType()) : 0.0;
		return serviceDiscount;
	}

	public double getProductDiscount(){
		double productDiscount = customer.isMember() ? 
				DiscountRate.getProductDiscountRate(customer.getMemberType()) : 0.0;
		return productDiscount;
	}

	public double getDiscountedService(){
		return serviceExpense * (1 - getServiceDiscount());
	}

	public double getDiscountedProduct(){
		return productExpense * (1 - getProductDiscount());
	}

	@Override
	public String toString() {
		if(customer.isMember()) {
			return "Visit { "
					+ "\n\t" + customer.toString() + 
					",\n\tDate: " + outputFormat.format(date) + 
					",\n\n\tService Expense        : Php " + serviceExpense +
					",\n\tLess: Service Discount : Php " + (serviceExpense * this.getServiceDiscount()) +
					",\n\tTotal Service          : Php " + (serviceExpense - (serviceExpense * this.getServiceDiscount())) + 
					",\n\n\tProduct Expense        : Php " + productExpense + 
					",\n\tLess: Product Discount : Php " + (this.getProductExpense() - this.getDiscountedProduct()) + 
					",\n\tTotal Product          : Php " + (productExpense - (this.getProductExpense() - this.getDiscountedProduct())) +
					",\n\n\n\tTotal Expense          : Php " + this.getTotalExpense() +
					"\n}";
		}else {
			return "Visit { "
					+ "\n\t" + customer.toString() + 
					",\n\tDate: " + outputFormat.format(date) + 
					",\n\tService Expense: Php " + serviceExpense +
					",\n\tProduct Expense: Php " + productExpense + 
					",\n\tTotal Expense:   Php " + this.getTotalExpense() +
					"\n}";
		}
		
	}

	public String displayComputation() {
		if(customer.isMember()) {
			return "\nComputation " + customer.getMemberType() 
			+ ": (((₱" + this.getServiceExpense()
			+ " - ₱" + this.getServiceDiscount() * 100
			+ ") + ₱" + this.getProductExpense() 
			+ ") - ₱" + (this.getProductExpense() - this.getDiscountedProduct())
			+ ") = ₱" + this.getTotalExpense();
		} else {
			return "\nComputation Non-Member"
					+ ": ₱" + this.getServiceExpense()
					+ " + ₱" + this.getProductExpense() 
					+ " = ₱" + this.getTotalExpense();
		}

	}

	public String displayExpense() {
		String ret = "";

		if(this.customer.getMemberType().equals("premium")) {
			this.customer.setMemberType("gold");
			ret += "\nTotal expense for gold membership: ₱" + this.getTotalExpense();
			this.customer.setMemberType("silver");
			ret += "\nTotal expense for silver membership: ₱" + this.getTotalExpense();
			this.customer.setMember(false);
			ret += "\nTotal expense for non member: ₱" + this.getTotalExpense();
		} else if(this.customer.getMemberType().equals("gold")) {
			this.customer.setMemberType("premium");
			ret += "\nTotal expense for premium membership: ₱" + this.getTotalExpense();
			this.customer.setMemberType("silver");
			ret += "\nTotal expense for silver membership: ₱" + this.getTotalExpense();
			this.customer.setMember(false);
			ret += "\nTotal expense for non member: ₱" + this.getTotalExpense();
		} else if(this.customer.getMemberType().equals("silver")) {
			this.customer.setMemberType("premium");
			ret += "\nTotal expense for premium membership: ₱" + this.getTotalExpense();
			this.customer.setMemberType("gold");
			ret += "\nTotal expense for gold membership: ₱" + this.getTotalExpense();
			this.customer.setMember(false);
			ret += "\nTotal expense for non member: ₱" + this.getTotalExpense();
		} else {
			this.customer.setMember(true);
			this.customer.setMemberType("premium");
			ret += "\nTotal expense for premium membership: ₱" + this.getTotalExpense();
			this.customer.setMemberType("gold");
			ret += "\nTotal expense for gold membership: ₱" + this.getTotalExpense();
			this.customer.setMemberType("silver");
			ret += "\nTotal expense for silver membership: ₱" + this.getTotalExpense();
		}


		return ret;
	}

	public static void main(String[] args) {
		// Create a new Visit object
		Visit visit1 = new Visit("Peter", new Date());
		visit1.getCustomer().setMember(true);
		visit1.getCustomer().setMemberType("Premium");
		
		// Set expenses
		visit1.setServiceExpense(100);
		visit1.setProductExpense(50);

		// Print the visit details
		System.out.println(visit1); 
		
		Visit visit2 = new Visit("Gilbert", new Date());
		// Update customer membership
		// visit2.getCustomer().setMember(false);
		visit2.getCustomer().setMember(true);
		visit2.getCustomer().setMemberType("Gold");
		
		visit2.setServiceExpense(100);
		visit2.setProductExpense(50);

		// Print the updated visit details (with discounts applied)
		System.out.println("\n"+visit2); 
		
		double expenseDifference = visit1.getTotalExpense() - visit2.getTotalExpense();
		if(expenseDifference < 0) {
			expenseDifference = -expenseDifference;
		}
		System.out.println("\nDifference in total expenses "
        		+ "of " + visit1.getCustomer().getName() + " and " + visit2.getCustomer().getName()
        		+ " is Php " + expenseDifference);
	}
}