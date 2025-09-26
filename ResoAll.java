import java.util.HashMap;
import java.util.Map;

public class ResoAll {
    public static boolean canFulfillRequests(int[] a1, int[] a2) {
        // Use HashMap to count occurrences in inventory (a1)
        Map<Integer, Integer> inventory = new HashMap<>();
        for (int resource : a1) {
            inventory.put(resource, inventory.getOrDefault(resource, 0) + 1);
        }

        // Check if each requested resource in a2 can be fulfilled
        for (int req : a2) {
            if (!inventory.containsKey(req) || inventory.get(req) == 0) {
                return false;
            }
            inventory.put(req, inventory.get(req) - 1);
        }

        return true;
    }

    // Example usage
    public static void main(String[] args) {
        // Test case 1
        int[] a1_1 = {1, 2, 3, 4, 2, 2};
        int[] a2_1 = {2, 2, 3};
        System.out.println(canFulfillRequests(a1_1, a2_1)); // Output: true

        // Test case 2
        int[] a1_2 = {1, 1, 1, 2};
        int[] a2_2 = {1, 1, 2, 2};
        System.out.println(canFulfillRequests(a1_2, a2_2)); // Output: false
    }
}
