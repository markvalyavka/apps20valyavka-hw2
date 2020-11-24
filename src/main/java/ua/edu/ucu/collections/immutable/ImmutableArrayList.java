package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList {

    private Object[] underlyingArray;
    private int capacity;
    private int size;

    public ImmutableArrayList() {
        underlyingArray = new Object[1];
        size = 0;
        capacity = 1;
    }

    public ImmutableArrayList(Object[] newUnderlyingArray) {
        underlyingArray = newUnderlyingArray;
        capacity = size = newUnderlyingArray.length;
    }

    public ImmutableArrayList(Object[] newUnderlyingArray, int newCapacity, int newSize) {
        underlyingArray = newUnderlyingArray;
        size = newSize;
        capacity = newCapacity;
    }

    private Object[] resizeAndCopyArray() {

        Object[] newUnderlyingArray = new Object[capacity*2];
        System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, size);
        return newUnderlyingArray;
    }

    @Override
    public ImmutableList add(Object e) {
        int newSize = size + 1;
        if (size == capacity) {
            int newCapacity = capacity * 2;
            Object[] newUnderlyingArray = resizeAndCopyArray();
            newUnderlyingArray[size] = e;
            return new ImmutableArrayList(newUnderlyingArray, newCapacity, newSize);
        } else {
            Object[] newUnderlyingArray = new Object[capacity];
            System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, size);
            newUnderlyingArray[size] = e;
            return new ImmutableArrayList(newUnderlyingArray, capacity, newSize);
        }
    }

    public void checkBounds(int index) {
        if (!(0 <= index && index < size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public ImmutableList add(int index, Object e) {
        checkBounds(index);
        int newSize = size + 1;
        if (size == capacity) {
            int newCapacity = capacity * 2;
            Object[] newUnderlyingArray = resizeAndCopyArray();
            System.arraycopy(newUnderlyingArray, index, newUnderlyingArray, index + 1, size - index);
            newUnderlyingArray[index] = e;
            return new ImmutableArrayList(newUnderlyingArray, newCapacity, newSize);
        } else {
            Object[] newUnderlyingArray = new Object[capacity];
            System.arraycopy(underlyingArray, index, newUnderlyingArray, index+1, size - index);
            newUnderlyingArray[index] = e;
            return new ImmutableArrayList(newUnderlyingArray, capacity, newSize);
        }
    }
    @Override
    public ImmutableList addAll(Object[] c) {
        Object[] newUnderlyingArray = new Object[size + c.length];
        System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, size);
        System.arraycopy(c, 0, newUnderlyingArray, size, c.length);
        return new ImmutableArrayList(newUnderlyingArray, size + c.length, size + c.length);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        checkBounds(index);
        Object[] newUnderlyingArray = new Object[size + c.length];
        System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, index);
        System.arraycopy(c, 0, newUnderlyingArray, index, c.length);
        System.arraycopy(underlyingArray, index, newUnderlyingArray, index + c.length, size - index);
        return new ImmutableArrayList(newUnderlyingArray, size + c.length, size + c.length);
    }

    @Override
    public Object get(int index) {
        checkBounds(index);
        return underlyingArray[index];
    }

    @Override
    public ImmutableList remove(int index) {
        checkBounds(index);
        Object[] newUnderlyingArray = new Object[size-1];
        System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, index);
        System.arraycopy(underlyingArray, index+1, newUnderlyingArray, index, size-index-1);
        return new ImmutableArrayList(newUnderlyingArray, size-1, size-1);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        checkBounds(index);
        Object[] newUnderlyingArray = new Object[size];
        System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, size);
        newUnderlyingArray[index] = e;
        return new ImmutableArrayList(newUnderlyingArray, size, size);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (underlyingArray[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ImmutableList clear() {
        Object[] newUnderlyingArray = new Object[size];
        System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, size);
        Arrays.fill(newUnderlyingArray, null);
        return new ImmutableArrayList(newUnderlyingArray, size, size);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {
        Object[] newUnderlyingArray = new Object[size];
        System.arraycopy(underlyingArray, 0, newUnderlyingArray, 0, size);
        return newUnderlyingArray;
    }

    @Override
    public String toString() {
        return "ImmutableArrayList("+ Arrays.toString(underlyingArray) + ", size = " +
                size + ", capacity = " + capacity + ")";
    }
}
