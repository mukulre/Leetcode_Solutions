import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 4, 15, 89};
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
