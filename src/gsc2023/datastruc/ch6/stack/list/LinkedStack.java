package gsc2023.datastruc.ch6.stack.list;

import gsc2023.datastruc.ch3.SinglyLinkedList;
import gsc2023.datastruc.ch6.stack.Stack;

/**
 * Code Fragment 6.4: Implementation of a Stack using a SinglyLinkedList as storage.
 *
 * @author Wilson A. Gayo
 */
public class LinkedStack<E> implements Stack<E> {
	private SinglyLinkedList<E> list = new SinglyLinkedList<>( ); // an empty list
	public LinkedStack( ) { } // new stack relies on the initially empty list
	public int size( ) { return list.size( ); }
	public boolean isEmpty( ) { return list.isEmpty( ); }
	public void push(E element) { list.addFirst(element); }
	public E top( ) { return list.first( ); }
	public E pop( ) { return list.removeFirst( ); }
	
	@Override
    public String toString() {
        StringBuilder result = new StringBuilder("contents: [");
        SinglyLinkedList.Node<E> current = list.getHead(); // Assuming Node is an inner class of SinglyLinkedList

        while (current != null) {
            result.append(current.getElement());
            current = current.getNext();

            if (current != null) {
                result.append(", ");
            }
        }

        result.append("]");
        return result.toString();
    }
	
}
