import java.util.*;

public class Tenth_Type_Promotion {
    public static void main(String[] args) {
        // Type promotion in Expression
        // 1, Java promote each bytes,short,or char operand to int when evaluating an expression
        // 2, If one operand is long, float, or double then 
        //    the whole expression will promoted to long, float, or double respectively.

        // example
        char a = 'a';
        int one = a;
        char b = 'b';
        int two = b;
        System.out.println("a-b -> "+(a-b)); // a-b -> -1
        System.out.println("b-a -> "+(b-a)); // b-a -> 1
        System.out.println("one & Value of 'a' -> "+one); // one & Value of 'a' -> 97
        System.out.println("two & Value of 'b' -> "+two); // two & Value of 'b' -> 98

        // example 2
        short a1 = 5;
        byte b1 = 25;
        char c1 = 'c';
        // byte ans1 = a1 + b1 + c1; // it through error -> lossy conversion from int to byte
        // as we see in type promotion short, byte, char, or int convert into int
        // so a + b + c will convert into the  int 
        // and we try to save int into byte which is not possible without type casting
        int anz = a1 + b1 +c1 ;
        System.out.println("a1 + b1 + c1 -> "+(anz)); // a1 + b1 + c1 -> 129

        // example3
        int a3 = 10;
        float b3 = 20.25f;
        long c3 = 25;
        double d3 = 30;
        double ans = a3 + b3 + c3 + d3 ;
        System.out.println(ans); // 82.25
    }
}
