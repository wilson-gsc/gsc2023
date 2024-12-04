package datastruc2024.chap6.queue.list;

import datastruc2024.chap3.singly.SinglyLinkedList;
import datastruc2024.chap6.queue.Queue;

/** Realization of a FIFO queue as an adaptation of a SinglyLinkedList. */
public class LinkedQueue<E> implements Queue<E> {

	private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
	
	// private SinglyLinkedList<E> list = new SinglyLinkedList<>(); // an empty list
	public LinkedQueue() { } // new queue relies on the initially empty list
	
	public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
    
	public void enqueue(E element) { 
		Node<E> newNode = new Node<>(element, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
	}
	
	public E first() { 
		if (isEmpty()) {
            return null;  // or throw an exception
        }
        return head.getElement();
	}
	
	public E dequeue() { 
		// return list.removeFirst(); 
		if (isEmpty()) {
            return null;  // or throw an exception
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;  // if the queue is empty after dequeuing
        }
        return answer;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node<E> current = head;
		while (current != null) {
			sb.append(current.getElement());
			if (current.getNext() != null) {
				sb.append(" -> ");
			}
			current = current.getNext();
		}
		sb.append("]");
		return sb.toString();
	}
}
