import java.util.*;
public class HashSet06 {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        // HashSet is Created from the HashMap
        // 1, No Duplicates -> Unique keys
        // 2, UnOrdered
        // 3, NULL is Allowed

        // Now Learn about HashSet Operation
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(4);
        System.out.println(hs.size()); // -> 7

        System.out.println(hs); // -> [1, 2, 3, 4, 5, 6, 7]
        if (hs.contains(2)) System.out.println("HashSet contains 2");
        if (hs.contains(4)) System.out.println("HashSet contains 4");

        hs.remove(2);
        System.out.println(hs.size()); // -> 6
        System.out.println(hs); // -> [1, 2, 3, 4, 5, 7]

        // Iteration in HashSet using iterator
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        } // -> 1,3,4,5,6,7
        System.out.println();

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Uttar Pradesh");
        cities.add("Gujrat");
        cities.add("Uttrakhand");
        cities.add("Jammu & Kashmir");
        // Iterator i = cities.iterator();
        // while (i.hasNext()) {
        //     System.err.print(i.next()+" ");
        // }
        // System.out.println();

        // Iteration in cities using Enhanced Loop
        for (String string : cities) {
            System.out.print(string+" ");
        } // -> Delhi Gujrat Uttrakhand Jammu & Kashmir Mumbai Uttar Pradesh 
        System.out.println();
        hs.clear();
        System.out.println(hs.size()); // -> 0
        System.out.println(hs.isEmpty()); // -> true
    }
}
