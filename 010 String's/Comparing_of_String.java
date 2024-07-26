// import java.util.*;

public class Comparing_of_String {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        
        // Here we are using compare to function 
        // which compare two strings LexicoGraphically

        // it return -1, 0, 1 values
        // -1 is for str1.compareTo(str2) str1 < str2
        // 0 is for str == str2
        // 1 is for str1 > str2

        // it have to functions 
        // 1, string_name.compareTo(string_name)
        // 2, string_name.comparreToIgnoreCase(string_name) -> it ignore upper or lower casing 

        String fruits[] = {"apple", "banana", "mango"};
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) if (largest.compareTo(fruits[i]) < 0) largest = fruits[i];
        System.out.println("The laegest String According to LexicoGraphically is : "+largest);
    }
}