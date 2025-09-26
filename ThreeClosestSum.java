
import java.util.Arrays;
import java.util.Scanner;

public class ThreeClosestSum{
    public static int findThreeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Update result if this sum is closer to the target
                if (Math.abs(target - sum) < closestSum) {
                    closestSum = Math.abs(target - sum);
                    result = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum; // Exact match found
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input array
        String[] inputArr = scanner.nextLine().split(" ");
        int[] nums = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();
        
        // Read target value
        int target = scanner.nextInt();
        scanner.close();

        // Compute and print the result
        System.out.println(findThreeSumClosest(nums, target));
    }
}
