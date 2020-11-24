package ua.edu.ucu.collections.immutable;

public class Node {
    Object item;
    Node prev;
    Node next;

    public Node(Object newItem) {
        item = newItem;
        prev = null;
        next = null;
    }
}
