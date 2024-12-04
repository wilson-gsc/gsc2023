package datastruc2024.chap3.singly;

public class SinglyLinkedListTest2 {
    public static void main(String[] args) {
    	// Step 1: Create a new SinglyLinkedList
        SinglyLinkedList<String> flightList = new SinglyLinkedList<>();
        
        // Step 2: Add initial elements (MSP, ATL, BOS)
        flightList.addLast("MSP");
        flightList.addLast("ATL");
        flightList.addLast("BOS");
        
        // Display initial state
        System.out.println("Initial flight list: ");
        flightList.displayList();
        
        // Step 3: Insert "MIA" at the tail
        System.out.println("\nInsert \"MIA\" at the tail: ");
        flightList.addLast("MIA");
        
        // Display after adding MIA at the tail
        System.out.println("\nAfter inserting MIA at the tail: ");
        flightList.displayList();
    }
}