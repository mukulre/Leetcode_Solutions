import java.util.Scanner;

public class DominantChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();
        
        int[] frequency = new int[26];
        
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            frequency[c - 'a']++;
        }
        
        int maxFrequency = -1;
        char result = 'a';
        
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                result = (char) (i + 'a');
            } else if (frequency[i] == maxFrequency) {
                if (i < (result - 'a')) {
                    result = (char) (i + 'a');
                }
            }
        }
        
        System.out.println(result);
    }
}
