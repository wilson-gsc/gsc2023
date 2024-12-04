package datastruc2024.chap3.singly;

public class SinglyLinkedListTest {
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
        
        // Step 3: Insert "LAX" at the head
        System.out.println("\nInserting \"LAX\" at the head");
        flightList.addFirst("LAX");
        
        // Display after adding LAX at the head
        System.out.println("\nAfter inserting LAX at the head: ");
        flightList.displayList();
    }
}