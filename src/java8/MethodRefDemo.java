package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

class Methods {
    int a;
    int b;
    Methods(){

    }

    Methods(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + " "+ b);
    }
    public static void display(String message) {
        System.out.println("Inside static: " + message);
    }

    public static void display(String message, int num) {
        System.out.println("Inside static: " + message+" and Num: "+num);
    }

    public void show(String message) {
        System.out.println("Inside instance method show : " + message);
    }
}

class Color {
    String color;
    Color(String color) {
        this.color = color;
        System.out.println("Object created");
    }

    @Override
    public String toString() {
        return color;
    }
}

public class MethodRefDemo {
    public static void main(String[] args) {
        //Method reference - way to refer method without executing it
        //used with functional interface as compact lambda
        //ClassName::methodName
        //types
        //static method - ClassName::staticMethod
        //instanceMethod - object::instanceMethod
        //instanceMethod (not specific object) - ClassName::instanceMethod
        //constructor ref - ClassName::new

        //Methods.display("message", 45);

        //static method
        Consumer<String> displaySingle = Methods::display;
        displaySingle.accept("message");

        BiConsumer<String, Integer> display = Methods::display;
        display.accept("dual messsgae", 1234);

        //Object specific - instance method
        Methods m = new Methods();
        Consumer<String> show = m::show;
        show.accept("qwertyuio");


        //Generic to any object - instance method
        List<String> colors = Arrays.asList("red", "blue", "black", "yellow", "pink");
        colors.sort(String::compareTo); //internally - a.compareTo(b)
        System.out.println(colors);

        //Constructor reference
        BiFunction<Integer,Integer,Methods> objectCreator = Methods::new;
        Methods obj = objectCreator.apply(20, 40);

        List<Color> colorObjList = colors.stream() //converts list to stream
                .map(Color::new) // passes value of stream into the constructor
                .toList(); // converts stream of color object to list of Color object

        System.out.println(colorObjList);
        colorObjList.forEach(System.out::println);
    }
}
