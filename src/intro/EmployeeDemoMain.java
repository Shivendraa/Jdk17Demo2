package intro;

class EmployeeDemo {
    String companyName = "MyOrg";
    protected void printEmployee() {
        System.out.println("Inside employee");
    }
}

class SoftwareEngineer extends EmployeeDemo {
    int id = 1002;
    String name = "Shiv";
    int age = 25;
    String techStack = "Java";

    void printSE() {
        System.out.println("Inside SE");
    }
}

class Intern extends SoftwareEngineer {
    String job = "Intern";


    void printIntern() {
        System.out.println("Inside Intern");
    }
}

class HREmployee extends EmployeeDemo {
    int id = 1003;
    String name = "Sania";
    int age = 20;
    String div = "payroll";

    void printHR() {
        System.out.println("Inside HR");
    }
}

// Single =  A -> B
// Multilevel = A -> B -> C
// hierarchical = A -> B , A -> C
// multiple -> A -> C, B -> C --- Java does not support (classes), can achieve (interfaces)
// hybrid  -> Combo any of above


public class EmployeeDemoMain {
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer();
        System.out.println("ID:"  + se.id);
        System.out.println("name:"  + se.name);
        System.out.println("age:"  + se.age);
        System.out.println("tech:"  + se.techStack);
        System.out.println("company:"  + se.companyName);
        se.printSE();
        se.printEmployee();
        System.out.println();

        HREmployee hr = new HREmployee();
        System.out.println("ID:"  + hr.id);
        System.out.println("name:"  + hr.name);
        System.out.println("age:"  + hr.age);
        System.out.println("div:"  + hr.div);
        System.out.println("company:"  + hr.companyName);
        hr.printHR();
        hr.printEmployee();
        System.out.println();

        Intern intern = new Intern();
        System.out.println("ID:"  + intern.id);
        System.out.println("name:"  + intern.name);
        System.out.println("age:"  + intern.age);
        System.out.println("tech:"  + intern.techStack);
        System.out.println("company:"  + intern.companyName);
        System.out.println("job:"  + intern.job);
        intern.printEmployee();
        intern.printSE();
        intern.printIntern();
        System.out.println();

    }

}


