package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        //Dequeue - double ended queue
        //front nd rear - allowed insertion and deletion from both ends
        //ArrayDequeue - This is faster than LinkedList or Stack

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(30);
        deque.addFirst(30);
        deque.addFirst(40);
        deque.addFirst(50);
        deque.addFirst(60);
        deque.addLast(70);
        deque.addLast(80);
        deque.add(90); // Default queue behavior

        System.out.println(deque);

        Iterator<Integer> itr = deque.iterator();
        //  0-1-2-3-4
        // you don't know the length
        // you want to iterate it
        // you don't want to modify it
        // you want to use while loop
        while (itr.hasNext()) { //hasNext()
            System.out.println(itr.next());
        }
        System.out.println(deque);
        while (!deque.isEmpty()) {
            System.out.println(deque.remove());
        }

        System.out.println(deque);

/*
        deque.removeFirst();

        System.out.println(deque);

        deque.removeLast();

        System.out.println(deque);

        deque.remove(); // Default queue behavior

        System.out.println(deque);

        System.out.println("first: " + deque.peekFirst() + "\tlast: " + deque.peekLast()
                + "\tpeek: " + deque.peek());

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.poll());
        System.out.println(deque);
 */

    }
}
