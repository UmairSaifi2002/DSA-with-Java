public class Binary_String_Problem {

    // Recursive method to remove consecutive ones
    public static StringBuilder ConsecturiveOnes(String str, int len, StringBuilder newStr) {
        // Base Case: If the current length is equal to the string length, return the result
        if (len == str.length()) {
            return newStr;
        }
        
        // If we're at the first character, append it to the result and move to the next character
        if (len == 0) {
            newStr.append(str.charAt(len));
            return ConsecturiveOnes(str, len + 1, newStr);
        }
        
        // If the current character is different from the previous character, append it to the result
        // if (str.charAt(len - 1) != str.charAt(len)) {

        // If the current and prev character is not 1 
        // or append the character i the consecutive character is not 1
        if (str.charAt(len - 1) != '1' || str.charAt(len) != '1') {
            newStr.append(str.charAt(len));
        }
        
        // Recursive call to process the next character
        return ConsecturiveOnes(str, len + 1, newStr);
    }

    public static void main(String[] args) {
        // Input string with binary characters
        String str = "000101101000101111000";
        
        // StringBuilder to hold the result without consecutive ones
        StringBuilder newStr = new StringBuilder();
        
        // Call the recursive method and print the result
        System.out.println(ConsecturiveOnes(str, 0, newStr));
    }
}
