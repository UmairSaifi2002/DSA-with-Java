import java.util.*;

public class Sum_of_first_n_natural_number {

    public static int SumOfFirstNnumbers(int n) {
        // Base Case
        if (n==1) {
            return 1;
        }
        // Recursion Call
        int sum = n + SumOfFirstNnumbers(n-1);
        return sum;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = SumOfFirstNnumbers(n);
        System.out.println(sum);
    }
}