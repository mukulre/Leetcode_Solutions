import java.util.HashMap;
import java.util.Scanner;

public class CountdownChallenge {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int minOperations(int n) {
        if (n == 1) return 0; // Base case

        if (memo.containsKey(n)) return memo.get(n); // Memoized result

        int steps;
        if (n % 2 == 0) {
            steps = 1 + minOperations(n / 2);
        } else {
            // Odd case: Try both +1 and -1 to find min steps
            steps = 1 + Math.min(minOperations(n + 1), minOperations(n - 1));
        }

        memo.put(n, steps);
        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(minOperations(n));
    }
}
