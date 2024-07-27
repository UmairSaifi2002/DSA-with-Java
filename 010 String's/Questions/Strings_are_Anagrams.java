// import java.util.*;

import java.util.Arrays;

public class Strings_are_Anagrams {

    public static boolean IsAnagram (String str, String str1) {
        int count = 0;
        if (str.length() != str1.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str1.length(); j++) if (str.charAt(i) == str1.charAt(j)) count++;
            if (count == 0) return false;
            count = 0;
        }
        return true;
    }

    public static boolean isAnagram(String str, String str1) {
        // If lengths are not the same, they can't be anagrams
        if (str.length() != str1.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str.toCharArray();
        char[] charArray2 = str1.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String str = "care";
        String str2 = "mace";
        boolean result = IsAnagram(str, str2);
        System.out.println(result);
    }
}