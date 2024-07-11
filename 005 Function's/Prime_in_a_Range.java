import java.util.*;

public class Prime_in_a_Range{

    public static boolean prime(int n){
        if(n == 1 || n == 2 || n == 3) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(((n%i) == 0)) return false;
        }
        return true;
    }

    public static void PrimeRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean result = prime(i);
            if(result) System.out.print(i+"\t");
        }
    }
    @SuppressWarnings("resource")
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Start Number : ");
        int start = scan.nextInt();
        System.out.print("Enter your End Number : ");
        int end = scan.nextInt();
        PrimeRange(start, end);
    }
}