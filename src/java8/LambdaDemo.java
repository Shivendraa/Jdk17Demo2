package java8;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("qwertyu");
        list.add("sd");
        list.add("dfghj");

//        for (String a : list) {
//        a = a.replcae()
//            System.out.println(a);
//        }

        //for all/each elements of list, do something
        list.forEach(str -> System.out.println(str.replace("d", "")));

        Collections.sort(list);
        System.out.println(list);


        List<Employee> employees = Arrays.asList(
                new Employee(100, "Shivendra", 12345678.0),
                new Employee(101, "Sania", 22345678.0),
                new Employee(101, "xjm", 22345678.0),
                new Employee(101, "dfgh", 22345678.0),
                new Employee(101, "dfghj", 22345678.0),
                new Employee(101, "ghsdfgh", 22345678.0),
                new Employee(101, "sdfgh", 22345678.0),
                new Employee(101, "qwertyui", 22345678.0),
                new Employee(101, "mnvcx", 22345678.0),
                new Employee(102, "Jack", 32345678.0)
        );

//        Collections.sort(employees, new Comparator<Employee>() {
//            public int compare(Employee o1, Employee o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//
//        for (Employee  e: employees) {
//            System.out.println(e);
//        }

        employees.sort((e1, e2) -> e2.name.toLowerCase().compareTo(e1.name.toLowerCase()));

        //lambda
        employees.forEach(e -> System.out.println(e.name));

        //method reference
        employees.forEach(System.out::println);
    }


}
