import java.util.Scanner;

public class ConcertCrowdControl {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();
            int[] E = new int[T];
            int[] L = new int[T];
            
            for (int i = 0; i < T; i++) {
                E[i] = scanner.nextInt();
            }
            for (int i = 0; i < T; i++) {
                L[i] = scanner.nextInt();
            }
            int currentAttendees = 0;
            int maxAttendees = 0;
            for (int i = 0; i < T; i++) {
                currentAttendees += E[i] - L[i];
                if (currentAttendees > maxAttendees) {
                    maxAttendees = currentAttendees;
                }
            }
            System.out.println(maxAttendees);
        }
    }
}
