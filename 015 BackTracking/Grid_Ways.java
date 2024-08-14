public class Grid_Ways {

    public static int GridWays(int i, int j, int n, int m) { // 0(2^(m*n))
        // Base Case
        if (i == n-1 && j == m-1) {// Condition for last cell
            return 1;
        }
        else if(i == n || j == m) { // this for the corner cases
            // boundry crossing condition
            return 0;
        }
        // Ways
        int w1 = GridWays(i+1, j, n, m);
        int w2 = GridWays(i, j+1, n, m);

        int ways = w1 + w2;
        return ways;
    }

    public static void main(String[] args) {
        // Question statement
        // Find number of ways to reach from (0, 0) to (N-1, M-1) in a NXM Grid.
        // Allowed moves - right or down.

        int n = 3;
        int m = 3;
        System.out.println(GridWays(0, 0, n, m));
    }
}