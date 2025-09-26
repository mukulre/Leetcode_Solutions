import java.util.Scanner;

public class BusiestRowMaxOccRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt(); 
        int C = scanner.nextInt(); 
        int maxCount = -1;
        int maxRowIndex = -1;
        for (int i = 1; i <= R; i++) {
            int countOnes = 0;
            for (int j = 0; j < C; j++) {
                int val = scanner.nextInt();
                if (val == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxCount) {
                maxCount = countOnes;
                maxRowIndex = i; 
            }
        }
        System.out.println(maxRowIndex);
        scanner.close();
    }
}