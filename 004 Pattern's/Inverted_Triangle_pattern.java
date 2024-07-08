import java.util.*;

public class Inverted_Triangle_pattern{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int no_row = scan.nextInt();
        for (int i = no_row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
// it like this when n = 4
// ****
// ***
// **
// *