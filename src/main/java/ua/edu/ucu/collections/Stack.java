package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import java.util.Arrays;

public class Stack {

    private ImmutableLinkedList underlyingArray;

    public Stack() {
        underlyingArray = new ImmutableLinkedList(new Object[]{});
    }

    public Stack(Object[] arr) {
        underlyingArray = new ImmutableLinkedList(arr);
    }

    public void push(Object e) {
        underlyingArray = underlyingArray.addLast(e);
    }

    public Object pop() {
        Object popped = underlyingArray.getLast();
        underlyingArray = underlyingArray.removeLast();
        return popped;
    }

    public Object peek() {
        return underlyingArray.getLast();
    }

    @Override
    public String toString() {
        return "Stack(" + Arrays.toString(underlyingArray.toArray()) + ")";
    }

}
