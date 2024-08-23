import java.util.*;

public class Most_Frequent_Number_following_Key {

    public static void MostFrequent(ArrayList<Integer> List, int key) {
        int index = 0;

        // finding the index of the key
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) == key) {
                index = i;
            }
        }

        // now finding the most frequent element
        int arr[] = new int[1000];
        int max = 0;
        for (int i = 0; i < List.size(); i++) {
            arr[List.get(i)]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = i;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(); // That's how we declare ArrayList

        // Adding Element in ArrayList O(1)
        // in Integer ArrayList
        List.add(2);
        List.add(2);
        List.add(2);
        List.add(2);
        List.add(3);
        MostFrequent(List, 2);
    }
}