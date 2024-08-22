import java.util.*;

public class Container_with_Most_Water {

    // Function to find the maximum area using the brute force approach
    public static void BruteForceApproach(ArrayList<Integer> Height) {
        int size = Height.size(); // Get the number of elements in the Height array
        int max = -1; // Initialize the maximum area found so far

        // Iterate over each pair of lines
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                // Check if the height of the current pair of lines can form a container
                if (Height.get(i) <= Height.get(j)) {
                    // Calculate the area of the current container
                    int area = Height.get(i) * (j - i);
                    // Update the maximum area if the current area is larger
                    if (max < area) {
                        max = area;
                    }
                } else {
                    // If the heights are not in increasing order, use the smaller height
                    int area = Height.get(j) * (j - i);
                    // Update the maximum area if the current area is larger
                    if (max < area) {
                        max = area;
                    }
                }
            }
        }
        // Print the maximum area found
        System.out.println(max);
    }

    public static void TwoPointerApproach(ArrayList<Integer> mainList) {
        // Initialize the maximum area found so far
        int max = -1;
    
        // Initialize two pointers, one at the start and one at the end of the list
        int start = 0;
        int end = mainList.size() - 1;
    
        // Continue the loop until the two pointers meet
        while (start <= end) {
            // Calculate the area between the two pointers
            int area = mainList.get(start) * (end - start);
    
            // Update the maximum area if the current area is larger
            if (max < area) {
                max = area;
            }
    
            // Move the pointer of the shorter line towards the other end
            if (mainList.get(start) < mainList.get(end)) {
                start++; // Move the start pointer to the right
            } else {
                end--; // Move the end pointer to the left
            }
        }
    
        // Print the maximum area found
        System.out.println(max);
    }
    

    public static void main(String[] args) {
        // Create an ArrayList to store the heights of the lines
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        System.out.println(Height); // Print the input heights
        // BruteForceApproach(Height); // Call the function to find the maximum area
        TwoPointerApproach(Height);
    }
}
