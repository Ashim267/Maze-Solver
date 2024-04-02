// File name:Dblqueue.java
// Author: Ashim Chand
// userid: chanda
// Email: ashimchand@vanderbilt.edu
// Class: CS2201
// Honor Statement: Will not use unfair means
// Assignment Number: 6
// Description: Dblqueue test
// Last Changed: 3/26/2024

/*import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DblQueueTest {

*//*    // TODO
    // Dear CS2201 student... at this point you should be comfortable creating JUnit
    // tests for the code that you write. Here is a starter file containing a single
    // simple test. Please enhance this test to be complete, and then create additional
    // tests to completely test the rest of the DblQueue class.

    @Test
    public void testDefaultConstructor() {
        Queue<T> myQ = new Queue<>();
        assertEquals(0, myQ.size());
    }

    @Test
    public void testIsEmpty() {
        DblQueue Q = new DblQueue();
        assertTrue(Q.isEmpty());
    }

    @Test
    public void testEnqueueAndIsEmpty() {
        DblQueue Q = new DblQueue();
        Q.enqueue(1);
        assertFalse(Q.isEmpty());
    }

    @Test
    public void testDQ() {
        DblQueue Q = new DblQueue();
        assertThrows(RuntimeException.class, Q::dequeue);
        Q.enqueue(1);
        Q.enqueue(2);
        Q.dequeue();
        assertEquals(2, Q.front());
    }

    @Test
    public void testfront() {
        DblQueue Q = new DblQueue();
        assertThrows(RuntimeException.class, Q::front);
        Q.enqueue(1);
        assertEquals(1, Q.front());
    }

    @Test
    public void testsize() {
        DblQueue Q = new DblQueue();
        Q.enqueue(1);
        Q.enqueue(2);
        assertEquals(2, Q.size());
    }*//*



}*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testDefaultConstructor() {
        Queue<Integer> myQueue = new Queue<>();
        assertEquals(0, myQueue.size());
    }

    @Test
    public void testIsEmpty() {
        Queue<String> myQueue = new Queue<>();
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testEnqueueAndIsEmpty() {
        Queue<Double> myQueue = new Queue<>();
        myQueue.enqueue(1.0);
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void testDequeue() {
        Queue<Character> myQueue = new Queue<>();
        assertThrows(RuntimeException.class, myQueue::dequeue);
        myQueue.enqueue('a');
        myQueue.enqueue('b');
        assertEquals(1, myQueue.size());
    }

    @Test
    public void testFront() {
        Queue<Integer> myQueue = new Queue<>();
        assertThrows(RuntimeException.class, myQueue::front);
        myQueue.enqueue(1);
        assertEquals(Integer.valueOf(1), myQueue.front());
    }

    @Test
    public void testSize() {
        Queue<String> myQueue = new Queue<>();
        myQueue.enqueue("test1");
        myQueue.enqueue("test2");
        assertEquals(2, myQueue.size());
    }


}

