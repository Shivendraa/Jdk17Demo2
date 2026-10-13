package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHashSet <- Set (impl), HashSet (extend)
        //maintains insertion order
        //does not allow  duplicates
        //allows only one null

        Set<Object> set = new LinkedHashSet<>();

        set.add(30);
        set.add(null);
        set.add("String");
        set.add(true);
        set.add(30.5);

        set.remove(30);

        // contains, size, isEmpty, clear, iterator

        System.out.println(set);

    }
}
