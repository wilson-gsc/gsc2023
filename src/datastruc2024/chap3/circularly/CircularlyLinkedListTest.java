package datastruc2024.chap3.circularly;

public class CircularlyLinkedListTest {
	public static void main(String[] args) {
        // Step 1: Create a CircularlyLinkedList
        CircularlyLinkedList<String> flightList = new CircularlyLinkedList<>();
        
        // Step 2: Add elements (LAX, MSP, ATL, BOS)
        flightList.addLast("LAX");
        flightList.addLast("MSP");
        flightList.addLast("ATL");
        flightList.addLast("BOS");
        
        // Display the list before rotation
        System.out.println("Before rotation:");
        flightList.displayList();
        
        // Step 3: Rotate the list
        flightList.rotate();
        
        // Display the list after the first rotation
        System.out.println("\nAfter first rotation:");
        flightList.displayList();
        
        // Perform addFirst operation to add "STL" (St. Louis) to the front
        flightList.addFirst("STL");
        System.out.println("\nFlight List after addFirst(STL):");
		flightList.displayList();
    }
}
