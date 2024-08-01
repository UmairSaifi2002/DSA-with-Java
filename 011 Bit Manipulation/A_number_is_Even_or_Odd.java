import java.util.*;

public class A_number_is_Even_or_Odd {

    public static boolean EvenOrOdd(int num) {
        if ((num&1) == 0) return true;
        return false;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean result = EvenOrOdd(number);
        if (result) System.out.println(number+" is EVEN");
        else System.out.println(number+" is ODD");
    }
}