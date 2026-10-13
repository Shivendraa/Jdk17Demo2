package collections;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        //Set
        // No duplicates - duplicates are ignore
        // Unordered - stores data at random locations
        // if problems with unordered - LinkedHashSet, TreeSet
        // hashing algorithm to store
        // add,remove, search - O(1) - fastest data structure
        // allows only 1 null value
        //Integer,Boolean, Double
        Set<Object> set = new HashSet<>();
        set.add(30); // 30 - ergbvjbv
        set.add(null);
        set.add("String");
        set.add(true);
        set.add(30.5);

        set.remove(40);
        //set.clear();

        System.out.println(set.contains(30));
        System.out.println(set.containsAll(List.of(30, 50, 40)));

        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
        //size,isEmpty,clear, iterator

        System.out.println(set);
    }
}
