package intro;

public class Employee {

    private String employeeId;
    private int age;
    private String gender;
    private String designation;
    private String name;

    Employee(String employeeId, int age, String gender, String designation) {
        this.employeeId = employeeId;
        this.age = age;
        this.gender = gender;
        this.designation = designation;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
