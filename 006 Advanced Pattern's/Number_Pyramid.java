import java.util.*;

public class Number_Pyramid {

    public static void Pyramid_Number(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = row-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1+" ");
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
        Pyramid_Number(row,col);
    }
}