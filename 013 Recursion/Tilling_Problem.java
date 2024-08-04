public class Tilling_Problem {

    public static int Tiles(int n) { // 2 X n (Floor Size)
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // kaam
        // vertical choice
        int fnm1 = Tiles(n-1);
        // horizontal choice
        int fnm2 = Tiles(n-2);

        // total ways
        int TotalWays = fnm1 + fnm2;
        return TotalWays;
        // return Tiles(n-1) + Tiles(n-2);
    }

    public static void main(String[] args) {
        // Tilling Problem
        // Given a "2Xn" board and tilees of size "2X1", count the number of
        // ways ti tile the given board using the 2X1 tiles.
        // (A tile can either be placed horizontally or vertically.)

        int n = 4;
        int ways = Tiles(n);
        System.out.println(ways);
    }
}