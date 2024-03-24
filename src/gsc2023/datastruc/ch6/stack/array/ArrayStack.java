package gsc2023.datastruc.ch6.stack.array;

import gsc2023.datastruc.ch6.stack.Stack;
import gsc2023.oop.finals.Item;

public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY=16; // default array capacity
	private E[ ] data; // generic array used for storage
	private int t = -1; // index of the top element in stack
	public ArrayStack( ) { this(CAPACITY); } // constructs stack with default capacity
	public ArrayStack(int capacity) { // constructs stack with given capacity
		data = (E[ ]) new Object[capacity]; // safe cast; compiler may give warning
	}
	public int size( ) { return (t + 1); }
	public boolean isEmpty( ) { return (t == -1); }
	public void push(E e) throws IllegalStateException {
		if (size( ) == data.length) throw new IllegalStateException("Stack is full");
		data[++t] = e; // increment t before storing new item
	}
	public boolean push2(E e) {
		boolean flag = false;
		if (size( ) == data.length) {
			flag = true;
		} else {
			data[++t] = e;
		}
		return flag;
	}
	public E top( ) {
		if (isEmpty( )) return null;
		return data[t];
	}
	public E pop( ) {
		if (isEmpty( )) return null;
		E answer = data[t];
		data[t] = null; // dereference to help garbage collection
		t--;
		return answer;
	}
	
	public int capacity( ) {
		return data.length;
	}
	
	public E getItemByID(int id) {
        for (int i = 0; i < size(); i++) {
            if (data[i] instanceof Item) { 
            	Item item = (Item) data[i];
                if (item.getId() == id) {
                    return (E) item;
                }
            }
        }
        return null; // Element not found
    }
	
	public E updateItemByID(int id, String desc) {
        for (int i = 0; i < size(); i++) {
            if (data[i] instanceof Item) { 
            	Item item = (Item) data[i];
                if (item.getId() == id) {
                	item.setDescription(desc);
                    return (E) item;
                }
            }
        }
        return null; // Element not found
    }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[\n");
		for (int i = 0; i <= t; i++) {
			sb.append(" "+data[i]);
			if (i < t) {
				sb.append(",\n");
			}
		}
		sb.append("\n]");
		return sb.toString();
	}
}
