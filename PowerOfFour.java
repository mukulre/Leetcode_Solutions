import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPowerOfFour(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPowerOfFour(int n) {
        // A number must be positive, a power of 2, and the set bit must be in an odd position
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}