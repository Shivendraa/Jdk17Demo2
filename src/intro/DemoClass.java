package intro;

public class DemoClass {
    private int a = 10;
    private int b = 15;

    DemoClass() {
        this.a = 5;
        this.b = 6;
    }

    DemoClass(int a, int b) {
        this();
    }
    int returnA() {
        return a;
    }

    int returnB() {
        return b;
    }

}
