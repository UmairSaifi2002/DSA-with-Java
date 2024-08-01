// import java.util.*;

public class Check_if_a_number_is_Power_of_two {

    public static boolean CheckPowerOfTwo(int num) {
        int prev_num = num - 1;
        if ((num&prev_num) == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int number = 1024;
        boolean result = CheckPowerOfTwo(number);
        if (result) System.out.println(number+" is a Power of 2");
        else System.out.println(number+" is not a Power of 2");
    }
}