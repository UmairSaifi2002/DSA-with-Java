import java.util.*;

public class factorial_of_a_number{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println("The Factorial of a number "+num+" is -> "+fact);
    }
}