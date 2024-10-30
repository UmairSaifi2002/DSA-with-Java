import java.util.*;
import java.util.HashMap;

public class Union_and_Intersection_of_two_Array10_Question04 {
    public static void main(String[] args) {
        // Union_and_Intersection_of_two_Array10_Question04.java
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9 , 4};
 
        // using HashSet to solve the Question
        // union
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : arr1) {
            set.add(i);
        }
        for (Integer i : arr2) {
            set.add(i);
        }
        System.out.println("The union of two arrays are -> "+set);
        // intersection
        set.clear();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("The number of elements are in intersection -> "+count);

        // intersection by me
        set.clear();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr1) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (Integer i : arr2) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                set.add(entry.getKey());
            }
        }
        System.out.println("The intersection of two array -> "+set);

    }
}