package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    
    @Test
    public void testImmutability() {
        ImmutableList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        assertNotEquals(arr, arr2);
    }

    @Test
    public void testEmptyImmutableListString() {
        ImmutableList arr = new ImmutableArrayList();
        assertEquals("ImmutableArrayList([null], size = 0, capacity = 1)", arr.toString());
    }

    @Test
    public void testAddAtEnd() {
        ImmutableList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(10);
        assertEquals("ImmutableArrayList([10], size = 1, capacity = 1)", arr2.toString());
    }

    @Test
    public void testAddAtIndex() {
        ImmutableList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(10).add(0,-10);
        assertEquals("ImmutableArrayList([-10, 10], size = 2, capacity = 2)", arr2.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAtIndexException() {
        ImmutableList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(0, 10);
        assertEquals("ImmutableArrayList([10], size = 1, capacity = 1)", arr2.toString());
    }

    @Test
    public void testAddAll() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr3 = arr.addAll(new Object[]{1, 2, 3, 4});
        assertEquals("ImmutableArrayList([1, 2, 3, 4], size = 4, capacity = 4)", arr3.toString());
    }

    @Test
    public void testAddAllAtIndex() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        ImmutableList arr3 = arr2.addAll(0, new Object[]{1, 2, 3, 4});
        assertEquals("ImmutableArrayList([1, 2, 3, 4, 2], size = 5, capacity = 5)", arr3.toString());
    }

    @Test
    public void testGet() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        ImmutableList arr3 = arr2.addAll(0, new Object[]{1, 2, 3, 4});
        assertEquals(3, arr3.get(2));
    }

    @Test
    public void testRemove() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        ImmutableList arr3 = arr2.addAll(0, new Object[]{1, 2, 3, 4});
        ImmutableList arr4 = arr3.remove(2);
        assertEquals("ImmutableArrayList([1, 2, 4, 2], size = 4, capacity = 4)", arr4.toString());
    }

    @Test
    public void testSet() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        ImmutableList arr3 = arr2.addAll(0, new Object[]{1, 2, 3, 4});
        ImmutableList arr4 = arr3.set(2, 10);
        assertEquals("ImmutableArrayList([1, 2, 10, 4, 2], size = 5, capacity = 5)", arr4.toString());
    }

    @Test
    public void testIndexOf() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        ImmutableList arr3 = arr2.addAll(0, new Object[]{1, 2, 3, 4});
        ImmutableList arr4 = arr3.set(2, 10);
        assertEquals(2, arr4.indexOf(10));
    }

    @Test
    public void testSize() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        ImmutableList arr3 = arr2.addAll(0, new Object[]{1, 2, 3, 4});
        ImmutableList arr4 = arr3.set(2, 10);
        assertEquals(5, arr4.size());
    }

    @Test
    public void testClear() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        ImmutableList arr3 = arr2.addAll(0, new Object[]{1, 2, 3, 4});
        ImmutableList arr4 = arr3.set(2, 10);
        assertEquals("ImmutableArrayList([null, null, null, null, null]," +
                " size = 5, capacity = 5)", arr4.clear().toString());
    }

    @Test
    public void testIsEmpty() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        assertFalse(arr2.isEmpty());
    }

    @Test
    public void testToArray() {
        ImmutableArrayList arr = new ImmutableArrayList();
        ImmutableList arr2 = arr.add(2);
        assertEquals("[2]", Arrays.toString(arr2.toArray()));
    }




    
}
