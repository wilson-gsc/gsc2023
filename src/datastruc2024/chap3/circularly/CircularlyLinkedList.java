package datastruc2024.chap3.circularly;

public class CircularlyLinkedList<E> {
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

	// instance variables of the CircularlyLinkedList
	private Node<E> tail = null; 		// we store tail (but not head)
	private int size = 0;				// number of nodes in the list
	public CircularlyLinkedList() { } 	// constructs an initially empty list
	// access methods
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E first() { 					// returns (but does not remove) the first element
		if (isEmpty()) return null;
		return tail.getNext().getElement(); // the head is *after* the tail
	}
	public E last() {
		if (isEmpty()) return null;
		return tail.getElement(); 
	}

	//update methods
	public void rotate() { if (tail != null)
		tail = tail.getNext();
	}

	public void addFirst(E e) {
		if (size == 0) {
			tail = new Node<>(e, null); tail.setNext(tail);
		} else {
			Node<E> newest = new Node<>(e, tail.getNext()); tail.setNext(newest);
		}
		size++;
	}
	
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	
	public E removeFirst( ) {
		if (isEmpty( )) return null; 
		Node<E> head = tail.getNext( ); 
		if (head == tail) tail = null;
		else tail.setNext(head.getNext( )); 
		size--;
		return head.getElement( );
	}
	
	// Display the circular list for visualization
    public void displayList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node<E> current = tail.getNext();  // start from head (tail's next)
        do {
            System.out.print(current.getElement() + " -> ");
            current = current.getNext();
        } while (current != tail.getNext());  // stop when back at head
        System.out.println("(back to head)");
    }
}
