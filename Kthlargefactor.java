import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KthLargestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                factors.add(i);
                if (i != N / i) {
                    factors.add(N / i);
                }
            }
        }

        Collections.sort(factors, Collections.reverseOrder());

        if (K > factors.size()) {
            System.out.println(-1);
        } else {
            System.out.println(factors.get(K - 1));
        }
    }
}