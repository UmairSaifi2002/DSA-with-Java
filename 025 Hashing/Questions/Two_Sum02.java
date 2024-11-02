package Questions;
import java.util.*;

public class Two_Sum02 {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int k = 9;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }
        System.out.println(hm);
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(k-arr[i])) {
                System.out.println(i+", "+hm.get(k-arr[i]));
            }
        }        
    }
}
