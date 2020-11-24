package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    
    @Test
    public void testEmptyQueueConstructor() {
        Queue queue = new Queue();
        assertEquals("Queue([])", queue.toString());
    }

    @Test
    public void testNotEmptyQueueConstructor() {
        Queue queue = new Queue(new Object[]{1, 3, 8});
        assertEquals("Queue([1, 3, 8])", queue.toString());
    }

    @Test
    public void testPeek() {
        Queue queue = new Queue(new Object[]{1, 3, 8});
        assertEquals(1, queue.peek());
    }

    @Test
    public void testEnqueue() {
        Queue queue = new Queue(new Object[]{1, 3, 8});
        queue.enqueue(9);
        assertEquals("Queue([1, 3, 8, 9])", queue.toString());
    }

    @Test
    public void testDequeue() {
        Queue queue = new Queue(new Object[]{1, 3, 8});
        Object dequeued = queue.dequeue();
        assertEquals(1, dequeued);
        assertEquals("Queue([3, 8])", queue.toString());
    }
    
}
