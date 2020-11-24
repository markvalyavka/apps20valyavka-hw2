package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testToString() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        assertEquals("ImmutableLinkedList([2, 3, 7, 9, 5])", arr.toString());
    }

    @Test
    public void testConstructor() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        assertEquals("ImmutableLinkedList([2, 3, 7, 9, 5])", arr.toString());
    }

    @Test
    public void testAdd() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableList arr2 = arr.add(13);
        assertEquals("ImmutableLinkedList([2, 3, 7, 9, 5, 13])", arr2.toString());
    }

    @Test
    public void testAddAtIndex() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableList arr2 = arr.add(2, 13);
        assertEquals("ImmutableLinkedList([2, 3, 13, 7, 9, 5])", arr2.toString());
    }

    @Test
    public void testAddAll() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableList arr2 = arr.addAll(new Object[]{1, 2, 3});
        assertEquals("ImmutableLinkedList([2, 3, 7, 9, 5, 1, 2, 3])", arr2.toString());
    }

    @Test
    public void testAddAllAtIndex() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableList arr2 = arr.addAll(2, new Object[]{1, 2, 3});
        assertEquals("ImmutableLinkedList([2, 3, 1, 2, 3, 7, 9, 5])", arr2.toString());
    }

    @Test
    public void testGet() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        Object elm = arr.get(2);
        assertEquals(7, elm);
    }

    @Test
    public void testRemove() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableList arr2 = arr.remove(2);
        assertEquals("ImmutableLinkedList([2, 3, 9, 5])", arr2.toString());
    }

    @Test
    public void testSet() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableList arr2 = arr.set(2, -100);
        assertEquals("ImmutableLinkedList([2, 3, -100, 9, 5])", arr2.toString());
    }

    @Test
    public void testIndexOf() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        assertEquals(3, arr.indexOf(9));
    }

    @Test
    public void testSize() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        assertEquals(5, arr.size());
    }

    @Test
    public void testClear() {
        ImmutableList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        assertEquals("ImmutableLinkedList([null, null, null, null, null])", arr.clear().toString());
    }

    @Test
    public void testGetFirst() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        assertEquals(2, arr.getFirst());
    }

    @Test
    public void testGetLast() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        assertEquals(5, arr.getLast());
    }

    @Test
    public void testAddFirst() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableLinkedList arr2 = arr.addFirst(1);
        assertEquals("ImmutableLinkedList([1, 2, 3, 7, 9, 5])", arr2.toString());
    }

    @Test
    public void testAddLast() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableLinkedList arr2 = arr.addLast(100);
        assertEquals("ImmutableLinkedList([2, 3, 7, 9, 5, 100])", arr2.toString());
    }

    @Test
    public void testRemoveFirst() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableLinkedList arr2 = arr.removeFirst();
        assertEquals("ImmutableLinkedList([3, 7, 9, 5])", arr2.toString());
    }

    @Test
    public void testRemoveLast() {
        ImmutableLinkedList arr = new ImmutableLinkedList(new Object[]{2, 3, 7, 9, 5});
        ImmutableLinkedList arr2 = arr.removeLast();
        assertEquals("ImmutableLinkedList([2, 3, 7, 9])", arr2.toString());
    }

}
