package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UnderAgeException extends Exception {

    public UnderAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    // must be caught or declared to be thrown
    // Exception handling - throws, try, catch, throw, finally
    public static void main(String[] args) {

        int div = 0;
        try {
            //int a = readInput();
            //int x = readInput();
            int age = readInput();
            if (checkAge(age)) {
                System.out.println("User is legal.");
            }
            //div = divideByX(a, x);
        }
        catch (UnderAgeException e) {
            System.out.println("User is underage: "+ e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IO Exception: "+e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Can not divide by 0: "+e.getMessage());
            throw new RuntimeException("How dare you?");
        }
//        catch (Exception e) {
//            System.out.println("Exception: "+e.getMessage());
//        }
        finally {
            System.out.println("I am in finally");
        }
        System.out.println(div);
    }

    private static int readInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine(); //checked
        return Integer.parseInt(input);
    }

    private static boolean checkAge(int age) throws UnderAgeException {
        if (age > 18) {
            return true;
        }
        else {
            throw new UnderAgeException("You are under age."); //flow break
        }
    }

    private static int divideByX(int a, int x) {
        return a/x; //unchecked exception
    }
}
