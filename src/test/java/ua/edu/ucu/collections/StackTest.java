package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testEmptyStackConstructor() {
        Stack stack = new Stack();
        assertEquals("Stack([])", stack.toString());
    }

    @Test
    public void testNotEmptyQueueConstructor() {
        Stack stack = new Stack(new Object[]{1, 3, 8});
        assertEquals("Stack([1, 3, 8])", stack.toString());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack(new Object[]{1, 3, 8});
        assertEquals(8, stack.peek());
    }

    @Test
    public void testPush() {
        Stack stack = new Stack(new Object[]{1, 3, 8});
        stack.push(9);
        assertEquals("Stack([1, 3, 8, 9])", stack.toString());
    }

    @Test
    public void testPop() {
        Stack stack = new Stack(new Object[]{1, 3, 8});
        Object popped = stack.pop();
        assertEquals(8, popped);
        assertEquals("Stack([1, 3])", stack.toString());
    }

}
