// import java.util.*;

public class Clear_Range_of_Bits {

    public static int ClearBitInRange (int num, int start, int end) {
        int a = ((~0) << (start+1)); // here we are making 111100000000 like this number
        // System.out.println(a);
        int b = (int)Math.pow(2, end)-1; // here we are making 00000000111 like this number
        // System.out.println(b);
        int BitMask = a|b; // here we are performing OR operation b/w  1111000011
        // System.out.println(BitMask);
        int result = num & BitMask;
        return result;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int result = ClearBitInRange(1023, 6, 2);
        System.out.println(result);
    }
}