import java.util.*;

public class Watch_Glass_Pattern {
    public static void WatchGlass_Pattern(int row, int col){

        // first half
        for (int i = 0; i < 2*row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*row; j > i; j--) {
                System.out.print("X ");
            }
            System.out.println();
        }

        // second half
        for (int i = 0; i < 2*row-1; i++) {
            for (int j = 2*row-2; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i+1; j++) {
                System.out.print("X ");
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
        WatchGlass_Pattern(row, col);
    }
}


// when row = 4, col = 4
// X X X X X X X X from here first half start
// .X X X X X X X 
// ..X X X X X X 
// ...X X X X X 
// ....X X X X 
// .....X X X 
// ......X X 
// .......X  here first half is complete
// ......X X  from here second half starts
// .....X X X 
// ....X X X X 
// ...X X X X X 
// ..X X X X X X 
// .X X X X X X X 
// X X X X X X X X  from here second half complete