package datastruc2024.chap6.dequeue;

public class CircularArrayDequeTest {
    public static void main(String[] args) {
        CircularArrayDeque<Integer> deque = new CircularArrayDeque<>(10);
        
        System.out.println("Method\t\tReturn Value\t\tD"); 
        
        System.out.print("addLast(5)"); 
        deque.addLast(5);      // (5)
        System.out.println("\t\t\t     " + deque.toString()); 
        
        System.out.print("addFirst(3)"); 
        deque.addFirst(3);     // (3, 5)
        System.out.println("\t\t\t     " + deque.toString()); 
        
        System.out.print("addFirst(7)"); 
        deque.addFirst(7);     // (7, 3, 5)
        System.out.println("\t\t\t     " + deque.toString()); 
        
        System.out.print("first()");
        System.out.print("\t\t     " + deque.first()); 
        System.out.println("\t\t     " + deque.toString()); 
        
        
        System.out.print("removeLast()");
        System.out.print("\t     " + deque.removeLast());
        System.out.println("\t\t     " + deque.toString()); 
       
        System.out.print("size()");
        System.out.print("\t\t     " + deque.size());
        System.out.println("\t\t     " + deque.toString()); 
        
        System.out.print("removeLast()");
        System.out.print("\t     " + deque.removeLast());
        System.out.println("\t\t     " + deque.toString());
        
        System.out.print("removeFirst()");
        System.out.print("\t     " + deque.removeFirst());
        System.out.println("\t\t     " + deque.toString());
        
        System.out.print("isEmpty()?");
        System.out.print("\t     " + deque.isEmptyStatus()); 
        System.out.println("\t     " + deque.toString());
        
        System.out.print("addFirst(6)"); 
        deque.addFirst(6);
        System.out.println("\t\t\t     " + deque.toString()); 
        
        System.out.print("last()");
        System.out.print("\t\t     " + deque.last()); 
        System.out.println("\t\t     " + deque.toString());
        
        System.out.print("addFirst(8)"); 
        deque.addFirst(8);
        System.out.println("\t\t\t     " + deque.toString()); 
        
        System.out.print("isEmpty()?");
        System.out.print("\t     " + deque.isEmptyStatus()); 
        System.out.println("\t\t     " + deque.toString());
        
        System.out.print("last()");
        System.out.print("\t\t     " + deque.last()); 
        System.out.println("\t\t     " + deque.toString());
        
        
        //System.out.println(deque.removeLast()); // Expected: 5
        //System.out.println(deque); // Expected: [7, 3]
        //System.out.println(deque.size()); // Expected: 2
        //System.out.println(deque.removeLast()); // Expected: 3
        //System.out.println(deque.removeFirst()); // Expected: 7
        //System.out.println(deque); // Expected: []
        //deque.addFirst(6);     // (6)
        //System.out.println(deque.last()); // Expected: 6
        //deque.addFirst(8);     // (8, 6)
        //System.out.println(deque); // Expected: [8, 6]
        //System.out.println(deque.isEmpty()); // Expected: false
        //System.out.println(deque.last());    // Expected: 6
    }
}