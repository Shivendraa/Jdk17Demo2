package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        //Implements Map interface and extends HashMap class
        //Maintains insertion order, just like linkedHashSet
        //stores key value pair
        //null key - yes, but only one
        //only accepts unique key


        Map<String, Object> map = new LinkedHashMap<>();
        map.put("Bye", null);
        map.put("Bye", "asdfghjk");
        map.put("Shiv", 12345678);
        map.put("Sania", 8765L);
        map.put("Hello", true);
        map.put("Demo", 23456789.99);

        /*
        * put(K,V)
        * get(K) - value
        * remove(K)
        * containsKey(K) - boolean
        * keySet() -
        * entrySet() -
        * clear() -
        * */
        System.out.println(map);
    }
}
