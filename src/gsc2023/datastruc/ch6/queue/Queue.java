package gsc2023.datastruc.ch6.queue;

public interface Queue<E>  {
	/** Returns the number of elements in the queue. */
	int size( );
	/** Tests whether the queue is empty. */
	boolean isEmpty( );
	/** Inserts an element at the rear of the queue. */
	void enqueue(E e);
	/** Returns, but does not remove, the first element of the queue (null if empty). */
	E first( );
	/** Removes and returns the first element of the queue (null if empty). */
	E dequeue( );
	int capacity( );
	boolean enqueue2(E e);
	E getTicketByLabel(String lbl); 
	E updateTicketByLabel(String lbl, String newLbl);
}
