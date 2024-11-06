public class Prefix_Problem_Q2 {

    public static Node root = new Node();

    // Insert function to add a word into the trie
    public static void insert(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            // If the character node does not exist, create it
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            } else {
                // Increment frequency if the node already exists
                curr.children[index].freq++;
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
    }

    // Search function to find the shortest unique prefix
    public static String search(String key) {
        Node curr = root;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            ans.append(key.charAt(i));
            // If frequency of current node is 1, prefix is unique
            if (curr.children[index].freq == 1) {
                return ans.toString();
            }
            curr = curr.children[index];
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        // Find the shortest unique prefix for every word in a given list
        // Assume no word is a prefix of another
        // arr[] = {"zebra", "dog", "duck", "dove"};
        // ans[] = {"z", "dog", "du", "dov"};

        String arr[] = {"zebra", "dog", "duck", "dove"};
        for (String word : arr) {
            insert(word);
        }

        // Find and print shortest unique prefix for each word
        for (String word : arr) {
            System.out.println(word + " -> " + search(word));
        }
    }
}

class Node {
    Node children[] = new Node[26];
    boolean endOfWord = false;
    int freq = 1; // Tracks the frequency of prefix at this node
    Node() {
        children = new Node[26];
    }
}
