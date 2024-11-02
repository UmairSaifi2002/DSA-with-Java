package Questions;

import java.util.*;

public class Sort_by_Frequency03 {
    public static void main(String[] args) {
        // Our goal is to sort characters by frequency in the given string
        String s = "tree";

        // Using a TreeMap to store each character and its frequency
        TreeMap<Character, Integer> map = new TreeMap<>();

        // Counting the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            // If character is already present, increase its count by 1, otherwise start at 1
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Using StringBuilder to efficiently build the final output string
        StringBuilder sb = new StringBuilder();

        // Looping through each entry (character and frequency) in the TreeMap
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();  // Getting frequency of the character
            Character key = entry.getKey();  // Getting the character

            // If frequency of the character is more than 1
            if (val > 1) {
                // Append the character to the StringBuilder "val" times
                for (int i = 0; i < val; i++) {
                    sb.append(key);
                }
            } else {
                // If frequency is 1, just add the character once
                sb.append(key);
            }
        }

        // Converting StringBuilder to string for the final result
        String result = sb.toString();

        // Print the result, which is characters sorted by frequency
        System.out.println(result);
    }
}
