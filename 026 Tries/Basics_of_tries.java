
public class Basics_of_tries {

    // We created root node as empty
    public static Node root = new Node();

    // creating node class
    public static class Node {
        Node children[] = new Node[26];
        boolean endOfWord = false;

        Node() {
            // creating the whole array as null
            // for (int i = 0; i < 26; i++) { // it is a traditional way to assign null to every index
            //     children[i] = null;
            // }
            children = new Node[26]; // it is a new way to assign null to every index
        }
    }

    // This function is for insertion of words in Tries
    public static void insert(String word) { // time complexity O(n)
        Node curr = root; // accessing current node
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a'; // computing index of the word
            if (curr.children[idx] == null) { // checking that entry of word is available or not
                curr.children[idx] = new Node(); // create a new node at that particular index
            }
            curr = curr.children[idx]; // if the word is present then move to the next level
        }
        curr.endOfWord = true; // now we known that word is complete
    }

    public static boolean search(String key) {
        // as same as insert
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.endOfWord == true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };  
        for (String string : words) {
            insert(string);
        }
        System.out.println(search("the")); // -> true
        System.out.println(search("thor")); // -> false
    }
 
}
