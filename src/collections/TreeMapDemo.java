package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //Implements Map interface
        //stores in key value pairs
        // Self balancing binary tree
        // does not allow null keys, may allow null values
        // automatically sorts inserted elements' keys
        // not synchronized

        /*
        put(K,V)
        get(K) - V
        remove(K)
        containsKey(K) - boolean
        containsValue(V) - boolean
        firstKey()/lastKey() - Smallest/Largest key
        higherKey()/lowerKey()
         */
        TreeMap<String, Object> treemap = new TreeMap<>();
        treemap.put("Bye", null);
        treemap.put("Shiv", 12345678);
        treemap.put("Sania", 8765L);
        treemap.put("Hello", true);
        treemap.put("Demo", 23456789.99);

        for (Map.Entry<String, Object> entry: treemap.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println("==" + entry.getValue());
        }

        System.out.println(treemap.higherKey("Hello"));
        System.out.println(treemap.lowerKey("Hello"));
        System.out.println(treemap.keySet());
        System.out.println(treemap.entrySet());


    }
}
