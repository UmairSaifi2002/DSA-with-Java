import java.util.*;

public class Pair_Sum_Sorted_ArrayList {

    public static boolean PairSumBruteForceApproach(ArrayList<Integer> List, int target) {
        int size = List.size();
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if ((List.get(i)+List.get(j)) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean PairSumOptimizedApproach(ArrayList<Integer> List, int target) {
        int start = 0;
        int end = List.size()-1;
        while (start < end) {
            int sum = List.get(start) + List.get(end);
            if (sum == target) {
                return true;
            }
            if (sum > target) {
                end--;
            }
            else {
                start++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(); // That's how we declare ArrayList

        // Adding Element in ArrayList O(1)
        // in Integer ArrayList
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println(PairSumBruteForceApproach(List, 5));
        System.out.println(PairSumOptimizedApproach(List, 5));
    }
}