public class N_Queen_all_cases {

    public static void nQueen(char board[][], int index) {
        // Base case
        if (index == board.length) {
            // Print thr board first before return
            printBoard(board);
            return;
        }
        // Kaam with backtracking
        // column pr loop lagega
        for (int j = 0; j < board.length; j++) {
            board[index][j] = 'Q'; // yaha sare column's pr Q value put kr di
            nQueen(board, index+1); // function ko call kr diya 
            board[index][j] = '.';
        }
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

    public static void main(String[] args) {
        int n = 3;
        char arr[][] = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '.';
            }
        }
        nQueen(arr, 0);
    }
}