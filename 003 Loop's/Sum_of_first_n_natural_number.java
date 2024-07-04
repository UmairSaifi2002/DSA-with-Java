import java.util.*;

public class Sum_of_first_n_natural_number{
    public static void main (String[] args){
        int n =1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while( n <= num){
            sum = sum + n;
            n++;
        }
        System.out.println("The sum of first "+num+" natural number is -> "+sum);
    }
}