import java.util.*;
public class Count_Distinct_Elements09_Question03 {
    public static void main(String[] args) {
        // sorted in Ascending Order
        // NULL value are NOT allowed -> because it sort the input and it is difficult to compare null value with the inputs
        // it os based on AVL or RedBlack Tree
        // Time Complexity -> O(logn)
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        TreeSet<Integer> DistinctValue = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            DistinctValue.add(nums[i]);
        }
        System.out.println("The Distict Elements are -> "+DistinctValue); // -> The Distict Elements are -> [1, 2, 3, 4, 5, 6, 7]
        System.out.println("The number of Distict Elements is "+DistinctValue.size()); // -> The number of Distict Elements is 7
    }
}
