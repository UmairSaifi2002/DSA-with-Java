import java.util.*;
 
public class Linked_HashMap02 {
    public static void main(String[] args) {
        // Linked HashMap
        // it is same as HashMap but Keys are arranged as Insertion
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("Pakistan", 90);
        lhm.put("Bangladesh", 40);
        lhm.put("Sri-Lanka", 10);

        System.out.println(lhm);

        // Creating our special notebook (HashMap) to store countries and their numbers
        HashMap<String, Integer> hm = new HashMap<>();

        // Adding some countries and their scores to the notebook
        hm.put("India", 100);
        hm.put("Pakistan", 90);
        hm.put("Bangladesh", 40);
        hm.put("Sri-Lanka", 10);

        System.out.println(hm);
    }
}
