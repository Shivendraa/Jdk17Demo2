package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //TreeSet
        //implement Set<> - SortedSet<> (impl)
        //stores elements in sorted order (ascending)
        //based on self-balancing binary search tree
        //duplicates not allowed
        //null not allowed

        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(8);
        set.add(6);

        //add,remove,contains,size

        System.out.println("First: " +set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Higher: " + set.higher(8));
        System.out.println("Lower: " + set.lower(1));
        System.out.println("Ceil: " + set.ceiling(2));
        System.out.println("Floor: " + set.floor(2));

        System.out.println(set.descendingSet());
        System.out.println(set);

    }
}
