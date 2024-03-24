package gsc2023.oop.finals;

import java.util.Scanner;

import gsc2023.datastruc.ch6.queue.ArrayQueue;
import gsc2023.datastruc.ch6.queue.Queue;
import gsc2023.datastruc.ch6.stack.Stack;
import gsc2023.datastruc.ch6.stack.array.ArrayStack;
import gsc2023.datastruc.ch6.ticketing.Ticket;

public class ItemManager {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Item> itemStack = new ArrayStack<>();

        int itemId = 1; // Start item numbering from 1
        boolean running = true;
        
        System.out.println("\nStack Item System...");
        
        while (running) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Create Item");
            System.out.println("2. Pull Item");
            System.out.println("3. Check Stack Size");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Check Stack Capacity");
            System.out.println("7. Get Item by ID");
            System.out.println("-1. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after reading int

            switch (choice) {
                case 1:
                    System.out.print("Enter item description: ");
                    String description = scanner.nextLine();
                    Item newItem = new Item(itemId++, description);
//                    itemStack.push(newItem);
//                    System.out.println("\n" + newItem + " is added to the stack.");
                    
                    if(itemStack.push2(newItem) == true) {
                    	System.out.println("\nCan not add a new item. Stack is full !!!");
                    } else {
                    	System.out.println("\n" + newItem + " is added to the stack.");
                    }
                    
                    
                    break;

                case 2:
                	Item servedItem = itemStack.pop();
                    if (servedItem != null) {
                        System.out.println("Item pulled: " + servedItem);
                    } else {
                        System.out.println("Stack is empty, no items to pull.");
                    }
                    break;

                case 3:
                    System.out.println("Size of the stack: " + itemStack.size());
                    break;

                case 4:
                    System.out.println("Is the stack empty? " + checkIfEmpty(itemStack.isEmpty()));
                    break;

                case 5:
                    System.out.println("Stack contents:");
                    System.out.println(itemStack.toString());
                    break;
                    
                case 6:
                    System.out.println("\nStorage Capacity of the stack: " + itemStack.capacity());
                    break;
                    
                case 7:
                	System.out.print("Search item ID: ");
                    int id = scanner.nextInt();
                    Item item2 = itemStack.getItemByID(id);
                    if (item2 != null) {
                    	System.out.println("\n" + item2);
                    } else {
                        System.out.println("\nItem "+ id +" does not exist!!!");
                    }
                    break;
                    
                case -1:
                	System.out.print("Are you sure you want to exit? Enter 0 if yes");
                    int ans = scanner.nextInt();
                    if(ans == 0) {
                    	running = false;
                        System.out.println("Exiting Stack Item System...");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
	
	public static String checkIfEmpty(boolean e) {
		if(e == true)
			return "Yes";
		else
			return "No";
	}
}
