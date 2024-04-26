import java.util.*;

public class If_number_is_Even_Or_ODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if((num%2) == 0) System.out.println(num+" is an EVEN Number");
        else System.out.println(num+" is an ODD Number");
    }
}
