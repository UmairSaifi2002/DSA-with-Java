import java.util.HashMap;

public class Valid_Anagram05_Question02 {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            // System.out.println(false);
            return false;
        }
        else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            }
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                if (map.containsKey(c)) {
                    int val = map.get(c);
                    val--;
                    map.put(c, val);
                }
                else{
                    // System.out.println(false);
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // code for Anagram
        String s = "keea";
        String t = "knee";
        System.out.println(isAnagram(s, t));
    }
}