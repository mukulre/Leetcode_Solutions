import java.util.Scanner;

public class HiddenGreeting {
    public static String canExtractHello(String s) {
        String target = "hello";
        int targetIndex = 0;

        for (char c : s.toCharArray()) {
            if (c == target.charAt(targetIndex)) {
                targetIndex++;
                if (targetIndex == target.length()) {
                    return "YES";
                }
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(canExtractHello(input));
    }
}