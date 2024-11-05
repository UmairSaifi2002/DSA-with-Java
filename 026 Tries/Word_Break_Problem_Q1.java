public class Word_Break_Problem_Q1 {

    // created a root node, which will be the starting point of our Trie (prefix tree)
    public static Node root = new Node();

    // function for inserting a word into the Trie
    public static void insert(String word) {
        Node curr = root; // start from the root node
        for (int level = 0; level < word.length(); level++) { // loop through each character in the word
            int index = word.charAt(level) - 'a'; // calculate the position of character in 'children' array
            if (curr.children[index] == null) { // if no node exists at this position, create a new Node
                curr.children[index] = new Node();
            }
            curr = curr.children[index]; // move to the next node
        }
        curr.endOfWord = true; // mark the end of the word in the Trie
    }

    // function for searching a word in the Trie
    public static boolean search(String word) {
        Node curr = root; // start from the root node
        for (int level = 0; level < word.length(); level++) { // loop through each character in the word
            int index = word.charAt(level) - 'a'; // calculate the position of character in 'children' array
            if (curr.children[index] == null) { // if no node exists at this position, word is not found
                return false;
            }
            curr = curr.children[index]; // move to the next node
        }
        return curr.endOfWord == true; // return true if we are at the end of a valid word in the Trie
    }

    // function to determine if the key can be segmented into words from the dictionary
    public static boolean wordBreak(String key) {
        // Base case: if the key is empty, we have successfully segmented all parts of the original string
        if (key.length() == 0) {
            return true;
        }

        // Check each substring of the key, starting from the first character
        for (int i = 1; i <= key.length(); i++) {
            // Check if the first part of the substring is a valid word in the dictionary
            // and if the rest of the substring can also be segmented into valid words
            if (search(key.substring(0, i)) && wordBreak(key.substring(i, key.length()))) {
                return true; // if both parts are valid, return true
            }
        }
        return false; // return false if no segmentation is found
    }

    public static void main(String[] args) {
        // Word_Break_Problem_Q1.java
        // Given an input String and a dictionary of words, find out if the input string
        // can be broken into a space-separated sequence of dictionary words

        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        String key = "ilikesamsung";
        // Expected output: true (key can be broken as "i like samsung")

        // Insert all words from the dictionary into the Trie
        for (String string : words) {
            insert(string);
        }

        // Check if the key can be broken down into words from the dictionary
        System.out.println(wordBreak(key)); // Should print true
    }
}

// Node class representing each node in the Trie
class Node {
    Node children[] = new Node[26]; // each node has 26 children, one for each letter of the alphabet
    boolean endOfWord = false; // indicates if a node marks the end of a valid word

    // Constructor to initialize the node's children array
    Node() {
        children = new Node[26];
    }
}

/*
 * Explanation of wordBreak Function
    -> The wordBreak function is designed to check if a given string (key) can be split into a sequence of words 
    that are present in the trie (which represents a dictionary of words). Here’s a step-by-step explanation of how it works:

    -> Base Case: If the key string is empty (i.e., key.length() == 0), it returns true. 
    This base case is important because it means that if we can break down the string completely into words 
    from the dictionary, we consider the segmentation valid.

    -> Loop Through the String: It tries to break the string into two parts at every possible position i, where 1 <= i <= key.length(). 
    This results in a prefix key.substring(0, i) and a suffix key.substring(i, key.length()).

    -> Check the Prefix in Trie: For each prefix (key.substring(0, i)), it uses the search function to check 
    if this prefix exists as a word in the trie.

    -> Recursive Check on the Suffix: If the prefix exists in the trie, it then recursively calls wordBreak on the 
    suffix (key.substring(i, key.length())) to see if the rest of the string can also be broken down into valid words from the dictionary.

    -> Return True if Valid Segmentation Found: If both the prefix is found in the trie and the suffix can be segmented into words 
    (indicated by wordBreak returning true for the suffix), then the function immediately returns true, 
    indicating that the string can be segmented into dictionary words.

    -> Return False if No Valid Segmentation: If no valid segmentation is found by the end of the loop, it returns false. 
    This means the string cannot be broken into a sequence of dictionary words.
*/