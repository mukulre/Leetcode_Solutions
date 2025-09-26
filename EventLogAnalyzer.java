import java.util.Arrays;
import java.util.Scanner;

public class EventLogAnalyzer {
    public static int countElementsBetween(int[] arr, int num1, int num2) {
        int leftIndex = -1, rightIndex = -1;
        
        // Find the leftmost occurrence of num1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                leftIndex = i;
                break;
            }
        }
        
        // Find the rightmost occurrence of num2
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == num2) {
                rightIndex = i;
                break;
            }
        }
        
        // Ensure valid indices
        if (leftIndex == -1 || rightIndex == -1 || leftIndex >= rightIndex) {
            return 0; // No valid range exists
        }

        return rightIndex - leftIndex - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input array
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();
        
        // Read num1 and num2
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        
        // Compute result
        int result = countElementsBetween(arr, num1, num2);
        
        System.out.println(result);
    }
}
