package datastruc2024.chap3.singly;

public class SinglyLinkedListTest3 {
    public static void main(String[] args) {
    	// Step 1: Create a new SinglyLinkedList
        SinglyLinkedList<String> flightList = new SinglyLinkedList<>();
        
        // Step 2: Add initial elements (LAX, MSP, ATL, BOS)
        flightList.addLast("LAX");
        flightList.addLast("MSP");
        flightList.addLast("ATL");
        flightList.addLast("BOS");
        
        // Display initial state
        System.out.println("Initial flight list: ");
        flightList.displayList();
        
        // Step 3: Remove the head (LAX)
		System.out.println("\nRemoving the head (LAX): ");
        flightList.removeFirst();
        
        // Display after removing the head
        System.out.println("\nAfter removing the head (LAX): ");
        flightList.displayList();
    }
}