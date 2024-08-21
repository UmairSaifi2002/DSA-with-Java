public class Rat_in_a_Maze {
    // Check if it's safe to move to cell (x, y)
    public static boolean isSafe(int arr[][], int x, int y, int n) {
        // Check boundaries and if the cell is not blocked (1 means not blocked)
        if (x < n && y < n && arr[x][y] == 1) {
            return true;
        }
        return false;
    }

    // Recursive function to find a path for the rat
    public static boolean ratInMaze(int arr[][], int x, int y, int n, int solu[][]) {
        // Base Case: reached the destination (bottom-right cell)
        if (x == (n - 1) && y == (n - 1)) {
            solu[x][y] = 1; // mark the destination cell as part of the solution
            return true;
        }

        // Check if it's safe to move to the current cell
        if (isSafe(arr, x, y, n)) {
            solu[x][y] = 1; // mark the current cell as part of the solution

            // Recur for the next cells
            if (ratInMaze(arr, x + 1, y, n, solu)) { // move downwards
                return true;
            }
            if (ratInMaze(arr, x, y + 1, n, solu)) { // move right
                return true;
            }

            // If no path is found, backtrack by marking the current cell as not part of the solution
            solu[x][y] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        // Input maze (1 means not blocked, 0 means blocked)
        int arr[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        // Solution matrix (initially all 0s)
        int solu[][] = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        // Call the recursive function to find a path
        ratInMaze(arr, 0, 0, 4, solu);

        // Print the solution matrix
        for (int i = 0; i < solu.length; i++) {
            for (int j = 0; j < solu.length; j++) {
                System.out.print(solu[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// This code solves the Rat in a Maze problem using backtracking. 
// The rat can move either downwards or right. 
// The isSafe function checks if a cell is not blocked and within the maze boundaries. 
// The ratInMaze function recursively tries to find a path to the destination cell. 
// If a path is found, it marks the cells as part of the solution. 
// If no path is found, it backtracks by marking the current cell as not part of the solution.
// public class Rat_in_a_Maze {

//     public static boolean isSafe(int arr[][], int x, int y, int n) {
//         if (x < n && y < n && arr[x][y] == 1) {
//             return true;
//         }
//         return false;
//     }

//     public static boolean ratInMaze(int arr[][], int x, int y, int n, int solu[][]) {
//         // Base Case
//         if (x == (n-1) && y == (n-1)) {
//             solu[x][y] = 1;
//             return true;
//         }
//         // Recursion
//         if (isSafe(arr, x, y, n)) {
//             solu[x][y] = 1;
//             if (ratInMaze(arr, x+1, y, n, solu)) { // moving downwards
//                 return true;
//             }
//             if (ratInMaze(arr, x, y+1, n, solu)) { // moving right
//                 return true;
//             }
//             solu[x][y] = 0; // backtracking
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[][] = {{1,0,0,0},
//                        {1,1,0,1},
//                        {0,1,0,0},
//                        {1,1,1,1}};
//         int solu[][] = {{0,0,0,0},
//                         {0,0,0,0},
//                         {0,0,0,0},
//                         {0,0,0,0}};
//         ratInMaze(arr, 0, 0, 4, solu);
//         for (int i = 0; i < solu.length; i++) {
//             for (int j = 0; j < solu.length; j++) {
//                 System.out.print(solu[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// Here's the modified code with detailed comments: