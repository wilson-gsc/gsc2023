package datastruc2024.chap6.queue.array;

public class TestArrayQueue {
	public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        System.out.println("Method\t\tReturn\t\tfirst ← Q ← last"); 
        System.out.print("enqueue(5)"); 
        queue.enqueue(5);
		System.out.println("\t\t\t    " + queue.toString()); 
		System.out.print("enqueue(3)");
        queue.enqueue(3);
        System.out.println("\t\t\t    " + queue.toString()); 
        System.out.print("size()"); 
		System.out.print("\t\t  " + queue.size( )); 
		System.out.println("\t\t    " + queue.toString());
		System.out.print("dequeue()");
		System.out.print("\t  " + queue.dequeue( ));
		System.out.println("\t\t    " + queue.toString());
		System.out.print("isEmpty()");
		System.out.print("\t  " + queue.isEmpty( ));
		System.out.println("\t\t    " + queue.toString());
		System.out.print("dequeue()");
		System.out.print("\t  " + queue.dequeue( ));
		System.out.println("\t\t    " + queue.toString());
		System.out.print("isEmpty()");
		System.out.print("\t  " + queue.isEmpty( ));
		System.out.println("\t\t    " + queue.toString());
		System.out.print("dequeue()");
		System.out.print("\t  " + queue.dequeue( ));
		System.out.println("\t\t    " + queue.toString());
		System.out.print("enqueue(7)"); 
        queue.enqueue(7);
		System.out.println("\t\t\t    " + queue.toString()); 
		System.out.print("enqueue(9)"); 
        queue.enqueue(9);
		System.out.println("\t\t\t    " + queue.toString()); 
		System.out.print("first()");
		System.out.print("\t\t  " + queue.first( ));
		System.out.println("\t\t    " + queue.toString());
		System.out.print("enqueue(4)"); 
        queue.enqueue(4);
        System.out.println("\t\t\t    " + queue.toString());
    }
}
