// We need a special helper called HashMap, so we're telling the computer to use it.
import java.util.HashMap;

// This is the name of our game: "Valid Anagram"
public class Valid_Anagram05_Question02 {

    // This is a special function that checks if two words are anagrams.
    public static boolean isAnagram(String s, String t){
        
        // First, we check if the two words have the same number of letters.
        // If they don't, it's not an anagram!
        if (s.length() != t.length()) { 
            // Go back and say it's not an anagram.
            return false; 
        } 
        else { 
            // We're creating a special box called "map" to store letters and counts.
            HashMap<Character, Integer> map = new HashMap<>();

            // Let's count how many times each letter appears in the first word.
            for (int i = 0; i < s.length(); i++) {
                // Put the letter in the box and add 1 to its count.
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            }

            // Now, let's check the second word.
            for (int i = 0; i < t.length(); i++) {
                // Get the current letter.
                char c = t.charAt(i);

                // Is this letter in our box?
                if (map.containsKey(c)) {
                    // Yes! So, subtract 1 from its count.
                    int val = map.get(c);
                    val--;
                    map.put(c, val);
                } 
                else{
                    // No! This letter isn't in our box, so it's not an anagram.
                    return false; 
                }
            }
        }

        // If we got this far, it's an anagram!
        return true; 
    }

    // This is where we start playing the game.
    public static void main(String[] args) {
        // Choose two words to play with.
        String s = "keea"; 
        String t = "knee";

        // Check if they're anagrams.
        System.out.println(isAnagram(s, t));
    }
}