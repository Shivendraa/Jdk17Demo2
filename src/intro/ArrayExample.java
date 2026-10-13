package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) throws Exception {
        /*
        int[] newArr = { 9, 8, 7, 6};
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
        //int[] arr = null;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }

        boolean[] boolArr = new boolean[5];
        //System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < 5; i++) {
//            arr[i] += 10;
//            System.out.println(arr[i]);
//        }
         */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArr = new String[5];
        for (int i = 0; i < 5; i++) {
            stringArr[i] = bufferedReader.readLine();
        }
        for (String i : stringArr){ //enhanced for loop
            i = i.toUpperCase();
            System.out.println(i);
        }
    }
}
