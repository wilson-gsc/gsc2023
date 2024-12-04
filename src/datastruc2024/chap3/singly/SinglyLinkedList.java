package datastruc2024.chap3.singly;

public class SinglyLinkedList<E> {
	//-------------- nested Node class ----------------
	private static class Node<E> {
		private E element;			// reference to the element stored at this node
		private Node<E> next;		// reference to the subsequent node in the list
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() { return element; }
		public Node<E> getNext() { return next; }
		public void setNext(Node<E> n) { next = n; }
	}
	//----------- end of nested Node class -----------
	
	// instance variables of the SinglyLinkedList
	private Node<E> head = null;		// head node of the list (or null if empty)
	private Node<E> tail = null;		// last node of the list (or null if empty)
	private int size = 0;				// number of nodes in the list
	public SinglyLinkedList() {}		// constructs an initially empty list
	
	// access methods
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E first() {					// returns (but does not remove) the first element
		if (isEmpty()) return null; 
		return head.getElement();
	}
	public E last() {					// returns (but does not remove) the last element
		if (isEmpty()) return null;
		return tail.getElement(); }
	
	// update methods
	public void addFirst(E e) {
		head = new Node<>(e, head); 
		if (size == 0)
			tail = head; 
		size++;
	}
	
	public void addLast(E e) {		// adds element e to the end of the list
		Node<E> newest = new Node<E>(e, null);
		if (isEmpty()) head = newest;
		else tail.setNext(newest);
		tail = newest;
		size++;
	}
	
	public E removeFirst() {		// removes and returns the first element
		if (isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return answer;
	}
	
	// Public accessor method to iterate through the list elements
    public void displayList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.getElement() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
