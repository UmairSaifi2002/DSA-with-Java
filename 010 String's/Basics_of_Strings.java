import java.util.*;

public class Basics_of_Strings {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        // defining the character 
        char arr[] = {'a','b','c','d'};

        // String declaration
        String str = "ABCD";
        String str1 = new String("abcd");

        // ***************** String is IMMUTABLE ******************

        String name;
        // Input the string
        System.out.print("Enter your name : ");
        name = scan.next(); // it take input only one word
        // Output the string
        System.out.println(name);

        // Clear the buffer by consuming the leftover newline character
        scan.nextLine();

        // Input the sentance
        String fullname;
        System.out.print("Enter you Full Name : ");
        fullname = scan.nextLine();
        System.out.println(fullname);
    }
}