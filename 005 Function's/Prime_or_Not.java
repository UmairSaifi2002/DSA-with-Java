import java.util.*;

public class Prime_or_Not{
    public static boolean prime(int n){
        if(n == 1 || n == 2 || n == 3) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(((n%i) == 0)) return false;
        }
        return true;
    }
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = scan.nextInt();
        boolean result = prime(n);
        if(result) System.out.println("Your number : "+n+" is Prime.");
        else System.out.println("Your number : "+n+" is not a Prime.");
    }
}