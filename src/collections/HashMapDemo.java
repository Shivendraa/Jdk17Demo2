package collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap
        //implements Map
        //store data in a key value
        //duplicate values allowed, but not keys
        //allows one null key only
        //unordered - elements are not stored in order

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Sania", 1000);
        map.put("Shiv", 999);
        map.put("ZYD", 999);
        map.put("XYZ", 799); // put adds 799
        map.put("XYZ", 200); // put replaces 799 with 200


        System.out.println(map.get("Sania"));

        map.remove("XYZ");

        System.out.println(map.containsKey("Sania"));
        System.out.println(map.containsValue(200));

        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        Collection<Integer> values = map.values();
        System.out.println(values);
        System.out.println(map.isEmpty());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  :  " + entry.getValue());
        }



        System.out.println(map);
    }
}
