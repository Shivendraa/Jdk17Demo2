package intro;

import java.util.Scanner;

public class MathLoop {
    public static void main(String[] args) {
        //2
        //0 2 10
        //5 3  5
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        // a + b*2^0 , a + b*2^0 + b*2^1,
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += b * (int)Math.pow(2, j);
                System.out.print(a+" ");
            }
        }

        /*
        int a = 10;
        int n = 4;
        String im = "hello";
        // a + b*2^0 , a + b*2^0 + b*2^1,
        System.out.println(Math.pow(a, n));
        System.out.println(Math.max(a, n));
        System.out.println(Math.min(a, n));
        System.out.println(Math.multiplyExact(a, n));
        System.out.println(Math.multiplyFull(a, n));
        System.out.println(Math.sqrt(16));
         */
    }
}

