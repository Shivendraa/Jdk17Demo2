package collections;

import java.util.*;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //About Queue in general
        //FIFO - First in first out
        //Token system - Jo order pehle aya wo pehle serve hoga
        //A-B-G-C-D-E-F
        //enqueue/add - add items to the queues, rear (end)
        //dequeue/poll - remove items from the queue, front (start), returns it as well
        //peek()/element() - returns front most item without removing it
        //isEmpty() - if queue is empty

        //Simple queue - FIFO
        //Circular queue - connects rear to front
        //Priority queue - Elements are ordered by priority not insertion order
        //Dequeue - Double ended queue - Insertion and Removal possible from both end
        /*
        //Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        //Priority Queue
        //not FIFO
        //smallest element comes first
        //can customize priority

        //applications
        //Task scheduling based on priority
        //Dijkstra - Shortest path
        //Huffman coding
        //Load balancing - prevents system overload
        //cloud  computing  - (ALB - Aws load balancer)

        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        priorityQueue.add(60);

        System.out.println("my P-Queue: " + priorityQueue);
        System.out.println("my front: " + priorityQueue.peek());
        System.out.println("my P-Queue: " + priorityQueue);
        System.out.println("removing: " + priorityQueue.poll());
        System.out.println("my P-Queue: " + priorityQueue);
        System.out.println("isEmpty: " + priorityQueue.isEmpty());
        System.out.println("my P-Queue: " + priorityQueue);
        */

        PriorityQueue<Task> tasks = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));
        tasks.add(new Task("Task 1", 6));
        tasks.add(new Task("Task 2", 4));
        tasks.add(new Task("Task 3", 3));
        tasks.add(new Task("Task 4", 1));
        tasks.add(new Task("Task 6", 2));

        while (!tasks.isEmpty()) {
            Task t = tasks.poll();
            System.out.println(t);
        }
    }
}
