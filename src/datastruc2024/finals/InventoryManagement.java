package datastruc2024.finals;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagement {

    private static ArrayList<Item> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    viewInventory();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Exiting Inventory Management System.");
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nInventory Management System");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item");
        System.out.println("4. View Inventory");
        System.out.println("5. Search Item");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        scanner.nextLine(); // Consume newline

        Item newItem = new Item(name, id, quantity, price);
        inventory.add(newItem);
        System.out.println("Item added successfully!");
    }

    private static void removeItem() {
        System.out.print("Enter ID of item to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        inventory.removeIf(item -> item.getId() == id);
        System.out.println("Item removed successfully!");
    }

    private static void updateItem() {
        System.out.print("Enter ID of item to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Item item : inventory) {
            if (item.getId() == id) {
                System.out.print("Enter new name (or press Enter to skip): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    item.setName(name);
                }
                System.out.print("Enter new quantity (or 0 to skip): ");
                int quantity = scanner.nextInt();
                if (quantity > 0) {
                    item.setQuantity(quantity);
                }
                System.out.print("Enter new price (or 0 to skip): ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                if (price > 0) {
                    item.setPrice(price);
                }
                System.out.println("Item updated successfully!");
                return;
            }
        }

        System.out.println("Item not found!");
    }

    private static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : inventory) {
                System.out.println(item);
            }
        }
    }

    private static void searchItem() {
        System.out.print("Enter name or ID of item to search: ");
        String searchTerm = scanner.nextLine();

        try {
            int id = Integer.parseInt(searchTerm);
            for (Item item : inventory) {
                if (item.getId() == id) {
                    System.out.println("Item found: " + item);
                    return;
                }
            }
        } catch (NumberFormatException e) {
            // If the search term is not an integer, search by name
            for (Item item : inventory) {
                if (item.getName().equalsIgnoreCase(searchTerm)) {
                    System.out.println("Item found: " + item);
                    return;
                }
            }
        }

        System.out.println("Item not found!");
    }
}
