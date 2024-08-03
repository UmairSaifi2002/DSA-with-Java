import java.util.*;

public class Factorial_of_a_Number {

    public static int Factorial(int n) {
        // Base Case
        if (n==0) {
            return 1;
        }
        // recursion call
        int fact = n * Factorial(n-1);
        return fact;
        // another way
        // return n*Factorial(n-1); 
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = Factorial(n);
        System.out.println(factorial);
    }
}