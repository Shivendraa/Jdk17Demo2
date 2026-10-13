package java8;

public class FunctionalInterfaceDemo implements MathOperation {
    public static void main(String[] args) {
        //interface
        //variables public static
        //methods abstract - no body, just declare

        //functional interface
        //default method - can have body
        //only one abstract method - it has to be there

        MathOperation mathOp = new FunctionalInterfaceDemo();
        System.out.println(mathOp.add(50,60));
        //use name of object while calling default or abstract method
        mathOp.show();
        //use name of interface while calling static method
        MathOperation.display();

    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public void show() {
        //MathOperation.super.show();
        int a = 65;
        System.out.println("Override {a} done");
    }

    //java 8 features:
    //lambda expression -
    //foreach -
    //functional interface -
    //stream api - **
    //method reference -
    //date time api - homework
    //optional class -
    //nashorn js engine - homework
    //concurrency api
}
