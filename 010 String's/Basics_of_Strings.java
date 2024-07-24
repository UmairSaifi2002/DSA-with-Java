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
        // Taking Input the string from the user
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

        // length function of a string
        System.out.println("The length of a Full Name is : "+fullname.length());

        // Concatination in strings
        String FirstName = "MOHD";
        String MIDDLENAME = "UMAIR";
        String LASTNAME = "SAIFI";

        String Name = FirstName + " " + MIDDLENAME + " " + LASTNAME; // concatination performed here
        System.out.println(Name);

        // charAt() function in String
        // it is used for a character in a string
        // charAt(index) -> Syntax
        System.out.println(FirstName.charAt(0));

        // Now we print the letters of Name.
        for (int i = 0; i < Name.length(); i++) System.out.print(Name.charAt(i));
    }
}