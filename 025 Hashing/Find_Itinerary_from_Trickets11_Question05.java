import java.util.*;
import java.util.HashMap;

public class Find_Itinerary_from_Trickets11_Question05 {
    public static void main(String[] args) {
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
        
        String tickets[][] = {{"Chennai", "Bangaluru"}, {"Mumbai", "Delhi"}, {"Goa", "Chennai"}, {"Delhi", "Goa"}};

        HashMap<String, String> map = new HashMap<>(); 
        for (String[] strings : tickets) {
            map.put(strings[0], strings[1]);
        }
        HashMap<String, String> revMap = new HashMap<>();
        for (String[] strings : tickets) {
            revMap.put(strings[1], strings[0]);
        }
        System.out.println(map);
        System.out.println(revMap);

        String start = "";

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String val = entry.getKey();
            // System.out.println(val);
            if (!revMap.containsKey(val)) {
                start = val;
                break;
            }
        }

        while (map.containsKey(start)) {
            System.out.println(start+" -> "+map.get(start));
            start = map.get(start);
        }
    }
}
