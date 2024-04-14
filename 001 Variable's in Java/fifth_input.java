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
        int num = sc.nextInt();
        System.out.println("Your num input -> " + num);
    }
}
