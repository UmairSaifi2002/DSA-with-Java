// Importing tools we need for our HashMap to work
import java.util.*; 
import java.util.LinkedList;

// HashMap are unOrdered in nature
public class Implementation_of_HashMap_Function01 {
    public static void main(String[] args) {
        // Creating our special notebook (HashMap) to store countries and their numbers
        HashMap<String, Integer> hm = new HashMap<>();

        // Adding some countries and their scores to the notebook
        hm.put("India", 100);
        hm.put("Pakistan", 90);
        hm.put("Bangladesh", 40);
        hm.put("Sri-Lanka", 10);

        // Printing all the countries (keys) from the notebook
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);  // It will print each country's name
        }

        // Getting and printing India's score
        System.out.println(hm.get("India"));  // -> 100

        // Removing India from the notebook
        hm.remove("India");

        // Checking if India's score is still available after removal
        System.out.println(hm.get("India"));  // -> null
    }
}

// This is where we build our own HashMap from scratch
class HashMap<K, V> {  // K (key) and V (value) can be any type, like String or Integer (generic)

    // A Node stores both a key (country) and a value (score)
    private class Node {
        K key;
        V value;

        // Constructor to create a new Node with the given key and value
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int n;  // Total number of key-value pairs in the notebook
    private int N;  // Total number of pages (buckets) in the notebook
    private LinkedList<Node> buckets[];  // Pages of the notebook are LinkedLists

    // Constructor to initialize the notebook with 4 empty pages (buckets)
    @SuppressWarnings("unchecked")
    public HashMap() {
        this.N = 4;
        this.buckets = new LinkedList[4];
        for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    // This function converts a key to a page number (bucket index)
    public int hashFunction(K key) {
        int hc = key.hashCode();  // Convert key to a number
        return Math.abs(hc) % N;  // Find the right page by dividing it
    }

    // This function looks for a key on a specific page
    public int searchInLinkedList(K key, int bucketIndex) {
        LinkedList<Node> ll = buckets[bucketIndex];  // Pick the page
        int dataIndex = 0;  // Start looking from the first item

        for (int i = 0; i < ll.size(); i++) {
            Node node = ll.get(i);
            if (node.key.equals(key)) {  // If the key matches, return its position
                return dataIndex;
            }
            dataIndex++;
        }
        return -1;  // If not found, return -1
    }

    // Rehashing: Make a bigger notebook if it becomes too full
    @SuppressWarnings("unchecked")
    public void rehash() {
        LinkedList<Node> oldBuckets[] = buckets;  // Save the old notebook
        buckets = new LinkedList[N * 2];  // Double the notebook size
        N *= 2;  // Update the size value

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        // Move everything from the old notebook to the new one
        for (LinkedList<Node> ll : oldBuckets) {
            for (Node node : ll) {
                put(node.key, node.value);
            }
        }
    }

    // Add or update a key-value pair in the notebook
    public void put(K key, V value) {
        int bucketIndex = hashFunction(key);  // Find the right page
        int dataIndex = searchInLinkedList(key, bucketIndex);  // Search for the key

        if (dataIndex != -1) {  // If key exists, update its value
            Node node = buckets[bucketIndex].get(dataIndex);
            /*
                The .get(index) method is used to retrieve an element from a specific position in a LinkedList. 
                Since each page (bucket) in your custom HashMap is a LinkedList that holds key-value pairs (Nodes), 
                we need a way to access a particular Node when we know its position.
            */
            node.value = value;
        } else {  // If key doesn't exist, add it
            buckets[bucketIndex].add(new Node(key, value));
            n++;
        }

        // Check if the notebook is too full (load factor > 2)
        double lambda = (double) n/N;
        if (lambda > 2.0) {
            rehash();  // Make a bigger notebook
        }
    }

    // Check if a key exists in the notebook
    public boolean ContainsKey(K key) {
        int bucketIndex = hashFunction(key);
        return searchInLinkedList(key, bucketIndex) != -1;
    }

    // Get the value associated with a key
    public V get(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInLinkedList(key, bucketIndex);
        if (dataIndex != -1) {
            Node node = buckets[bucketIndex].get(dataIndex);
            return node.value;
        }
        return null;  // If key is not found, return null
    }

    // Remove a key-value pair from the notebook
    public Node remove(K key) {
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInLinkedList(key, bucketIndex);
        if (dataIndex != -1) {
            n--;
            return buckets[bucketIndex].remove(dataIndex);  // Remove the node
        }
        return null;  // If key is not found, return null
    }

    // Get all keys from the notebook as a list
    public ArrayList<K> keySet() {
        ArrayList<K> keys = new ArrayList<>();
        for (LinkedList<Node> ll : buckets) {
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    // Check if the notebook is empty
    public boolean isEmpty() {
        return n == 0;
    }

    public int getOrDefault(char charAt, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrDefault'");
    }

    public boolean containsKey(char c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsKey'");
    }
}

/*
    import java.util.*;
// We are using LinkedList from Java's built-in tools
import java.util.LinkedList;

public class Implementation_of_HashMap_Function01 {
    public static void main(String[] args) {
        // Imagine we are creating a special notebook (HashMap)
        // where we store COUNTRIES and NUMBERS as pairs.

        HashMap<String, Integer> hm = new HashMap<>();

        // We are adding four countries and their scores to our notebook.
        hm.put("India", 100);
        hm.put("Pakistan", 90);
        hm.put("Bangladesh", 40);
        hm.put("Sri-Lanka", 10);

        ArrayList<String> keys = hm.keySet();
        for (String string : keys) {
            System.out.println(string);
        }

        System.out.println(hm.get("India"));
        hm.remove("India");
        System.out.println(hm.get("India"));
    }
}

// Let's build our own HashMap from scratch!
class HashMap<K, V> {  // K and V are placeholders (like A and B) for data types

    // A Node stores a key (like country) and a value (like a number)
    private class Node {
        K key;
        V value;

        // When we make a new Node, we store the key and value inside it
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int n;  // Total number of key-value pairs in the notebook
    private int N;  // Total number of pages (buckets) in the notebook
    private LinkedList<Node> buckets[];  // Our pages (buckets) are LinkedLists

    @SuppressWarnings("unchecked")
    public HashMap() {
        // Start with a notebook that has 4 pages (buckets)
        this.N = 4;
        this.buckets = new LinkedList[4];

        // Every page in the notebook needs to be ready to store Nodes (key-value pairs)
        for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    // Hash function: Takes a key and turns it into a page number (bucket index)
    public int hashFunction(K key) {
        int hc = key.hashCode();  // Converts key to a number
        return Math.abs(hc) % N;  // Finds the right page by dividing it
    }

    // Search function: Looks for a key on a specific page
    public int searchInLinkedList(K key, int bucketIndex) {
        LinkedList<Node> ll = buckets[bucketIndex];  // Pick the page
        int dataIndex = 0;  // Start looking from the first item

        for (int i = 0; i < ll.size(); i++) {
            Node node = ll.get(i);
            if (node.key == key) {  // If we find the key, return its position
                return dataIndex;
            }
            dataIndex++;  // Keep moving forward
        }
        return -1;  // If we don't find it, return -1
    }

    // Rehash: If our notebook becomes too full, we make a bigger one!
    @SuppressWarnings("unchecked")
    public void rehash() {
        LinkedList<Node> oldBucket[] = buckets;  // Save the old notebook
        buckets = new LinkedList[N * 2];  // Make a bigger notebook (double the size)
        N = 2 * N;

        // Initialize new pages
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        // Move all the key-value pairs from the old notebook to the new one
        for (int i = 0; i < oldBucket.length; i++) {
            LinkedList<Node> ll = oldBucket[i];
            for (int j = 0; j < ll.size(); j++) {
                Node node = ll.remove();
                put(node.key, node.value);  // Add everything to the new notebook
            }
        }
    }

    // Put function: Add or update a key-value pair in the notebook
    public void put(K key, V value) {
        int bucketIndex = hashFunction(key);  // Find the right page
        int dataIndex = searchInLinkedList(key, bucketIndex);  // Check if key is already there

        if (dataIndex != -1) {  // If key exists, update its value
            Node node = buckets[bucketIndex].get(dataIndex);
            node.value = value;
        } else {  // If key doesn't exist, add a new one
            buckets[bucketIndex].add(new Node(key, value));
            n++;  // Increase the number of items in the notebook
        }

        // Calculate the "load factor" to check if the notebook is too full
        double lambda = (double) n / N;
        if (lambda > 2.0) {  // If too full, make a bigger notebook
            rehash();
        }
    }

    // ContainsKey function :-
    public boolean ContainsKey(K key){
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInLinkedList(key, bucketIndex);
        if (dataIndex != -1) {
            return true;
        }
        return false;
    }

    // Get function :-
    public V get(K key){
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInLinkedList(key, bucketIndex);
        if (dataIndex != -1) {
            Node node = buckets[bucketIndex].get(dataIndex);
            return node.value;
        }
        return null;
    }

    // Remove function :- 
    public Node remove(K key){
        int bucketIndex = hashFunction(key);
        int dataIndex = searchInLinkedList(key, bucketIndex);
        if (dataIndex != -1) {
            Node node = buckets[bucketIndex].remove(dataIndex);
            n--;
            return node;
        }
        return null;
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            LinkedList<Node> ll = buckets[i];
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    public boolean isEmpty(){
        return n==0;
    }

}

*/