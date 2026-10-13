package intro;

public class FlowControls {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 6, 2};
        FlowControls flowControls = new FlowControls();
        int sum = flowControls.doAddition(arr[2], arr[5]);
        System.out.println(sum);
        /*
        int n = 0;
        while (n < arr.length) {
            if (arr[n] == 3) {
                System.out.println("Skipping at " + arr[n]);
                n++;
                continue;
            }
            System.out.println(arr[n]);
//            if (arr[n] == 3)
//                break;
            n++;
        }
         */
        /*
        n = 0;
        do {
            System.out.println(arr[n]);
            n++;
        } while (n < arr.length);

         */
    }

    private int doAddition(int a, int b) {
        if (a != 0) {
            return a + b;
        }
        else {
            System.out.println("A is 0, I won't add");
            return a - b;
        }
    }
}
