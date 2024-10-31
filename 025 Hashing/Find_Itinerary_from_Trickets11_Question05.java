import java.util.*;
import java.util.HashMap;

public class Find_Itinerary_from_Trickets11_Question05 {
//     public static void main(String[] args) {
        // Find itinerary from Tickets
        // From -> To
        // "Chennai" -> "Bangaluru"
        // "Mumbai" -> "Delhi"
        // "Goa" -> "Chennai"
        // "Delhi" -> "Goa"

        // "Bangaluru" -> "Chennai"
        // "Delhi" -> "Mumbai"
        // "Chennai" -> "Goa"
        // "Goa" -> "Delhi"
        
        // String tickets[][] = {{"Chennai", "Bangaluru"}, {"Mumbai", "Delhi"}, {"Goa", "Chennai"}, {"Delhi", "Goa"}};

        // HashMap<String, String> map = new HashMap<>(); 
        // for (String[] strings : tickets) {
        //     map.put(strings[0], strings[1]);
        // }
        // HashMap<String, String> revMap = new HashMap<>();
        // for (String[] strings : tickets) {
        //     revMap.put(strings[1], strings[0]);
        // }
        // System.out.println(map);
        // System.out.println(revMap);

        // String start = "";

        // for (Map.Entry<String, String> entry : map.entrySet()) {
        //     String val = entry.getKey();
        //     // System.out.println(val);
        //     if (!revMap.containsKey(val)) {
        //         start = val;
        //         break;
        //     }
        // }

        // while (map.containsKey(start)) {
        //     System.out.println(start+" -> "+map.get(start));
        //     start = map.get(start);
        // }

        // /*
        //  *  System.out.print(start+" -> ");
        //     while (map.containsKey(start)) {
        //         start = map.get(start);
        //         System.out.print(start+" -> ");
        //     }System.out.println();
        // */

        /**
     * Creates a forward map (From -> To) from the given tickets.
     * 
     * Time complexity: O(n), where n is the number of tickets.
     * 
     * @param tickets Array of tickets, where each ticket is a string array [From, To].
     * @return Forward map (From -> To).
     */
    public static HashMap<String, String> createForwardMap(String[][] tickets) {
        HashMap<String, String> map = new HashMap<>();
        for (String[] strings : tickets) {
            map.put(strings[0], strings[1]);
        }
        return map;
    }

    /**
     * Creates a reverse map (To -> From) from the given tickets.
     * 
     * Time complexity: O(n), where n is the number of tickets.
     * 
     * @param tickets Array of tickets, where each ticket is a string array [From, To].
     * @return Reverse map (To -> From).
     */
    public static HashMap<String, String> createReverseMap(String[][] tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String[] strings : tickets) {
            revMap.put(strings[1], strings[0]);
        }
        return revMap;
    }

    /**
     * Finds the starting point of the itinerary.
     * 
     * Time complexity: O(n), where n is the number of tickets.
     * 
     * @param map Forward map (From -> To).
     * @param revMap Reverse map (To -> From).
     * @return Starting point of the itinerary.
     */
    public static String findStartPoint(HashMap<String, String> map, HashMap<String, String> revMap) {
        String start = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String val = entry.getKey();
            if (!revMap.containsKey(val)) {
                start = val;
                break;
            }
        }
        return start;
    }

    /**
     * Prints the itinerary.
     * 
     * Time complexity: O(n), where n is the number of tickets.
     * 
     * @param map Forward map (From -> To).
     * @param start Starting point of the itinerary.
     */
    public static void printItinerary(HashMap<String, String> map, String start) {
        while (map.containsKey(start)) {
            System.out.println(start + " -> " + map.get(start));
            start = map.get(start);
        }
    }

    public static void main(String[] args) {
        // Define the tickets
        String tickets[][] = {
            {"Chennai", "Bangaluru"},
            {"Mumbai", "Delhi"},
            {"Goa", "Chennai"},
            {"Delhi", "Goa"}
        };

        // Create forward and reverse maps
        HashMap<String, String> map = createForwardMap(tickets);
        HashMap<String, String> revMap = createReverseMap(tickets);

        // Print the maps (optional)
        System.out.println("Forward Map: " + map);
        System.out.println("Reverse Map: " + revMap);

        // Find the starting point
        String start = findStartPoint(map, revMap);

        // Print the itinerary
        printItinerary(map, start);
    }

    }

