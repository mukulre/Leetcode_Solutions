import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card {
    public static List<Boolean> hasUniqueCard(List<List<Integer>> piles) {
        Map<Integer, Integer> cardCount = new HashMap<>();
        int n = piles.size();

        // Count the occurrences of each card across all players
        for (List<Integer> pile : piles) {
            for (int card : pile) {
                cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
            }
        }

        // For each player, check if they have a unique card
        List<Boolean> result = new ArrayList<>();
        for (List<Integer> pile : piles) {
            boolean hasUnique = false;
            for (int card : pile) {
                if (cardCount.get(card) == 1) {
                    hasUnique = true;
                    break;
                }
            }
            result.add(hasUnique);
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        // Example 1
        List<List<Integer>> piles1 = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(2, 4, 6),
            Arrays.asList(3, 5)
        );
        System.out.println(hasUniqueCard(piles1)); // [true, true, true]

        // Example 2
        List<List<Integer>> piles2 = Arrays.asList(
            Arrays.asList(7, 8, 9),
            Arrays.asList(8, 9),
            Arrays.asList(9, 7)
        );
        System.out.println(hasUniqueCard(piles2)); // [false, false, false]

        // Example 3
        List<List<Integer>> piles3 = Arrays.asList(
            Arrays.asList(10, 20, 30),
            Arrays.asList(20, 40),
            Arrays.asList(30, 50)
        );
        System.out.println(hasUniqueCard(piles3)); // [true, true, true]
    }
}
