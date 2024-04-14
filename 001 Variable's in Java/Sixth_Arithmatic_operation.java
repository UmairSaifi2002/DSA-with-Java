import java.util.*;

public class Sixth_Arithmatic_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SUM
        // Input for first number
        int first = sc.nextInt();
        // Input for second number
        int second = sc.nextInt();

        System.out.println("The Sum of " + first + " and " + second + " is " + (first + second) );
        /*
        int sum = first + second ;
        System.out.println("The Sum of "+first+" and "+second+" is -> " + sum) ;
        */

        // DIFFERENCE
        System.out.println("The Diffrence of " + first + " and " + second + " is " + (first - second) );
        /*
        int difference = first - second ;
        System.out.println("The difference of "+first+" and "+second+" is -> " + difference) ;
        */

        // PRODUCT
        System.out.println("The Product of " + first + " and " + second + " is " + (first * second) );
        /*
        int product = first * second ;
        System.out.println("The product of "+first+" and "+second+" is -> " + product) ;
        */

        // DIVISION
        System.out.println("The Division of " + first + " and " + second + " is " + (first / second) );
        /*
        int division = first / second ;
        System.out.println("The division of "+first+" and "+second+" is -> " + division) ;
        */
    }
}
