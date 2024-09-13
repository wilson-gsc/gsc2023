package datastruc2024.chap2.inherit;

import java.util.Scanner;

public class PredatoryCreditCardTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customer = scanner.nextLine();

        System.out.print("Enter bank name: ");
        String bank = scanner.nextLine();

        System.out.print("Enter account number: ");
        String account = scanner.nextLine();

        System.out.print("Enter credit limit: ");
        int limit = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter annual percentage rate (APR): ");
        double apr = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        PredatoryCreditCard card = new PredatoryCreditCard(customer, bank, account, limit, initialBalance, apr);

        System.out.printf("%nInitial credit card balance: %.2f%n",card.getBalance());

        // Simulate charges and payments
        System.out.println("Simulate charges and payments ");
        System.out.println("Card charge: 100");
        card.charge(100);
        System.out.println("Card charge: 200");
        card.charge(200);
        System.out.println("Card make payment: 50");
        card.makePayment(50);
        System.out.println("Process monthly interest and fees ");
        card.processMonth(); // Process monthly interest and fees

        System.out.printf("%nUpdated credit card balance: %.2f%n",card.getBalance());

		scanner.close();
    }
}
