package datastruc2024.chap6.dequeue;

public class DoublyLinkedListDeque<E> implements Deque<E> {

    // Node class for the doubly linked list
    private static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }
    }

    private Node<E> header;  // Sentinel node at the beginning
    private Node<E> trailer; // Sentinel node at the end
    private int size = 0;

    public DoublyLinkedListDeque() {
        header = new Node<>(null, null, null); // Create header
        trailer = new Node<>(null, header, null); // Create trailer
        header.next = trailer; // Link header and trailer
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return header.next.element; // The element after the header
    }

    @Override
    public E last() {
        if (isEmpty()) return null;
        return trailer.prev.element; // The element before the trailer
    }

    @Override
    public void addFirst(E e) {
        addBetween(e, header, header.next); // Insert new node between header and first element
    }

    @Override
    public void addLast(E e) {
        addBetween(e, trailer.prev, trailer); // Insert new node between last element and trailer
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.next); // Remove the first node
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.prev); // Remove the last node
    }

    /** Adds an element between the given nodes. */
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newNode = new Node<>(e, predecessor, successor); // Create and link new node
        predecessor.next = newNode;
        successor.prev = newNode;
        size++;
    }

    /** Removes the given node and returns its element. */
    private E remove(Node<E> node) {
        Node<E> predecessor = node.prev;
        Node<E> successor = node.next;
        predecessor.next = successor;
        successor.prev = predecessor;
        size--;
        return node.element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = header.next;
        while (current != trailer) {
            sb.append(current.element);
            current = current.next;
            if (current != trailer) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    /** Custom method to display emptiness status as "Yes" or "No" */
    public String isEmptyStatus() {
        return isEmpty() ? "Yes" : "No";
    }
}

