import java.util.*;

public class MaxSubarraySum {
    public static int findMaxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;

        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input array
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();
        
        scanner.close();

        // Compute and print the result
        System.out.println(findMaxSubarraySum(arr));
    }
}
