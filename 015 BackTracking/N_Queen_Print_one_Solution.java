public class N_Queen_Print_one_Solution {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up direction is safe
          for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
          }
        // daigonal up direction is safe
        // left daiginal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0 ; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right daigonal 
        for (int i = row-1, j = col+1; i >= 0 && j < board.length ; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // when the queen is on the safe place 
        return true;
    }

    public static boolean nQueen(char board[][], int row) {
        // Base case
        if (row == board.length) {
            // Print the board first before return
            count++;
            printBoard(board);
            return true;
        }
        // Kaam with backtracking
        // column pr loop lagega
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // yaha sare column's pr Q value put kr di
                if(nQueen(board, row+1)) {
                    return true;
                } // function ko call kr diya 
                board[row][j] = '.';
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("---- chess Board ----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '.';
            }
        }
        if( nQueen(arr, 0) ) {
            System.out.println("Solution is Possible");
        }
        else {
            System.out.println("Solution is not Possible.");
        }
        // System.out.println("The number of solutions for "+n+"X"+n+" board is -> "+count);
    }
}