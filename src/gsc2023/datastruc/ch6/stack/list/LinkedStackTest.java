package gsc2023.datastruc.ch6.stack.list;

public class LinkedStackTest {

	public static void main(String[] args) {
		LinkedStack<Integer> stack = new LinkedStack<>();
		
		System.out.println("LinkedStackTest...");
        System.out.println(stack);
        
        stack.push(5);
        System.out.println("push(5)\ncontents: " + stack);

        stack.push(3);
        System.out.println("push(3)\ncontents: " + stack);

        System.out.println("size: " + stack.size());

        System.out.println("pop: " + stack.pop());
        System.out.println("contents: " + stack + " isEmpty: " + (stack.isEmpty() ? "Yes" : "No"));

        System.out.println("pop: " + stack.pop());
        System.out.println("contents: " + stack + " isEmpty: " + (stack.isEmpty() ? "Yes" : "No"));

        System.out.println("pop: " + stack.pop());

        stack.push(7);
        System.out.println("push(7)\ncontents: " + stack);

        stack.push(9);
        System.out.println("push(9)\ncontents: " + stack);

        System.out.println("top: " + stack.top());

        stack.push(4);
        System.out.println("push(4)\ncontents: " + stack);

        System.out.println("size: " + stack.size());

        System.out.println("pop: " + stack.pop());
        System.out.println("contents: " + stack);

        stack.push(6);
        System.out.println("push(6)\ncontents: " + stack);

        stack.push(8);
        System.out.println("push(8)\ncontents: " + stack);

        System.out.println("pop: " + stack.pop());
        System.out.println("contents: " + stack);

	}

}
