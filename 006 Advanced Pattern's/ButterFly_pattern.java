import java.util.*;

public class ButterFly_pattern {

    public static void ButterFly(int row, int col){
        int one = 0;
        int two = 2*row-1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2*col; j++) {
                if (j <= one || j >= two) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            one++;
            two--;
            System.out.println();
        }
        int three = row;
        int four = col;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2*col; j++) {
                if (j < three || j >= four) {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            three--;
            four++;
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
        ButterFly(row, col);
    }
}