// import java.util.*;

public class MAX_SubArray_Sum {

    public static int maximum_sum (int arr[]) {
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
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int arr1[] = {1, -2, 6, -1, 3};
        int result = maximum_sum(arr);
        int result1 = maximum_sum(arr1);
        System.out.println("The max sum of sub-array 'arr' is "+result);
        System.out.println("The max sum of sub-array 'arr1' is "+result1);
    }
    
}