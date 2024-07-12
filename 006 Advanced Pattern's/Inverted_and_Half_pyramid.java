import java.util.*;

public class Inverted_and_Half_pyramid {

    public static void Half_Inverted_Pyramid(int row, int col) {
        for (int i = 0; i < row; i++) {
            // for spaces
            for (int j = row-1; j > i; j--) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
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
        Half_Inverted_Pyramid(row, col);
    }
}