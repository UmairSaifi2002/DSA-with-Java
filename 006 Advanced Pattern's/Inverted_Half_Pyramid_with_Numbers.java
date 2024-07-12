import java.util.*;

public class Inverted_Half_Pyramid_with_Numbers {
    public static void Half_Pyramid_Num(int row, int col){
        for (int i = row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
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
        Half_Pyramid_Num(row, col);
    }
}