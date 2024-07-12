import java.util.*;

public class Floyds_Triangle {

    public static void Floyd_pattern(int row, int col){
        int counter = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
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
        Floyd_pattern(row, col);
    }
}