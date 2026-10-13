package java8;

import java.util.*;
import java.util.stream.Collectors;

//What is?
//Improves the wy you process data (collections)
public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> allEmployees = List.of("Shivendra", "Jack", "Adam", "John", "Sania", "John", "Adam");
        List<String> employees = new ArrayList<>();
        for (String employee : allEmployees) {
            if(employee.startsWith("S")) {
                employees.add(employee);
            }
        }
        System.out.println(employees);
        //Using STREAM
        List<String> employees2 = allEmployees.stream().filter(e -> e.startsWith("J")).collect(Collectors.toList());
        System.out.println(employees2);
        //Operations allowed in streams
        //Intermediate operations
        //      filter(condition),map(convert, transform),flatMap(flattens + transform),distinct(remove duplicates),
        //      sorted(elements sort),limit(to limit the result),skip(skip number of elements),peek(to fetch the data)
        //Terminal operations
        //      forEach(what to do with each element), collect(collects elements and box it), count(), findFirst(),
        //      findAny(),anyMatch(),allMatch(),noneMatch(),min()/max(),reduce(combine stream into one value) = .reduce(0, Integer::sum)

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4,5));
        //map
        //list.stream().map(e -> e.size()).forEach(System.out::println);
        //flatMap
        //list.stream().flatMap(List::stream).forEach(System.out::println);
        //distinct
        System.out.println(allEmployees);
        System.out.println(allEmployees.stream().distinct().sorted().toList());
        //Sorted
        System.out.println(allEmployees.stream().sorted().toList());
        System.out.println(allEmployees.stream().distinct().sorted(Comparator.reverseOrder()).toList());
        //Limit - LIMIT
        System.out.println(allEmployees.stream().distinct().sorted().limit(3).toList());
        //Skip - offset
        System.out.println(allEmployees.stream().distinct().sorted().skip(3).limit(1).toList());
        //peek
        System.out.println(allEmployees.stream().distinct().sorted().limit(4).peek(e -> System.out.println("peeked:" + e)).toList());

        //Terminal operations
        //collect() - converted to SET
        Set<String> employeesSet = allEmployees.stream().filter(e -> e.startsWith("J")).collect(Collectors.toSet());
        //count()
        long count = allEmployees.stream().distinct().count();
        System.out.println(count);
        //findFirst()/findAny() - returns optional
        System.out.println(allEmployees.stream().findFirst().get());
        System.out.println(allEmployees.stream().findAny().get());
        //anyMatch(),allMatch(),noneMatch()
        List<Integer> numbers = List.of(2,4,6,8,10);
        boolean isEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("anyMatch() : "+ isEven);
        boolean isEven1 = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("allMatch() : "+ isEven1);
        boolean isEven2 = numbers.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("noneMatch() : "+ isEven2);
        //min()/max()
        System.out.println(numbers.stream().min(Comparator.comparing(Integer::valueOf)));
        System.out.println(numbers.stream().max(Comparator.comparing(Integer::valueOf)));
        //reduce
        System.out.println(numbers.stream().reduce(Integer::sum));
        System.out.println(allEmployees.stream().reduce(String::concat));


    }
}
