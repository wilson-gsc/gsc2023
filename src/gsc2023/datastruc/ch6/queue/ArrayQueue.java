package gsc2023.datastruc.ch6.queue;

import gsc2023.datastruc.ch6.ticketing.Ticket;

/** Implementation of the queue ADT using a fixed-length array. */
public class ArrayQueue<E> implements Queue<E> {
	// instance variables
	public static final int CAPACITY=16; // default array capacity
	private E[ ] data; // generic array used for storage
	private int f = 0; // index of the front element
	private int sz = 0; // current number of elements

	// constructors
	public ArrayQueue( ) {this(CAPACITY);} // constructs queue with default capacity
	public ArrayQueue(int capacity) { // constructs queue with given capacity
		data = (E[ ]) new Object[capacity];  // safe cast; compiler may give warning
	}

	// methods
	/** Returns the number of elements in the queue. */
	public int size( ) { return sz; }

	/** Tests whether the queue is empty. */
	public boolean isEmpty( ) { return (sz == 0); }

	/** Inserts an element at the rear of the queue. */
	public void enqueue(E e) throws IllegalStateException {
		if (sz == data.length) throw new IllegalStateException("Queue is full");
		int avail = (f + sz) % data.length; // use modular arithmetic
		data[avail] = e;
		sz++;
	}
	
	public boolean enqueue2(E e) {
		boolean flag = false;
		if (sz == data.length) {
			flag = true;
		} else {
			int avail = (f + sz) % data.length; // use modular arithmetic
			data[avail] = e;
			sz++;
		}
		return flag;
	}

	/** Returns, but does not remove, the first element of the queue (null if empty). */
	public E first( ) {
		if (isEmpty( )) return null;
		return data[f];
	}

	/** Removes and returns the first element of the queue (null if empty). */
	public E dequeue( ) {
		if (isEmpty( )) return null;
		E answer = data[f];
		data[f] = null; // dereference to help garbage collection
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
	
	public int capacity( ) {
		return data.length;
	}
	
	public E[] getData() {
		return data;
	}
	
	public E getTicketByLabel(String lbl) {
        for (int i = 0; i < sz; i++) {
            int index = (f + i) % data.length;
            if (data[index] instanceof Ticket) { 
                Ticket ticket = (Ticket) data[index];
                if (ticket.getLabel().equals(lbl)) {
                    return (E) ticket;
                }
            }
        }
        return null; // Element not found
    }
	
	public E updateTicketByLabel(String lbl, String newLbl) {
        for (int i = 0; i < sz; i++) {
            int index = (f + i) % data.length;
            if (data[index] instanceof Ticket) { 
                Ticket ticket = (Ticket) data[index];
                if (ticket.getLabel().equals(lbl)) {
                	ticket.setLabel(newLbl);
                    return (E) ticket;
                }
            }
        }
        return null; // Element not found
    }
	
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        for (int i = 0; i < sz; i++) {
            int index = (f + i) % data.length;
            sb.append(" "+data[index]);
            if (i < sz - 1) {
                sb.append(",\n");
            }
        }
        sb.append("\n]");
        return sb.toString();
    }
	
}