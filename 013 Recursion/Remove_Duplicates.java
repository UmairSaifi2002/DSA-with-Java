public class Remove_Duplicates {

    public static void Remove(String str, int index, StringBuilder newStr, boolean map[]) {
        // Base Case
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Work
        // char currentChar = Character.toLowerCase(str.charAt(index)); // it will work if we have uppercase letters also in our given string.
        char currentChar = str.charAt(index);
        
        // This line now correctly assumes that all characters are lowercase 'a' to 'z'
        if (currentChar >= 'a' && currentChar <= 'z') {
            if (map[currentChar - 'a']) {
                // duplicate
                // then move to the next index without adding it to the newStr
                Remove(str, index + 1, newStr, map);
            } else {
                map[currentChar - 'a'] = true;
                Remove(str, index + 1, newStr.append(currentChar), map);
            }
        } else {
            // If the character is not a lowercase letter, we skip the mapping and just append it
            Remove(str, index + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apna College";
        StringBuilder newStr = new StringBuilder();
        boolean map[] = new boolean[26];
        Remove(str, 0, newStr, map);
    }
}
