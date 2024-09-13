package datastruc2024.chap1.credit;

import java.util.Scanner;

public class CreditCard {
	// Instance variables:
	private String customer;     // name of the customer (e.g., "John Bowman")
	private String bank;         // name of the bank (e.g., "California Savings")
	private String account;      // account identifier (e.g., "5391 0375 9387 5309")
	private int limit;           // credit limit (measured in dollars)
	protected double balance;    // current balance (measured in dollars)

	// Constructors:
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
		this.customer = cust;
		this.bank = bk;
		this.account = acnt;
		this.limit = lim;
		this.balance = initialBal;
	}

	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0);  // use a balance of zero as default
	}

	// Accessor methods:
	public String getCustomer() { return this.customer; }
	public String getBank() { return this.bank; }
	public String getAccount() { return this.account; }
	public int getLimit() { return this.limit; }
	public double getBalance() { return this.balance; }

	// Update methods:
	public boolean charge(double price) {            // make a charge
		if (price + balance > limit)                 // if charge would surpass limit
			return false;                            // refuse the charge
		// at this point, the charge is successful
		balance += price;                            // update the balance
		return true;                                 // announce the good news
	}

	public void makePayment(double amount) {         // make a payment
		balance -= amount;
	}

	// Utility method to print a card's information
	public static void printSummary(CreditCard card) {
		System.out.println("\nCustomer = " + card.customer);
		System.out.println("Bank = " + card.bank);
		System.out.println("Account = " + card.account);
		System.out.println("Balance = " + card.balance);  // implicit cast
		System.out.println("Limit = " + card.limit + "\n");      // implicit cast
	}

	// main method
	public static void main(String[ ] args) {
//		CreditCard[ ] wallet = new CreditCard[3];
//		wallet[0] = new CreditCard("John Bowman", "California Savings",
//								   "5391 0375 9387 5309", 5000); 
//		wallet[1] = new CreditCard("John Bowman", "California Federal",
//								   "3485 0399 3395 1954", 3500); 
//		wallet[2] = new CreditCard("John Bowman", "California Finance",
//								   "5391 0375 9387 5309", 2500, 300);
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of credit cards: ");
        int numCards = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        CreditCard[] wallet = new CreditCard[numCards];

        for (int i = 0; i < numCards; i++) {
            System.out.println("\nCard " + (i + 1) + ":");

            System.out.print("Customer name: ");
            String customer = scanner.nextLine();

            System.out.print("Bank name: ");
            String bank = scanner.nextLine();

            System.out.print("Account number: ");
            String account = scanner.nextLine();

            System.out.print("Credit limit: ");
            int limit = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Initial balance: ");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            wallet[i] = new CreditCard(customer, bank, account, limit, initialBalance);
            
            for (int val = 1; val <= 16; val++) { 
    			wallet[i].charge(3*val); 
    		}
        }
        
        scanner.close();
		
//		for (int val = 1; val <= 16; val++) { 
//			wallet[0].charge(3*val); 
//			wallet[1].charge(2*val); 
//			wallet[2].charge(val);
//		}
		
		System.out.println("\n- - - - - - - - - - - - - - - - - -");
		
		for (CreditCard card : wallet) { 
			CreditCard.printSummary(card); 
			while (card.getBalance() > 200.0) {
				card.makePayment(200);
				// calling static method
				System.out.println("New balance = " + card.getBalance( )); 
			}
		} 
	}
}
