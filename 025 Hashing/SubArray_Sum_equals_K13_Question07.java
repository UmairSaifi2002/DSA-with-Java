import java.util.*;
import java.util.HashMap;

public class SubArray_Sum_equals_K13_Question07 {

    public static void main(String[] args) {
        // in this Question we wants to find the number of sub-array's
        // which is equal to k
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        // sum[i, j] = sum[0, j] - sum[0, i]
        // so, sum[i, j] = k because we want to find the count of subArray which sum is
        // equal tot the 'k'
        // k = sum[0, j] - sum[0, i]
        // sum[0, i] = sum[0, j] - k
        // sum[0, j] it is a sum which we store in a HashMap
        // sum[0, i] it is a sum which we compute

        int sum = 0, ans = 0; // sum - ab tak ka total sum store karega, ans - count karega kitne subarrays
                              // target meet karte hain
        HashMap<Integer, Integer> map = new HashMap<>(); // yeh map sums aur unke occurrences ko store karega
        map.put(0, 1); // starting point: agar sum zero hoga toh woh ek baar occur karega

        // har element (i) ke liye loop chalayenge
        for (int i : arr) {
            sum += i; // current element ko sum mein add karenge

            // check karte hain ki kya (sum - k) pehle se exist karta hai
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k); // agar haan, toh ans mein uska occurrence count add karte hain
            }

            // map mein current sum ko add/update karte hain, agar pehle se hai toh count
            // badhate hain
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans); // final answer print karenge: kitne subarrays ka sum target k ke equal hai

        /*
         * Humko aise subarrays find karne hain jinka sum k ke equal ho.
         * sum ko use karke hum ab tak ka sum calculate karte hain.
         * Har naye sum ke saath check karte hain ki (sum - k) pehle dekha gaya hai ya
         * nahi.
         * Agar haan, toh iska matlab hai ki woh subarray sum k ke equal hoga, toh ans
         * mein uska count add karte hain.
         * Phir hum map mein har naye sum ka count update karte hain.
         * End mein ans print karte hain jo bataega kitne subarrays hain jinka sum k ke
         * equal hai.
         */

    }
}