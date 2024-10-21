import java.util.*;

public class TreeMap03 {
    public static void main(String[] args) {
        // Keys ar eSorted
        // put, get, remove are O(logn)
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("America", 120);
        tm.put("China", 180);
        tm.put("India", 100);
        tm.put("Pakistan", 90);
        tm.put("Bangladesh", 40);
        tm.put("Sri-Lanka", 10);

        // Creating our special notebook (HashMap) to store countries and their numbers
        HashMap<String, Integer> hm = new HashMap<>();
        // Adding some countries and their scores to the notebook
        hm.put("America", 120);
        hm.put("China", 180);
        hm.put("India", 100);
        hm.put("Pakistan", 90);
        hm.put("Bangladesh", 40);
        hm.put("Sri-Lanka", 10);

        System.out.println(tm);
        System.out.println(hm);
    }
}
