import java.util.Arrays;
import java.util.Scanner;

public class MaxCircularSubarraySum {
    public static int maxSubarraySumCircular(int[] nums) {
        int maxKadane = kadane(nums); // Standard max subarray sum
        int totalSum = 0, minSubarraySum = Integer.MAX_VALUE;
        int currentMin = 0;

        // Calculate total sum and find minimum subarray sum
        for (int num : nums) {
            totalSum += num;
            currentMin = Math.min(currentMin + num, num);
            minSubarraySum = Math.min(minSubarraySum, currentMin);
        }

        // Edge case: If all numbers are negative, return maxKadane
        if (totalSum == minSubarraySum) return maxKadane;

        return Math.max(maxKadane, totalSum - minSubarraySum);
    }

    private static int kadane(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currentMax = 0;
        for (int num : nums) {
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] nums = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();
        scanner.close();

        System.out.println(maxSubarraySumCircular(nums));
    }
}
