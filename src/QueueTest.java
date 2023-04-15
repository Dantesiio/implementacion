import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    @Test
    public void testRemoveAllElements() {
        Queueimplem<Integer> queue = new Queueimplem<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        Assertions.assertEquals(1,  (int) queue.dequeue());
        Assertions.assertEquals(2,  (int) queue.dequeue());
        Assertions.assertEquals(3,  (int) queue.dequeue());
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        Queueimplem<Integer> queue = new Queueimplem<Integer>();
        Assertions.assertTrue(queue.isEmpty());
        queue.enqueue(1);
        Assertions.assertFalse(queue.isEmpty());
        queue.dequeue();
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueEmptyQueue() {
        Queueimplem<Double> queue = new Queueimplem<Double>();
        Assertions.assertNull(queue.dequeue());
    }
}
