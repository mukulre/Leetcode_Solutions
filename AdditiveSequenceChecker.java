import java.math.BigInteger;
import java.util.Scanner;

public class AdditiveSequenceChecker {

    public static boolean isAdditiveSequence(String num) {
        int n = num.length();

        // i and j represent the split points for first two numbers
        for (int i = 1; i <= n / 2; i++) {
            for (int j = i + 1; j < n; j++) {
                String num1 = num.substring(0, i);
                String num2 = num.substring(i, j);

                // Validate no leading zeros
                if (isValid(num1) && isValid(num2) && isAdditive(num1, num2, num.substring(j))) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isAdditive(String num1, String num2, String remaining) {
        if (remaining.isEmpty()) return true;

        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger sum = n1.add(n2);
        String sumStr = sum.toString();

        if (!remaining.startsWith(sumStr)) return false;

        return isAdditive(num2, sumStr, remaining.substring(sumStr.length()));
    }

    private static boolean isValid(String num) {
        // Prevent leading zeros unless the number itself is "0"
        return !(num.length() > 1 && num.startsWith("0"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        scanner.close();

        System.out.println(isAdditiveSequence(input));
    }
}
