import java.util.*;

public class Print_Character_Half_Pyramid{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        char ch = 'A'; // we assign the first character
        int input = scan.nextInt();
        for (int j = 0; j < input; j++) {
            for (int j2 = 0; j2 <= j; j2++) {
                System.out.print(ch);
                ch++; // here we make an increment in te character.
            }
            System.out.println();
        }
    }
}

// it like this when n = 4
// A
// BC
// DEF
// GHIJ