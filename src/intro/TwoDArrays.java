package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) throws Exception {
        int[][] a = new int[4][3];
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        //       0 1 2
        //
        // 0     5 5 5                  i
        // 1     6 6 6                  i
        // 2     7 8 8                  i
        // 3     7 7 7                  i
        //
        // j j j j
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }
        System.out.println(a[1][1]);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
