import java.util.*;

public class Print_Diamond_Pattern {

    public static void Daimond_Pattern(int row, int col){
        int counter = 1;
        for (int i = 0; i < row; i++) {
            for (int j = row-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < counter; j++) {
                System.out.print("X");
            }
            counter += 2;
            System.out.println();
        }
        counter -= 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = counter; j > 0; j--) {
                System.out.print("X");
            }
            counter -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = scan.nextInt();
        System.out.print("Enter col : ");
        int col = scan.nextInt();
        Daimond_Pattern(row, col);
    }
}

// when row = 4 , col =4
//    X
//   XXX
//  XXXXX
// XXXXXXX
// XXXXXXX
//  XXXXX
//   XXX
//    X