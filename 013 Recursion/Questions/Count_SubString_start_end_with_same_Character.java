public class Count_SubString_start_end_with_same_Character {

    public static int Count(String Str, int start, int end, int count) {
        // Base Case: If start reaches the end of the string, return the count
        if (start == Str.length()) {
            return count;
        }
        // Base Case: If end reaches the end of the string, move to the next start position
        if (end == Str.length()) {
            return Count(Str, start + 1, start + 1, count);
        }
        // Count the substring if start and end characters are the same
        if (Str.charAt(start) == Str.charAt(end)) {
            count++;
        }
        // Move to the next end position
        return Count(Str, start, end + 1, count);
    }

    public static void main(String[] args) {
        String Str = "abcab";
        int count = Count(Str, 0, 0, 0);
        System.out.println(count);  // Output the count of substrings that start and end with the same character
    }
}
