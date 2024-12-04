package datastruc2024.chap3.doubly;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
    	DoublyLinkedList<String> list = new DoublyLinkedList<>();

        // Insert elements at the beginning
        list.addFirst("BWI");
        list.addFirst("JFK");
        list.addFirst("SFO");

        // Display the list after insertions
        System.out.println("List after insertions:");
        list.printList();

        // Insert an element at the beginning
        list.addFirst("PVD");

        // Display the list after insertion
        System.out.println("\nList after inserting PVD at the beginning:");
        list.printList();
    }
}

