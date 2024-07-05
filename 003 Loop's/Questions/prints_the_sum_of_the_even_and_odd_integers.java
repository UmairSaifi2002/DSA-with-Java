import java.util.*;

public class prints_the_sum_of_the_even_and_odd_integers{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of terms you want to input -> ");
        int no_of_num = scan.nextInt();
        int even_sum = 0;
        int odd_sum = 0;
        for (int i = 0; i < no_of_num; i++) {
            System.out.print("Enter "+(i+1)+" Number -> ");
            int input = scan.nextInt();
            if(input %2 == 0) {
                even_sum = even_sum + input;
            }
            else{
                odd_sum = odd_sum + input;
            }
        }
        System.out.println("The Sum of Even Numbers are -> "+even_sum);
        System.out.println("The Sum of ODD Numbers are -> "+odd_sum);
    }
}