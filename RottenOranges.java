import java.util.*;

public class RottenOranges {
    static class Pair {
        int row, col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int minMinutesToRot(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int freshOranges = 0;

        // Step 1: Store all initially rotten oranges & count fresh ones
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) queue.offer(new Pair(i, j));
                else if (grid[i][j] == 1) freshOranges++;
            }
        }

        // If no fresh oranges exist, return 0 immediately
        if (freshOranges == 0) return 0;

        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right

        // Step 2: Start BFS to spread rotting effect
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;
            
            for (int i = 0; i < size; i++) {
                Pair rotten = queue.poll();
                
                for (int[] dir : directions) {
                    int newRow = rotten.row + dir[0];
                    int newCol = rotten.col + dir[1];

                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; // Rot the fresh orange
                        queue.offer(new Pair(newRow, newCol));
                        freshOranges--;
                        rotted = true;
                    }
                }
            }

            if (rotted) minutes++; // Increase time if any oranges got rotted
        }

        // If fresh oranges still exist, return -1; otherwise, return the time taken
        return (freshOranges == 0) ? minutes : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] grid = new int[m][n];

        // Read grid values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // Compute minimum minutes to rot all oranges
        System.out.println(minMinutesToRot(grid));
    }
}

