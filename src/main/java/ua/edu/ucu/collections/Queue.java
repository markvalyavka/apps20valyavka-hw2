package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import java.util.Arrays;

public class Queue {

    private ImmutableLinkedList underlyingArray;

    public Queue() {
        underlyingArray = new ImmutableLinkedList(new Object[]{});
    }

    public Queue(Object[] arr) {
        underlyingArray = new ImmutableLinkedList(arr);
    }

    public void enqueue(Object e) {
        underlyingArray = underlyingArray.addLast(e);
    }

    public Object dequeue() {
        Object dequeued = underlyingArray.getFirst();
        underlyingArray = underlyingArray.removeFirst();
        return dequeued;
    }

    public Object peek() {
        return underlyingArray.getFirst();
    }

    @Override
    public String toString() {
        return "Queue(" + Arrays.toString(underlyingArray.toArray()) + ")";
    }

}

