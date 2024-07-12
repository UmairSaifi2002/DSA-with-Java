import java.util.*;

public class Solid_Rhombus_Pattern {

    public static void rhombus(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = row-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("X");
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
        rhombus(row, col);
    }
}