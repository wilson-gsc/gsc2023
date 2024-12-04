package datastruc2024.chap3.doubly;

/** A basic doubly linked list implementation. */ 
public class DoublyLinkedList<E> {
	//---------------- nested Node class ----------------
	private static class Node<E> {
		private E element;				// reference to the element stored at this node 
		private Node<E> prev;			// reference to the previous node in the list
		private Node<E> next;			// reference to the subsequent node in the list
		public Node(E e, Node<E> p, Node<E> n) {
			element = e; 
			prev = p; 
			next = n;
		}
		public E getElement() { return element; } 
		public Node<E> getPrev() { return prev; } 
		public Node<E> getNext() { return next; } 
		public void setPrev(Node<E> p) { prev = p; } 
		public void setNext(Node<E> n) { next = n; }
	} 
	//----------- end of nested Node class -----------
	// instance variables of the DoublyLinkedList
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	/** Constructs a new empty list. */ 
	public DoublyLinkedList( ) {
		header = new Node<>(null, null, null); 
		trailer = new Node<>(null, header, null); 
		header.setNext(trailer);
	}
	
	/** Returns the number of elements in the linked list. */ 
	public int size() { return size; }
	/** Tests whether the linked list is empty. */
	public boolean isEmpty() { return size == 0; }
	
	/** Returns (but does not remove) the first element of the list. */ 
	public E first( ) {
		if (isEmpty()) return null;
		return header.getNext().getElement(); // first element is beyond header 
	}
		/** Returns (but does not remove) the last element of the list. */ 
	public E last( ) {
		if (isEmpty()) 
			return null;
		return trailer.getPrev().getElement(); // last element is before trailer 
	}
	
	/** Adds an element to the front of the list. */ 
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	/** Adds an element to the end of the list. */ 
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	/** Removes and returns the first element of the list. */ 
	public E removeFirst( ) {
		if (isEmpty())
			return null;
		return remove(header.getNext());
	}
	
	/** Removes and returns the last element of the list. */ 
	public E removeLast( ) {
		if (isEmpty())
			return null;
		return remove(trailer.getPrev());
	}
	
	/** Adds an element to the linked list in between the given nodes. */ 
	public void addBetween(E e, Node<E> prev, Node<E> next) {
		Node<E> newest = new Node<>(e, prev, next);
		prev.setNext(newest);
		next.setPrev(newest);
		size++;
	}
	
	/** Removes the given node from the list and returns its element. */ 
	private E remove(Node<E> node) {
		Node<E> prev = node.getPrev();
		Node<E> next = node.getNext();
		prev.setNext(next);
		next.setPrev(prev);
		size--;
		return node.getElement();
	}
	
	public void printList() {
		Node<E> current = header.getNext();
		while (current != trailer) {
			System.out.print(current.getElement() + " ");
			current = current.getNext();
		}
		System.out.println();
	}

}
