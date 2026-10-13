package intro;

public class OperatorsExample {
    /*
    Arithmetic Operators ->  + - * / %
    Unary Operators -> - , ! , ++, --, ~
    Assignment operators  -> = , += , -=, *=, /=, %=
    Relational operators -> ==, !=, > , < , >=, <=,
    Logical operators -> && , ||, !
    ternary: a ? b : c
    bitwise: |, &, ^, ~
    shift: >>, <<, >>> 00000000111010101001
     */
    public static void main(String[] args) {
        boolean a = true;
        int b = 10;
        int c = 20;
        int d = b >= c ? b : c;
        //System.out.println(!a);
        //System.out.println(~b);
        //System.out.println(b++);
        //System.out.println(b);
        System.out.println(d);

    }
}
