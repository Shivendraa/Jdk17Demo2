package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /*
        int year = Integer.parseInt(bufferedReader.readLine());
        if(year%4==0 && !(year % 100 == 0) || (year % 400 == 0)) {
            System.out.println(year + " is Leap year");
        }
        else {
            System.out.println(year + " is not leap year");
        }
         */
        int month = Integer.parseInt(bufferedReader.readLine());
        String string = "";
        switch (month) {
            case 1:
                string = "january";
                break;
            case 2:
                string = "February";
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("Month selected is "+string+".");
    }
}
