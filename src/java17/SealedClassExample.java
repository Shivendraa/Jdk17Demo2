package java17;

// Base class: permits specific subclasses only
sealed class Shape permits Circle, Rectangle {
    // Shape properties and methods
}

// permitted class has to be one of
// final, non-sealed, sealed
final class Circle extends Shape {
    // Circle properties and methods
}

final class Rectangle extends Shape {
    // Rectangle properties and methods
}

// The following class would cause a compile-time error
//class Triangle extends Shape { }


public class SealedClassExample {
    public static void main(String[] args) {

    }
}
