import java.util.LinkedHashSet;

public class Linked_HashSet07 {
    public static void main(String[] args) {
        // Linked HashSet is come to exist by the Linked HashMap
        // Linked HashSet have all the function that Linked HashMap havve
        // it is Ordered(as user give input) in nature using Doubly LinkedList
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Uttar Pradesh");
        cities.add("Gujrat");
        cities.add("Uttrakhand");
        cities.add("Jammu & Kashmir");
        System.out.println(cities); // -> [Delhi, Mumbai, Uttar Pradesh, Gujrat, Uttrakhand, Jammu & Kashmir]
        cities.remove("Delhi");
        System.out.println(cities); // -> [Mumbai, Uttar Pradesh, Gujrat, Uttrakhand, Jammu & Kashmir]
    }
}
