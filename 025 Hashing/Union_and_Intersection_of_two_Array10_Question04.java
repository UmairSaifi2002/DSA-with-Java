import java.util.*;
import java.util.HashMap;

public class Union_and_Intersection_of_two_Array10_Question04 {
    public static void main(String[] args) {
        // Union_and_Intersection_of_two_Array10_Question04.java
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9 , 4};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (int i : arr2) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        // System.out.println(map); // -> {2=1, 3=2, 4=1, 6=1, 7=1, 9=3}
        Set<Integer> union = map.keySet();
        System.out.print("Union of two array :- {");
        for (Integer i : union) {
            System.out.print(i+", ");
        }System.out.println("}");

        Set<Integer> intersection = new HashSet<>();
        // Iterator it = i.iterator();


        System.out.println(intersection);
    }
}
