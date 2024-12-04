package java2024.oopinjava.finals.discount;

import java.util.Date;
import java.util.Scanner;

public class TestDiscountSystemDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Get details for the first customer ---
        System.out.println("Enter details for the first customer:");
        Visit visit1 = getVisitDetails(scanner);

        // --- Get details for the second customer ---
        System.out.println("\nEnter details for the second customer:");
        Visit visit2 = getVisitDetails(scanner);

        // --- Print visit details and total bill for both customers ---
        System.out.println("\n--- Visit Details ---");
        System.out.println("Customer 1:\n" + visit1);
        System.out.println("Total expense for "+ visit1.getCustomer().getName()+" is : Php" + visit1.getTotalExpense());

        System.out.println("\nCustomer 2:\n" + visit2);
        System.out.println("Total expense for " + visit2.getCustomer().getName() +" is : Php" + visit2.getTotalExpense());

        // --- Calculate and print the difference in total expenses ---
        double expenseDifference = Math.abs(visit1.getTotalExpense() - visit2.getTotalExpense());
        System.out.println("\nDifference in total expenses: Php" + expenseDifference);

        scanner.close();
    }

    // Helper method to get visit details from the user
    private static Visit getVisitDetails(Scanner scanner) {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        Date date = new Date(); // Using current date for simplicity
        Visit visit = new Visit(name, date);

        System.out.print("Is the customer a member (yes/no)? ");
        String memberInput = scanner.nextLine().toLowerCase();
        boolean isMember = memberInput.equals("yes");

        if (isMember) {
            System.out.print("Enter member type (Premium, Gold, Silver): ");
            String memberType = scanner.nextLine();
            visit.getCustomer().setMember(true);
            visit.getCustomer().setMemberType(memberType);
        }

        System.out.print("Enter service expense: ");
        double serviceExpense = scanner.nextDouble();
        visit.setServiceExpense(serviceExpense);

        System.out.print("Enter product expense: ");
        double productExpense = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        visit.setProductExpense(productExpense);

        return visit;
    }
}
