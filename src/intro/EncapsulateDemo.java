package intro;

public class EncapsulateDemo {
    public static void main(String[] args) {

        //1000
        Employee employee1 = new Employee("ID01", 25, "MALE", "SE");
        Employee employee2 = new Employee("ID02", 21, "FEMALE", "PM");
        Employee employee3 = new Employee("ID02", 21, "FEMALE", "PM");
        Employee employee4 = new Employee("ID02", 21, "FEMALE", "PM");
        Employee employee5 = new Employee("ID02", 21, "FEMALE", "PM");

        System.out.println(employee1);

        Employee[] employees = { employee1, employee2, employee3, employee4, employee5};

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
