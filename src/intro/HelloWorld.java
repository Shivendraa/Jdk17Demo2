package intro; //folder

//public private protected default
//class = template/blueprinnt objects ka behavior, user defined
// camel case - methods (functions) - addTwoNumbers, subTwoNumbers
// pascal case - classes - ArithmeticOperations
// upper case - COUNTRY_CODE = 91;
// helloworld.java - java file ->  programmers - apne ko samjhta
// helloWorld.class - class file = byteCode -> machine - comp ko samjhta


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        //objName - reference variable
        //new DemoClass(); - object
        //object - access instance var and methods
        //DemoClass obj = new DemoClass();
        DemoClass objName = new DemoClass(50, 100);
        int sum = objName.returnA() + objName.returnB();
        //System.out.println(sum);

        //user input
        /* //scanner way
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        byte inByte = scanner.nextByte();
        String inStr2 = scanner.nextLine();
        String inStr = scanner.nextLine();
        System.out.println(input);
        System.out.println(inByte);
        System.out.println(inStr);
        System.out.println(inStr2);
         */

        //buffered reader way
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        byte inByte = Byte.parseByte(reader.readLine());
        int num = Byte.MIN_VALUE;
        String inStr2 = reader.readLine();
        String inStr = reader.readLine();
        System.out.println(input);
        System.out.println(inByte);
        System.out.println(inStr2);
        System.out.println(inStr);
        System.out.println(num);
    }
}
