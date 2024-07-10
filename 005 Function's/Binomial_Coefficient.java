import java.util.*;

public class Binomial_Coefficient{

    public static long Factorial(long n){
        if(n == 0 || n == 1){
            return 1;
        }
        long fact = 1;
        for (long i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static long Binomial(long n, long r){
        long first = Factorial(n);
        long second = Factorial(r);
        long third = Factorial(n-r);
        long result = first / (second * third);
        return result;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long r = scan.nextLong();
        long result = Binomial(n, r);
        System.out.println(n+"C"+r+" -> "+result);
    }
}