package gsc2023.datastruc.ch6.queue;

public class LinkedQueueTest {
	public static void main(String[] args) {
    	// Creating an LinkedQueue of Strings
        Queue<String> queue = new LinkedQueue<>();
        
        System.out.println("LinkedQueue: " + queue.toString());
        
        // Enqueueing elements
        System.out.println("enqueue (5)");
        queue.enqueue("5");
        System.out.println("enqueue (3)");
        queue.enqueue("3");
        
        System.out.println("LinkedQueue: " + queue.toString());
        
        // Displaying the size of the queue
        System.out.println("LinkedQueue size(): " + queue.size());
        
        // Displaying and removing elements from the queue
        if (!queue.isEmpty()) {
        	System.out.println("dequeue() " + queue.dequeue());
        }
        
        System.out.println("LinkedQueue: " + queue.toString());
        
        System.out.println("LinkedQueue is empty? " + checkIfEmpty(queue.isEmpty()));
        
        if (!queue.isEmpty()) {
        	System.out.println("dequeue() " + queue.dequeue());
        }
        
        System.out.println("LinkedQueue: " + queue.toString());
   
        System.out.println("LinkedQueue is empty? " + checkIfEmpty(queue.isEmpty()));
        
        // Trying to dequeue from an empty queue
        System.out.println("Dequeue from an empty queue: " + queue.dequeue()); // Should print null
        
        System.out.println("enqueue (7)");
        queue.enqueue("7");
        System.out.println("enqueue (9)");
        queue.enqueue("9");
        
        System.out.println("LinkedQueue: " + queue.toString());
        
        System.out.println("LinkedQueue first: " + queue.first());
        
        System.out.println("enqueue (4)");
        queue.enqueue("4");
        
        System.out.println("LinkedQueue: " + queue.toString());
    }
    
	public static String checkIfEmpty(boolean e) {
		if(e == true)
			return "Yes";
		else
			return "No";
	}
}
