package datastruc2024.chap6.stack;

public class TestArrayStack {

	public static void main(String[] args) {
		Stack<Integer> S = new ArrayStack<>(11); 
		System.out.println("Method\t\tReturn\t\tStack Contents\n"); 
		System.out.print("push(5)"); 
		S.push(5);
		System.out.println("\t\t\t\t    " + S.toString()); 
		System.out.print("push(3)");
		S.push(3);
		System.out.println("\t\t\t\t    " + S.toString());
		System.out.print("size()"); 
		System.out.print("\t\t  " + S.size( )); 
		System.out.println("\t\t    " + S.toString());
		System.out.print("pop()");
		System.out.print("\t\t  " + S.pop( )); 
		System.out.println("\t\t    " + S.toString());
		System.out.print("isEmpty()");
		System.out.print("\t  " + S.isEmpty( ));
		System.out.println("\t\t    " + S.toString());
		System.out.print("pop()");
		System.out.print("\t\t  " + S.pop( )); 
		System.out.println("\t\t    " + S.toString());
		System.out.print("isEmpty()");
		System.out.print("\t  " + S.isEmpty( ));
		System.out.println("\t\t    " + S.toString());
		System.out.print("pop()");
		System.out.print("\t\t  " + S.pop( )); 
		System.out.println("\t\t    " + S.toString());
		System.out.print("push(7)");
		S.push(7);
		System.out.println("\t\t\t\t    " + S.toString());
		System.out.print("push(9)");
		S.push(9);
		System.out.println("\t\t\t\t    " + S.toString());
		System.out.print("top()");
		System.out.print("\t\t  " + S.top( )); 
		System.out.println("\t\t    " + S.toString());
		System.out.print("push(4)");
		S.push(4);
		System.out.println("\t\t\t\t    " + S.toString());
		System.out.print("size()");
		System.out.print("\t\t  " + S.size( )); 
		System.out.println("\t\t    " + S.toString());
		System.out.print("pop()");
		System.out.print("\t\t  " + S.pop( )); 
		System.out.println("\t\t    " + S.toString());
		System.out.print("push(6)");
		S.push(6);
		System.out.println("\t\t\t\t    " + S.toString());
		System.out.print("push(8)");
		S.push(8);
		System.out.println("\t\t\t\t    " + S.toString());
		System.out.print("pop()");
		System.out.print("\t\t  " + S.pop( ));
		System.out.println("\t\t    " + S.toString());
		
		System.out.print("push(5)");
		S.push(5);
		S.push(5);S.push(5);S.push(5);S.push(5);
		S.push(5);S.push(5);S.push(5);
		System.out.println("\t\t\t\t    " + S.toString());
		
//		System.out.print("pop()");
//		S.pop();S.pop();S.pop();S.pop();
//		System.out.println("\t\t\t\t    " + S.toString());
		
		System.out.print("isEmpty()");
		System.out.print("\t  " + S.isEmpty( ));
		System.out.println("\t\t    " + S.toString());
		
//		System.out.print("pop()");
//		System.out.print("\t\t  " + S.pop( ));
//		System.out.println("\t\t    " + S.toString());
	}
}
