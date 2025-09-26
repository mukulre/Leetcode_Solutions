import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctTriplets {
    public static int countDistinctTriplets(int[] arr) {
        Set<String> uniqueTriplets = new HashSet<>();
        Set<Integer> numSet = new HashSet<>();
        
        for (int num : arr) {
            numSet.add(num);
        }
        
        int count = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (numSet.contains(sum)) {
                    int[] triplet = new int[]{arr[i], arr[j], sum};
                    Arrays.sort(triplet); // Ensure uniqueness regardless of order
                    String key = triplet[0] + "," + triplet[1] + "," + triplet[2];
                    
                    if (!uniqueTriplets.contains(key)) {
                        uniqueTriplets.add(key);
                        count++;
                    }
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        scanner.close();
        
        System.out.println(countDistinctTriplets(arr));
    }
}
