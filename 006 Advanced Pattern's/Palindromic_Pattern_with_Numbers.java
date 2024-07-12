import java.util.*;

public class Palindromic_Pattern_with_Numbers {

    public static void Palindrome_Pattern(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = row-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j+1);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+1);
            }
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
        Palindrome_Pattern(row, col);
    }
}