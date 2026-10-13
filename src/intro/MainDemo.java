package intro;

class Constructors {
    private int a;
    private int b;
    Constructors() {
        a = 40;
        b = 60;
        System.out.println("Constructor created");
    }
    Constructors(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("In params constructor");
    }
    Constructors(Constructors s) {
        this.a  = s.a;
        this.b = s.b;
    }
    void setA(int a) {
        this.a = a;
    }
    void setB(int b) {
        this.b = b;
    }
    int getA() {
        return this.a;
    }
    int getB() {
        return this.b;
    }
}

public class MainDemo {
    public static void main(String[] args) {
        Constructors con = new Constructors();
        Constructors con2 = new Constructors(con);
//        con2.setA(100);
//        con2.setB(200);
        System.out.println(con2.getA());
        System.out.println(con2.getB());
    }
}
