package intro;

//byte -> short -> int -> long, double
//float -> double

class Shape {
    double calculateArea(double l, double b) {
        return 0;
    }
}

class Rectangle extends Shape {

    double calculateArea(double l, double b) {
        return l*b;
        //return super.calculateArea(l,b); //using super you can access methods and data from parent
    }
}

class Triangle extends Shape {

    double calculateArea(double l, double b) {
        return 0.5*l*b;
    }
}


public class RunTimePolymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1 = new Rectangle();
        Shape shape2 = new Triangle();
        System.out.println("Shape: " + shape.calculateArea(10, 20));
        System.out.println("Rectangle: "  + shape1.calculateArea(10, 20));
        System.out.println("Triangle: "  + shape2.calculateArea(10, 20));
    }
}
