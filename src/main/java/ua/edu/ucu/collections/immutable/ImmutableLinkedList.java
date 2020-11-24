package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableLinkedList implements ImmutableList {

    private Node head;
    private Node tail;
    int size;

    public ImmutableLinkedList(Object[] arr) {

        // Array to doubly linked list
        size = arr.length;
        if (arr.length == 0) {
            tail = head = null;
        } else {
            head = new Node(arr[0]);
            tail = new Node(arr[arr.length - 1]);
            Node prev = head;
            for(int i = 1; i < size-1; i++) {
                Node newNode = new Node(arr[i]);
                newNode.prev = prev;
                prev.next = newNode;
            }
        }
    }

    @Override
    public ImmutableList add(Object e) {
        return null;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        return null;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public ImmutableList remove(int index) {
        return null;
    }

    @Override
    public ImmutableList set(int index, Object e) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ImmutableList clear() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String toString() {
        
    }
}
