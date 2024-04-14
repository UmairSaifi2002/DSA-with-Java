import java.util.*;

public class fifth_input {
    public static void main(String[] args) {
        // thats how we can take input from user.
        Scanner sc = new Scanner(System.in);

        // String taken as an input
        String input1 = sc.next(); // -> .next() stores the entry of the user unit the space will occur in the input
        System.out.println("Your stringOne input -> " + input1);
        
        String input2 = sc.nextLine(); // -> .nextLine() stores the user input with spaces occur inbetween the input
        System.out.println("Your stringTwo input -> " + input2);

        // Integer taken as an input
        int num1 = sc.nextInt();
        System.out.println("Your Integer number input -> " + num1);

        // Long taken as an input
        long num2 = sc.nextLong();
        System.out.println("Your Long number input -> " + num2);

        // Floating number taken as an input
        float num3 = sc.nextFloat();
        System.out.println("Your Floating number input -> " + num3);

        // Double number taken as an input
        double num4 = sc.nextDouble();
        System.out.println("Your Double number input -> " + num4);
    }
}
