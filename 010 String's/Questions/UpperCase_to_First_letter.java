// import java.util.*;

public class UpperCase_to_First_letter {

    public static StringBuilder ToUppercaseFirstLetter(StringBuilder str) {

        // The reason for using Character.toUpperCase when dealing with individual
        // characters in Java is that it is the designated method for converting a
        // single character to its uppercase form. The Character class provides utility
        // methods for handling char data types, including case conversion, character
        // type checking, and more.

        // Why Use Character.toUpperCase?
        // Designed for Individual Characters:

        // Character.toUpperCase(char ch) is specifically designed to convert a single
        // char to its uppercase equivalent.
        // This method is optimized and built to handle the nuances of character
        // conversion, including considerations for different Unicode characters.
        // String toUpperCase Method:

        // The String class method toUpperCase() converts the entire string to
        // uppercase.
        // It is not suitable for converting individual characters within a string while
        // iterating through it.

        StringBuilder result = new StringBuilder("");
        result.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                // Convert the character after a space to uppercase
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Append the character as is
                result.append(str.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        StringBuilder str = new StringBuilder("hi, i am umair saifi.");
        String result = ToUppercaseFirstLetter(str).toString();
        System.out.println(result);
    }
}