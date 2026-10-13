package intro;

// Multiple inheritance -  A, B -> C
class ShapeDemoImpl implements ShapeDemo, ShapeTriangle {

    @Override
    public int calculateArea(int side) {
        return side*side;
    }

    @Override
    public int calculateArea(int base, int height) {
        return (int)(0.5*base*height);
    }

    void printMessage() {
        System.out.println("Message: " + ShapeDemo.side);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ShapeDemoImpl shapeDemo = new ShapeDemoImpl();
        System.out.println(shapeDemo.calculateArea(10));
        System.out.println(shapeDemo.calculateArea(10, 20));
        shapeDemo.printMessage();
    }
}
