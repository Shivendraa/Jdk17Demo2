package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        //HashTable
        //key value pair
        //synchronized
        //no null keys/values
        //keys  unique
        //unordered - insertion order not maintained
        //legacy class - purana

        Hashtable<String, Object> map = new Hashtable<>();
        map.put("Bye", "qwe");
        map.put("Bye", "asdfghjk");
        map.put("Shiv", 12345678);
        map.put("Sania", 8765L);
        map.put("Hello", true);
        map.put("Demo", 23456789.99);

        System.out.println(map);

        System.out.println(map.elements());
        System.out.println(map.keys());
        Enumeration<Object> enumer = map.elements();
        while (enumer.hasMoreElements()) {
            System.out.println(enumer.nextElement());
        }

        //Enumeration
        //hashMoreElements(), nextElement()

        /*
        * put(K,V)
        * get(K)
        * remove(K)
        * containsKey(K)
        * containsValue(V)
        * elements()
        * keys()
        * */
    }
}
