package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A",20);
        map.put("B",15);
        map.put("C",10);
        map.put("D",30);
        map.put("E",45);
        map.put("F",40);
        Map<String, Integer> sorted = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map
                .Entry::getValue, ((integer, integer2) -> integer), LinkedHashMap::new));
        System.out.println(sorted);

    }
}
