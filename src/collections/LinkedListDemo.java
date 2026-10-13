package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Engineer -. ..
        List<Integer> list = new LinkedList<>();
        //Baap doctor hai to beta bhi doctor hi banega
        Queue<Integer> queue = new LinkedList<>();

        //LinkedList and ArrayList
        //LinkedList - Insertion and Deletion ka performance accha hai, kab? - from middl
        //ArrayList - accesing by index is faster than LinkedList

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.set(2, 100);
        list.add(4, 99);
        System.out.println(list.get(3));
        System.out.println(list.remove(4)); //Element ??
        System.out.println(list.remove(4)); //Element ??
        System.out.println(list.remove(Integer.valueOf(500))); //true/false
        System.out.println(list.size());
        System.out.println(list);

        /*
        //Queue
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove(40));
        System.out.println(queue);
        */

    }
}
