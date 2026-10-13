package intro;

//Polymorphism - One name many purposes (many forms)
// types - 1.Compile time (method overloading) 2. Run time (Method overriding)
// method overloading - method name will be same but parameters or return types will be different
// -- will or may take place in same class
// method overriding - method name will be same and parameters or return types will also be same
// -- will not take place in same class, may take in child classes

class Area {
    int calculateArea(int length, int breadth) {
        return length*breadth;
    }

    int calculateArea(int side) {
        return side*side;
    }

    int calculateArea(int base, double height){
        return (int)(0.5*base*height);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        //Compile Time Polymorphism
        Area area = new Area();
        System.out.println("Rectangle: " + area.calculateArea(10, 20));
        System.out.println("Square: " + area.calculateArea(10));
        System.out.println("Triangle: " + area.calculateArea(5, 10.0));
    }
}
