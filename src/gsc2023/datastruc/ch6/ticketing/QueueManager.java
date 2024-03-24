package gsc2023.datastruc.ch6.ticketing;

import java.util.Scanner;

import gsc2023.datastruc.ch6.queue.ArrayQueue;
import gsc2023.datastruc.ch6.queue.Queue;

public class QueueManager {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Ticket> ticketQueue = new ArrayQueue<>();

        int ticketNumber = 1; // Start ticket numbering from 1
        boolean running = true;
        boolean fromExit = false;
        
        System.out.println("\nQueue Ticketing System (Version 2)");
        
        System.out.print("\nChange ticket queue default capacity \n"
        		+ "Enter 0 to use default: ");
        int inputCap = scanner.nextInt();
        if(inputCap > 0) {
        	ticketQueue = new ArrayQueue<>(inputCap);
        }
        
        while (running) {
        	if(fromExit) {
        		System.out.println("\nNotification: System is stil running.");
        	}
        	System.out.println("\n|-------------------------------------|");
        	System.out.println("|Storage Capacity of the queue is " + ticketQueue.capacity());
            System.out.println("|Size of the queue: " + ticketQueue.size());
            System.out.println("|Is the queue empty? " + checkIfEmpty(ticketQueue.isEmpty()));
            System.out.println("|Queue contents:");
            System.out.println(ticketQueue.toString());
            System.out.println("|-------------------------------------|");
            
            System.out.println("\nSelect an operation:");
            System.out.println("1. Create Ticket");
            System.out.println("2. Serve Ticket");
            System.out.println("3. Search Ticket by Label");
            System.out.println("4. Update Ticket by Label");
            System.out.println("-1. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after reading int

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket label: ");
                    String label = scanner.nextLine();
                    System.out.print("Enter ticket status \n[open | closed] : ");
                    String status = scanner.nextLine();
                    Ticket newTicket = new Ticket(ticketNumber++);
                    newTicket.setLabel(label);
                    if(checkStatus(status) == false) {
                    	System.out.println("\nStatus must be [open | closed] !!!");
                    } else {
                    	
                    	Ticket ticket = ticketQueue.getTicketByLabel(label);
                        if (ticket != null) {
                        	System.out.println("\n"+ ticket +" already exist!!!");
                        } else {
                        	newTicket.setStatus(status);
                            if(ticketQueue.enqueue2(newTicket) == true) {
                            	System.out.println("\nCan not add a new ticket. Queue is full !!!");
                            } else {
                            	System.out.println("\n" + newTicket + " is added to the queue.");
                            }
                        }
                    	
                    }
                    break;

                case 2:
                    Ticket servedTicket = ticketQueue.dequeue();
                    if (servedTicket != null) {
                        System.out.println("\n" + servedTicket + " is served.");
                    } else {
                        System.out.println("\nQueue is empty, no tickets to serve.");
                    }
                    break;

                case 3:
                	System.out.print("Search ticket label: ");
                    String lbl = scanner.nextLine();
                    Ticket ticket = ticketQueue.getTicketByLabel(lbl);
                    if (ticket != null) {
                    	System.out.println("\n" + ticket);
                    } else {
                        System.out.println("\nTicket "+ lbl +" does not exist!!!");
                    }
                    break;
                    
                case 4:
                	System.out.print("Input ticket label for update: ");
                    String lblToUpdate = scanner.nextLine();
                    Ticket ticketToUpdate = ticketQueue.getTicketByLabel(lblToUpdate);
                    if (ticketToUpdate != null) {
                    	System.out.print("Input new ticket label: ");
                        String newLbl = scanner.nextLine();
                        Ticket updatedTicket = ticketQueue.updateTicketByLabel(lblToUpdate, newLbl);
                        if (ticketToUpdate != null) {
                        	System.out.println("\n" + updatedTicket);
                        } 
                    } else {
                        System.out.println("\nTicket "+ lblToUpdate +" does not exist!!!");
                    }
                    break;

                case -1:
                	System.out.print("Are you sure you want to exit? Enter 0 if yes");
                    int ans = scanner.nextInt();
                    if(ans == 0) {
                    	running = false;
                        System.out.println("\nExiting Queue Ticketing System...");
                    } else {
                    	fromExit = true;
                    }
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
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
	
	public static boolean checkStatus(String s) {
		boolean flag = false;
		if(s.equals("open")) flag = true;
		if(s.equals("closed")) flag = true;
		return flag;
	}
	
}
