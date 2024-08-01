// import java.util.*;

public class Modular_Exponentiation {

    public static boolean EvenOrOdd (int pow) {
        if ((pow&1) == 0) return true;
        return false;
    }

    public static int FastExponent (int num, int pow) {
        int ans = 1;
        while (pow>0) {
            // System.out.println(pow);
            if (EvenOrOdd(pow) == false) {
                ans = ans * num;
                // System.out.println(ans);
                // System.out.println(num);
            }
            num = num*num;
            pow = (pow >> 1);
        }
        return ans;
    }

    public static int ModularExpo(int num, int pow, int mod) {
        int ans = FastExponent(num, pow) % mod ;
        return ans;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int number = 2;
        int power = 5;
        int mod = 13;
        int ans = ModularExpo(number, power, mod);
        System.out.println(ans);
    }
}