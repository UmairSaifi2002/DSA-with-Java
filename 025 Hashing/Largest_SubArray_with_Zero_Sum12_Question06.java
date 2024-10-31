import java.util.HashMap;

public class Largest_SubArray_with_Zero_Sum12_Question06 {
    public static void main(String[] args) {
        // Let see what is PreSum
        // sum[i+1, j] = sum[0, j] - sum[0, i]
        // we want sum of SubArray is Zero
        // so, sum[i+1, j] = 0
        // 0 = sum[0, j] - sum[0, i]
        // sum[0, j] = sum[0, i]

        int arr[] = { 15, -2, 2, -8, 1, 7, 10 }; // We have a list of numbers we want to check
        int sum = 0; // Start with a sum of 0, where we'll add up numbers
        int len = 0; // Length of the longest subarray (small groups within array) starting at 0
        HashMap<Integer, Integer> map = new HashMap<>(); // This is like a notepad where we store each sum's position

        for (int i = 0; i < arr.length; i++) { // Loop through each number in the list
            sum += arr[i]; // Add the current number to the total sum

            if (map.containsKey(sum)) { // Check if we've seen this sum before
                len = Math.max(len, i - map.get(sum)); // If so, find the length of this subarray and update 'len'
            } else { // If the sum is new, write it down along with the position
                map.put(sum, i);
            }
        }

        System.out.println(len); // Print the longest length found

    }
}
 