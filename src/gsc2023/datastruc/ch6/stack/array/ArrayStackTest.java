package gsc2023.datastruc.ch6.stack.array;

import gsc2023.datastruc.ch6.stack.Stack;

public class ArrayStackTest {

	public static void main(String[] args) {
//		Stack<Integer> S = new ArrayStack<>( ); // contents: ()
//		S.push(5); 								// contents: (5)
//		S.push(3); 								// contents: (5, 3)
//		System.out.println(S.size( )); 			// contents: (5, 3) outputs 2
//		System.out.println(S.pop( )); 			// contents: (5) outputs 3
//		System.out.println(S.isEmpty( )); 		// contents: (5) outputs false
//		System.out.println(S.pop( )); 			// contents: () outputs 5
//		System.out.println(S.isEmpty( )); 		// contents: () outputs true
//		System.out.println(S.pop( )); 			// contents: () outputs null
//		S.push(7); 								// contents: (7)
//		S.push(9); 								// contents: (7, 9)
//		System.out.println(S.top( )); 			// contents: (7, 9) outputs 9
//		S.push(4); 								// contents: (7, 9, 4)
//		System.out.println(S.size( )); 			// contents: (7, 9, 4) outputs 3
//		System.out.println(S.pop( )); 			// contents: (7, 9) outputs 4
//		S.push(6); 								// contents: (7, 9, 6)
//		S.push(8); 								// contents: (7, 9, 6, 8)
//		System.out.println(S.pop( )); 			// contents: (7, 9, 6) outputs 8
			
		
		
		
		
		
		
		
		
		System.out.println("ArrayStack Test...");
		Stack<Integer> S = new ArrayStack<>( );
		System.out.println("contents: " + S.toString());
		System.out.println("push(5)");
		S.push(5);
		System.out.println("contents: " + S.toString());
		System.out.println("push(3)");
		S.push(3);
		System.out.println("contents: " + S.toString());
		System.out.println("size: " + S.size( )); 
		System.out.println("pop: " + S.pop( ));
		System.out.println("contents: " + S.toString() + " isEmpty: " + checkIfEmpty(S.isEmpty( )));
		System.out.println("pop: " + S.pop( ));
		System.out.println("contents: " + S.toString() + " isEmpty: " + checkIfEmpty(S.isEmpty( )));
		System.out.println("pop: " + S.pop( ));
		System.out.println("push(7)");
		S.push(7);
		System.out.println("contents: " + S.toString());
		System.out.println("push(9)");
		S.push(9);
		System.out.println("contents: " + S.toString());
		System.out.println("top: " + S.top( ));
		System.out.println("push(4)");
		S.push(4);
		System.out.println("contents: " + S.toString());
		System.out.println("size: " + S.size( ));
		System.out.println("pop: " + S.pop( ));
		System.out.println("contents: " + S.toString());
		System.out.println("push(6)");
		S.push(6);
		System.out.println("contents: " + S.toString());
		System.out.println("push(8)");
		S.push(8);
		System.out.println("contents: " + S.toString());
		System.out.println("pop: " + S.pop( ));
		System.out.println("contents: " + S.toString());
		
}

	public static String checkIfEmpty(boolean e) {
		if(e == true)
			return "Yes";
		else
			return "No";
	}
}
