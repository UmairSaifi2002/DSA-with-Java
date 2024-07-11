import java.util.*;

public class Sum_of_Digits {
    public static int sum(int n){
        int sum = 0;
        while (n>0) {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sum(n));
    }
}