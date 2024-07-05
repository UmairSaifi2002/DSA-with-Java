import java.util.*;

public class Check_if_a_number_is_prime_or_not{
    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        double number = scan.nextInt();
        // Checking a number is prime or not
        // by using loop
        // we gonna check that number from 2 to under root of a number
        // which reduces the computation
        boolean prime = true;

        if(number == 2 || number == 3){
            System.out.println("The number -> "+number+"\nIs a Prime number.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            System.out.println("The number -> "+number+"\nIs a Prime number.");
        }
        else{
            System.out.println("The number -> "+number+"\nIs not a Prime number.");
        }
    }
}