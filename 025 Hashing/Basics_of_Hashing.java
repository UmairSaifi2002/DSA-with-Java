import java.util.HashMap;
/*
    1. Key-Value Pair Structure
        A HashMap stores data as key-value pairs. Each key must be unique, but values can be duplicated.
    2. Fast Operations
        Insertion, Deletion, and Retrieval operations have an average time complexity of O(1), thanks to hashing.
    3. Allows Null Values
        A HashMap allows one null key and multiple null values.
    4. Non-Thread-Safe
        It is not synchronized, meaning it is not safe to use in a multi-threaded environment without external synchronization.
    5. Order is Not Guaranteed
        The order of elements in a HashMap is not predictable because it depends on the hash function. 
        For order-sensitive use cases, LinkedHashMap is preferred.
    6. Hashing Mechanism
        Internally, it uses hashing to store and retrieve data efficiently. 
        Each key's hashcode determines where it is placed in the map.
    7. Handles Collisions
        If two keys have the same hashcode, it handles collisions using a linked list or a balanced tree 
        (from Java 8 onwards) at that location.
    8. Capacity and Load Factor
        It has an initial capacity and a load factor (default 0.75), meaning the map resizes when 75% of the buckets are filled.
    9. Fail-Fast Iterators
        If the map is modified while iterating (other than via the iterator), 
        it throws a ConcurrentModificationException.
    10. Usage Scenarios
        Commonly used when quick lookups are needed, like caching, frequency counts, and maintaining mappings between objects (like country-to-population).
*/
public class Basics_of_Hashing {
    public static void main(String[] args) {
        // Think of HashMap like a school notebook
        // where each page has two parts: a NAME (key) and a NUMBER (value).
        
        // 1. We are creating a new empty notebook (HashMap).
        HashMap<String, Integer> hm = new HashMap<>();

        // 2. Checking if the notebook has anything written inside.
        System.out.println(hm);  // Shows what's inside -> {}
        System.out.println(hm.size());  // Number of items -> 0
        System.out.println(hm.isEmpty());  // Is it empty? -> true

        // 3. Let's write some names and numbers in our notebook!
        hm.put("India", 100);  // Write: India -> 100
        hm.put("China", 160);  // Write: China -> 160
        hm.put("America", 50);  // Write: America -> 50
        hm.put("Canada", 60);  // Write: Canada -> 60

        // 4. Now, let’s see what we wrote in the notebook.
        System.out.println(hm);  // Prints the whole notebook
        System.out.println(hm.size());  // How many items? -> 4
        System.out.println(hm.isEmpty());  // Is it empty now? -> false

        // 5. Check what number is written next to "India".
        System.out.println(hm.get("India"));  // -> 100
        // 6. Ask if there’s any entry for "Nepal".
        System.out.println(hm.get("Nepal"));  // -> null (means it's not written there)

        // 7. Let's see if some names are in the notebook.
        System.out.println(hm.containsKey("India"));  // -> true (yes, it's there)
        System.out.println(hm.containsKey("Nepal"));  // -> false (no, not there)

        // 8. Oops! We made a mistake. Let's erase "China" from the notebook.
        hm.remove("China");
        System.out.println(hm);  // See the updated notebook -> {Canada=60, America=50, India=100}
        
        // 9. Try to erase "Indonesia", but it's not in the notebook.
        hm.remove("Indonesia");  
        System.out.println(hm);  // Nothing changes -> {Canada=60, America=50, India=100}
    }
}
