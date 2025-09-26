import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        int totalSubstrings = 0;

        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (int count : countMap.values()) {
            totalSubstrings += (count * (count + 1)) / 2;
        }

        return totalSubstrings;
    }
}