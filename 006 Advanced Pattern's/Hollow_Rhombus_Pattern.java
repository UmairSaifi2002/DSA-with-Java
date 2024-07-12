import java.util.*;
public class Hollow_Rhombus_Pattern {

    public static void hollow_rhombus(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = row-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                if (i==0||j==0||j==col-1||i==row-1) {
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
        System.out.print("Enter row : ");
        int row = scan.nextInt();
        System.out.print("Enter col : ");
        int col = scan.nextInt();
        hollow_rhombus(row, col);
    }
}