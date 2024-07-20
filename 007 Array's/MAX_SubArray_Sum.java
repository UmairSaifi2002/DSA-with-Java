// import java.util.*;

import java.util.Arrays;

public class MAX_SubArray_Sum {

    //Brute force approach
    public static int maximum_sum (int arr[]) {
        // in this approach we have time complexity O(n^3)
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    // System.out.print(arr[j2]+" ");
                    sum = sum + arr[j2];
                }
                if (max_sum < sum) max_sum = sum;
                System.out.println(sum);
                sum = 0;
            }
        }
        return max_sum;
    }

    // some potimized approach
    public static int prefix_array(int arr[]){
        // in this approach we have time complexity O(n^2)
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // here we calculate the prefix array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        // Now we will calculate the Max Sum of Sub array
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                current_sum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if (max_sum < current_sum) max_sum = current_sum;
            }
        }

        return max_sum;
    }

    // Kadene's approach
    // most optimized approach
    public static int kadenes(int arr[]){
        // in this code we have time complexity is O(n)
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            if (current_sum < 0) current_sum = 0;
            max_sum = Math.max(max_sum, current_sum);
        }

        // if the array donot contain any positive integer
        // then it will givw you the largest negative integer
        if (max_sum == 0) {
            max_sum = arr[0];
            // for (int i = 1; i < arr.length; i++) {
            //     max_sum = max_sum < arr[i] ? arr[i] : max_sum ;
            // }
            Arrays.sort(arr);
            max_sum = arr[arr.length - 1];
        }
        return max_sum;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1, -2, 6, -1, 3};
        // int result = maximum_sum(arr);
        // int result = prefix_array(arr);
        int result = kadenes(arr);
        // int result1 = maximum_sum(arr1);
        // int result1 = prefix_array(arr1);
        int result1 = kadenes(arr1);
        System.out.println("The max sum of sub-array 'arr' is "+result);
        System.out.println("The max sum of sub-array 'arr1' is "+result1);
        int arr2[] = {-12,-11,-2,-43,-45,-61};
        int result3 = kadenes(arr2);
        System.out.println(result3);
    }
    
}