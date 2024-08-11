public class Majority_Element {

    public static int MajorityElement(int nums[]){
        // Brute Force Approach
        int majority = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majority) {
                return nums[i];
            }
        }
        return -1;
    }

    // Some optimized approach
    public static int Major(int[] nums, int val, int index) {
        // Initialize a counter to track the occurrences of the value 'val'
        int cnt = 0;
        System.out.println(cnt);
    
        // Loop through the array starting from the given index
        for (int i = index; i < nums.length; i++) {
            // If the current element is equal to 'val', increment the counter
            if (nums[i] == val) {
                cnt++;
                System.out.println(val + "-" + cnt);
            } else {
                // If the current element is not equal to 'val', decrement the counter
                cnt--;
                System.out.println(val + "-" + cnt);
            }
    
            // If the counter goes negative, it indicates that 'val' is no longer the majority element
            if (cnt < 0) {
                System.out.println(val + "-" + cnt);
                // Recursively call the Major function with the current element as the new 'val'
                // and the current index as the new starting point
                return Major(nums, nums[i], i);
            }
        }
    
        // If the loop completes, return 'val' as the majority element
        return val;
    }
    

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        int nums1[] = {1,1,1,2,2,2,2};
        // System.out.println(MajorityElement(nums1));
        System.out.println(Major(nums1,nums1[0],0));
    }
}