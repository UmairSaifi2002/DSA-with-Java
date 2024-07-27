public class String_Comparision {

    /**
     * This method takes a string and returns a compressed version of the string
     * where consecutive duplicate characters are replaced by the character followed
     * by the number of occurrences.
     *
     * @param str The input string to be compressed
     * @return A StringBuilder object containing the compressed version of the input string
     */
    public static StringBuilder StringComparision(String str) {
        // Time Complexity -> O(n)
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        int i = 0; // Index to traverse the string

        // Loop through the entire string
        while (i < str.length()) {
            char currentChar = str.charAt(i); // Get the current character
            int count = 1; // Initialize count of the current character

            // Count the number of consecutive occurrences of the current character
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the current character to the result
            result.append(currentChar);
            // If the character repeats, append the count to the result
            if (count > 1) {
                result.append(count);
            }

            i++; // Move to the next character
        }

        return result; // Return the compressed string
    }

    public static StringBuilder OptimizedStringComparession(String str) {
        // Time Complexity -> O(n)
        if (str == null || str.length() == 0) {
            return new StringBuilder();
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        // Loop through the string starting from the second character
        for (int i = 1; i <= str.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append the previous character and its count (if greater than 1) to the result
                result.append(str.charAt(i - 1));
                if (count > 1) {
                    result.append(count);
                }
                // Reset the count for the new character
                count = 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Define the input string
        String str = "aaabbcccdd";
        String str1 = "abcd";
        String str2 = "";
        String str3 = "aaaabbccccaaabbbccc";
        // Call the StringComparision method and store the result
        StringBuilder result = StringComparision(str);
        StringBuilder result1 = StringComparision(str1);
        StringBuilder result2 = OptimizedStringComparession(str2);
        StringBuilder result3 = OptimizedStringComparession(str3);
        // Print the compressed string
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
