import java.util.Arrays;
import java.util.Scanner;

public class Goldbach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Generate prime sieve
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Find and print all pairs p1 and p2 such that p1 + p2 = N and p1 <= p2
        for (int p1 = 2; p1 <= N / 2; p1++) {
            if (isPrime[p1] && isPrime[N - p1]) {
                System.out.println(p1 + " " + (N - p1));
            }
        }

        sc.close();
    }
}
