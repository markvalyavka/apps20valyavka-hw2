package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.ImmutableList;

public class Queue {

    private ImmutableList underlyingArray;

    public Queue() {
        underlyingArray = new ImmutableLinkedList(new Object[]{});
    }

    public Queue(Object[] arr) {
        underlyingArray = new ImmutableLinkedList(arr);
    }

    public void enqueue(Object e) {
        underlyingArray = underlyingArray.add(underlyingArray.size(), e);
    }

    public Object dequeue() {
        Object dequeued = underlyingArray.get(0);
        underlyingArray = underlyingArray.remove(0);
        return dequeued;
    }
    
}
