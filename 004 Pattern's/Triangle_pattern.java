import java.util.*;

public class Triangle_pattern{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int no_row = scan.nextInt();
        for (int i = 0; i < no_row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// it like this when n=4
// *
// **
// ***
// ****