import java.util.*;

public class Minimum_Absolute_Difference_Pairs03 {
    public static void main(String[] args) {
        // Given two arrays A and B of equal length n.
        // Pair each element of array A to an element in array B,
        // such that sum S of absolute differences of all the pairs is minimum.
        // Define two arrays A and B of equal length
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        // Sort arrays A and B in ascending order
        Arrays.sort(A);
        Arrays.sort(B);

        // Initialize variable to store minimum sum
        int minimum = 0;

        // Iterate over arrays A and B
        for (int i = 0; i < B.length; i++) {
            // Calculate absolute difference between corresponding elements
            int temp = A[i] - B[i];

            // Ensure difference is positive
            if (temp < 0) {
                temp = -1 * (temp); // or use Math.abs(temp)
            }

            // Add difference to minimum sum
            minimum += temp;
        }

        // Print minimum sum of absolute differences
        System.out.println("Minimum Sum: " + minimum);

    }
}
