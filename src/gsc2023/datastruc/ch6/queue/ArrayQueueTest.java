package gsc2023.datastruc.ch6.queue;

public class ArrayQueueTest {

    public static void main(String[] args) {
    	// Creating an ArrayQueue of Strings
        Queue<String> queue = new ArrayQueue<>();
        
        System.out.println("ArrayQueue: " + queue.toString());
        
        // Enqueueing elements
        System.out.println("enqueue (5)");
        queue.enqueue("5");
        System.out.println("enqueue (3)");
        queue.enqueue("3");
        
        System.out.println("ArrayQueue: " + queue.toString());
        
        // Displaying the size of the queue
        System.out.println("ArrayQueue size(): " + queue.size());
        
        // Displaying and removing elements from the queue
        if (!queue.isEmpty()) {
        	System.out.println("dequeue() " + queue.dequeue());
        }
        
        System.out.println("ArrayQueue: " + queue.toString());
        
        System.out.println("ArrayQueue is empty? " + checkIfEmpty(queue.isEmpty()));
        
        if (!queue.isEmpty()) {
        	System.out.println("dequeue() " + queue.dequeue());
        }
        
        System.out.println("ArrayQueue: " + queue.toString());
   
        System.out.println("ArrayQueue is empty? " + checkIfEmpty(queue.isEmpty()));
        
        // Trying to dequeue from an empty queue
        System.out.println("Dequeue from an empty queue: " + queue.dequeue()); // Should print null
        
        System.out.println("enqueue (7)");
        queue.enqueue("7");
        System.out.println("enqueue (9)");
        queue.enqueue("9");
        
        System.out.println("ArrayQueue: " + queue.toString());
        
        System.out.println("ArrayQueue first: " + queue.first());
        
        System.out.println("enqueue (4)");
        queue.enqueue("4");
        
        System.out.println("ArrayQueue: " + queue.toString());
    }
    
    public static String checkIfEmpty(boolean e) {
		if(e == true)
			return "Yes";
		else
			return "No";
	}
}

