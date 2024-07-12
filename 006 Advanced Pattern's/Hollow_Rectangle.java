import java.util.*;

public class Hollow_Rectangle {
    public static void hollow(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==0||j==0||i==row-1||j==col-1){
                    System.out.print("X");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        hollow(row, col);
    }
}

// when r = 4, c = 4
// ****
// *  *
// *  *
// ****