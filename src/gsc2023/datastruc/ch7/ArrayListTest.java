package gsc2023.datastruc.ch7;

public class ArrayListTest {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        
        System.out.println("ArrayList: " + list);
        // Add elements
        list.add(0, "A");
        list.add(0, "B");
        System.out.println("add(0, A)");
        System.out.println("add(0, B)");
        System.out.println("ArrayList: " + list);

        // Get element
        String element1 = list.get(1);
        System.out.println("get(1) " + element1);

        // Set element
        // list.set(2, "C");
        System.out.println("set(2, C) : error");
        //System.out.println("After setting element at index 2 to C: " + list);
        System.out.println("add(2, C)");
        list.add(2, "C");
        System.out.println("ArrayList: " + list);
        //System.out.println("add(4, D)");
        //list.add(4, "D");
        System.out.println("add(4, D) : error");
        
        // Remove element
        String removedElement = list.remove(1);
        System.out.println("Removed element: " + removedElement);
        System.out.println("After removing element at index 1: " + list);
        
        list.add(1, "D");
        list.add(1, "E");
        System.out.println("add(1, D)");
        System.out.println("add(1, E)");
        System.out.println("ArrayList: " + list);
        
        //String element4 = list.get(4);
        //System.out.println("get("+element4+") ");
        System.out.println("get(4) : error");
        
        list.add(4, "F");
        System.out.println("add(4, F)");
        System.out.println("ArrayList: " + list);
        
        list.set(2, "G");
        System.out.println("set(2, G)");
        System.out.println("ArrayList: " + list);
        
        String element2 = list.get(2);
        System.out.println("get(1) " + element2);
        
        
        // Check isEmpty
        boolean isEmpty = list.isEmpty();
        System.out.println("ArrayList is empty: " + isEmpty);

        // Get size
        int size = list.size();
        System.out.println("ArrayList size: " + size);

        // Try to get element from empty list
        try {
            //element1 = list.get(0);
            //System.out.println("Element at index 0: " + element1); // This line won't be reached
        } catch (IndexOutOfBoundsException e) {
            //System.out.println("Index out of bounds exception: " + e.getMessage());
        }
    }
}
