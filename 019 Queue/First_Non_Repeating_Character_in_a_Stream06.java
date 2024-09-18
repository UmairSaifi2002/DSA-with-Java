import java.util.Queue;
import java.util.LinkedList;

public class First_Non_Repeating_Character_in_a_Stream06 {

    public static void printNonRepeating(String str) {
        // Create an array to store the frequency of each character (assuming lowercase English letters).
        int freq[] = new int[26];
        
        // Create a queue to store characters and track the first non-repeating character.
        Queue<Character> q = new LinkedList<>();
        
        // Iterate over each character in the string.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character.
            
            // Add the character to the queue.
            q.add(ch);
            
            // Increment the frequency count for the current character.
            freq[ch - 'a']++;
            
            // Remove characters from the queue that are repeating.
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove(); // Remove the repeating character from the queue.
            }
            
            // Check if the queue is empty (i.e., no non-repeating character found).
            if (q.isEmpty()) {
                // Print -1 to indicate no non-repeating character.
                System.out.print(-1 + " ");
            } else {
                // Print the first non-repeating character.
                System.out.print(q.peek() + " ");
            }
        }
    }
    

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
