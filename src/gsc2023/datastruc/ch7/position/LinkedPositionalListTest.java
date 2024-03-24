package gsc2023.datastruc.ch7.position;

public class LinkedPositionalListTest {
	public static void main(String[] args) {
        LinkedPositionalList<Integer> list = new LinkedPositionalList<>();

        // System.out.println("Is the list empty? " + list.isEmpty()); // Should print true
        
        Position<Integer> last = list.addLast(8);
        System.out.println("  Method       |   Return Value   |   List Contents");
        System.out.println("addLast(8)     |        "+last.getElement().toString() + "         |       " + list.toString());
        System.out.println("first()        |        "+list.first().getElement()    + "         |       " + list.toString());
        Position<Integer> afterFirst = list.addAfter(list.first(), 5);
        System.out.println("addAfter(p, 5) |        "+afterFirst.getElement().toString()+ "         |       " + list.toString());
          // Adding elements to the list
//        Position<Integer> first = list.addFirst(5);
//        
//        Position<Integer> beforeLast = list.addBefore(last, 8);
//        Position<Integer> afterFirst = list.addAfter(first, 3);
//
//        System.out.println("Is the list empty? " + list.isEmpty()); // Should print false
//        System.out.println("Size of the list: " + list.size()); // Should print 4
//
//        // Testing element retrieval and manipulation
//        System.out.println("First element: " + list.first().getElement()); // Should print 5
//        System.out.println("Last element: " + list.last().getElement()); // Should print 10
//        System.out.println("Element before last: " + list.before(last).getElement()); // Should print 8
//        System.out.println("Element after first: " + list.after(first).getElement()); // Should print 3
//
//        list.set(afterFirst, 7); // Set the element after first to 7
//        System.out.println("Element after first (changed): " + list.after(first).getElement()); // Should print 7
//
//        // Removing elements
//        list.remove(beforeLast); // Remove element before last
//        System.out.println("Size of the list after removal: " + list.size()); // Should print 3
//
//        // Testing iteration through the list
//        System.out.println("Elements in the list:");
//        System.out.println(list.toString());
    }
}
