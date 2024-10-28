import java.util.TreeSet;

public class TreeSet08 {
    public static void main(String[] args) {
        // TreeSet
        // Stored in Ascending Order
        // Null value is NOT allowed
        // It is implemented by the AVL or Red Black Tree
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Uttar Pradesh");
        cities.add("Gujrat");
        cities.add("Uttrakhand");
        cities.add("Jammu & Kashmir");
        System.out.println(cities); // -> [Delhi, Gujrat, Jammu & Kashmir, Mumbai, Uttar Pradesh, Uttrakhand]
    }
}
