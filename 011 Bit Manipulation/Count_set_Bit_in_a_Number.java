// import java.util.*;

public class Count_set_Bit_in_a_Number {

    public static boolean EvenOrOdd (int num) {
        if ((num&1) == 0) return true;
        return false;
    }

    public static int CountSetBit (int num) {
        int count = 0;
        while (num > 0) {
            if (EvenOrOdd(num) == false) count++;
            num = (num >> 1);
        }
        return count;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int number = 7;
        int result = CountSetBit(number);
        System.out.println(result);
    }
}