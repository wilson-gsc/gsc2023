package java2024.oopinjava.finals.discount;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd yyyy E hh:mm a");

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
		return "Visit { "
				+ "\n\t" + customer.toString() + 
				",\n\tDate: " + outputFormat.format(date) + 
				",\n\tService Expense: Php " + serviceExpense +
				",\n\tProduct Expense: Php " + productExpense + 
				",\n\tTotal Expense:   Php " + this.getTotalExpense() +
				"\n}";
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
		Visit visit1 = new Visit("Bob", new Date());

		// Set expenses
		visit1.setServiceExpense(100);
		visit1.setProductExpense(50);

		// Print the visit details
		System.out.println(visit1); 

		// Update customer membership
		visit1.getCustomer().setMember(true);
		visit1.getCustomer().setMemberType("Premium");

		// Print the updated visit details (with discounts applied)
		System.out.println(visit1); 
	}
}