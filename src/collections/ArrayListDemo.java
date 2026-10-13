package collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        //limitations of array
        // - fixed size
        // - manage indexing
        // - no default printing mechanism
        // - no built-in methods
        // - memory waste/overflow
        int[] arr = new int[5];
        arr[0] = 20;
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>(); // 10
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.remove(3);
        list.remove(Integer.valueOf(20));
        //list.clear();
        int value  = list.get(2);
        list.add(1, 90);
        System.out.println(list.contains(100));
        System.out.println(list);
        System.out.println(value);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i : list) {
            System.out.println(i+20);
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Bye");
        String[] strings = {"Bye", "Hello2", "Sania"};
        List<String> strings1 = Arrays.asList(strings);
        stringList.addAll(strings1);
        stringList.set(3,"Hey");

        //Collections.sort(stringList);
        System.out.println(stringList);
    }
}
