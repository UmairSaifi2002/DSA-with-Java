public class Grid_Ways {
    public static int GridWays(int i, int j, int n, int m) {
        // Time complexity: O(2^(m*n)) due to recursive calls

        // Base Case: when we reach the last cell (n-1, m-1)
        if (i == n - 1 && j == m - 1) {
            // Only one way to reach the last cell (stay in the cell)
            return 1;
        } else if (i == n || j == m) {
            // Corner cases: when we cross the grid boundaries
            // No ways to reach the destination from outside the grid
            return 0;
        }

        // Recursive Case: explore ways to reach the destination from current cell (i, j)
        // Two possible moves: right (j+1) or down (i+1)

        // Ways to reach the destination from the cell below (i+1, j)
        int w1 = GridWays(i + 1, j, n, m);

        // Ways to reach the destination from the cell to the right (i, j+1)
        int w2 = GridWays(i, j + 1, n, m);

        // Total ways to reach the destination from current cell (i, j)
        int ways = w1 + w2;

        return ways;
    }

    public static void main(String[] args) {
        // Question statement:
        // Find the number of ways to reach from (0, 0) to (N-1, M-1) in an NXM Grid.
        // Allowed moves: right or down.

        int n = 3; // Grid rows
        int m = 3; // Grid columns

        // Call the GridWays function to find the number of ways
        System.out.println(GridWays(0, 0, n, m));
    }
}
