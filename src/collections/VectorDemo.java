package collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //same as arrayList
        //thread-safe - synchronized
        //resizable array
        //implements List interface

        Vector<String> cities = new Vector<>();
        cities.add("Nagpur");
        cities.add("Pune");
        cities.add("mumbai");
        cities.add("chennai");

        cities.remove("Pune");

        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");
        cities.add(1, "indore");

        cities.set(2, "banglore");

        cities.remove(1);

        System.out.println(cities);

        System.out.println(cities.get(2));

        System.out.println(cities.size());

        //cities.clear();

        System.out.println(cities.isEmpty());

        System.out.println(cities.contains("chennai"));

        System.out.println("First element: " + cities.firstElement() + "\nlast element: "+ cities.lastElement());

        cities.trimToSize();

        System.out.println(cities.capacity());

//        for (String city : cities) {
//            System.out.println("City: " + city);
//        }


    }
}
