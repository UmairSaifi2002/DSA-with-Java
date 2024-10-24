import java.util.*;
public class Count_Distinct_Elements09_Question03 {
    public static void main(String[] args) {
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        TreeSet<Integer> DistinctValue = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            DistinctValue.add(nums[i]);
        }
        System.out.println("The Distict Elements are -> "+DistinctValue);
        System.out.println("The number of Distict Elements is "+DistinctValue.size());
    }
}
