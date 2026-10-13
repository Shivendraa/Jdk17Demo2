package intro;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {11, 23, 45, 65, 78, 25, 77, 99};
        int key = 45;
        int foundAt = linearSearch(arr, key);
        int sum = getSumOfAll(arr);
        System.out.println(foundAt == -1 ? "Element not found" : "Element found at "+foundAt);
        System.out.println("Sum of all elements " + sum);
    }

    private static int getSumOfAll(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static int linearSearch(int[] collection, int key) {
        for (int i = 0; i < collection.length; i++) {
            if(key == collection[i]){
                return i;
            }
        }
        return -1;
    }
}
