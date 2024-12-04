package datastruc2024.chap6.dequeue;

public class CircularArrayDeque<E> implements Deque<E> {
    private static final int CAPACITY = 10; // Default array capacity
    private E[] data;
    private int front = 0;
    private int size = 0;

    public CircularArrayDeque() {
        data = (E[]) new Object[CAPACITY]; // Safe cast; generic array
    }

    public CircularArrayDeque(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Custom method to display emptiness status as "Yes" or "No" */
    public String isEmptyStatus() {
        return isEmpty() ? "Yes" : "No";
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[front];
    }

    @Override
    public E last() {
        if (isEmpty()) return null;
        int back = (front + size - 1) % data.length;
        return data[back];
    }

    @Override
    public void addFirst(E e) {
        if (size == data.length) resize(2 * data.length); // Resize if full
        front = (front - 1 + data.length) % data.length; // Circularly decrement front
        data[front] = e;
        size++;
    }

    @Override
    public void addLast(E e) {
        if (size == data.length) resize(2 * data.length); // Resize if full
        int avail = (front + size) % data.length; // Position to add at the end
        data[avail] = e;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = data[front];
        data[front] = null; // Help garbage collection
        front = (front + 1) % data.length; // Circularly increment front
        size--;
        return answer;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        int back = (front + size - 1) % data.length;
        E answer = data[back];
        data[back] = null; // Help garbage collection
        size--;
        return answer;
    }

    private void resize(int capacity) {
        E[] newData = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(front + i) % data.length];
        }
        data = newData;
        front = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[(front + i) % data.length]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}