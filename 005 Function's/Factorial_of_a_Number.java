import java.util.*;

public class Factorial_of_a_Number{
    public static int Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter YOur Number : ");
        int a = scan.nextInt();
        int result = Factorial(a);
        System.out.println("The Factorial of a Number : "+a+" is -> "+result);
    }
}