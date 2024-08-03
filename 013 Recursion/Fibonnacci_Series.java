import java.util.*;

public class Fibonnacci_Series {

    public static int FibonnacciSeries(int n) {
        // Base case
        if (n == 0) return 0;
        if (n == 1) return 1;
        // Recursion call
        int fib = FibonnacciSeries(n-1) + FibonnacciSeries(n-2);
        // returning our ans
        return fib;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // System.out.println(FibonnacciSeries(num));
        for (int i = 0; i <= num; i++) {
            System.out.print(FibonnacciSeries(i)+" ");
        }
    }
}