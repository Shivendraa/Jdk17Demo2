package java8;

@FunctionalInterface
public interface MathOperation {

    //abstract method
    //you have to override
    int add(int a, int b);

    //default method
    //freedom to use default logic or override
    default void show() {
        System.out.println("Inside functional interface");
    }

    //no override
    static void display() {
        System.out.println("Inside static method");
    }
}
