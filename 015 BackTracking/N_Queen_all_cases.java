public class N_Queen_all_cases {
    public static void nQueen(char board[][], int index) {
        // Base case: when all queens are placed (index == board length)
        if (index == board.length) {
            // Print the board before returning
            printBoard(board);
            return;
        }

        // Try placing a queen in each column of the current row (index)
        for (int j = 0; j < board.length; j++) {
            // Place a queen in the current column (mark with 'Q')
            board[index][j] = 'Q';

            // Recursively place the remaining queens (backtracking)
            nQueen(board, index + 1);

            // Remove the queen from the current column (backtrack)
            board[index][j] = '.';
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("---- Chess Board ----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2; // Number of queens
        char arr[][] = new char[n][n]; // Initialize the board

        // Initialize the board with empty spaces (.)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '.';
            }
        }

        // Start placing queens from the first row (index 0)
        nQueen(arr, 0);
    }
}

/*
 This code solves the N-Queens problem, printing all possible configurations for placing n queens on an n x n chessboard such that no two queens attack each other.(without the conditions)

Here's a step-by-step explanation:

1. The nQueen method takes two parameters: the chessboard board and the current row index, index.
2. The base case is when all queens are placed (index == board.length), at which point the current board configuration is printed.
3. The recursive case tries placing a queen in each column of the current row (index).
4. For each column, it:
    - Places a queen (marks with 'Q').
    - Recursively places the remaining queens (backtracking).
    - Removes the queen (backtracks) to try the next column.
5. The printBoard method prints the current board configuration.
6. In the main method, the process starts with an empty board and n queens.

Note that the number of possible configurations grows rapidly with n, demonstrating the complexity of the N-Queens problem.
*/