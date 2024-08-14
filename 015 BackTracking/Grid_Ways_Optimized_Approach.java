public class Grid_Ways_Optimized_Approach {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int GridWaysOptimizedApproach(int n, int m) { // 0(n)
        int ways = (factorial(n-1+m-1))/(factorial(n-1) * factorial(m-1));
        return ways;
    }

    public static void main(String[] args) {
        // Question statement
        // Find number of ways to reach from (0, 0) to (N-1, M-1) in a NXM Grid.
        // Allowed moves - right or down.

        int n = 3;
        int m = 3;
        System.out.println(GridWaysOptimizedApproach(n, m));
    }
}